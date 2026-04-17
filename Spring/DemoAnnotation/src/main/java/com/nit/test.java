package com.nit;


// dependy injection  is applied 

public class test {
	private int num;
	private String id;
	private String model;
	private testDi te;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	
	
	public void setTe(testDi te) {
		this.te = te;
	}
	@Override
	public String toString() {
		return "test [num=" + num + ", id=" + id + ", model=" + model +"injection from anotherclass"+te+ "]";
	}
	
	
}
