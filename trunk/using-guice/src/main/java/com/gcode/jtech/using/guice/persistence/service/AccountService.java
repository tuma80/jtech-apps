package com.gcode.jtech.using.guice.persistence.service;

import com.gcode.jtech.using.guice.persistence.model.Account;

public interface AccountService extends PersistenceService<Account,String> {
	
	Account findByAccountNumber(String accountNumber);

}
