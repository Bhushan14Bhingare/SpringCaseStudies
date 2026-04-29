package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class PaymentProcessor {
	
	@Autowired
	@Qualifier("googlePayService")
     private PaymentService paymentService ;
	
	public void processPayment(double amount) {
		paymentService.pay(amount);
	}
     
}
