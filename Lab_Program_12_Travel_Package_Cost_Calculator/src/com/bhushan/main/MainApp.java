package com.bhushan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.TravelPackageCostCalculator;

public class MainApp {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		TravelPackageCostCalculator travel = ctx.getBean(TravelPackageCostCalculator.class);
		System.out.println(travel.calculateFinalPackageCost());
		ctx.close();
	}
}
