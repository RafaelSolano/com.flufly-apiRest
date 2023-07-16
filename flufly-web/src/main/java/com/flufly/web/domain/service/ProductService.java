package com.flufly.web.domain.service;

import com.flufly.web.domain.Product;
import com.flufly.web.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAll(){
    return productRepository.getAll();
  }

}
