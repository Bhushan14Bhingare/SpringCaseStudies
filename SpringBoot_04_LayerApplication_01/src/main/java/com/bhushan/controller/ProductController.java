package com.bhushan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhushan.sbeans.Product;
import com.bhushan.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	public void addProduct(Product product)  {
		try {
			int rowCount =  service.addProduct(product);
			if(rowCount > 0) {
				System.out.println("Inserted Data Sucessfully");
			}
			else {
			    System.out.println("Data not inserted");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}		
	}
	
	
	public void deleteProduct(String productId) {
		try {
			int rowCount =  service.deleteProduct(productId);
			if(rowCount > 0) {
				System.out.println("Data deleted Sucessfully");
			}
			else {
			    System.out.println("Data not deleted");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}	
	}
 
	public void updateProduct(String id,double price) {
		try {
			int rowCount =  service.updateProduct(id,price);
			if(rowCount > 0) {
				System.out.println("Data updated Sucessfully");
			}
			else {
			    System.out.println("Data not updated");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}	
	}
	
	public void retriveAllProduct() {
		try {
			List<Product> list = service.retriveProduct();
			for(Product l1 : list) {
				System.out.println(l1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
