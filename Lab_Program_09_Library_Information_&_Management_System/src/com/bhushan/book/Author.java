package com.bhushan.book;

public class Author {
    private String authorId;
    private String authorName;
    
    
	public Author(String authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}
    
	public void displayAuthorInfo() {
		System.out.println("Author Id : "+authorId+" Author Name : "+authorName);
	}
    
}
