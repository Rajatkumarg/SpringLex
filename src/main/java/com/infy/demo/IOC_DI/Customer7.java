package com.infy.demo.IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer7 {
	@Autowired
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
