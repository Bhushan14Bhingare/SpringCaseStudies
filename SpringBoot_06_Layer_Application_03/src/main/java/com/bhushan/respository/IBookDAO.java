package com.bhushan.respository;

import java.util.List;

import com.bhushan.bean.BookBean;

public interface IBookDAO {

	int insertBook(BookBean book) throws Exception;
	int deleteBook(int id) throws Exception;
	int updateBook(int id, double price) throws Exception;
	List<BookBean> retriveAllBook() throws Exception;
	
}
