package com.bhushan.respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhushan.bean.BookBean;

@Repository
public class BookDAO implements IBookDAO {

	@Autowired
	private DataSource ds;
	@Override
	public int insertBook(BookBean book) throws Exception {
		int rowCount = 0;
		String query1 = "Insert Into Book values(?,?,?,?)";
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query1)){
			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setDouble(4, book.getPrice());
			
			rowCount = ps.executeUpdate();
		}
		catch(SQLException e) {
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

	@Override
	public int deleteBook(int id) throws Exception {
		int rowCount = 0;
		String query2 = "Delete from Book where BookId = ?";
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query2)){
			ps.setInt(1, id);
			rowCount = ps.executeUpdate();
		}
		catch(SQLException e) {
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

	@Override
	public int updateBook(int id, double price) throws Exception {
		int rowCount = 0;
		String query3 = "Update book set price = ? where Bookid = ?";
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query3)){
			ps.setDouble(1, price);
			ps.setInt(2, id);
			rowCount = ps.executeUpdate();
		}
		catch(SQLException e) {
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

	@Override
	public List<BookBean> retriveAllBook() throws Exception {
		List<BookBean> list = new ArrayList<>();
		
		String query4 = "Select * from Book";
	
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query4)){
			
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			BookBean book = new BookBean();
			book.setBookId(rs.getInt(1));
			book.setAuthor(rs.getString(2));
			book.setTitle(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			list.add(book);
		}
			
		}		
		return list;
	}

}
