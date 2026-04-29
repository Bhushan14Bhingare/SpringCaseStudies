package com.bhushan;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.bean.Employee;
import com.bhushan.controller.EmployeeController;

@SpringBootApplication
public class Test05Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx =  SpringApplication.run(Test05Application.class, args);
		
		EmployeeController controller = ctx.getBean(EmployeeController.class);
		while(true) {
		System.out.println("1.Insert Product");
		System.out.println("2.Retrive Product");
		System.out.println("3.Delete Product");
		System.out.println("4.Update Product");
		System.out.println("5.Exit");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1->{
			System.out.println("Enter employee id : ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter a employee name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter employee age : ");
			int age = Integer.parseInt(sc.nextLine());
			

			System.out.print("Enter a salary : ");
			double salary = Double.parseDouble(sc.nextLine());
			
			Employee emp = new Employee(id,name,age,salary);
			int result = controller.addData(emp);
			
			if(result > 0 ) {
				System.out.println("data inserted successfully");
			}
			else {
				System.out.println("data not inserted ");
			}
		}
		
		case 2->{
			List<Employee> list =controller.retrive();
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
		}
		case 3->{
			System.out.println("Enter employee id : ");
			int id = Integer.parseInt(sc.nextLine());
			
			int result = controller.delete(id);
			
			if(result > 0 ) {
				System.out.println("data delete successfully");
			}
			else {
				System.out.println("data not delete ");
			}
		}
		
		case 4->{
			
			System.out.println("Enter employee id : ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter a salary : ");
			double salary = Double.parseDouble(sc.nextLine());
			
			int result = controller.update(id, salary);
			
			if(result > 0 ) {
				System.out.println("data update successfully");
			}
			else {
				System.out.println("data not update ");
			}
		}
		
		case 5->{
			sc.close();
			System.exit(0);
		}
		default ->{
			System.out.println("Please enter a valid option");
		}
		}
		}
	}


	}

