package com.rest.demo.patient.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.patient.model.Patient;

public interface PatientRepository  {
	
	public void addPatient(Patient patient) throws Exception;
	
	public List<Map<String,Object>> getallPatients() throws Exception;
	
	public Optional<Patient> findPatientByFristname(String patient);
	
	public Optional<Stream<Patient>> findListOfPatientByFristname(String patient);
	
	public List<Patient> findPatientByFLname(String fristname,String lastname);

	List<Patient> findPatientByGeneric(int id, String fristname, String lastname, String address, String phonenumber);

	
	
}
	

	
	


