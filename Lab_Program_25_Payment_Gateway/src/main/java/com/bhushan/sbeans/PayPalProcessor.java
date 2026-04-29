package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment via PayPal.");
		System.out.println("Amount : "+amount);
	}

}
