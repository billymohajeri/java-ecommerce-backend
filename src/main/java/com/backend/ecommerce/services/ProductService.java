package com.backend.ecommerce.services;

import com.backend.ecommerce.Database;
import com.backend.ecommerce.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  public Product createProduct(Product product) {
    return Database.createProduct(product);
  }

  public List<Product> getAllProducts() {
    return Database.getAllProducts();
  }
}
