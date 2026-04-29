package com.bhushan.book;

public class Book {
     private String bookId;
     private String bookTitle;
     private Author author;
     
	 public Book(String bookId, String bookTitle) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	 }

	 
	
     
     public void setAuthor(Author author) {
		this.author = author;
	}




	 public void displayBookDetails() {
		 author.displayAuthorInfo();
    	 System.out.println("Book Id "+bookId+" Book Title "+bookTitle);
     }
}
