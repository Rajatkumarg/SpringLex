package com.infy.demo.IOC_DI;

public class Customer1 {
	private String customerName; 
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
