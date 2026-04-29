package com.bhushan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhushan.book.Librarian;

public class MainApp {
       
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com\\bhushan\\config\\SpringConfig.xml");
	    Librarian obj = (Librarian) ctx.getBean(Librarian.class);
	    obj.manageLibrary();
	    ctx.close();
	}
}
