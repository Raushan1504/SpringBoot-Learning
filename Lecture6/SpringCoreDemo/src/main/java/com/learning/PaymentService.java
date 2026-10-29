package com.learning;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {
OrderService orderService;

    PaymentService(OrderService orderService){

        this.orderService = orderService;

    }

    void pay(){
    System.out.println("Payment done");
    }
}
