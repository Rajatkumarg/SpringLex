package com.infy.demo.IOC_DI;


public class Customer3 {
	public void register()throws Exception{
		Plan plan = new Prepaid3();
		if(plan.enrollToPlan()){
			System.out.println("Customer enrolled to a Prepaid plan");
		}else{
			throw new Exception("Exception.UNREGISTERED_CUSTOMER");
		}
		
		plan = new Postpaid3();
		if(plan.enrollToPlan()){
			System.out.println("Customer enrolled to a Postpaid plan");
		}else{
			throw new Exception("Exception.UNREGISTERED_CUSTOMER");
		}
	}
	
	public static void main(String[] args)throws Exception {
		new Customer3().register();
	}
}
