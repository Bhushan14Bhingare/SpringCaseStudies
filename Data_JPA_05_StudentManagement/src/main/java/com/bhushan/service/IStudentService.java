package com.bhushan.service;

import java.util.List;

import com.bhushan.entity.Student;

public interface IStudentService {

	List<Student> findByCourse(String course);
	
	List<Student> findByMarksGreaterThan(Double marks);
	
	List<Student> findByMarksBetween(Double min,Double max);
	
	List<Student> findByGrade(String grade);
	
	List<Student> findByCity(String city);
	
	List<Student> findByPassedTrue(Boolean status);
	
	List<Student> findByNameStartingWith(String prefix);
	
	List<Student> findByCourseAndPassed(String course,Boolean status);
	
	List<Student> findTop3ByOrderByMarksDesc();
	
	List<Student> findByCityNotIn(List<String> cities);
}
