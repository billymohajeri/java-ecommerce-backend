package com.backend.ecommerce;

import com.backend.ecommerce.entities.Product;
import com.backend.ecommerce.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Database {
  private static List<Product> productList = new ArrayList<>();
  private List<User> userList;

  public static Product createProduct(Product product) {
    product.setId(UUID.randomUUID());
    productList.add(product);
    return product;
  }

  public static List<Product> getAllProducts() {
    return new ArrayList<>(productList);
  }
}
