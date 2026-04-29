package com.bhushan.test;

import java.util.Locale;
import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter language code (en /fa )");
        String lang = sc.nextLine();

        Locale locale = Locale.of(lang);

        String msg1 = ctx.getMessage("welcome.msg", null, locale);
       

        System.out.println(msg1);
       
        sc.close();
        ctx.close();
    }
}
