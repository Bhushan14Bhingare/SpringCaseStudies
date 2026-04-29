package com.bhushan.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PaymentFactory {
  
	@Autowired
	private Map<String,PaymentProcessor> payment;
	
	public PaymentProcessor getPaymentProcessor(String type) {
		return payment.get(type);
		
	}
}
