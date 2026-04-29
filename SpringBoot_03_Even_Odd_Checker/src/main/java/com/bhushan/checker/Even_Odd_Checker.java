package com.bhushan.checker;

import org.springframework.stereotype.Component;

@Component
public class Even_Odd_Checker {
 
	public String checkEvenOdd(int number) {
		if(number % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}

}
