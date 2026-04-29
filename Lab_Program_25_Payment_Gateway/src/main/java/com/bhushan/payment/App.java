package com.bhushan.payment;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.PaymentFactory;
import com.bhushan.sbeans.PaymentProcessor;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentFactory factory = ctx.getBean(PaymentFactory.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aZxc vbnm,0."
        		+ ""
        		+ "  payment type (creditCard, paypal, upi)");
        String type = sc.nextLine();
        System.out.println("Enter a amount: ");
        double amount = Double.parseDouble(sc.next());
        
        PaymentProcessor payment  = factory.getPaymentProcessor(type);
        
        if(payment!=null) {
        	    payment.processPayment(amount);
        }
        else {
        	 System.out.println("Invalid type of payment");
        }
        sc.close();
        ctx.close();
    }
}
