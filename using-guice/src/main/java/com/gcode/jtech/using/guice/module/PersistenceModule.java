package com.gcode.jtech.using.guice.module;

import com.gcode.jtech.using.guice.persistence.service.AccountService;
import com.gcode.jtech.using.guice.persistence.service.AddressService;
import com.gcode.jtech.using.guice.persistence.service.CustomerService;
import com.gcode.jtech.using.guice.persistence.service.impl.HAccountService;
import com.gcode.jtech.using.guice.persistence.service.impl.HAddressService;
import com.gcode.jtech.using.guice.persistence.service.impl.HCustomerService;
import com.google.inject.AbstractModule;

public class PersistenceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CustomerService.class).to(HCustomerService.class);
		bind(AddressService.class).to(HAddressService.class);
		bind(AccountService.class).to(HAccountService.class);
	}

}
