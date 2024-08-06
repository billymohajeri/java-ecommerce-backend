package com.backend.ecommerce.controllers;

import com.backend.ecommerce.entities.Product;
import com.backend.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
  public Optional<Product> updateProduct(@PathVariable UUID id, @RequestBody Product product) {
    return productService.updateProduct(id, product);
  }

  @DeleteMapping("/{id}")
  public void deleteProduct(@PathVariable UUID id) {
    productService.deleteProduct(id);
  }

  @PatchMapping("/{id}")
  public Optional<Product> patchProductStock(@PathVariable UUID id, @RequestBody Product product) {
    return productService.patchProductStock(id, product);
  }
}
