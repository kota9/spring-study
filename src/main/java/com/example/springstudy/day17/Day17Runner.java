package com.example.springstudy.day17;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("day17")
public class Day17Runner implements CommandLineRunner {

    private final ApplicationContext context;
    private final StatefulService statefulService;

    public Day17Runner(ApplicationContext context, StatefulService statefulService) {
        this.context = context;
        this.statefulService = statefulService;
    }

    @Override
    public void run(String... args) throws Exception {

//        SingletonService service1 = context.getBean(SingletonService.class);
//        SingletonService service2 = context.getBean(SingletonService.class);
        /*PrototypeService service1 = context.getBean(PrototypeService.class);
        PrototypeService service2 = context.getBean(PrototypeService.class);

        System.out.println(service1);
        System.out.println(service2);

        System.out.println(service1 == service2);*/

        statefulService.setUserName("Alice");
        System.out.println("Alice 요청 결과: " + statefulService.getUserName());
        statefulService.setUserName("Bob");
        System.out.println("Bob 요청 결과: " + statefulService.getUserName());
    }
}
