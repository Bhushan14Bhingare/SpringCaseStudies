package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.bean.BookBean;
import com.bhushan.respository.BookDAO;

@Service
public class BookService {

	@Autowired
	private BookDAO book ;
	
	public int addData(BookBean bookData) throws Exception {
		return book.insertBook(bookData);
	}
	
	public int deleteData(int id) throws Exception {
		return book.deleteBook(id);
	}
	
	public int updateData(int id , double price) throws Exception{
		return book.updateBook(id, price);		
	}
	
	public List<BookBean> retriveData() throws Exception{
		return book.retriveAllBook();
		
	}
}
