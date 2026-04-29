package com.bhushan.repository;

import java.util.List;

import com.bhushan.sbeans.Product;

public interface IProductDAO {
    int insertProduct(Product product) throws Exception;
    List<Product> getAllProducts() throws Exception;
    int deleteProduct(String productId) throws Exception;
    int updateProduct(String id, double price) throws Exception;
}
