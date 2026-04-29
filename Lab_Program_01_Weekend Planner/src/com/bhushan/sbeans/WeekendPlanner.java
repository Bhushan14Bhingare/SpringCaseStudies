package com.bhushan.sbeans;

import java.time.LocalDate;

public class WeekendPlanner {
   private LocalDate day;
   
   public WeekendPlanner() {
	   System.out.println("WeekendPlanner::0 param Constructor");
   }

   

   public void setDay(LocalDate day) {
	   System.out.println("WeekendPlanner.set the day");
	this.day = day;
	
   }

   public String getWeekDays() {
	   int days = day.getDayOfWeek().getValue();
	   
	   if(days >= 1 && days<=5) {
		   return "It is a Weekdays";
	   }
	   
	   return "It is a weekend";
	
   }
   
}
