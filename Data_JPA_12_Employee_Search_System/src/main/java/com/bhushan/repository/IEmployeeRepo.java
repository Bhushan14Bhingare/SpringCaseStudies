package com.bhushan.repository;

import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bhushan.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long>,PagingAndSortingRepository<Employee,Long>{

	

}
