package com.gcode.jtech.using.guice.persistence.service;

import java.util.List;

import com.gcode.jtech.using.guice.persistence.model.Address;

public interface AddressService extends PersistenceService<Address, String>{
	
	public List<Address> findByStreetName(String streetName);

}
