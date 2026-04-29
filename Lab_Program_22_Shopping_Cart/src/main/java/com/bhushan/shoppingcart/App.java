package com.bhushan.shoppingcart;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.ShoppingContext;
import com.bhushan.sbeans.ShoppingService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         System.out.println("Choose Platform:");
         System.out.println("1. Amazon");
         System.out.println("2. Flipkart");

         int choice = sc.nextInt();

         AnnotationConfigApplicationContext ctx =
                 new AnnotationConfigApplicationContext(AppConfig.class);

         ShoppingService service = null;

         if(choice == 1){
             service = ctx.getBean("amazon", ShoppingService.class);
         }
         else{
             service = ctx.getBean("flipkart", ShoppingService.class);
         }

         ShoppingContext shoppingContext = new ShoppingContext(service);

         while(true){

             System.out.println("\n1.Add Item");
             System.out.println("2.View Cart");
             System.out.println("3.Checkout");
             System.out.println("4.Exit");

             int choice1 = sc.nextInt();

             switch(choice1){

                 case 1 ->{
                     System.out.println("Enter item name:");
                     String item = sc.next();

                     System.out.println("Enter price:");
                     double price = sc.nextDouble();

                     shoppingContext.addItem(item, price);
                  
                 }
                 case 2 ->
                     shoppingContext.viewCart();
                    

                 case 3 ->
                     shoppingContext.checkout();
                     

                 case 4 ->{
                     System.out.println("Thank you for shopping!");
                     ctx.close();
                     sc.close();
                     System.exit(0);
                 }
             }
         }
     }
    }

