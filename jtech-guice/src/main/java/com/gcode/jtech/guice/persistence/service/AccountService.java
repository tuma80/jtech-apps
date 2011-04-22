package com.gcode.jtech.guice.persistence.service;

import com.gcode.jtech.guice.persistence.model.Account;

public interface AccountService extends PersistenceService<Account,String> {
	
	Account findByAccountNumber(String accountNumber);

}
