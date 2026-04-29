package com.bhushan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.entity.Employee;
import com.bhushan.service.Management;

@SpringBootApplication
public class DataJpa04EmployeeMangementApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx =SpringApplication.run(DataJpa04EmployeeMangementApplication.class, args);
	 Management mg = ctx.getBean(Management.class);
	 Employee emp = new Employee();
	 emp.setEmpName("Bhushan");
	 emp.setDepartment("Backend");
	 emp.setSalary(25000.0);
	 
	 mg.addEmployee(emp);
	 
	}

}