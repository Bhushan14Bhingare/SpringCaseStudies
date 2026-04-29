package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vechile {

	@Override
	public void assemble() {
		System.out.println("Assembling a Car with automatic transmission.");
	}

}
