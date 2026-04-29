package com.bhushan.sbeans;

public class Employee {
   
	private int id;
	private String name;
	private double salary;
	private double hra;
	private double da;
	private double taxPercentage;
	
	
	public Employee() {
		System.out.println("Employee 0 :: param Constructor");
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public void setDa(double da) {
		this.da = da;
	}


	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public double getHra() {
		return hra;
	}


	public double getDa() {
		return da;
	}


	public double getTaxPercentage() {
		return taxPercentage;
	}
	
	
}
