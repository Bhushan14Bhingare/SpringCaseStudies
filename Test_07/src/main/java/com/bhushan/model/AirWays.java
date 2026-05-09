package com.bhushan.model;

import lombok.Data;

@Data
public class AirWays {

	private Integer num;
	private Double price;
	private Double tax;
	private Double finalPrice;
	
	public AirWays(int num , double price , double tax) {
		this.num = num;
		this.price = price;
		this.tax = tax;
	}
	
	public void setFinalAmount() {
		
			double sub = this.num * this.price;
			double amout = sub;
			double gst = sub * 0.18;
			this.tax = gst;
			
			this.finalPrice = amout + this.tax;

		
	}
}
