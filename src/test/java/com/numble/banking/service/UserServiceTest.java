package com.numble.banking.service;

import com.numble.banking.domain.User;
import com.numble.banking.dto.user.request.UserCreateRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;



    @Test
    public void 회원가입_테스트()
    {
        //given
        UserCreateRequest userCreateRequest1 = new UserCreateRequest("이범기","이범기 아이디","123","123");
        UserCreateRequest userCreateRequest2 = new UserCreateRequest("이범기","이범기 아이디","123","1234");

        //when



        //then

    }






}