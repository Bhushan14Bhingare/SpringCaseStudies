package com.bhushan.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeasonService {
	
	@Autowired	
	private LocalDate date;
      
	public String getSeason() {
		int month = date.getMonthValue();
		if(month >= 3 && month <= 6) {
			return "Summer Season";
		}
		else if(month >= 7 && month <= 10) {
			return "Rainy Season";
		}
		else if((month >= 11 && month <= 12 ) || month >=1 && month <= 2) {
			return "Winter Season";
		}
		else {
			return "Invalid month! Please enter 1-12.";
		}
	}
}
