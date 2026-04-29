package com.bhushan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.beans.Employee;

@SpringBootApplication
public class SpringBoot08Properties01Application {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringBoot08Properties01Application.class, args);
	Employee emp = ctx.getBean(Employee.class);
	System.out.println(emp);
	}

}
