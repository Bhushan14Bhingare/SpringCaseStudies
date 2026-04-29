package com.bhushan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.bhushan.model.Payment;
@Service
@Profile("test")
public class UpiPaymentService implements IPaymentService {

	@Override
	public void processPayment(Payment p) {
		System.out.println("Processing UPI Payment of <amount>");
	}

}
