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

@Data
@Entity
@Table(name ="Student_Bhus")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Column(name = "Stu_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Student_Name",length = 20)
	private String name;
	@Column(name = "Student_Mark",length = 10)
	private Double marks;
}
