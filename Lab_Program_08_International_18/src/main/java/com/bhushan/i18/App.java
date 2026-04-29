package com.bhushan.i18;

/**
 * Hello world!
 */
import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.DateFormatterUtil;
import com.bhushan.sbeans.LocaleSelector;

public class App {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter locale (en, fr, hi, te):");
    String lang=sc.nextLine();
    Locale locale = LocaleSelector.getLocale(lang);
    
    String formatted = DateFormatterUtil.formatDateForLocale(locale);
    MessageSource ms = ctx.getBean(MessageSource.class);
    String message = ms.getMessage("date.message", new Object[] {formatted},locale);
    System.out.println(message);
    sc.close();
    ctx.close();
    }
}
