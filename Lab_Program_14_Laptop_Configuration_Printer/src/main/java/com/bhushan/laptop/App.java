package com.bhushan.laptop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.appConfig.AppConfig;
import com.bhushan.sbeans.LaptopService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        LaptopService service = ctx.getBean(LaptopService.class);
        service.printLaptopDetails();
        ctx.close();
    }
}
