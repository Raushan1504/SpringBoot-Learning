package com.learning;

import com.learning.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class OrderService {


    private PaymentService paymentService;


    OrderService(@Qualifier("cardPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }



    void order(){
        paymentService.pay();


        System.out.println("Order Delivered");
    }
}
