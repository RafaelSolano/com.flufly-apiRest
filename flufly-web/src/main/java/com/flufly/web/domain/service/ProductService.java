package com.flufly.web.domain.service;

import com.flufly.web.domain.Product;
import com.flufly.web.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAll(){
    return productRepository.getAll();
  }

  public Optional<Product> getProduct(int productId){
    return productRepository.getProduct(productId);
  }

  public Product save (Product product){
    return productRepository.save(product);
  }

  public boolean existsById(int productId){
    return productRepository.existsById(productId);
  }

  public boolean delete(int productId) {
    if (existsById(productId)) {
      productRepository.delete(productId);
      return true;
    } else {
      return false;
    }
  }







}
