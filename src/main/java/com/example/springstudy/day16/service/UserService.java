package com.example.springstudy.day16.service;

import com.example.springstudy.day16.bean.PaymentClient;
import com.example.springstudy.day16.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PaymentClient paymentClient;

    public String getUsers() {
        return userRepository.findAll() + " / " + paymentClient.pay();
    }
}
