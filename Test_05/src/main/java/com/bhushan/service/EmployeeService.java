package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.bean.Employee;
import com.bhushan.respository.IEmpDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private IEmpDAO dao ;

	public int addData(Employee emp) throws Exception {
		
		return dao.insertEmployee(emp);
		
	}
	public int update(int id, double salary) throws Exception {
		return dao.updateEmployee(id, salary);
	}
	
	public int delete(int id) throws Exception {
		return dao.deleteEmployee(id);
	}
	
	public List<Employee> retrive() throws Exception{
		return dao.retriveAllEmployee();
		
	}
}
