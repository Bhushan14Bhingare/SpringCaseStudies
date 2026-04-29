package com.bhushan.sbeans;


public class RegularCustometDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		double dis = 0.05;
		double discount = amount * dis;
		return discount;
	}
        
}
