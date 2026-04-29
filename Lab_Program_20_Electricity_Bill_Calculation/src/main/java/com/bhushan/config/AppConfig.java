package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.CommercialBilling;
import com.bhushan.sbeans.InndustrialBilling;
import com.bhushan.sbeans.ResidentialBilling;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {

	@Bean
	public ResidentialBilling residentialBilling() {
		return new ResidentialBilling();
	}
	
	@Bean
	public CommercialBilling commercialBilling() {
		return new CommercialBilling();
	}
	
	@Bean
	public InndustrialBilling inndustrialBilling() {
		return new InndustrialBilling();
	}
}
