package com.gcode.jtech.guice.persistence.service.test;

import org.junit.Assert;
import org.junit.Test;

import com.gcode.jtech.guice.persistence.service.CustomerService;

public class TestCustomerService extends TestService{
	
	private final CustomerService customerService;
	
	public TestCustomerService(){
		customerService=injector.getInstance(CustomerService.class);
	}
	
	@Test
	public void testGetCustomer(){
		Assert.assertEquals("Jitendra", customerService.get("").getFirstName());		
	}
	
}
