package com.infy.demo.IOC_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.IOC_DI.SpringConfig1;
import com.infy.config.IOC_DI.SpringConfig2;
import com.infy.config.IOC_DI.SpringConfig3;
import com.infy.config.IOC_DI.SpringConfig4;
import com.infy.config.IOC_DI.SpringConfig5;

public class UserInterface {
	public static void main(String[] args)throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig1.class);
        Customer1 customer = applicationContext.getBean(Customer1.class); 
        customer.setCustomerName("Alex"); 
        System.out.println(customer.registerCustomer(customer.getCustomerName())); 
        System.out.println("1------------------");
        
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
        Customer6 customer6 = (Customer6)applicationContext.getBean("customer6"); 
        customer6.setCustomerName("Rajat"); 
        System.out.println(customer6.registerCustomer(customer.getCustomerName())); 
        System.out.println("2------------------");
        
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig3.class);
        customer6 = applicationContext.getBean("customerBean",Customer6.class); 
        customer6.setCustomerName("Nishant"); 
        System.out.println(customer6.registerCustomer(customer.getCustomerName())); 
        applicationContext.getBean(LazyBean.class);//Lazy initialized
        System.out.println("3-----------------");
        
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig4.class);
        Customer7 customer7 = applicationContext.getBean(Customer7.class); 
        customer7.register(); 
        System.out.println("4-----------------");
        
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig5.class);
        Customer8 customer8 = applicationContext.getBean(Customer8.class); 
        customer8.register();
        System.out.println("5------------------");
        Customer9 customer9 = applicationContext.getBean(Customer9.class); 
        customer9.register();
        System.out.println("6------------------");
        Customer10 customer10 = applicationContext.getBean(Customer10.class); 
        customer10.register();
	}
}
