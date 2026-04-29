package com.bhushan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhushan.employee.Company;

public class MainApp {
     public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com\\bhushan\\config\\SpringConfig.xml");
		
		Company company = (Company) ctx.getBean(Company.class);
		company.showCompanyInfo();
		ctx.close();
	}
}
