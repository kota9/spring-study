package com.example.springstudy.day18.injection.field;

import com.example.springstudy.day18.injection.common.Dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldInjectionService {

    @Autowired
    private Dependency dependency;

    public void execute() {
        dependency.run();
    }
}
