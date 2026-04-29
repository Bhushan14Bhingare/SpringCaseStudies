package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("washingMachine")
public class WashingMachine implements Appliance{

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Washing Machine with smart sensors.");
	}

}
