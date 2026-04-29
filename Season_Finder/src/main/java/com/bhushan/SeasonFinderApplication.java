package com.bhushan;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bhushan.sbean.SeasonService;


@SpringBootApplication
public class SeasonFinderApplication {

    @Bean
    LocalDate createDate() {
		return LocalDate.now();
		
	}

	public static void main(String[] args) {
		
	ApplicationContext ctx =	SpringApplication.run(SeasonFinderApplication.class, args);
	
	SeasonService season = ctx.getBean(SeasonService.class);
	
	String result =  season.getSeason();
	
	System.out.println(result);

	}

}
