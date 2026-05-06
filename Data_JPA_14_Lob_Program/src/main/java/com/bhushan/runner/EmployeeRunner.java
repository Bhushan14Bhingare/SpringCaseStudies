package com.bhushan.runner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Employee;
import com.bhushan.service.EmployeeService;
@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService serv;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Save the Data");
			System.out.println("2.Retrive the Data");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 -> {
				Employee emp = new Employee();
				emp.setName("Bhushan");
				emp.setDepartment("Developer");
				emp.setSalary(90000d);
				
				byte[] allBytes = Files.readAllBytes(Paths.get("C:\\Users\\BHUSHAN\\OneDrive\\Pictures\\1.jpg"));
				emp.setProfile_Photo(allBytes);
				
				String resume = new String(Files.readAllBytes(Paths.get("C:\\Users\\BHUSHAN\\Downloads\\Final_Bhushan_Resume.pdf")));
				
				emp.setResume(resume);
				
				serv.addData(emp);
			}
			
			case 2 ->{
				System.out.println("Employee Imformation Retrieved");
				Optional<Employee> byId = serv.retriveData(52l);;
			    Employee e = byId.get();
			    System.out.println(e.getId());
			    System.out.println(e.getName());
			    System.out.println(e.getDepartment());
			    System.out.println(e.getSalary());
		        Files.write(Paths.get("C:\\Users\\BHUSHAN\\OneDrive\\Pictures\\1.jpg"), e.getProfile_Photo());
			    Files.write(Paths.get("Final_Bhushan_Resume.pdf"), e.getResume().getBytes());
			   
			   System.out.println("SuccessFully Retrieved");
			}

			}
			}
		}
	}


