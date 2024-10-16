package com.infy.demo.IOC_DI;

public class Customer2 {
	public void register()throws Exception{
		Prepaid2 prepaid = new Prepaid2();
		Postpaid2 postpaid = new Postpaid2();
		if(prepaid.enrollToPlan()){
			System.out.println("Customer enrolled to a prepaid plan");
		}else{
			throw new Exception("Exception.UNPAID_BILL");
		}
		
		if(postpaid.enrollToPlan()){
			System.out.println("Customer enrolled to a postpaid plan");
		}else{
			throw new Exception("Exception.UNPAID_BILL");
		}
	}
	
	public static void main(String[] args)throws Exception {
		new Customer2().register();
	}
}
