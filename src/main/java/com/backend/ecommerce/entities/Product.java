package com.backend.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Product {
  private UUID id;
  private String name;
  private double price;
  private String description;
  private String[] images;
  private String color;
  private Map<String, Object> meta;
  private float rating;
  private int stock;
}
