package com.bhushan.sbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("flipkart")
public final class Flipkart implements ShoppingService {
 
	
	

	    private final Map<String, Double> cart = new LinkedHashMap<>();

	    @Override
	    public void addItem(String item, double price) {
	        cart.put(item, price);
	        System.out.println(item + " added to Flipkart cart.");
	    }

	    @Override
	    public void viewCart() {

	        if(cart.isEmpty()){
	            System.out.println("Cart is empty");
	            return;
	        }

	        System.out.println("Flipkart Cart Items:");

	        cart.forEach((item,price)->{
	            System.out.println(item + " : ₹" + price);
	        });
	    }

	    @Override
	    public void checkOut() {

	        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();

	        double discount = total * 0.05;
	        double discountedTotal = total - discount;

	        double shipping = 0;

	        if(discountedTotal < 500){
	            shipping = 50;
	        }

	        double finalAmount = discountedTotal + shipping;

	        System.out.println("Total Amount : ₹" + total);
	        System.out.println("Flipkart Discount (5%) : ₹" + discount);
	        System.out.println("Shipping Charge : ₹" + shipping);
	        System.out.println("Final Amount : ₹" + finalAmount);
	        System.out.println("Delivery: Standard delivery (3-5 days) 📦");
	    }
	}