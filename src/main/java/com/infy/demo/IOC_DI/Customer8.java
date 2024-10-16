package com.infy.demo.IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer8 {
	
	//Autowiring using property
	@Autowired
	@Qualifier("postpaidPlan")//This qualifies/state which Plan bean to execute from 2 or more
    private Plan plan;
	
    public String register(){        
      if(plan.enrollToPlan()) {
			return "Customer enrolled to plan successfully";
		}
		else {
			return "Customer not registered. Pls try again.";
		}
    }
}
