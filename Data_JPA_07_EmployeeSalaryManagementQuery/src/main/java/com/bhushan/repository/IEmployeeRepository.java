package com.bhushan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhushan.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

		
	 // 1. Find by department
	
    @Query("SELECT e FROM Employee e WHERE e.department = :dept")
    List<Employee> findByDepartment(@Param("dept") String dept);

    // 2. Salary between
    
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :min AND :max")
    List<Employee> findSalaryBetween(@Param("min") double min, @Param("max") double max);

    // 3. Experience greater than
    
    @Query("SELECT e FROM Employee e WHERE e.experience > :e")
    List<Employee> findExperienced(@Param("e") int e);

    // 4. Count employees in department
    
    @Query("SELECT COUNT(e) FROM Employee e WHERE e.department = :dept")
    long countByDepartment(@Param("dept") String dept);

    // 5. Highest salary employee
    
    @Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2)")
    Employee getHighestSalaryEmployee();

    // 6. Increase salary
    
    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.salary = e.salary + (e.salary * :percent / 100) WHERE e.id = :id")
    int increaseSalary(@Param("id") Long id, @Param("percent") double percent);

    // 7. Delete low salary employees
    
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.salary < :amount")
    int deleteLowSalary(@Param("amount") double amount);
}
