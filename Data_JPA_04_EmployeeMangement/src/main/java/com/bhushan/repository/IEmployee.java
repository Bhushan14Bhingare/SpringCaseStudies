package com.bhushan.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhushan.entity.Employee;

public interface IEmployee extends CrudRepository<Employee, Integer> {

	
}
