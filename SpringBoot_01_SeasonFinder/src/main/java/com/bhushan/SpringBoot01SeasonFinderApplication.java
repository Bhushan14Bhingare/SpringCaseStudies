package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.seasonFinder.Season_Finder;

@SpringBootApplication
public class SpringBoot01SeasonFinderApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBoot01SeasonFinderApplication.class, args);
        Season_Finder finder = ctx.getBean(Season_Finder.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month : ");
        int month = Integer.parseInt(sc.nextLine());
        String result = finder.getSeason(month);
        System.out.println(result);
        sc.close();
	}

}
