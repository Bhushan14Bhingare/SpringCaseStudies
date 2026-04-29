package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanService {
    
	@Autowired
	@Qualifier("carLoan")
	private InterestStrategy type;
	
	
	public void processLoan(double amount) {
		System.out.println("Loan Type : Car Loan");
		System.out.println("Loan amount "+amount);
		System.out.println("Interest Amount "+type.calculateInterest(amount));
		
	}
	
}
