package com.numble.banking.bank.controller;


import com.numble.banking.bank.dto.user.request.UserCreateRequest;
import com.numble.banking.bank.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {


    private final UserService userService;

    public BankController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test1")
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

    @PostMapping("/jointest")
    @ExceptionHandler(IllegalArgumentException.class)
    public String jointest(@RequestBody @Validated UserCreateRequest userCreateRequest)
    {
        userService.join(userCreateRequest);
        return userCreateRequest.getName()+"회원가입 성공";
    }


}
