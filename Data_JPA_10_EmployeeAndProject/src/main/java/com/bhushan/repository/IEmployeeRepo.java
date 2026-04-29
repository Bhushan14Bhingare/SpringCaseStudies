package com.bhushan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
