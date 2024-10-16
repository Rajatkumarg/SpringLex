package com.infy.demo.IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer9 {
	
	private Plan plan;
	
	//Autowiring using setter
	@Autowired
	@Qualifier("prepaidPlan")//This qualifies/state which Plan bean to execute from 2 or more
    public void setPlan(Plan plan) {
		this.plan = plan;
		System.out.println(plan.getClass().getName());
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
