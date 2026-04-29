package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class Burger implements Food {

	@Override
	public void prepareFood() {
		System.out.println("Burger is ready for serve");
	}

}
