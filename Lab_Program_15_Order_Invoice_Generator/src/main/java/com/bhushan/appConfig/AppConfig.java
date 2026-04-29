package com.bhushan.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.Product;
import com.bhushan.sbeans.TaxCalculator;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
   
	@Bean(name ="product")
	public Product createObj() {
		return new Product();
	}
	
	@Bean(name ="tax")
	public TaxCalculator createCal() {
		return new TaxCalculator();
	}
}
