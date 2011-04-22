package com.gcode.jtech.guice.persistence.service;

import java.util.List;

import com.gcode.jtech.guice.persistence.model.Address;

public interface AddressService extends PersistenceService<Address, String>{
	
	public List<Address> findByStreetName(String streetName);

}
