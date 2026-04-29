package com.bhushan.sbeans;




public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		double dis = 0.1;
		double discount = amount * dis;
		return discount;
	}

}
