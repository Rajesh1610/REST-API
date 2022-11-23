//package com.rest.demo.patient.repository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.rest.demo.patient.model.Patient;
//
//@Repository
//public class PatientRepositoryImpl2 implements PatientRepository {
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public static void main(String[] args) {
//		SpringApplication.run(PatientRepositoryImpl2.class, args);
//	}
//
//	public void addPatient(Patient patient) throws Exception {
//		String sql = "INSERT INTO patientdetails (id,fristname,lastname,phonenumber,address ) VALUES (?, ?, ?,?,?)";
//
//		int result = jdbcTemplate.update(sql, "107", "Amar", "Shah", "9445715847",
//				"10-Bellandur,sai baba temple,560103");
//
//		if (result > 0) {
//			System.out.println("Patient details has been Added.");
//		}
//
//	}
//
//	//@Override
//	//public void addPatient1(Patient patient) throws Exception {
//		// TODO Auto-generated method stub
//
//	
//}