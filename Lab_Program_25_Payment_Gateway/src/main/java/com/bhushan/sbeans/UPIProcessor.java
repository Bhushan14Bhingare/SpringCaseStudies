package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment via UPI.");
		System.out.println("Amount : "+amount);
	}

}
