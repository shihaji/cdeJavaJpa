package com.cts;

import javax.persistence.Entity;

//@Entity
public class GovtEmployee extends Employee{
	
	private String pension;

	public String getPension() {
		return pension;
	}

	public void setPension(String pension) {
		this.pension = pension;
	}
	
	

}
