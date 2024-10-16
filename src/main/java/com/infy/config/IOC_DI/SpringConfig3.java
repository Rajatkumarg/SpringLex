package com.infy.config.IOC_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.infy.demo.IOC_DI.Customer6;
import com.infy.demo.IOC_DI.EagerBean;
import com.infy.demo.IOC_DI.LazyBean;
import com.infy.demo.IOC_DI.Plan;

//@Lazy - This will applicable for all beans
@Configuration
public class SpringConfig3 {

	@Lazy
    @Bean(name="customerBean")
	public Customer6 customer(){
		return new Customer6();
	}
	
	@Bean
	public EagerBean eagerBean() {
		System.out.println("Eager bean called");
		return new EagerBean();
	}

	@Bean
	@Lazy
	public LazyBean lazyBean() {
		System.out.println("Lazy bean called");
		return new LazyBean();
	}
}
