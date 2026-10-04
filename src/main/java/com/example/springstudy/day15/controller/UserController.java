package com.example.springstudy.day15.controller;

import com.example.springstudy.day15.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/day15/users")
    public String saveUser(@RequestParam String name) {
        userService.saveUser(name);
        return "saved: " + name;
    }
}
