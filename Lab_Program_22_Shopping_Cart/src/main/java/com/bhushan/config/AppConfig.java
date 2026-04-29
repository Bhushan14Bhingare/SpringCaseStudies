package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.Amazon;
import com.bhushan.sbeans.Flipkart;

@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
         @Bean
         public Flipkart flipkart() {
        	 return new Flipkart();
         }
         
         @Bean
         public Amazon amazon() {
        	 return new Amazon();
         }
}
