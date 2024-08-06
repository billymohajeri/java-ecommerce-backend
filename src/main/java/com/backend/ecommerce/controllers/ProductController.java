package com.backend.ecommerce.controllers;

import com.backend.ecommerce.entities.Product;
import com.backend.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping
  public Product createProduct(@RequestBody Product product) {
    return productService.createProduct(product);
  }

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Optional<Product> getProduct(@PathVariable UUID id) {
    return productService.getProduct(id);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Product> updateProduct(@PathVariable UUID id, @RequestBody Product product) {
    Optional<Product> updatedProduct = productService.updateProduct(id, product);
    return updatedProduct.map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
  }
}
