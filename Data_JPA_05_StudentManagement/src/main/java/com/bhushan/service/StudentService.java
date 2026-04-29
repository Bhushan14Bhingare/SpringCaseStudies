package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Student;
import com.bhushan.repository.StudentRepository;
@Component
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> findByCourse(String course) {
		return repository.findByCourse(course);
	}

	@Override
	public List<Student> findByMarksGreaterThan(Double marks) {
		return repository.findByMarksGreaterThan(marks);
	}

	@Override
	public List<Student> findByMarksBetween(Double min, Double max) {
		return repository.findByMarksBetween(min, max);
	}

	@Override
	public List<Student> findByGrade(String grade) {
		return repository.findByGrade(grade);
	}

	@Override
	public List<Student> findByCity(String city) {
		return repository.findByCity(city);
	}

	@Override
	public List<Student> findByPassedTrue(Boolean status) {
        return repository.findByPassedTrue(status);
	}

	@Override
	public List<Student> findByNameStartingWith(String prefix) {
		return repository.findByNameStartingWith(prefix);
	}

	@Override
	public List<Student> findByCourseAndPassed(String course, Boolean status) {
		return repository.findByCourseAndPassed(course, status);
	}

	@Override
	public List<Student> findTop3ByOrderByMarksDesc() {		
		return repository.findTop3ByOrderByMarksDesc();
	}

	@Override
	public List<Student> findByCityNotIn(List<String> cities) {
		return repository.findByCityNotIn(cities);
	}

	public void saveAll(List<Student> list) {
		repository.saveAll(list);
	}
	
}
