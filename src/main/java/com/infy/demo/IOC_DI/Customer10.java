package com.infy.demo.IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer10 {
	
	private Plan plan;
	
	//Autowiring using constructor
	@Autowired
    public Customer10(Plan plan) {
		this.plan = plan;
	}
	
    public String register(){        
      if(plan.enrollToPlan()) {
			return "Customer enrolled to plan successfully";
		}
		else {
			return "Customer not registered. Pls try again.";
		}
    }
}
