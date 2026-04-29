package com.bhushan.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbean.Email_Schedular;

public class EmailGenerator {
    public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/config/applicationContext.xml");
		Email_Schedular obj = (Email_Schedular) ctx.getBean("email");
		obj.emailGenerate();
		ctx.close();
		
	}
}
