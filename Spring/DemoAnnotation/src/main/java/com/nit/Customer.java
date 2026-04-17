package com.nit;



import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int custId;
	private String custName;
	private String custEmail;

	public Customer(int custId, String custName, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + "]";
	}

}
