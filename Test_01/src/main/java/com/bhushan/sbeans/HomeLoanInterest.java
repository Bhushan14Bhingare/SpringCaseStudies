package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("homeLoan")
public class HomeLoanInterest implements InterestStrategy {

	@Override
	public double calculateInterest(double amount) {
		double interestPercent = 0.07;
		double intersetAmonut = amount * interestPercent;
		return intersetAmonut;
	}

}
