package com.bhushan.sbeans;

public class PackageDetails {

	private double packageCostPerPerson;

	private int numberOfTravelers;

	private double discountPercentage;

	public PackageDetails() {
	}

	public void setPackageCostPerPerson(double packageCostPerPerson) {
		this.packageCostPerPerson = packageCostPerPerson;
	}

	public void setNumberOfTravelers(int numberOfTravelers) {
		this.numberOfTravelers = numberOfTravelers;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getPackageCostPerPerson() {
		return packageCostPerPerson;
	}

	public int getNumberOfTravelers() {
		return numberOfTravelers;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

}
