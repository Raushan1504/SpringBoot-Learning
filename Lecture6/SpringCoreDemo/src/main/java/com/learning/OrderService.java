package com.learning;


import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    OrderService(){
        System.out.println("Order Created");
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
