package com.bhushan.sbeans;




public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		double dis = 0.15;
		double discount = amount * dis;
		return discount;
	}

}
