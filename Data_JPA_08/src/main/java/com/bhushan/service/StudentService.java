package com.bhushan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.entity.Student;
import com.bhushan.repo.IStudentRepo;

@Service
public class StudentService {

	@Autowired
	private IStudentRepo repo;
	
	public void saveStudent(Student stu) {
		repo.save(stu);
	}
	
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
	
	public void searchAllStudent() {
	Iterable<Student> stu =	repo.findAll();
	stu.forEach(System.out::println);
	}
}
