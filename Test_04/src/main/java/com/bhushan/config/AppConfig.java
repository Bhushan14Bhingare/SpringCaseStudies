package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {


	@Bean
    public ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource ms =
                new ResourceBundleMessageSource();

        ms.setBasename("messages");   
        ms.setDefaultEncoding("UTF-8");

        return ms;
    }
	
}
