package com.bhushan.notification;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.NotificationFactory;
import com.bhushan.sbeans.Notifier;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
      NotificationFactory factory =  ctx.getBean(NotificationFactory.class);
      System.out.println("Enter application type : (email/sms/push)");
      Scanner sc = new Scanner(System.in);
      String type =sc.nextLine();
      Notifier service = factory.getNotifier(type);
      if(service != null) {
    	      service.sendNotification(type);
      }
      else {
    	  System.out.println("Invalid type");
      }
      sc.close();
      ctx.close();
    }
}
