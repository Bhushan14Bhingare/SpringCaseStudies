package com.bhushan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhushan.bean.Employee;

import com.bhushan.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService dao ;

	public int addData(Employee emp) throws Exception {
		
		return dao.addData(emp);
		
	}
	public int update(int id, double salary) throws Exception {
		return dao.update(id, salary);
	}
	
	public int delete(int id) throws Exception {
		return dao.delete(id);
	}
	
	public List<Employee> retrive() throws Exception{
		return dao.retrive();
		
	}

}
