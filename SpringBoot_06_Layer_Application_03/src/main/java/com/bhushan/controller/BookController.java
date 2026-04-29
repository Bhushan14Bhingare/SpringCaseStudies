package com.bhushan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhushan.bean.BookBean;
import com.bhushan.service.BookService;

@Controller
public class BookController {


	@Autowired
	private BookService service;

	
	public void addBook(BookBean book)  {
		int result ;
		try {
			result = service.addData(book);
			if(result > 0) {
				System.out.println("Book data inserted Successfully");
			}
			else {
				System.out.println("Book data not inserted Successfully");
			}
		} catch (Exception e) {
			System.out.println("Problem occur in query");
		}	
	}
	
	public void deleteBook(int id) {
		int result ;
		try {
			result = service.deleteData(id);
			if(result > 0) {
				System.out.println("Book data deleted Successfully");
			}
			else {
				System.out.println("Book data not deleted Successfully");
			}
		} catch (Exception e) {
			System.out.println("Problem occur in query");
		}
	}
	
	public void updateBook(int id, double price) {
		int result ;
		try {
			result = service.updateData(id ,price);
			if(result > 0) {
				System.out.println("Book data updated Successfully");
			}
			else {
				System.out.println("Book data not updated Successfully");
			}
		} catch (Exception e) {
			System.out.println("Problem occur in query");
		}
	}
	
	public void retriveBook() {
		try {
			List<BookBean> book = service.retriveData();
			book.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Problem occur in query");
		}
	}
}
