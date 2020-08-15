package com.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.restservice.entities.Product;
import com.restservice.services.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return this.productService.getListOfProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable String productId) {
        return this.productService.getProductById(Integer.parseInt(productId));
    }

    @PostMapping(path = "/products")
    public Product createProduct(@RequestBody Product product) {
        return this.productService.createProduct(product);
    }

    @PutMapping(path = "/products/{productId}")
    public Product updateProduct(@RequestBody Product product) {
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProductById(@PathVariable String productId) {
        this.productService.deleteProductById(Integer.parseInt(productId));
    }
}
