package com.school.manage.domain;

import java.util.List;

public class School {
	private int schoolId;
	private String schoolName;
	private int noOfStudents;
	private int noOfTeacher;
	private String registrationNumber;

	private Address address;
	private List<Contact> contactList;

	public School() {
		super();
	}

	public School(int schoolId, String schoolName, String registrationNumber) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.registrationNumber = registrationNumber;
	}

	public School(int schoolId, String schoolName, int noOfStudents, int noOfTeacher, String registrationNumber,
			Address address, List<Contact> contactList) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.noOfStudents = noOfStudents;
		this.noOfTeacher = noOfTeacher;
		this.registrationNumber = registrationNumber;
		this.address = address;
		this.contactList = contactList;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfTeacher() {
		return noOfTeacher;
	}

	public void setNoOfTeacher(int noOfTeacher) {
		this.noOfTeacher = noOfTeacher;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", noOfStudents=" + noOfStudents
				+ ", noOfTeacher=" + noOfTeacher + ", registrationNumber=" + registrationNumber + ", address=" + address
				+ ", contactList=" + contactList + "]";
	}

}
