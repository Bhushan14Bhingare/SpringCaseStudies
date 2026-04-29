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

@Table(name = "Employee")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Column(name = "EMP_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "EMP_NAME",length = 25)
	private String name;
	@Column(name = "EMP_Desgination", length = 25)
	private String desgination;
	@Column(name = "EMP_Salary",length = 9)
	private Double salary;
}
