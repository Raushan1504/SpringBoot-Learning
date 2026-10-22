package com.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning")
public class AppConfig {



    @Bean
    public OrderService os1(){
        return new OrderService();
    }


    @Bean
    public OrderService os2(){
        return new OrderService();
    }
}
