package com.gcode.jtech.guice.persistence.service;

import java.util.List;

import com.gcode.jtech.guice.persistence.model.Customer;

public interface CustomerService extends PersistenceService<Customer,String>{
	
	List<Customer> findByFirstName(String firstName);

}
