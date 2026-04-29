package com.bhushan.sbeans;

public class Engine {
      private String engineType;
      private String horsePower;
      
      
	  public Engine(String engineType, String horsePower) {
		this.engineType = engineType;
		this.horsePower = horsePower;
	  }


	  
	  public void showEngineDetails()
 {
		System.out.println("Engine Type=" + engineType + ", Horse Power=" + horsePower );
	  }
      
	  
      
}
