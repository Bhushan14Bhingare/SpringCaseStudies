package com.bhushan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.student_result.Student;

@SpringBootApplication
public class SpringBoot10Properties03Application {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(SpringBoot10Properties03Application.class, args);
	  Student student = ctx.getBean(Student.class);
	  student.displayResult();
	}

}
