package com.infy.demo.IOC_DI;

import org.springframework.stereotype.Component;

@Component
public class Customer6 {
	private String customerName;
	
	public Customer6() {
		System.out.println("Customer6 constructor called");
	}
    public String getCustomerName() { 
        return customerName; 
    } 
    public void setCustomerName(String customerName) { 
        this.customerName = customerName; 
    } 
    public String registerCustomer(String name){ 
        return "Welcome "+ name+"! You are now our registered user!!"; 
    } 
}
