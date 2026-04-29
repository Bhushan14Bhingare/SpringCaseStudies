package com.bhushan.respository;

import java.util.List;

import com.bhushan.bean.Employee;

public interface IEmpDAO {

	
	int insertEmployee(Employee emp) throws Exception;
    List<Employee> retriveAllEmployee() throws Exception;
    int deleteEmployee(int id) throws Exception;
    int updateEmployee(int  id, double salary) throws Exception;
	
}
