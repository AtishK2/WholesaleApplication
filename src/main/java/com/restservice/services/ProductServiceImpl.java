package com.restservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restservice.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> productsList;

    ProductServiceImpl() {
        productsList = new ArrayList<>();
        productsList.add(new Product(1, "Eno", "Medicine"));
        productsList.add(new Product(2, "Jaljira", "Beverage masala"));
    }

    @Override
    public List<Product> getListOfProducts() {
        return productsList;
    }

    @Override
    public Product getProductById(int productId) {
        Product associatedProduct = null;
        for (Product product : productsList) {
            if (product.getId() == productId) {
                associatedProduct = product;
                break;
            }
        }
        return associatedProduct;
    }

    @Override
    public Product createProduct(Product product) {
        if(!productsList.contains(product)){
            productsList.add(product);
        }
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        Product associateProduct = null;
        for (Product actualProduct : productsList) {
            if (actualProduct.getId() == product.getId()) {
                actualProduct.setProductName(product.getProductName());
                actualProduct.setProductType(product.getProductType());
            }
            associateProduct = actualProduct;
        }
        return associateProduct;
    }

    @Override
    public void deleteProductById(int productId) {
        Product associateProduct = null;
        for (Product actualProduct : productsList) {
            if (actualProduct.getId() == productId) {
                associateProduct = actualProduct;
                break;
            }
        }
        productsList.remove(associateProduct);
    }

}
