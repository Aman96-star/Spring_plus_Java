package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cust")
public class CustomerAddress {
	@Autowired
	private Address address;

	public void showAddress() {
		System.out.println(address);
	}

}
