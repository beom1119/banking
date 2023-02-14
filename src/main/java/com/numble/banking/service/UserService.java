package com.numble.banking.service;

import com.numble.banking.domain.User;
import com.numble.banking.domain.UserRepository;
import com.numble.banking.dto.user.request.UserCreateRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String join(UserCreateRequest userCreateRequest)
    {
        User user = new User(userCreateRequest.getName(),userCreateRequest.getUserPassword(),userCreateRequest.getUserId(),userCreateRequest.getUserPassword());
        userRepository.save(user);
        return user+"님 회원가입 완료.";

    }



}
