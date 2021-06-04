package com.cts;

import javax.persistence.Entity;

//@Entity
public class PrivateEmployee extends Employee{
	
	private String onSite;

	public String getOnSite() {
		return onSite;
	}

	public void setOnSite(String onSite) {
		this.onSite = onSite;
	}
	
	

}
