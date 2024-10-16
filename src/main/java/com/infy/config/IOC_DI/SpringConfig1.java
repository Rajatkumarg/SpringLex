package com.infy.config.IOC_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.demo.IOC_DI.Customer1;

@Configuration
public class SpringConfig1 {

	@Bean(name = "custBean")
    public Customer1 customer(){ 
       return new Customer1(); 
    } 
}
