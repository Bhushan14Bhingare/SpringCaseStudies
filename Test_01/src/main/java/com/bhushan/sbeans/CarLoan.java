package com.bhushan.sbeans;


import org.springframework.stereotype.Component;

@Component("carLoan")

public class CarLoan implements InterestStrategy {

	@Override
	public double calculateInterest(double amount) {
		double interestPercent = 0.09;
		double intersetAmonut = amount * interestPercent;
		return intersetAmonut;
	}

}
