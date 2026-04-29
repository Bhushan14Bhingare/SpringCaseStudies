package com.bhushan;

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

        System.out.println("Enter language code (en / hi / te / sa) : ");
        String lang = sc.nextLine();

        Locale locale = Locale.of(lang);

        String msg1 = ctx.getMessage("welcome.msg", null, locale);
        String msg2 = ctx.getMessage("wish.message", null, locale);
        String msg3 = ctx.getMessage("goodBye.msg", null, locale);

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);

        sc.close();
        ctx.close();
    }
}
