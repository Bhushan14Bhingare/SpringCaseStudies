package com.bhushan.sbeans;

import lombok.Data;

@Data
public class Product {
    private String productId;
    private String productName;
    private double price;
    private int qty;
    
    
	public Product(String productId, String productName, double price, int qty) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}


	public Product() {
	}
    
    
}