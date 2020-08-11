package com.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.entities.Product;
import com.restservice.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getHome() {
		return this.productService.getListOfProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getHome(@PathVariable String productId) {
		return this.productService.getProductById(Integer.parseInt(productId));
	}
	
	@PostMapping(path = "/products")
	public Product createProduct(@RequestBody Product product) {
		return this.productService.createProduct(product);
	}
	
}
