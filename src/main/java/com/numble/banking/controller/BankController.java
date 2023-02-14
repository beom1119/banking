package com.numble.banking.controller;


import com.numble.banking.dto.user.request.UserCreateRequest;
import com.numble.banking.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {


    private final UserService userService;

    public BankController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test()
    {
        return "hello";
    }

    @PostMapping("/join")
    public String join(@RequestBody UserCreateRequest userCreateRequest)
    {
        userService.join(userCreateRequest);
        return userCreateRequest.getName()+"회원가입 성공";
    }




}
