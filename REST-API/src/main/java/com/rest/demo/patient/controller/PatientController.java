package com.rest.demo.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rest.demo.patient.model.Patient;
import com.rest.demo.patient.service.PatientServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class PatientController {

	List<Patient> PatientDetails = new ArrayList<>();

	@Autowired
	PatientServiceImpl service;

	// FIND ALL
	@GetMapping("fetch-all-Patient")
	public List<Map<String, Object>> getallPatients() {
		List<Map<String, Object>> patientList = service.getallPatients();
		return patientList;

	}

	// POST

	@PostMapping("save-Patient")
	public String savePatient(@RequestBody Patient Patient) {
		PatientDetails.add(Patient);// Add to patient via arraylist method
		service.addPatient(Patient);
		return "Successfully inserted";
		// public List<Patient> savePatient(@RequestBody Patient patient){

		// return service.addPatient(patient);
		// return "Successfully inserted ListofPatients";
	}

	// SEARCH

	@GetMapping("search/Patient/{fristname}")
	public Optional<Stream<Patient>> findPatientByFristname(@PathVariable String fristname) {
		System.out.print("First Name::::" + fristname);
		Optional<Stream<Patient>> getFristName = (Optional<Stream<Patient>>) service.findPatientByFristname(fristname);
		return getFristName;
	}
	
	
	// SEARCH VIA FRIST AND LAST NAME
	@GetMapping("search/patients/")
		public List<Patient> findPatientByFLname (@RequestParam  String fristname , @RequestParam String lastname){
		System.out.print("Frist Name::::" + fristname);
		System.out.print("LASTName::::" + lastname);
		List<Patient> getFLname =  (List<Patient>) service.findPatientByFLname(fristname,lastname);
		
		return getFLname;
		
	}
	
	
	
	// SEARCH VIA GENERIC
	
	
	@GetMapping("serach/patient/")
	public List<Patient> findPatientByGeneric(@RequestParam int id,@RequestParam String  fristname , @RequestParam String lastname,
			@RequestParam String  address,@RequestParam String  phonenumber){
		System.out.print("id:::" + id);
		System.out.print("Frist Name::::" + fristname);
		System.out.print("LASTName::::" + lastname);
		System.out.print("ADDRESS::::" + address);
		System.out.print("PHONENUMBER::::" + phonenumber);
		
		List<Patient> getGeneric =  (List<Patient>) service.findPatientByGeneric(id,fristname,lastname,address,phonenumber);
		
		return getGeneric;
	}
	
	//anygeneric value

	// Delete
	@DeleteMapping("delete/Patient/{phonenumber}")
	public Patient deletePatientByPhonenumber(@PathVariable String phonenumber) {

		Patient PatientPhone = (Patient) service.deletePatientByPhonenumber(phonenumber);
//			PatientDetails = PatientDetails.stream().filter(Patient -> Patient.getPhonenumber() != phonenumber)
//					.collect(Collectors.toList());
		return PatientPhone;
	}

	// Update
	@PutMapping("update/Patient/{id}")
	public List<Patient> updatePatientById(@PathVariable int id, @RequestBody Patient Patient) {
		PatientDetails.forEach(PatientInfo -> {
			if (PatientInfo.getId() == id) {
				PatientInfo.setFristname(Patient.getFristname());
				PatientInfo.setLastname(Patient.getLastname());
			}
		});
		return PatientDetails;
	}

}
