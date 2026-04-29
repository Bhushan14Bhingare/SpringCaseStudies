package com.bhushan.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.RestaurantBillGenerator;

public class CalculateBill {
       public static void main(String[] args) {
		
    	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	   
    	   RestaurantBillGenerator bill = ctx.getBean(RestaurantBillGenerator.class);
    	   System.out.println(bill.generateFinalBill()); 
    	   ctx.close();
	}

	  
}
