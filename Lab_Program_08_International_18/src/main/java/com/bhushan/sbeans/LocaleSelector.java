package com.bhushan.sbeans;

import java.util.Locale;

public class LocaleSelector {
	public  static Locale getLocale(String lang)
	{
		if(lang.equalsIgnoreCase("hi")) 
			return Locale.of("hi");
			else if(lang.equalsIgnoreCase("en"))
				return Locale.of("en");
			else if(lang.equalsIgnoreCase("te"))
				return Locale.of("te");
			else if(lang.equalsIgnoreCase("fr"))
				return Locale.of("fr");
			else return Locale.ENGLISH;
		
	}

}
