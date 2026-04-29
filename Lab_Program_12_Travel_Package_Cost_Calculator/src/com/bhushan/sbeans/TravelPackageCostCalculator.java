package com.bhushan.sbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TravelPackageCostCalculator {
  @Autowired
 private PackageDetails packagedetails;

	public TravelPackageCostCalculator() {
	}
 
	
	public double calculateFinalPackageCost() {
		double total = packagedetails.getPackageCostPerPerson() *packagedetails.getNumberOfTravelers();
		double discount = total * packagedetails.getDiscountPercentage() / 100;
		return (total-discount);
	}
}
