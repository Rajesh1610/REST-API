package com.rest.demo.patient.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PatientRowMapper implements RowMapper<Patient> {

	@Override
	public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return  new Patient(rs.getInt("id"), rs.getString("fristname"),rs.getString("lastname"), 
				rs.getString("phonenumber"),rs.getString("address"));
	}

}
