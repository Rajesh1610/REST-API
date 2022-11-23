package com.rest.demo.patient.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.Statement;
import com.rest.demo.patient.model.Patient;
import com.rest.demo.patient.model.PatientRowMapper;

@Repository
public class PatientRepositoryImpl implements PatientRepository {

	@Autowired
	private DataSource dataSource;
	/// private JdbcTemplate jdbcTemplate;
	

	public void setDataSource(DataSource ds) {
		dataSource = ds;
	}

	@Override
	public void addPatient(Patient patient) throws Exception {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO PATIENT(id,fristname,lastname,phonenumber,address) VALUES (?, ?, ?,?,?)";

		int result = insert.update(sql, patient.getId(), patient.getFristname(), patient.getLastname(),
				patient.getPhonenumber(), patient.getAddress());
		if (result > 0) {
			System.out.println("Patientdetails has been added");
		}
	}

	@Override
	public List<Map<String, Object>> getallPatients() throws Exception {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM PATIE	NT";
		List<Map<String, Object>> patientList = insert.queryForList(sql);
		return patientList;

	}

	@Override
	public Optional<Patient> findPatientByFristname(String fristName) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		// List<Patient> Patientfirst = null;
		String sql = "SELECT * FROM PATIENT WHERE FRISTNAME = ?";
		return insert.query(sql, new PatientRowMapper(), fristName).stream().findFirst();
	}

	public Optional<Stream<Patient>> findListOfPatientByFristname(String fristname) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM PATIENT WHERE fristname = ?";
		return Optional.ofNullable(insert.query(sql, new PatientRowMapper(), fristname).stream());
	}

	@Override
	public List<Patient> findPatientByFLname(String fristname, String lastname) {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM PATIENT WHERE FRISTNAME = ? AND LASTNAME = ?";

		return (select.query(sql, new PatientRowMapper(), new Object[] { fristname, lastname }));
	}
	@Override
	
	public List<Patient> findPatientByGeneric(int id, String fristname, String lastname, String address,
			String phonenumber) {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM PATIENT WHERE  ID=? AND FRISTNAME = ?AND LASTNAME = ? AND ADDRESS=? AND PHONENUMBER=?";
		return (select.query(sql,new PatientRowMapper(),new Object[] { id,fristname, lastname ,address,phonenumber}));
	}
}

//////




 class Generic<T,S,U,V,W> 
 
 {
	 
	 T findPatientByid;
	 U findPatientByFristname;
	 S findPatientByLastname;
	 V findPatientByaddress;
	 W findPatientByphonenumber;
 
	 
	 
	 
	 public void print()
	 {
		 System.out.println("findPatientByid");
		 System.out.println("findPatientByFristname");
		 System.out.println("findPatientLastname");
		 System.out.println("findPatientByaddress");
		 System.out.println("findPatientByphonenumber");
	 }
 }

 
 	class Main
 	{
 		public static Generic<Integer, String, String, String, String> main(String[] args)
 		{
 			 	Generic<Integer,String,String,String,String> generic = new Generic<Integer,String,String,String,String>(patient.getId(), 
 			 										patient.getFristname(), patient.getLastname(),
 			 										spatient.getPhonenumber(), patient.getAddress());
 			 	 return generic;
 			 	
 		}
 	}
//public <T> List<T> selectQuery(Class<T> type, query) throws SQLException {
//    List<T> list = new ArrayList<T>();
//    try (Connection conn = dataSource.getConnection()) {
//        try (Statement stmt = conn.createStatement()) {
//            try (ResultSet rst = stmt.executeQuery(query)) {
//                while (rst.next()) {
//                    T t = type.newInstance();
//                    loadResultSetIntoObject(rst, t);
//                    list.add(t);
//                }
//            }
//        } catch (InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException("Unable to get the records: " + e.getMessage(), e);
//        }
//    }
//    return list;
//}
//
//private void loadResultSetIntoObject(ResultSet rst, T t) {
//	// TODO Auto-generated method stub
//	
//}
//}
//
//
//
//
//
//
//
//
//
//
//
//
















































//public List<Patient> findPatientByGeneric(int id, String fristname, String lastname, String address,
//		String phonenumber) {
//	JdbcTemplate select = new JdbcTemplate(dataSource);
//	String sql = "SELECT * FROM PATIENT WHERE  ID=? AND FRISTNAME = ? AND LASTNAME = ? AND ADDRESS=? AND PHONENUMBER=?";
//	return (select.query(sql,new PatientRowMapper(),new Object[] { id,fristname, lastname ,address,phonenumber}));
//}
//}
//
//// {
//		try {
//			while(ResultSet.next());
//			list.add(Patient);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//			
//	}
//	

//	
//	Patient patient = new Patient(0, null, null, null,null);		
//	String query = "SELECT * FROM PATIENT WHERE firstname =? and lastname =?";
//	PreparedStatement statement = con.prepareStatement(query);
//	statement.setString(1, String.valueOf(fristname));
//	statement.setString(1, String.valueOf(lastname));
//	ResultSet resultSet = statement.executeQuery();
//	try {
//		while(resultSet.next())
//		Patient = new  Patient(Integer.parseInt(resultSet.getString("id")),resultSet.getString("firstname") , resultSet.getString("lastname"), query, query);
//		    
//                Fl.add(patient);
//	    }
//              catch (SQLException e) 
//                {}
//	return Fl;

