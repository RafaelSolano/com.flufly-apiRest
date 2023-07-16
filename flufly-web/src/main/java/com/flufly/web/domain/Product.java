package com.flufly.web.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Product {
  private int productId;
  private String productName;
  private String reference;
  private int stock;
  private Double price;
  private LocalDateTime purchaseDate;
  private String description;
  private String benefits;
  private String features;
  private String photo;
  private double purchasePrice;
  private double sellingPrice;

  private Category category;
  private Species species;

}
