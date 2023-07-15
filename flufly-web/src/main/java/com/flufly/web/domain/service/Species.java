package com.flufly.web.domain.service;

import com.flufly.web.domain.Product;
import com.flufly.web.persistence.entity.Producto;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.List;

@Getter
@Setter
public class Species {
  private int speciesId;
  private String speciesName;
  private List<Product> products;

}
