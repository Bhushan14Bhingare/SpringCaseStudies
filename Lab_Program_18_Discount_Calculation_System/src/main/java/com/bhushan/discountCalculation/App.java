package com.bhushan.discountCalculation;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.BillingService;
import com.bhushan.sbeans.DiscountStrategy;
import com.bhushan.sbeans.EliteCustomerDiscount;
import com.bhushan.sbeans.PremiumCustomerDiscount;
import com.bhushan.sbeans.RegularCustometDiscount;

/**
 * Hello world!
 */
public class App {
    
    	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter purchase amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter customer type (regular/premium/elite): ");
            String type = sc.next();

            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppConfig.class);

            DiscountStrategy strategy = null;

            if(type.equalsIgnoreCase("regular")) {
                strategy = context.getBean(RegularCustometDiscount.class);
            }
            else if(type.equalsIgnoreCase("premium")) {
                strategy = context.getBean(PremiumCustomerDiscount.class);
            }
            else if(type.equalsIgnoreCase("elite")) {
                strategy = context.getBean(EliteCustomerDiscount.class);
            }
            else {
                System.out.println("Invalid customer type");
                
            }

            BillingService billingService = new BillingService(strategy);
            billingService.generateBill(amount);
            sc.close();
            context.close();
    }
}
