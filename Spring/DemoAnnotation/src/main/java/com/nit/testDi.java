package com.nit;

import org.springframework.stereotype.Component;

@Component
public class testDi {
	private int de;
	
	
	public void setD(int de) {
		super();
		this.de = de;
	}


	@Override
	public String toString() {
		return "testDi [de=" + de + "]";
	}
	
}
