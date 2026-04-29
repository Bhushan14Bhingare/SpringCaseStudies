package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.checker.Even_Odd_Checker;

@SpringBootApplication
public class SpringBoot03EvenOddCheckerApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(SpringBoot03EvenOddCheckerApplication.class, args);
		Even_Odd_Checker checker = ctx.getBean(Even_Odd_Checker.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check even or odd : ");
		int num = Integer.parseInt(sc.nextLine());
		
		String check = checker.checkEvenOdd(num);
		System.out.println(num + " is "+check);
		sc.close();
		
		
	}

}
