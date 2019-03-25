package com.noura.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.noura.entity.Student;

@Repository
public class StudentDao 
{
	private static Map<Integer, Student> studentList;

	static 
	{
		studentList = new HashMap<Integer, Student>();
		studentList.put(1, new Student(1,"noura","english"));
		studentList.put(2, new Student(2,"ann","french"));
		studentList.put(3, new Student(3,"bob","social"));
	}
	
	@SuppressWarnings("static-access")
	public Map<Integer,Student> getAllStudents() {
		return this.studentList;
	}
}
