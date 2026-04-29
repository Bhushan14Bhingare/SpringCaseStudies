package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.controller.ProductController;
import com.bhushan.sbeans.Product;

@SpringBootApplication
public class SpringBoot_04_LayerApplication_01 {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBoot_04_LayerApplication_01.class, args);
		ProductController controller = ctx.getBean(ProductController.class);
		while(true) {
		System.out.println("1.Insert Product");
		System.out.println("2.Retrive Product");
		System.out.println("3.Delete Product");
		System.out.println("4.Update Product");
		System.out.println("5.Exit");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1->{
			System.out.print("Enter a product id : ");
			String id = sc.nextLine();
			
			System.out.print("Enter a product name : ");
			String name = sc.nextLine();
			
			System.out.print("Enter a product price : ");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter a product qty : ");
            int qty =Integer.parseInt(sc.nextLine());
            
			Product pb = new Product(id,name,price,qty);
			controller.addProduct(pb);
		}
		
		case 2->{
			controller.retriveAllProduct();
		}
		case 3->{
			System.out.print("Enter a product id : ");
			String id = sc.nextLine();
			
			controller.deleteProduct(id);
		}
		
		case 4->{
			
			System.out.print("Enter a product id : ");
			String id = sc.nextLine();
			
			System.out.print("Enter a product price : ");
			double price = Double.parseDouble(sc.nextLine());
			
			controller.updateProduct(id, price);
		}
		
		case 5->{
			sc.close();
			System.exit(0);
		}
		default ->{
			System.out.println("Please enter a valid option");
		}
		}
		}
	}

}
