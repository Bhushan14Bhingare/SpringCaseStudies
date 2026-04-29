package com.bhushan.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbeans.CalendarService;

public class Calender {
     
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/config/applicationContext.xml");
		
		CalendarService obj = (CalendarService) ctx.getBean("cld");
		obj.getDate();
		ctx.close();
	}
}
