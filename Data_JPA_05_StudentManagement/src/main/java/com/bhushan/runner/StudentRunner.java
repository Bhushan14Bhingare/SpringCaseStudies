package com.bhushan.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Student;
import com.bhushan.service.StudentService;
@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentService service;
	@Override
	public void run(String... args) throws Exception {
		

		
		List<Student> topper = service.findTop3ByOrderByMarksDesc();
		topper.forEach(System.out::println);
		
		List<Student> result = service.findByPassedTrue(false);
		result.forEach(System.out::println);
	}

}
