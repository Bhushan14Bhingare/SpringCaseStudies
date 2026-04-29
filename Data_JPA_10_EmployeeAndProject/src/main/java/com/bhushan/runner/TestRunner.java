package com.bhushan.runner;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bhushan.entity.Employee;
import com.bhushan.entity.Projects;
import com.bhushan.repository.IEmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepo empRepo;
	@Transactional
	@Override
	public void run(String... args) throws Exception {

		

		Projects p1=new Projects(
				"Banking Application",
				"HDFC",500000.0,"6 Months"
			);
		

			Projects p2=new Projects(
				"Ecommerce Platform",
				"Amazon",800000.0,"8 Months"
			);

			Set<Projects> list = new HashSet<>();
			list.add(p2);
			list.add(p1);

			Employee e1=new Employee(
				"Rahman","Java",
				65000.0,"rahman@gmail.com"
			);
			

			Employee e2=new Employee(
				"Kiran","Testing",
				55000.0,"kiran@gmail.com"
			);
			e1.setProjects(list);
			e2.setProjects(list);

			Set<Employee> elist = new HashSet<>();
			elist.add(e2);
			elist.add(e1);
			
			p1.setEmployees(elist);
			p2.setEmployees(elist);


			empRepo.save(e1);
			empRepo.save(e2);


			System.out.println("Data Saved Successfully");


			System.out.println("\nEmployee and Project Details");
			empRepo.findAll().forEach(emp->{

				System.out.println("----------------------");
				System.out.println("Employee Id : "
						+emp.getEmpId());
				System.out.println("Employee Name : "
						+emp.getEmpName());
				System.out.println("Department : "
						+emp.getDepartment());
				System.out.println("Salary : "
						+emp.getSalary());
				System.out.println("Email : "
						+emp.getEmail());

				System.out.println("Assigned Projects");

				emp.getProjects().forEach(project->{
					System.out.println(
					project.getProjectName()
					+" - "+project.getClientName()
					);
				});

			});


			System.out.println("\nEmployees Working Under Project");
			Optional<Employee> op=
					empRepo.findById(101);

			if(op.isPresent()){

				Employee emp=op.get();

				for(Projects p:emp.getProjects()) {

					if(p.getProjectName()
					 .equals("Ecommerce Platform")) {

						System.out.println(
						"\nProject : "
						+p.getProjectName());

						p.getEmployees()
						 .forEach(e->
						System.out.println(
						e.getEmpName()));
					}
				}
			}


	}

}
