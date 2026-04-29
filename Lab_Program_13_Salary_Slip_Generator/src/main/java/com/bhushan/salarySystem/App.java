package com.bhushan.salarySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.appConfig.AppConfig;
import com.bhushan.sbeans.SalarySlipService;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	SalarySlipService salary = ctx.getBean(SalarySlipService.class);
    	salary.generateSlip();
    	ctx.close();
    }
}
