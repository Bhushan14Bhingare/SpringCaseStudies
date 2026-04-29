package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name = "Laptop";
    private double price = 50000.0;
    private int quantity = 2;
    
    
	public Product() {
		
	}


	public String getName() {
		return name;
	}




	public double getPrice() {
		return price;
	}


	


	public int getQuantity() {
		return quantity;
	}


	
	
	
    
    
}
