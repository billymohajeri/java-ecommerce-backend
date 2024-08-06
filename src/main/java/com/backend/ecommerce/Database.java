package com.backend.ecommerce;

import com.backend.ecommerce.entities.Product;
import com.backend.ecommerce.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

  public static Optional<Product> getProduct(UUID id) {
    for (Product product : productList) {
      if (product.getId().equals(id)) {
        return Optional.of(product);
      }
    }
    return Optional.empty();
  }

  public static Optional<Product> updateProduct(UUID id, Product newProduct) {
    for (Product product : productList) {
      if (product.getId().equals(id)) {
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setDescription(newProduct.getDescription());
        product.setImages(newProduct.getImages());
        product.setColor(newProduct.getColor());
        product.setMeta(newProduct.getMeta());
        product.setRating(newProduct.getRating());
        product.setStock(newProduct.getStock());
        return Optional.of(product);
      }
    }
    return Optional.empty();
  }

  public static void deleteProduct(UUID id) {
    productList.removeIf(product -> product.getId().equals(id));
  }
}
