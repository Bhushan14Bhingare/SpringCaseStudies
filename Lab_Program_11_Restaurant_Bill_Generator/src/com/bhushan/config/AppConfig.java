package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
    
	@Bean(name ="food")
	public double foodAmount() {
		return 800.0;
	}
	
	@Bean(name ="drink")
	public double drinkAmount() {
		return 200.0;
	}
	
	@Bean(name ="service")
	public double serviceAmount() {
		return 20.0;
	}
	
	@Bean(name ="gst")
	public double percentage() {
		return 18.0;
	}
}
