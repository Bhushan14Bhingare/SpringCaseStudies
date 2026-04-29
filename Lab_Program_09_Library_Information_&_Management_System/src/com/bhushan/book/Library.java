package com.bhushan.book;

import java.util.List;

public class Library {
	private String libraryName;
	private List<Book> book;
	
	public Library(String libraryName, List<Book> book) {
		this.libraryName = libraryName;
		this.book = book;
	}

	public void showLibraryData() {
		System.out.println(book+" "+libraryName);
	}
}
