package com.example.springstudy.day18.order;

import com.example.springstudy.day18.payment.FakePaymentService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrderServicePureTest {

    @Test
    void 주문하면_결제가_호출된다() {

        FakePaymentService fakePaymentService = new FakePaymentService();

        OrderService orderService = new OrderService(fakePaymentService);

        orderService.order(10000);

        assertThat(fakePaymentService.getPaidAmount()).isEqualTo(10000);
    }
}
