package com.example.springstudy.day17;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    public SingletonService() {
        System.out.println("SingletonService created");
    }
}
