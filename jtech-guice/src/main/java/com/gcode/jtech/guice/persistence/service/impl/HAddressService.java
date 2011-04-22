package com.gcode.jtech.guice.persistence.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gcode.jtech.guice.persistence.model.Address;
import com.gcode.jtech.guice.persistence.service.AddressService;

public class HAddressService extends HAbstractService implements AddressService {

	public Address get(String k) {
		return new Address();
	}

	public List<Address> getAll() {
		List<Address> addresses=new ArrayList<Address>();
		addresses.add(new Address());
		return addresses;
	}

	public String create(Address t) {
		return t.getId();
	}

	public Address update(Address t) {
		return t;
	}

	public List<Address> findByStreetName(String streetName) {
		if(streetName==null)
			throw new IllegalArgumentException("Invalid Address Street Name.");
		
		List<Address> addresses=new ArrayList<Address>();
		Address address=new Address();		
		address.setStreetName(streetName);
		addresses.add(address);
		return addresses;
	}

}
