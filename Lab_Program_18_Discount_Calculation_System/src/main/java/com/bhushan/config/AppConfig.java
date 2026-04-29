package com.bhushan.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;


import com.bhushan.sbeans.EliteCustomerDiscount;
import com.bhushan.sbeans.PremiumCustomerDiscount;
import com.bhushan.sbeans.RegularCustometDiscount;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
 
	@Bean
	public RegularCustometDiscount regularCustometDiscount() {
		return new RegularCustometDiscount();
	}
	@Bean
	public PremiumCustomerDiscount premiumCustomerDiscount() {
		return new PremiumCustomerDiscount();
	}
	@Bean
	public EliteCustomerDiscount eliteCustomerDiscount() {
		return new EliteCustomerDiscount();
	}
	
}
