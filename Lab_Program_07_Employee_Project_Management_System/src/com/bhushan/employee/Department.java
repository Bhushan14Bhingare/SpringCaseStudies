package com.bhushan.employee;

import java.util.List;

public class Department {
     private String departmentName;
     private List<Employee> employees;
     
     
	 public Department(String departmentName, List<Employee> employees) {
		this.departmentName = departmentName;
		this.employees = employees;
	 }


	 public void showDepartmentInfo() {
	        System.out.println("Department: " + departmentName);
	        for (Employee emp : employees) {
	            emp.showEmployeeDetails();
	        }
	    }
	 
     
}
