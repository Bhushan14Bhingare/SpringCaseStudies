package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vechile {
      
	@Autowired
	@Qualifier("petrolEngine")
	private Engine engine;
	
	public void startVechile() {
		engine.start();
	}
	
}
