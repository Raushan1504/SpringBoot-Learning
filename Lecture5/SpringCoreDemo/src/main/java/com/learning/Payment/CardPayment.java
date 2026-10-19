package com.learning.Payment;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component

public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payment done through Card");
    }
}