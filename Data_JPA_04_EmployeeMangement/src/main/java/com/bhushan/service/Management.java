package com.bhushan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.entity.Employee;
import com.bhushan.repository.IEmployee;

@Service
public class Management implements IManagement {

	@Autowired
	private IEmployee emp1;
	public void addEmployee(Employee emp) {
	   Employee e1 =   emp1.save(emp);
	    System.out.println(e1);
	}

}
