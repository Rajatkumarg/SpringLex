package com.infy.demo.IOC_DI;

public class Customer5 {
	Plan plan;
	
	//setter injection
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	public void register()throws Exception{
		if(plan.enrollToPlan()){
			System.out.println("Customer enrolled to a plan");
		}else{
			throw new Exception("Exception.UNREGISTERED_CUSTOMER");
		}
	}
	
	public static void main(String[] args)throws Exception {
		Customer5 customer = new Customer5();
		customer.setPlan(new Prepaid3());
		customer.register();
		customer.setPlan(new Postpaid3());
		customer.register();
	}
}
