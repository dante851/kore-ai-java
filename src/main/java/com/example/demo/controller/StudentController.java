package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import jakarta.websocket.server.PathParam;


@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/students")
	public Student getStudentDetails() {
		
		Student student = studentService.getStudentDetails();
		
		return student;
	}
}
