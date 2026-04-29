package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("creditCard")
public class CreditCardProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment via Credit Card.");
		System.out.println("Amount : "+amount);

	}

}
