package com.example.springstudy.day18.injection.setter;

import com.example.springstudy.day18.injection.common.Dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectionService {

    private Dependency dependency;

    @Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public void execute() {
        dependency.run();
    }
}
