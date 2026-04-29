package com.bhushan.sbean;

import java.time.LocalTime;

public class WishMessageGenerator {
    
	private LocalTime time;

	
	public void setTime(LocalTime time) {
		this.time = time;
	}


	public WishMessageGenerator() {
	}
	
	public String wishGenerator(String user) {
	  int hours = time.getHour();
	  if(hours >= 5 && hours <=11) {
		  return user+" Good Morning";
	  }
	  else if(hours >= 12 && hours <=16) {
		  return user+" Good Afternoon";
	  }
	  else if(hours >= 17 && hours <20) {
		  return user+" Good Evening";
	  }
	  else {
		  return user+" Good Night";
	  }
	}
	
}
