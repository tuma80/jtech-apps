package com.gcode.jtech.using.guice.persistence.service.test;

import junit.framework.Assert;

import org.junit.Test;

import com.gcode.jtech.using.guice.persistence.service.AccountService;

public class TestAccountService extends TestService {
	
	private final AccountService accountService;
	
	public TestAccountService(){
		this.accountService=injector.getInstance(AccountService.class);
	}
	
	@Test
	public void testGetAccount(){
		Assert.assertEquals("1234567890",accountService.get("").getAccountNumber());
	}

}
