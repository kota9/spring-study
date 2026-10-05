package com.example.springstudy.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String findAll() {
        return "users";
    }

}
