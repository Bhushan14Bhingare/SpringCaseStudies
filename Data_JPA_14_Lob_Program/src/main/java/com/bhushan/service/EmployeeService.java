package com.bhushan.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.entity.Employee;
import com.bhushan.repository.IEmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private IEmployeeRepo repo;
	
	public void addData(Employee emp) {
		repo.save(emp);
	}
	
	public Optional<Employee> retriveData(Long id) {
	  return repo.findById(id);
		
		
	}
}
