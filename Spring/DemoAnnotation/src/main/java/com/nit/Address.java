package com.nit;

public class Address {

	private String city;
	private String state;
	private String country;
	private Customer customer;

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCustomer(Customer customer) {
		System.out.println(customer.hashCode());
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", customer=" + customer + "]";
	}

}
