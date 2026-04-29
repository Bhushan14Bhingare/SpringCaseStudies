package com.bhushan.discount;

import org.springframework.stereotype.Component;

@Component
public class DiscountService {

	public double applyDiscount(double price, double discountPercentage) {
		return price-((price * discountPercentage) / 100);
	}

}
