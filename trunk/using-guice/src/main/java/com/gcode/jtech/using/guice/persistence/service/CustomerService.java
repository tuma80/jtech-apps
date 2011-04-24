package com.gcode.jtech.using.guice.persistence.service;

import java.util.List;

import com.gcode.jtech.using.guice.persistence.model.Customer;

public interface CustomerService extends PersistenceService<Customer,String>{
	
	List<Customer> findByFirstName(String firstName);

}
