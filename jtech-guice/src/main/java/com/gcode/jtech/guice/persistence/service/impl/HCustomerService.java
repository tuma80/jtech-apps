package com.gcode.jtech.guice.persistence.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gcode.jtech.guice.persistence.model.Customer;
import com.gcode.jtech.guice.persistence.service.AddressService;
import com.gcode.jtech.guice.persistence.service.CustomerService;
import com.google.inject.Inject;

public class HCustomerService extends HAbstractService implements CustomerService {
	
	private AddressService addressService;
	
	@Inject
	public void setAddressService(AddressService addressService){
		this.addressService=addressService;
	}
	
	public Customer get(String k) {
		addressService.get("");
		return new Customer();
	}

	public List<Customer> getAll() {
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(new Customer());
		return customers;
	}

	public String create(Customer t) {
		return t.getId();
	}

	public Customer update(Customer t) {
		return t;
	}

	public List<Customer> findByFirstName(String firstName) {
		if(firstName==null)
			throw new IllegalArgumentException("Invalid Customer First Name.");
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer=new Customer();		
		customer.setFirstName(firstName);
		customers.add(customer);
		return customers;
	}

}
