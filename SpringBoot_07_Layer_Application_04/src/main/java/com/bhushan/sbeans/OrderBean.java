package com.bhushan.sbeans;

import lombok.Data;

@Data
public class OrderBean {

	private int orderId;
	private String orderDate;
	private String customerName;
	private double totalAmount;
	
	public OrderBean(int orderId, String orderDate, String customerName, double totalAmount) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
	}

	public OrderBean() {
	}
	
	
	
	
}
