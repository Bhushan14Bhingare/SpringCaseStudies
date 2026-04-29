package com.bhushan.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.TravelManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        TravelManager ticket = config.getBean(TravelManager.class);
        ticket.bookingDetails();
        config.close();
    }
}
