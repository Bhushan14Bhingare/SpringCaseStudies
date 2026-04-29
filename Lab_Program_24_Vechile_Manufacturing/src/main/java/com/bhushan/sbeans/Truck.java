package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Vechile {

	@Override
	public void assemble() {
	System.out.println("Assembling a Truck with heavy-duty engine.");	
	}

}
