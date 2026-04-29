package com.bhushan.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter

@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "Employee1")
public class Employee {

	@Id
	@Column(name = "Emp_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_gen")
	@SequenceGenerator(
	    name = "emp_seq_gen",
	    sequenceName = "emp_seq",
	    allocationSize = 1
	)	private Integer empId;
	@NonNull
	@Column(name = "Emp_Name", length = 15)
	private String empName;
	@NonNull
	@Column(name = "Emp_Department", length = 10)
	private String department;
	@NonNull

	@Column(name = "Emp_Salary", length = 8)
	private Double salary;
	@NonNull

	@Column(name = "Emp_email", length = 25)
	private String email;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "employee_projects", joinColumns = @JoinColumn(name = "E_ID"), 
	inverseJoinColumns = @JoinColumn(name = "Proj_Id"))
	private Set<Projects> projects = new HashSet<>();

}