//	public List<Patient> findPatientByFLname(String fristname, String lastname) {
//		String sql = "SELECT * FROM PATIENT WHERE FRISTNAME = ? AND LASTNAME = ?";
//		return jdbcTemplate.query(sql, new PatientRowMapper(), fristname, lastname);
//	}

//		 Patient patient = new patient();
//		 patient.setFristname(rs.getString("fristname"));
//		 patient.setLastname(rs.getString("lastaname"));
//		 return Patient;

//	

//public List<Patient> select(String firstname, String lastname) {
////DataSource dataSource;
//JdbcTemplate select = new JdbcTemplate(dataSource);
//return select
//		.query(
//				"select  *  from PATIENT where FIRSTNAME = ? AND LASTNAME= ?",
//				new Object[] { fristname, lastname },
//				new PatientRowMapper());

// @SuppressWarnings("unchecked")
//		Patient patientDetails = (Patient) jdbcTemplate.queryForObject();
//		return Patientfirst;

//		String sql = "SELECT * FROM PATIENT WHERE fristname=?";
//		return (List<Patient>) jdbcTemplate.queryForObject(sql,new Object[] {fristname}, new BeanPropertyRowMapper(Patient.class));

// List<Patient> Patientfirst = null;
// String sql = "SELECT * FROM PATIENT WHERE fristname = ?";
// @SuppressWarnings("unchecked")
//		List<Patient> patientDetails = (Patient) jdbcTemplate.query( "SELECT * FROM PATIENT WHERE fristname = ?", 
//				new Object[] {firstName},
//				new BeanPropertyRowMapper(Patient.class));
//		return Patientfirst;

//	@Override
//	public List<Patient> findPatientByFristname(String firstName) {
//		List<Patient> Patientfirst = null;
//		String sql = "SELECT * FROM PATIENT WHERE fristname = ?";
//		@SuppressWarnings("unchecked")
//		Patient patientDetails =  (Patient) jdbcTemplate.queryForList(sql, new Object[] {firstName},new
//				 BeanPropertyRowMapper(Patient.class));
//		return Patientfirst;

// ("SELECT * FROM PATIENT WHERE fristname = ?", new
// BeanPropertyRowMapper(Patient.class),patient.getFristname());

////int result1 = jdbcTemplate.update(sql, "121", "Akash", "Krishna", "9362817225",
////"60-Podanur,B3 policestation,556743");
////int result2 = jdbcTemplate.update(sql, "135", "Arun", "Kumar", "9539952071", "70-kodanur,I3 petrolbunk,641024");
////
////int result3 = jdbcTemplate.update(sql, "155", "Shree", "Shan", "7827392292", "50-Kuruchi,RR Hospital,641087");
//
//if (result1 > 0) {
//
//if (result2 > 0) 
//if (result3 > 0) {
//System.out.println(" List of Patientdetails has been added");
//}
//}
//
//}

//	@Override
//	public void findPatientByFristname(String fristname) {
//		// TODO Auto-generated method stub

//	@Override
//	public Patient findPatientByFristname(String fristname) {
//		return jdbcTemplate.findPatientByFristname(fristname);

//	public List<Patient> addPatient(List<Patient> patient) {
//		
//		ArrayList<Patient> patientList = new ArrayList<>();
//		Patient p1= new Patient(patient.get(0).getId(),patient.get(0).getfristName().patient)
//		p1.add
//		
//	
//		String sql = "INSERT INTO patientdetails (id,fristname,lastname,phonenumber,address ) VALUES (?, ?, ?,?,?)";
//		
//		for(int i=0;i<p1.size();i++)
//			
//			p1 = p1.add(sql, ((Patient) patient).getId(), ((Patient) patient).getfristName(),
//					((Patient) patient).getlastName(), ((Patient) patient).getphoneNumber(),
//					((Patient) patient).getaddress());
//			
//		System.out.print(p1.get(p1) +"Patient.getId()","" );
//		
//		
//		System.out.println("Patientdetails has been added");
//		

// Patient.getfristName();

//		//int result1 = jdbcTemplate.update(sql, ((Patient) patient).getId(), ((Patient) patient).getfristName(),
//				((Patient) patient).getlastName(), ((Patient) patient).getphoneNumber(),
//				((Patient) patient).getaddress());

// if (result > 0)
// if (result1 > 0) {

// System.out.println("Patientdetails has been added");

// }return patient;

//	@Override
//	public void addPatient(Patient patient) throws Exception {
//		// TODO Auto-generated method stub

//	@Override
//	public void addPatient(Patient patient) throws Exception {
//		// TODO Auto-generated method stub

//public void addPatient(Patient patient) throws Exception {
//int result = jdbcTemplate.update(sql, "101", "Arjun", "Singh", "9445716871",
// "80-Bellandur,sai baba temple,560103");
/*
 * 
 * ;
 * 
 * int result = jdbcTemplate.update(sql, "101", "Arjun", "Singh", "9445716871",
 * "80-Bellandur,sai baba temple,560103");
 * 
 * if (result > 0) { System.out.println("Patientdetails has been added");
 * 
 * } }
 */
