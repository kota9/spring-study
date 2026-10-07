package com.example.springstudy.day18.order;

import com.example.springstudy.day18.payment.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void order(int amount) {
        paymentService.pay(amount);
    }
}
