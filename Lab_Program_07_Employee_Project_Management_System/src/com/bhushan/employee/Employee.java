package com.bhushan.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
     @SuppressWarnings("unused")
	private String employeeId;
     private String employeeName;
     private Project project;
     
     
	 
	 public Employee(String employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}



     @Autowired
	 public void setProject(Project project) {
		 this.project = project;
	 }



	
	 public void showEmployeeDetails() {
	        System.out.println(
	            "  Employee: " + employeeName +
	            " | Project: " + project.getProjectName() +
	            " (" + project.getDuration() + ")"
	        );
	    }
     
     
}
