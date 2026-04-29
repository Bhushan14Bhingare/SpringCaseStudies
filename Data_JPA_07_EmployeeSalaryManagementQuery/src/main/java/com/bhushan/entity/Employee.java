package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee_Details")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	@Id
	@Column(name = "Emp_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Column(name = "Emp_Name")
    private String name;
	
	@Column(name = "Emp_Department")
    private String department;
	
	@Column(name = "Emp_salary")
    private Double salary;
	
	@Column(name = "Emp_experience")
    private Integer experience;

}
