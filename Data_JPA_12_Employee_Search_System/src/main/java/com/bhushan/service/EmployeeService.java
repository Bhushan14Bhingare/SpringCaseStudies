package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bhushan.entity.Employee;
import com.bhushan.repository.IEmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private IEmployeeRepo repo;
	
	public void findAllEmployee() {
		Sort sortbyName = Sort.by(Sort.Direction.DESC,"name");
		
		List<Employee> all = repo.findAll(sortbyName);
		all.forEach(System.out::println);
		
		
		int pageSize = 2;
		
		for(int i = 0 ; i < 6 ; i++) {
			PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Employee> page = repo.findAll(pageable);
            
            page.getContent().forEach(System.out::println);
		}
		
	}
	
}
