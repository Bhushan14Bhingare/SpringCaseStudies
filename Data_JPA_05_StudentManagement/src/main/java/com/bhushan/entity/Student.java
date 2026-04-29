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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Information")
public class Student {

	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Student_Name", length = 25)
	private String name;
	@Column(name = "Student_Course", length = 25)
	private String course;
	@Column(name = "Student_Marks", length = 5)
	private Double marks;
	@Column(name = "Student_Grade",length = 2)
	private String grade;
	@Column(name = "Student_City", length = 30)
	private String city;
	@Column(name = "Result", length = 5)
	private Boolean passed;

}
