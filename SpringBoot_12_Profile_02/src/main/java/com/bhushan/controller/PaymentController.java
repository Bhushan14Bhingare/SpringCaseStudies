package com.bhushan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.model.Payment;
import com.bhushan.service.IPaymentService;

@Component
public class PaymentController {

	@Autowired
	private IPaymentService service;
	
	public void payment(Payment pay) {
		service.processPayment(pay);
	}
	
}
