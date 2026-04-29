package com.bhushan.sbeans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterUtil {

	public  static String formatDateForLocale(Locale locale)
	{
		LocalDate today = LocalDate.now();

	    DateTimeFormatter formatter =
	            DateTimeFormatter.ofPattern("dd MMM yyyy", locale);
	    

	    return today.format(formatter);
	}

}
