package com.rest.demo.patient.repository;

public class GenericMethod<T extends Number> {
	private T id, fristName, lastName, address, phoneNumber;

	public GenericMethod(T id, T fristName, T lastName, T address, T phoneNumber) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public T getFristName() {
		return fristName;
	}

	public void setFristName(T fristName) {
		this.fristName = fristName;
	}

	public T getLastName() {
		return lastName;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public T getAddress() {
		return address;
	}

	public void setAddress(T address) {
		this.address = address;
	}

	public void setLastName(T lastName) {
		this.lastName = lastName;
	}

	public T getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(T phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "GenericMethod [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", address="
				+ address + ", phoneNumber=" + phoneNumber + "]";
	}
}
