package com.infy.config.IOC_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.demo.IOC_DI.Customer7;
import com.infy.demo.IOC_DI.Plan;
import com.infy.demo.IOC_DI.Prepaid3;

@Configuration
public class SpringConfig4 {

	@Bean
    public Plan plan(){
            return new Prepaid3();
    }
    @Bean
    public Customer7 customer(){
            return new Customer7();   
    }
}
