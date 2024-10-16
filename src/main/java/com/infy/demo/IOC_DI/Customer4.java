package com.infy.demo.IOC_DI;

public class Customer4 {
	Plan plan;
	//constructor injection
	public Customer4(Plan plan){
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
		Plan plan = new Prepaid3();
		Customer4 customer = new Customer4(plan);
		customer.register();
		plan = new Postpaid3();
		customer = new Customer4(plan);
		customer.register();
	}
}
