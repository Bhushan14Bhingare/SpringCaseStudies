package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("industrialBilling")
public class InndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return 10 * units;
	}

}
