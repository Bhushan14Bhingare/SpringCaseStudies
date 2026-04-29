package com.bhushan.invoiceGenerator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.appConfig.AppConfig;
import com.bhushan.sbeans.InvoiceService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
        InvoiceService bill = ctx.getBean(InvoiceService.class);
        bill.printInvoice();
        ctx.close();
    }
}
