package com.bhushan.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbeans.WeekendPlanner;

public class DependentTest {
	
     public static void main(String[] args) {
		
    	  FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/cfgs/applicationContext.xml");
    	  Object obj = ctx.getBean("wmg");
    	  WeekendPlanner generator = (WeekendPlanner) obj;
    	  String data = generator.getWeekDays();
    	  System.out.println(data);
    	  ctx.close();
    	 
    	  
    	  
	}
}
