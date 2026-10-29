package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
//        OrderService os1 = context.getBean(OrderService.class);
//        OrderService os2 = context.getBean(OrderService.class);


        OrderService os1 = context.getBean(OrderService.class);
        os1.OrderKarlo();







    }
}
