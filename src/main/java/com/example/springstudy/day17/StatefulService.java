package com.example.springstudy.day17;

import org.springframework.stereotype.Service;

@Service
public class StatefulService {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
