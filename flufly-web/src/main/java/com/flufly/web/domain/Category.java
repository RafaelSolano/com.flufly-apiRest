package com.flufly.web.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {
  private Integer categoryId;
  private String description;
  private String status;
  private List<Product> products;

}
