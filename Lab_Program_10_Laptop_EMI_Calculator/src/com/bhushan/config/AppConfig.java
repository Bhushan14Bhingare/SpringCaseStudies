package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.LaptopEMICalculator;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
 @Bean
	 public LaptopEMICalculator laptopEMICalculator() {
	        return new LaptopEMICalculator(60000, 10000, 10);
	    }
	
}
