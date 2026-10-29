package com.learning;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    OrderService(@Lazy PaymentService paymentService){

        this.paymentService = paymentService;

    }


    void OrderKarlo(){
        paymentService.pay();
        getOrderDetails();
        System.out.println("Order Received");
    }


    void getOrderDetails(){
        System.out.println("Here are order details");
    }
}
