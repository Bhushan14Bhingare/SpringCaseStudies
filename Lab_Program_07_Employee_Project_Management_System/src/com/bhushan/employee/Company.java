package com.bhushan.employee;

import java.util.Map;

public class Company {
    private String companyName;
    private  Map<String,Department> department;
    
    
	public Company(String companyName, Map<String, Department> department) {
		this.companyName = companyName;
		this.department = department;
	}


	public void showCompanyInfo() {
        System.out.println("=== Company Structure ===");
        System.out.println("Company: " + companyName);

        for (Department dept : department.values()) {
            dept.showDepartmentInfo();
        }
    }
    
    
    
    
}
