package com.infy.demo.IOC_DI;

public class Postpaid3 implements Plan{

	@Override
	public boolean enrollToPlan() {
		System.out.println("enrolled to Postpaid");
		return true;
	}

}
