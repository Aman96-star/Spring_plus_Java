package com.nit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages = "com.nit")
public class AppConfig {
	
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

}
