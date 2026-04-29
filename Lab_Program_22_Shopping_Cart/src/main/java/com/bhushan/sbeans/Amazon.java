package com.bhushan.sbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("amazon")

public final class Amazon implements ShoppingService {

	    private final Map<String, Double> cart = new LinkedHashMap<>();

	    @Override
	    public void addItem(String item, double price) {
	        cart.put(item, price);
	        System.out.println(item + " added to Amazon cart.");
	    }

	    @Override
	    public void viewCart() {
	        if(cart.isEmpty()){
	            System.out.println("Cart is empty");
	            return;
	        }

	        System.out.println("Amazon Cart Items:");
	        cart.forEach((item,price)->{
	            System.out.println(item + " : ₹" + price);
	        });
	    }

	    @Override
	    public void checkOut() {

	        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();

	        double discount = total * 0.10;
	        double finalAmount = total - discount;

	        System.out.println("Total Amount : ₹" + total);
	        System.out.println("Amazon Discount (10%) : ₹" + discount);
	        System.out.println("Final Amount : ₹" + finalAmount);
	        System.out.println("Delivery: Fast delivery within 2 days 🚀");
	    }
	}