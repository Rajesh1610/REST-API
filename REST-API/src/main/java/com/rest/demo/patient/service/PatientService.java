package com.rest.demo.patient.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.rest.demo.patient.model.Patient;

public interface PatientService {
	
	public String addPatient(Patient patient);
	
	public List<Map<String,Object>> getallPatients();
	
	
	public Optional<Stream<Patient>> findPatientByFristname(String fristname);
	
	public List<Patient> findPatientByFLname(String fristname,String lastname);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static List<Patient> addPatient(List<Patient> patient) {
		// TODO Auto-generated method stub
		//return null;
	//}

	//List<Patient> addPatient(Patient patient);
	

}
