package com.gcode.jtech.using.guice.persistence.model;

@SuppressWarnings("serial")
public class Address extends Persistence {
	
	private String id;
	
	private String streetName;
	
	public Address(){
		this.id=String.valueOf(Math.random());
		this.streetName="Patali Pada, G. B. Road";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
}
