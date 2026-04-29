package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("residentialBilling")
public class ResidentialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return 5 * units;
	}

}
