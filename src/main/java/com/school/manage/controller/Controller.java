package com.school.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.manage.domain.School;
import com.school.manage.domain.SchoolObject;

@RestController
@RequestMapping("/api/v1/school")
public class Controller {
	
	@Autowired
	public SchoolObject schoolObject;
	
	@GetMapping("/getSchool")
	public School getSchool() {
		return schoolObject.getSchool();
	}
	
	@GetMapping("/getSchoolOfStudent")
	public School getSchoolOfStudent() {
		School school = new School(123,"WISTM","YE27364");
		return school;
	}
}
