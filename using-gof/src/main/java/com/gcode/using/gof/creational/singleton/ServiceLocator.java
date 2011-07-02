package com.gcode.using.gof.creational.singleton;

public class ServiceLocator {
	
	private static final ServiceLocator serviceLocator=new ServiceLocator();
	
	private ServiceLocator(){
	}
	
	public static ServiceLocator getInstance(){
		return serviceLocator;
	}

}
