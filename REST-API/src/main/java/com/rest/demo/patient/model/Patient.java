package com.rest.demo.patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name = "Patientdetails")
public class Patient {

	@Id
	@Column
	@GeneratedValue
	private int id;
	private String fristname;
	private String lastname;
	private String phonenumber;
	private String address;

	public Patient(int id, String fristname, String lastname, String phonenumber, String address) {
		super();
		this.id = id;
		this.fristname = fristname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getallPatients() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", fristname=" + fristname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", address=" + address + "]";
	}
}

//package com.rest.demo.patient.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
////@Entity
////@Table(name="patientdetails")
//@Entity
//public class Patient {
//
//	@Id
//
//	private int id;
//	private String firstname;
//	private String lastname;
//	private String phonenumber;
//	private String address;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getFirstname() {
//		return getFirstname();
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getPhonenumber() {
//		return phonenumber;
//	}
//
//	public void setPhonenumber(String phonenumber) {
//		this.phonenumber = phonenumber;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddressr(String address) {
//		this.address = address;
//	}
//
//}
