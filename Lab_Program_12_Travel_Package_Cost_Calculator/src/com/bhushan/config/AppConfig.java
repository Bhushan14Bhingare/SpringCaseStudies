package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.PackageDetails;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
    
	@Bean
	public PackageDetails packageDetails() {
		PackageDetails packageDetails = new PackageDetails();
		packageDetails.setDiscountPercentage(10);
		packageDetails.setNumberOfTravelers(4);
		packageDetails.setDiscountPercentage(5000);
		return packageDetails;
	}
}
