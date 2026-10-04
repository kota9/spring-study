package com.example.springstudy.day15.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MemoryUserRepository implements UserRepository{

    @Override
    public void save(String name) {
        System.out.println("Memory 저장: " + name);
    }
}
