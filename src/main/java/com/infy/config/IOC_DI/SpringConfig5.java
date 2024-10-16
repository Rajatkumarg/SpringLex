package com.infy.config.IOC_DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.demo.IOC_DI.Customer10;
import com.infy.demo.IOC_DI.Customer7;
import com.infy.demo.IOC_DI.Customer8;
import com.infy.demo.IOC_DI.Customer9;
import com.infy.demo.IOC_DI.Plan;
import com.infy.demo.IOC_DI.Postpaid3;
import com.infy.demo.IOC_DI.Prepaid3;

@Configuration
public class SpringConfig5 {

	@Bean
    public Plan prepaidPlan(){
            return new Prepaid3();
    }
	
	@Bean
    public Plan postpaidPlan(){
            return new Postpaid3();
    }
	
    @Bean
    public Customer8 customer(){
            return new Customer8();   
    }
    
    @Bean
    public Customer9 customer9(){
            return new Customer9();   
    }
    
    @Bean
    public Customer10 customer10(@Qualifier("postpaidPlan") Plan plan) {
    	return new Customer10(plan);
    }
}
