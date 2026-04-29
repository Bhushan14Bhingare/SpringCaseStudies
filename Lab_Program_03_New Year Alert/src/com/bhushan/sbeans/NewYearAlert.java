package com.bhushan.sbeans;

import java.time.LocalDate;


public class NewYearAlert {
   private LocalDate month;

   public NewYearAlert() {
	
   }

    public void setMonth(LocalDate month) {
	this.month = month;
   }
   
   
	public void getMonth() {
   int month_number 	 =month.getMonthValue();
   
    	
    	if( month_number == 1) {
    		System.out.println("Happy New year");
    	}
    	else if(month_number == 12) {
    		System.out.println("Get ready for the new year!");
    	}
    	else {
    		System.out.println("Regular month.");
    	}
    
    }
   
}
