package com.school.manage.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SchoolObject {

	public School getSchool() {

		School school = new School();
		school.setSchoolId(123);
		school.setSchoolName("WISTM");
		school.setNoOfStudents(200);
		school.setNoOfTeacher(30);
		school.setRegistrationNumber("GDSH3647");

		Address address = new Address(23, "Pinagadi", "Pendurthi", "vizag", "visakhapatnam", "AndhraPradesh", "531116");
		List<Contact> contactList = new ArrayList<>();

		Contact contact = new Contact(12, "mobile", "7036421825");
		Contact Contact1 = new Contact();
		Contact1.setContactId(123);
		Contact1.setContactType("Email");
		Contact1.setValue("Mobile");

		contactList.add(contact);
		contactList.add(Contact1);

		school.setAddress(address);
		school.setContactList(contactList);

		return school;
	}
}
