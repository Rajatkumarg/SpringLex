package com.infy.demo.scope;

import org.springframework.stereotype.Component;

public class Prepaid implements Plan{

	@Override
	public boolean enrollToPlan() {
		System.out.println("enrolled to Prepaid");
		return true;
	}
}
