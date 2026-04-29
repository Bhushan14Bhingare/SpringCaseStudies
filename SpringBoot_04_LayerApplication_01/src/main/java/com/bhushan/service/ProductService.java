package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.repository.IProductDAO;
import com.bhushan.sbeans.Product;

@Service
public class ProductService {
     
	@Autowired
	private IProductDAO prod ;
	
	public int addProduct(Product product) throws Exception {
		return prod.insertProduct(product);		
	}
	
	public int deleteProduct(String productId) throws Exception {
		return prod.deleteProduct(productId);
	}
	
	public int updateProduct(String id , double price) throws Exception {
		return prod.updateProduct(id, price);		
	}
	
	public List<Product> retriveProduct() throws Exception{
		return prod.getAllProducts();		
	}
}
