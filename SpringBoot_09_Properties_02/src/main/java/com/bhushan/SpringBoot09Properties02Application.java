package com.bhushan;

import com.bhushan.sbean.ECommerce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot09Properties02Application {

    public static void main(String[] args) {
		
	ApplicationContext ctx = SpringApplication.run(SpringBoot09Properties02Application.class, args);
	 ECommerce ecom = ctx.getBean(ECommerce.class);
	 System.out.println(ecom);
	}

}
