package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {
    public double calculateTax(double amount) {
    	
    	double taxAmount = (amount * 0.18);
    	
		return taxAmount;     	
    }
}
