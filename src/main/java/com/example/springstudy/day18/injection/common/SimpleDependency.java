package com.example.springstudy.day18.injection.common;

import org.springframework.stereotype.Component;

@Component
public class SimpleDependency implements Dependency{

    @Override
    public void run() {
        System.out.println("SimpleDependency.run()");
    }
}
