package com.example.springstudy.day18.injection.constructor;

import com.example.springstudy.day18.injection.common.Dependency;

public class ConstructorInjectionService {

    private final Dependency dependency;

    public ConstructorInjectionService(Dependency dependency) {
        this.dependency = dependency;
    }

    public void execute() {
        dependency.run();
    }
}
