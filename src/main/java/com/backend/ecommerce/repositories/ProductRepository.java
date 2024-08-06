package com.backend.ecommerce.repositories;

import com.backend.ecommerce.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
  Product findOne();

  List<Product> findAll();
}
