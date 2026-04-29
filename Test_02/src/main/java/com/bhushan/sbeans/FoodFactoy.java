package com.bhushan.sbeans;

public class FoodFactoy {
     
	public static Food getInstance(String foods) {
		
		Food food = null;
		
		if(foods.equalsIgnoreCase("pizza")) {
			System.out.println("Preparing Pizza");
			food = new Pizza();
		}
		else if (foods.equalsIgnoreCase("burger")) {
			System.out.println("Preparing Pizza");
			food =  new Burger();			
		}
		return food;
		
	}
}
