package com.bhushan.main;

import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.Appliance;
import com.bhushan.sbeans.ApplianceFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class);

         ApplianceFactory factory = context.getBean(ApplianceFactory.class);

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Appliance Type (washingMachine / refrigerator):");
         String type = sc.nextLine();

         Appliance appliance = factory.getAppliance(type);

         if (appliance != null) {
             appliance.manufacture();
         } else {
             System.out.println("Invalid Appliance Type!");
         }

         sc.close();
         context.close();
        
    }
}
