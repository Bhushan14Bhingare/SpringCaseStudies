package com.bhushan.vechile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.Vechile;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        Vechile vechile = config.getBean(Vechile.class);
        vechile.startVechile();
        config.close();
    }
}
