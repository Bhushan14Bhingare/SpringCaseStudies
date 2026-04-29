package com.bhushan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${emp.id}")
    private int id;

    @Value("${emp.name}")
    private String name;

    @Value("${emp.sal}")
    private double basicSalary;

    @Value("${emp.bonus}")
    private double bonus;

    

    public double getTotalSal() {
        return  (12*basicSalary) + bonus ;
    }

    @Override
    public String toString() {
        return "Employee Id = " + id + ", name = " + name +
                ", Monthly Salary =" + basicSalary +
                ", Bonus =" + bonus + 
                ", totalSal=" + getTotalSal();
    }
}