package com.rest.demo.patient.repository;

import java.util.Map;

public interface GenericRepository<T> {
	long searchGeneric(Map<String,Object>params);
	
	 T findPatientByGeneric (T t);

}
