package com.example.springstudy.day16.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String findAll() {
        return "users";
    }

}
