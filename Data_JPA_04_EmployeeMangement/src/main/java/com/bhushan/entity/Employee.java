package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Employee_Management")

public class Employee {
     @Column(name = "Emp_Id")
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
     @Column(name = "Emp_Name", length = 25)
	private String empName;
     @Column(name = "Department_Name", length = 25)
	private String department;
     @Column(name = "Emp_Salary", length = 10)
	private Double salary;
     
	 public Employee() {
	 }

	 @Override
	 public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	 }
     
     
}
