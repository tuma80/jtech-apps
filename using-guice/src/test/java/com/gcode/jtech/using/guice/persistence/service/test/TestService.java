package com.gcode.jtech.using.guice.persistence.service.test;

import com.gcode.jtech.using.guice.module.PersistenceModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class TestService {
	
	protected final Injector injector;
	
	public TestService(){
		injector=Guice.createInjector(new PersistenceModule());
	}

}
