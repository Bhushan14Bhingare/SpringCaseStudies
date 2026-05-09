package com.bhushan.model;

import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor


public class ProductDetails {

	private Integer quantity;
	private Double price;
	private Double subTotal;
	private Double gst ;
	private Double discount;
	private Double finalPrice;
	
	public ProductDetails(int quat,double price) {
		this.price = price;
		this.quantity = quat;
	}
	public void setFinalPrice() {
		double sub = this.quantity * this.price;
		this.subTotal = sub;
		double gst = sub * 0.18;
		this.gst = gst;
		if(sub > 5000) {
			double dis = sub * 0.10;
			this.discount = dis;

		}
		this.finalPrice = this.subTotal + this.gst - this.discount;

	}
}
