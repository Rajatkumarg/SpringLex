package com.infy.demo.IOC_DI;

import jakarta.annotation.PostConstruct;

public class EagerBean {
	@PostConstruct
    public void AfterBeanLoading(){
                   System.out.println("Success message: Eager bean is Eagerly Loaded!");
	}
}
