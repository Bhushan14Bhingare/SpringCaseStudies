package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vechile {
 
	private String vechileName;
	private Engine engine;
	private Tyre tyre;
	
	
	
	public Vechile(Engine engine) {
		this.engine = engine;
	}

	public void setVechileName(String vechileName) {
		this.vechileName = vechileName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void displayVechileInfo() {
		System.out.println("Vechile Name=" + vechileName );
		engine.showEngineDetails() ; tyre.showTyreDetails();
	}
	
	
	
}
