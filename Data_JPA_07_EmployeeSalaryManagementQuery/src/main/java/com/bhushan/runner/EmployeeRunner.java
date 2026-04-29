package com.bhushan.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Employee;
import com.bhushan.repository.IEmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n=== Employee Salary Menu ===");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View All Employees");
	            System.out.println("3. Find by Department");
	            System.out.println("4. Find Salary Between Range");
	            System.out.println("5. Find Experienced Employees");
	            System.out.println("6. Count Employees in Department");
	            System.out.println("7. Highest Salary Employee");
	            System.out.println("8. Increase Salary");
	            System.out.println("9. Delete Low Salary Employees");
	            System.out.println("10. Exit");

	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    sc.nextLine();
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Department: ");
	                    String dept = sc.nextLine();
	                    System.out.print("Salary: ");
	                    double salary = sc.nextDouble();
	                    System.out.print("Experience: ");
	                    int exp = sc.nextInt();

	                    repo.save(new Employee(null,name, dept, salary, exp));
	                    System.out.println("Employee Added!");
	                    break;

	                case 2:
	                    repo.findAll().forEach(System.out::println);
	                    break;

	                case 3:
	                    sc.nextLine();
	                    System.out.print("Enter Department: ");
	                    String d = sc.nextLine();

	                    List<Employee> list = repo.findByDepartment(d);
	                    list.forEach(System.out::println);
	                    break;

	                case 4:
	                    System.out.print("Min Salary: ");
	                    double min = sc.nextDouble();
	                    System.out.print("Max Salary: ");
	                    double max = sc.nextDouble();

	                    repo.findSalaryBetween(min, max).forEach(System.out::println);
	                    break;

	                case 5:
	                    System.out.print("Experience > ");
	                    int e = sc.nextInt();

	                    repo.findExperienced(e).forEach(System.out::println);
	                    break;

	                case 6:
	                    sc.nextLine();
	                    System.out.print("Department: ");
	                    String dep = sc.nextLine();

	                    long count = repo.countByDepartment(dep);
	                    System.out.println("Count: " + count);
	                    break;

	                case 7:
	                    System.out.println(repo.getHighestSalaryEmployee());
	                    break;

	                case 8:
	                    System.out.print("Employee ID: ");
	                    Long id = sc.nextLong();
	                    System.out.print("Increase %: ");
	                    double percent = sc.nextDouble();

	                    repo.increaseSalary(id, percent);
	                    System.out.println("Salary Updated!");
	                    break;

	                case 9:
	                    System.out.print("Delete salary");
	                    double amt = sc.nextDouble();

	                    repo.deleteLowSalary(amt);
	                    System.out.println("Employees Deleted!");
	                    break;

	                case 10:
	                    System.exit(0);
	            }
	        }
	    }
	}

