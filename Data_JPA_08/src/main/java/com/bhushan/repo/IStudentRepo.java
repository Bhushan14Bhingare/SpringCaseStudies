package com.bhushan.repo;

import org.springframework.data.repository.CrudRepository;

import com.bhushan.entity.Student;

public interface IStudentRepo extends CrudRepository<Student, Long> {

}
