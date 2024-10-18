package com.example.restpract.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restpract.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	//define @PostController to load the student data .... only once!
	
	public void loadData() {
		List<Student> theStudents = new ArrayList<Student>();
		
		theStudents.add(new Student("Ayushman","Mohanty"));
		theStudents.add(new Student("Shovan","Mohanty"));
		theStudents.add(new Student("Omkar","Mishra"));
	}
	
	//define endpoint for "/students" - return a list of students
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> theStudents = new ArrayList<Student>();
		
		return theStudents;
	}
	
	//define endpoint for "/students/{studentId}" - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		List<Student> theStudents =  new ArrayList<Student>();
		
		return theStudents.get(studentId);
	}
}
