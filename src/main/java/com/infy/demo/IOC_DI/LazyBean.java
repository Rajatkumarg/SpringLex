package com.infy.demo.IOC_DI;

import jakarta.annotation.PostConstruct;

public class LazyBean {
	@PostConstruct
    public void onBeanLoading(){
                   System.out.println("Success message: Lazy bean is Lazily Loaded!");
	}
}
