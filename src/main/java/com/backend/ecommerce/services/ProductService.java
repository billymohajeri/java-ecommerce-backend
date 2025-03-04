package com.backend.ecommerce.services;

import com.backend.ecommerce.Database;
import com.backend.ecommerce.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
  public Product createProduct(Product product) {
    return Database.createProduct(product);
  }

  public List<Product> getAllProducts() {
    return Database.getAllProducts();
  }

  public Optional<Product> getProduct(UUID id) {
    return Database.getProduct(id);
  }

  public Optional<Product> updateProduct(UUID id, Product product) {
    return Database.updateProduct(id, product);
  }

  public void deleteProduct(UUID id) {
    Database.deleteProduct(id);
  }

  public Optional<Product> patchProductStock(UUID id, Product product) {
    return Database.patchProductStock(id, product);
  }
}
