package com.example.springstudy.day18.payment;

import org.springframework.stereotype.Service;

@Service
public class TossPaymentService implements PaymentService {

    @Override
    public void pay(int amount) {
        System.out.println("토스 결제" + amount);
    }
}
