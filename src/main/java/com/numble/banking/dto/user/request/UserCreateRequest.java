package com.numble.banking.dto.user.request;

public class UserCreateRequest {

    private String name;

    private String userId;

    private String userPassword;


    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
