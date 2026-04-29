package com.bhushan.runner;

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
		
		Student stu = new Student();
		stu.setName("Bhushan");
		stu.setMarks(60d);
		service.saveStudent(stu);
		
		service.searchAllStudent();
		
		service.deleteStudent(1L);
		
		

	}

}
