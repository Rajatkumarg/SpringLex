package com.infy.config.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infy.demo.scope.Customer;

@Configuration
public class SpringConfig1 {
	@Bean
    @Scope("singleton")//bidefault scope is Singleton
    public Customer customerSingleton(){
           return new Customer();
    }
	
	@Bean(name = "prototypeBean")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//bidefault scope is Singleton
    public Customer customerPrototype(){
           return new Customer();
    }
}
