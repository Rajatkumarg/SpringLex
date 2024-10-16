package com.infy.demo.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.scope.SpringConfig1;

public class UserInterface {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig1.class);            
           Customer customer1=(Customer) context.getBean("customerSingleton");
           Customer customer2=(Customer) context.getBean("customerSingleton");
           System.out.println("hashcode of customer1:"+customer1.hashCode());
           System.out.println("hashcode of customer2:"+customer2.hashCode());
           if(customer1==customer2){
                    System.out.println("Same Instances depicting singleton scope");
           }
           else{
                    System.out.println("Different Instances");
           }   
           customer1.register();
           customer2.register();
           
           customer1 = context.getBean("prototypeBean",Customer.class);
           customer2 = context.getBean("prototypeBean",Customer.class);
           System.out.println("hashcode of customer1:"+customer1.hashCode());
           System.out.println("hashcode of customer2:"+customer2.hashCode());
           if(customer1!=customer2){
                    System.out.println("Diff Instances depicting prototype scope");
           }
           else{
                    System.out.println("Same Instances");
           }   
           customer1.register();
           customer2.register();
}
}
