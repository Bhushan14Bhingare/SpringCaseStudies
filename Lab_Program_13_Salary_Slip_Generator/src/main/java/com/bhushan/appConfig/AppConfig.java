package com.bhushan.appConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.Employee;

@Configuration
@ComponentScan(basePackages = {"com.bhushan.sbeans"})
public class AppConfig {
     
	@Bean(name ="emp")
	public Employee createEmployee() {
	Employee e=new Employee();	
	e.setName("Jhon");
	e.setSalary(50000.0);
	e.setHra(5000.0);
	e.setDa(1000);
	e.setId(102);
	e.setTaxPercentage(5);
	return e;
	}
}
