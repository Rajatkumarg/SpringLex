package com.infy.demo.IOC_DI;

public class Prepaid3 implements Plan{

	@Override
	public boolean enrollToPlan() {
		System.out.println("enrolled to Prepaid");
		return true;
	}
}
