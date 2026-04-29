package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhushan.sbeans.EmailNotification;
import com.bhushan.sbeans.SMSNotification;
import com.bhushan.sbeans.WhatsAppNotification;


@Configuration
@ComponentScan("com.bhushan.sbeans")
public class AppConfig {
       @Bean(name="email")
       public EmailNotification emailNotification() {
    	      return new EmailNotification();
       }
       
       @Bean(name="sms")
       public SMSNotification smsNotification() {
    	   return new SMSNotification();
       } 
       
       @Bean(name="whatsApp")
       public WhatsAppNotification whatsAppNotification() {
    	   return new WhatsAppNotification();    			   
       }
}
