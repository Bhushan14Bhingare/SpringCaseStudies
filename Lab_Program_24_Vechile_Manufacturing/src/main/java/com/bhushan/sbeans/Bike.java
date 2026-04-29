package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vechile {

	@Override
	public void assemble() {
		System.out.println("Assembling a Bike with lightweight alloy frame.");
	}

}
