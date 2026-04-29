package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.discount.DiscountService;


@SpringBootApplication
public class SpringBoot02ProductDiscountApplication {

    
	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(SpringBoot02ProductDiscountApplication.class, args);
		DiscountService service = ctx.getBean(DiscountService.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a total price : ");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter a discount percentage : ");
		double percentage = Double.parseDouble(sc.nextLine());
		
		System.out.println("Price Before Discount : "+price);
		
		double finalPrice = service.applyDiscount(price, percentage);
		System.out.println("Final Amount : "+finalPrice);
		sc.close();
	}

}
