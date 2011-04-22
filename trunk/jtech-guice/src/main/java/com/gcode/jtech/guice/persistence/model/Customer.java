package com.gcode.jtech.guice.persistence.model;

@SuppressWarnings("serial")
public class Customer extends Persistence{
	
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	public Customer(){
		this.id=String.valueOf(Math.random());
		this.firstName="Jitendra";
		this.lastName="Takalkar";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
