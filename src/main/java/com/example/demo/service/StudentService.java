package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {

	public Student getStudentDetails() {	
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("John");
		student.setPhoneNumber("9080796756");
		return student;
	}

}
