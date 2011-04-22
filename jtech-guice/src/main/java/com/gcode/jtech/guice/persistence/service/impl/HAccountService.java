package com.gcode.jtech.guice.persistence.service.impl;

import java.util.List;

import com.gcode.jtech.guice.persistence.model.Account;
import com.gcode.jtech.guice.persistence.service.AccountService;
import com.gcode.jtech.guice.persistence.service.CustomerService;
import com.google.inject.Inject;

public class HAccountService extends HAbstractService implements AccountService {
	
	private CustomerService customerService;
	
	@Inject
	public void setCustomerService(CustomerService customerService){
		this.customerService=customerService;
	}

	public Account get(String k) {
		customerService.get("");
		return new Account();
	}

	public List<Account> getAll() {
		return null;
	}

	public String create(Account t) {
		return null;
	}

	public Account update(Account t) {
		return null;
	}

	public Account findByAccountNumber(String accountNumber) {
		return null;
	}

}
