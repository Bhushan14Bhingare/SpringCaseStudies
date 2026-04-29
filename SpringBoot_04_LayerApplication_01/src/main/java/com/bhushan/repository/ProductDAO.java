package com.bhushan.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhushan.sbeans.Product;
@Repository
public class ProductDAO implements IProductDAO{
 
	@Autowired
	private DataSource ds ;
	
	public final static String Insert_Data = "Insert into product values(?,?,?,?)";
	public final static String Retrive_Data = "Select * from Product";
	public final static String Delete_Data = "Delete from Product where PRODUCT_ID = ?";
	public final static String Update_Data = "Update Product set  PRODUCT_PRICE = ? where PRODUCT_ID = ?";
	
	@Override
	public int insertProduct(Product product) throws Exception{
         int rowCount = 0 ; 
     try(Connection conn = ds.getConnection();PreparedStatement ps = conn.prepareStatement(Insert_Data);){
    	    
    	       ps.setString(1, product.getProductId());
    	       ps.setString(2, product.getProductName());
    	       ps.setDouble(3, product.getPrice());
    	       ps.setInt(4, product.getQty());
    	       rowCount = ps.executeUpdate();
     }
     catch (SQLException se) {
    	      throw se;
     }
     catch(Exception e) {
    	 throw e;
     }
	 return rowCount;
		
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
         List<Product> list = new ArrayList<>();
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(Retrive_Data)){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 Product product = new Product();
				 product.setProductId(rs.getString(1));
				 product.setProductName(rs.getString(2));
				 product.setPrice(rs.getDouble(3));
				 product.setQty(rs.getInt(4));
				 list.add(product);
			}
		}
		catch(SQLException sq) {
			throw sq;
		}
		catch(Exception e) {
			throw e;
		}
         
		return list;
	}

	@Override
	public int deleteProduct(String productId) throws Exception {
		int rowCount = 0;
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(Delete_Data);){
			
			ps.setString(1, productId);
			 rowCount = ps.executeUpdate();
			
		}
		catch(SQLException sq) {
			throw sq;
		}
		catch(Exception e) {
			throw e;
		}		
		return rowCount;
		
	}

	@Override
	public int updateProduct(String id,double price) throws Exception{
		int rowCount = 0;
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(Delete_Data);){
			ps.setDouble(1, price);
			ps.setString(2, id);
			 rowCount = ps.executeUpdate();
		}
		
		return rowCount;
		
	}
	
}
