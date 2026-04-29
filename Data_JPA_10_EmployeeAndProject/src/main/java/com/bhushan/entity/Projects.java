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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employees")
@RequiredArgsConstructor
@NoArgsConstructor
public class Projects {

	@Id
	@Column(name = "Project_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pro_seq_gen")
	@SequenceGenerator(
	    name = "pro_seq_gen",
	    sequenceName = "pro_seq",
	    allocationSize = 1
	)
	private Integer projectId;
	@NonNull

	@Column(name = "Project_Name", length = 25)
	private String projectName;
	@NonNull

	@Column(name = "Client_Name", length = 25)
	private String clientName;
	@NonNull

	@Column(name = "Project_Budget", length = 25)
	private Double budget;
	@NonNull

	@Column(name = "Project_Deadline", length = 25)
	private String deadline;
	

	@ManyToMany(mappedBy = "projects",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Employee> employees = new HashSet<>();

}
