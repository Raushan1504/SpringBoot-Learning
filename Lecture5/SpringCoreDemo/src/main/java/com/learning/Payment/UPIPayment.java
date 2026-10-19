package com.learning.Payment;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
public class UPIPayment implements PaymentService{
   @Override
    public void pay(){
        System.out.println("Payment done through UPI");
    }
}
