package com.bhushan.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GooglePayService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+ " using Payment");
	}
    
	
}
