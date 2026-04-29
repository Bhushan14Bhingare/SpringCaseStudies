package com.bhushan.vechile;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.Vechile;
import com.bhushan.sbeans.VechileFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        VechileFactory factory = context.getBean(VechileFactory.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vechile Type (car, truck, bike)");
        String type = sc.nextLine();
        Vechile vechile = factory.getVechile(type);

        if (vechile != null) {
        	vechile.assemble();
        } else {
            System.out.println("Invalid vechile Type!");
        }

        sc.close();
        context.close();
    }
}
