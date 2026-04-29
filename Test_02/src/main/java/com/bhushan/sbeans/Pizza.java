package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class Pizza implements Food {

	@Override
	public void prepareFood() {
		System.out.println("Pizza is ready for serve");
	}

}
