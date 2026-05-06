package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Employee_Table")
@NoArgsConstructor
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_id")
	private Long id;
	@Column(name = "Emp_name", length =10)
	private String name;
	@Column(name = "Emp_depart",length =10)
	private String department;
	@Column(name = "Emp_sal",length =5)
	private Double salary;
	@Column(name = "Emp_photo")
	@Lob
	private byte[] profile_Photo;
	@Lob
	@Column(name = "Emp_resume")
	private String resume;
}
