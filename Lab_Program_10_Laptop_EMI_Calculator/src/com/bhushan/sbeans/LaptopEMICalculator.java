package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopEMICalculator {
     private double laptopPrice;
     private double downPayment;
     private int emiMonths;
     
     @Autowired
	 public LaptopEMICalculator(double laptopPrice, double downPayment, int emiMonths) {
		this.laptopPrice = laptopPrice;
		this.downPayment = downPayment;
		this.emiMonths = emiMonths;
	 }
     
     public double calculateMonthlyEMI() {
    	    return (laptopPrice - downPayment) / emiMonths; 
     }
}
