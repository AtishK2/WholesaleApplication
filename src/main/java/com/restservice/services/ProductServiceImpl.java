package com.restservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restservice.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	List<Product> productList;

	ProductServiceImpl() {
		productList = new ArrayList<>();
		productList.add(new Product(1, "Eno", "Medicine"));
		productList.add(new Product(2, "Jaljira", "Beverage masala"));
	}

	@Override
	public List<Product> getListOfProducts() {
		return productList;
	}

	@Override
	public Product getProductById(int productId) {
		Product associatedProduct = null;
		for (Product product : productList) {
			if (product.getId() == productId) {
				associatedProduct = product;
				break;
			}
		}
		return associatedProduct;
	}

	@Override
	public Product createProduct(Product product) {
		productList.add(product);
		return product;
	}

}
