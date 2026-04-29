package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class SalarySlipService {
     
	
	private Employee emp;
	
	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	public void generateSlip() {
		System.out.println("Salary Slip for "+emp.getName());
		double grossSalary = emp.getSalary() + emp.getHra() + emp.getDa();
		double  taxAmount = (grossSalary * emp.getTaxPercentage()) / 100;
		double netSalary = grossSalary - taxAmount;
		System.out.println("Gross Salary : "+grossSalary);
		System.out.println("Tax Amount : "+taxAmount);
		System.out.println("Net Salary : "+netSalary);
	}

	

	
	
}



