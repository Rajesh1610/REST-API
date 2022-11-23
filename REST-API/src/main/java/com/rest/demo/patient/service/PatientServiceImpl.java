package com.rest.demo.patient.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.demo.patient.model.Patient;
import com.rest.demo.patient.repository.PatientRepositoryImpl;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepositoryImpl p1;
	// private PatientRepositoryImpl p2;

	public String addPatient(Patient patient) {
		try {
			p1.addPatient(patient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "successfully inserted";
	}

	@Override
	public List<Map<String, Object>> getallPatients() {
		List<Map<String, Object>> patientList = null;
		try {
			patientList = p1.getallPatients();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patientList;
	}

	@Override
	public Optional<Stream<Patient>> findPatientByFristname(String fristname) {
		Optional<Stream<Patient>> p = p1.findListOfPatientByFristname(fristname);
		return p;

	}

	public List<Patient> findPatientByFLname(String fristname, String lastname) {
		List<Patient> fl = p1.findPatientByFLname(fristname,lastname);
		return fl;
	}
	
	
	public List<Patient> findPatientByGeneric(int id, String fristname, String lastname, String address,
			String phonenumber) {
		List<Patient> gl = p1.findPatientByGeneric(id,fristname,lastname,address,phonenumber);
		return gl;
	}

	public Patient deletePatientByPhonenumber(String phonenumber) {
		return null;
		// TODO Auto-generated method stub

	}

	

	

//	public Patient findPatientByFristname(String fristname) {
//		
//		p1.findPatientByFristname(fristname).getallPatients();
//		return null;
//		
}

//		
//		//You have to add patients whose name starts with "A" or "S"
//		
//
//	public String addPatient (patient) {
////		
////		//public  String Patient s(Product product) {
//	        return repository.addPatient(patient);
//	}
//	
//	}
//	}
//}

//	public Patient addPatient(Patient patient) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}