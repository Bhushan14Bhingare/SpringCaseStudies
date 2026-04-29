package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
      @Autowired
      private Product product;
      @Autowired
      private TaxCalculator tax;
      
      public void printInvoice() {
    	      double amount = product.getPrice() * product.getQuantity();
    	      double taxAmount = tax.calculateTax(amount);
    	      
    	      System.out.println("Invoice: ");
    	      System.out.println("Product: "+product.getName());
    	      System.out.println("Quantity: "+product.getQuantity());
    	      System.out.println("Total (before tax): "+amount);
    	      System.out.println("Tax : "+taxAmount);
    	      System.out.println("Final Amount: "+(amount+taxAmount));
      }
}
