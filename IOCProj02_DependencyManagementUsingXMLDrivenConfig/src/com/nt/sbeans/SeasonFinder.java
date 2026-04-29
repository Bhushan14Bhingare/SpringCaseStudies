package com.nt.sbeans;

import java.util.Date;

public class SeasonFinder {
         private Date date;

		 public SeasonFinder() {
			 System.out.println("SeasonFinder 0 paramConstructor");
		 }
         
         public void setDate(Date date) {
        	 
        	 System.out.println("SeasonFinder.setDate(-)");
			this.date = date;
		}
         
		 public String seasonFinder() {
        	    @SuppressWarnings("deprecation")
				int month = date.getMonth();
        	    
        	    if(month >= 3 && month <= 6) {
        	    	return "Summer Season";
        	    }
        	    else if(month >= 7 && month <= 10) {
        	    	return "Rainy Season";
        	    }
        	    else {
        	    	return "Winter Season";
        	    }
         }
}
