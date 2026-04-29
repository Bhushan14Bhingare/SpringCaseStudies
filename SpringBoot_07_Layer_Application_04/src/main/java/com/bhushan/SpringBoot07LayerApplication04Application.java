package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.controller.ConrollerOrder;
import com.bhushan.sbeans.OrderBean;

@SpringBootApplication

public class SpringBoot07LayerApplication04Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBoot07LayerApplication04Application.class, args);

		ConrollerOrder order = ctx.getBean(ConrollerOrder.class);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Insert order details.");
			System.out.println("2.Update order details.");
			System.out.println("3.Delete order details.");
			System.out.println("4.View all order details.");
			System.out.println("5.Exit.");
			System.out.println("Enter a your choice : ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1 -> {
                System.out.println("Enter a order id : ");
                int id = Integer.parseInt(sc.nextLine());
                
                System.out.println("Enter a customer name : ");
                String name = sc.nextLine();
                
                System.out.println("Enter a order date : ");
                String date = sc.nextLine();
                
                System.out.println("Enter a amount of order : ");
                double amount = Double.parseDouble(sc.nextLine());
                
                OrderBean order1 = new OrderBean(id,date,name,amount);
                order.addData(order1);  
                
			}
			case 2 -> {
				System.out.println("Enter a order id : ");
                int id = Integer.parseInt(sc.nextLine());
                
                System.out.println("Enter a amount of order : ");
                double amount = Double.parseDouble(sc.nextLine());
                
                order.update(id, amount);
			}
			case 3 -> {
				System.out.println("Enter a order id : ");
                int id = Integer.parseInt(sc.nextLine());
                
                order.delete(id);
			}
			case 4 -> {
				order.retrive();
			}
			case 5 -> {
				sc.close();
				System.out.println("Thankyou");
				System.exit(0);
			}
			default -> {
				System.out.println("Enter a valid choice.");
			}
			}
		}
	}

}
