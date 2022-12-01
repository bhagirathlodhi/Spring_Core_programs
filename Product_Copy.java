package com.cls.hibernatecls;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product_Copy {
	@Id
	private	Integer pid;
	private	Double price;
	private String pname;
	
	
	
	
	public Product_Copy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

}
