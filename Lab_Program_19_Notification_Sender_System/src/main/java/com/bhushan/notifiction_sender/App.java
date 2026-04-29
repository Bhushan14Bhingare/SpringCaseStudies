package com.bhushan.notifiction_sender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.NotificationService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       NotificationService service = ctx.getBean(NotificationService.class);
       service.notifyUser("Meeting at 4 PM");
       ctx.close();
    }
}
