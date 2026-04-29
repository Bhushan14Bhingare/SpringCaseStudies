package com.bhushan.notification;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.EmailNotification;
import com.bhushan.sbeans.NotificationService;
import com.bhushan.sbeans.NotificationStrategy;
import com.bhushan.sbeans.SMSNotification;
import com.bhushan.sbeans.WhatsAppNotification;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter notification type (email/sms/whatsapp):");
        String user = sc.nextLine();
        System.out.println("Enter message:");
        String message = sc.nextLine();
        NotificationStrategy notify = null;
        
        if(user.equalsIgnoreCase("email")) {
        	      notify = ctx.getBean(EmailNotification.class);
        }
        else if(user.equalsIgnoreCase("sms")) {
              notify = ctx.getBean(SMSNotification.class);
        }
        else if(user.equalsIgnoreCase("whatsApp")) {
        		 notify = ctx.getBean(WhatsAppNotification.class);
        }
       
         
        NotificationService service = new NotificationService(notify);
        service.notifyUser(message);
        ctx.close();
        sc.close();
        
    }
}
