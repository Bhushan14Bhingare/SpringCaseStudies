package com.bhushan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
@Configuration
public class AppConfig {

	@Bean()
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com\\bhushan\\resource\\message");
		source.setDefaultEncoding("UTF-8");
	    return source;
	}
}
