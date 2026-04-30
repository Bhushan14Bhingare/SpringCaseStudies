package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Employee {

	@Id
	@Column(name="EMP_ID")
	private Long id;
	@Column(name="EMP_NAME")
	private String name;
	@Column(name="EMP_DESGINATION")
	private String desgination;
	@Column(name="EMP_SALARY")
	private Double salary;

}
