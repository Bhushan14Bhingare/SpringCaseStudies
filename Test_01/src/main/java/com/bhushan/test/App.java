package com.bhushan.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.LoanService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       LoanService service = ctx.getBean(LoanService.class);
       service.processLoan(200000);
       ctx.close();
    }
}
