package com.bhushan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.bhushan.entity.Employee;
import com.bhushan.repository.IEmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.*;

@SpringBootApplication
public class EmployeeSorting implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSorting.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Insert sample data
    	/*
        repository.save(new Employee(null, "Alice", "Developer", 50000.0));
        repository.save(new Employee(null, "Bob", "Manager", 70000.0));
        repository.save(new Employee(null, "Charlie", "Tester", 40000.0));
        repository.save(new Employee(null, "David", "Developer", 55000.0));
        repository.save(new Employee(null, "Eve", "HR", 45000.0));
        repository.save(new Employee(null, "Frank", "Developer", 60000.0));
        */   
        
        System.out.println("=== PAGINATION ===");

        int pageSize = 3;

        for (int i = 0; i < 2; i++) {
            Pageable pageable = PageRequest.of(i, pageSize);
            Page<Employee> page = repository.findAll(pageable);

            System.out.println("Page " + (i + 1));
            page.getContent().forEach(System.out::println);
            System.out.println("------------------");
        }

       
        System.out.println("=== SORT BY NAME ASC ===");

        Sort sortByName = Sort.by(Sort.Direction.ASC, "name");
        repository.findAll(sortByName).forEach(System.out::println);

        System.out.println("=== SORT BY SALARY DESC ===");

        Sort sortBySalary = Sort.by(Sort.Direction.DESC, "salary");
        repository.findAll(sortBySalary).forEach(System.out::println);
    }
}