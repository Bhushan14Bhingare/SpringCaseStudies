package com.bhushan.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbeans.NewYearAlert;

public class Month {
   public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/config/applicationContext.xml");
	NewYearAlert obj = (NewYearAlert) ctx.getBean("nya");
	
	obj.getMonth();
	ctx.close();
}
}
