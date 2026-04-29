package com.bhushan.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.Laptop;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
     
	@Bean(name ="laptop")
	public Laptop createLaptop() {
		Laptop lap = new Laptop();
		lap.setBrand("Dell");
		lap.setProcessor("Intel i7");
		lap.setRam("16GB");
		return lap;
	}
}
