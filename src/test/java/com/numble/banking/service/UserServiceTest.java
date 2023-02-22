package com.numble.banking.service;

import com.numble.banking.bank.dto.user.request.UserCreateRequest;
import com.numble.banking.bank.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

        if (!userCreateRequest1.getUserPassword().equals(userCreateRequest1.getCheckUserPassword()))
        {
            System.out.printf("틀림");
        }


        //then

    }






}