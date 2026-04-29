package com.bhushan.sbeans;

import java.time.LocalDate;

public class CalendarService {
     private LocalDate date;

	 public CalendarService() {
	 }

	 public void setDate(LocalDate date) {
		 this.date = date;
	 }
	 
	 
     public void getDate() {
    	  int day =   date.getDayOfMonth();
    	  
    	  if(day >= 30 && day <= 31) {
    		  System.out.println("Month is ending, please submit reports.");
    	  }
    	  else {
    		  System.out.println("Continue working as usual.");
    	  }
     }
     
     
}
