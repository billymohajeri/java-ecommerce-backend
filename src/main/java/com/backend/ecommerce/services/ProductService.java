package com.backend.ecommerce.services;

import com.backend.ecommerce.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  public Product createProduct(Product product) {
//    Add new product to the database
    System.out.println("New product created: " + product.getName());
    return product;
  }
}
