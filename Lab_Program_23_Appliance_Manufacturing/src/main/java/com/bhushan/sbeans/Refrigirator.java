package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("refrigerator")
public class Refrigirator implements Appliance {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Refrigerator with inverter technology.");
	}

}
