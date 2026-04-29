package com.bhushan.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbean.WishMessageGenerator;

public class Greeting {
      public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/config/applicationContext.xml");
	WishMessageGenerator generator = (WishMessageGenerator) ctx.getBean("wmg");
	String data = generator.wishGenerator("Bhushan");
	System.out.println(data);
	ctx.close();
  }
}
