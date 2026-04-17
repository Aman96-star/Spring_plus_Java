package com.nit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages = "com.nit")
public class AppConfig {
	
	//This class tells Spring:
	//👉 "I will provide object creation logic"
	// here object is created
	
	//bean class 1/2
	
	@Bean
	public Customer customer() {
		return new Customer(101,"John","j@gmail.com");
	}
	
	@Bean
	public Address address() {
		Address address = new Address();
		address.setCity("Hyd");
		address.setState("Telangana");
		address.setCountry("India");
		System.out.println(customer().hashCode());
		address.setCustomer(customer());
		return address;
	}
	
	@Bean
	public test te() {
		test te =new test();
		te.setId("Stu20-21");
		te.setModel("Ferrari");
		te.setNum(1);
		te.setTe(Di());
		
		return te;
	}
	@Bean
	public testDi Di() {
		return new testDi(404);
	}

}
