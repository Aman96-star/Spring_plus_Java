package com.aman.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="product")

public class Product {

	@Id
	private long pid;
	
	private String pname;
	
	private double pprice;
	
	public Product(){
		super();
	}
	
	public Product(long pid,String pname,double pprice){
		super();
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
	
}
