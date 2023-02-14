package com.numble.banking.domain;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.persistence.*;

@Entity
@Slf4j
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String name;

    @Column
    private String number;

    @Column
    private String userId;

    @Column
    private String userPassword;

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User() {
    }

    public User(String name, String number, String userId, String userPassword) {

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(number) || StringUtils.isEmpty(userId) || StringUtils.isEmpty(userPassword))
        {
            log.info("이름: "+name+" 번호: "+number+" ID: "+userId+" PW: "+userPassword);
            throw new IllegalArgumentException(String.format("잘못된 입력입니다."));
        }
        this.name = name;
        this.number = number;
        this.userId = userId;
        this.userPassword = userPassword;
    }





}
