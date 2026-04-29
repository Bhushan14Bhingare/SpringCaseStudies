package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;


public class DependencyInjection {

	public static void main(String[] args) {
		
		
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/config/applicationContext.xml");
    	
    	Object obj = ctx.getBean("sfind");
    SeasonFinder generator = (SeasonFinder)obj;
    	
    	String result = generator.seasonFinder();
    	System.out.println(result);
    	
    	ctx.close();

	}

}
