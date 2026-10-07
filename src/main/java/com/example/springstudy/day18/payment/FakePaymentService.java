package com.example.springstudy.day18.payment;

public class FakePaymentService implements PaymentService{

    private int paidAmount;

    @Override
    public void pay(int amount) {
        paidAmount = amount;
    }

    public int getPaidAmount() {
        return paidAmount;
    }
}
