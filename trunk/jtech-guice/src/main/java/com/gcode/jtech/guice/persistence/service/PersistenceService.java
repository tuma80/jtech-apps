package com.gcode.jtech.guice.persistence.service;

import java.util.List;

public interface PersistenceService <T, K> {
	
	T get(K k);
	
	List<T> getAll();
	
	K create(T t);
	
	T update(T t);
	
	//T findByField(String fieldName,String fieldValue);
}
