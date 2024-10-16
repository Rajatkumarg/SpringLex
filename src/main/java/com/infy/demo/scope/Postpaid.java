package com.infy.demo.scope;

import org.springframework.stereotype.Component;


public class Postpaid implements Plan{

	@Override
	public boolean enrollToPlan() {
		System.out.println("enrolled to Postpaid");
		return true;
	}

}
