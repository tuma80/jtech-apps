package com.gcode.jtech.using.guice.persistence.model;

@SuppressWarnings("serial")
public class Account extends Persistence {
	
	private String id;
	
	private String accountNumber;
	
	public Account(){
		this.id=String.valueOf(Math.random());
		this.accountNumber="1234567890";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
