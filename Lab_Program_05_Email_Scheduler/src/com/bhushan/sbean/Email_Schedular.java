package com.bhushan.sbean;

import java.time.LocalDate;

public class Email_Schedular {
       private LocalDate day;
       
       public Email_Schedular() {
    	   
       }

	   public void setDay(LocalDate day) {
		   this.day = day;
	   }
       
       public void emailGenerate() {
    	      String day = this.day.getDayOfWeek().name();
    	      
    	      if(day.equalsIgnoreCase("Friday")) {
    	    	  System.out.println("Schedule weekly report email.");
    	      }
    	      else if(day.equalsIgnoreCase("Monday")) {
    	    	  System.out.println("Check weekend system logs.");
    	      }
    	      else {
    	    	  System.out.println("Normal weekday operations.");
    	      }
       }
}
