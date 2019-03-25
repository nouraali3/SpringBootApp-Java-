package com.noura.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noura.entity.Driver;
import com.noura.entity.Student;
import com.noura.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
//	@RequestMapping(value="/display", method=RequestMethod.GET)
//	public  Map<Integer,Student> getAllStudents() {
//		return this.studentService.getAllStudents();
//	}
	
//	@RequestMapping(value="/{id}", method=RequestMethod.GET)
//	public Driver getStudent(@PathVariable int id)
//	{
//		return this.studentService.getStudentByID(id);
//	}
	
}
