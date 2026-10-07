package com.example.springstudy.day18.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class OrderServiceSpringTest {

    @Autowired
    private OrderService orderService;

    @Test
    void Spring이_의존성을_주입한다() {
        assertThat(orderService).isNotNull();
    }
}
