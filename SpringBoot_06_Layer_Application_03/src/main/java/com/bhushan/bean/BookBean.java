package com.bhushan.bean;

import lombok.Data;

@Data
public class BookBean {

	private int bookId;
	private String title;
	private String author;
	private double price;
	
	public BookBean(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public BookBean() {
	}
	
	
	
}
