package com.numble.dmplus.bank.service;

import com.numble.dmplus.bank.dto.user.request.UserCreateRequest;
import com.numble.dmplus.bank.domain.User;
import com.numble.dmplus.bank.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public String join(UserCreateRequest userCreateRequest)
    {
        if (!userCreateRequest.getUserPassword().equals(userCreateRequest.getCheckUserPassword()))
        {
         log.info("password : "+ userCreateRequest.getUserPassword()+" checkpassword :"+userCreateRequest.getCheckUserPassword());
         throw new IllegalArgumentException("비밀번호 체크 오류");
        }
        User user = new User(userCreateRequest.getName(),userCreateRequest.getUserPassword(),userCreateRequest.getUserId(),userCreateRequest.getUserPassword());
        userRepository.save(user);
        return user+"님 회원가입 완료.";
    }



}
