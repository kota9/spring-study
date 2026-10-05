package com.example.springstudy.service;

import com.example.springstudy.bean.PaymentClient;
import com.example.springstudy.repository.UserRepository;
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
