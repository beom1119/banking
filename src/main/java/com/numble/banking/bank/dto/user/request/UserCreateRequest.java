package com.numble.banking.bank.dto.user.request;

import javax.validation.constraints.NotBlank;

public class UserCreateRequest {

    @NotBlank(message = "name 빈 값 불가능")
    private String name;

    private String userId;

    private String userPassword;

    private String checkUserPassword;


    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getCheckUserPassword() {
        return checkUserPassword;
    }

    //TEST CODE
    public UserCreateRequest(String name, String userId, String userPassword, String checkUserPassword) {
        this.name = name;
        this.userId = userId;
        this.userPassword = userPassword;
        this.checkUserPassword = checkUserPassword;
    }
}
