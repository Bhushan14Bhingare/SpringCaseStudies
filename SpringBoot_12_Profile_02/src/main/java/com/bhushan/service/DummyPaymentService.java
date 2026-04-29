package com.bhushan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.bhushan.model.Payment;
@Service
@Profile("dev")
public class DummyPaymentService implements IPaymentService {

	@Override
	public void processPayment(Payment p) {
		System.out.println("Processing Dummy Payment of <amount>");
	}

}
