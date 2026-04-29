package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyMangementTest {
	
	
    public static void main(String[] args) {
    	
    	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
    	
    	Object obj = ctx.getBean("wmg");
    	WishMessageGenerator generator = (WishMessageGenerator)obj;
    	
    	String result = generator.showWishMessage("Bhushan");
    	System.out.println(result);
    	
    	ctx.close();
	
	}
}
