package com.bhushan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.controller.PaymentController;
import com.bhushan.model.Payment;
@Component 
public class Runner implements CommandLineRunner {

	@Autowired
	private PaymentController controller; 
	@Override
	public void run(String... args) throws Exception {
		Payment pay = new Payment(101,2500D,"CreditCard");
		
		controller.payment(pay);
	}

}
