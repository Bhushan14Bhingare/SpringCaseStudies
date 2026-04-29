package com.bhushan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.LaptopEMICalculator;

public class Customer {
       public static void main(String[] args) {
		
    	   @SuppressWarnings("resource")
		   ApplicationContext context =
                   new AnnotationConfigApplicationContext(AppConfig.class);

           LaptopEMICalculator calculator =
                   context.getBean(LaptopEMICalculator.class);

           double emi = calculator.calculateMonthlyEMI();
           System.out.println("Monthly EMI: ₹" + emi);
          
	}
}
