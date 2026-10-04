package com.example.springstudy.day15.service;

import com.example.springstudy.day15.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(String name) {
        userRepository.save(name);
    }
}
