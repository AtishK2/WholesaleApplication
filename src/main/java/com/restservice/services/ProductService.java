package com.restservice.services;

import java.util.List;

import com.restservice.entities.Product;


public interface ProductService {
	
	public List<Product> getListOfProducts();
//	public Product getProductById(String productId);
	Product getProductById(int productId);
	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProductById(int productId);

}
