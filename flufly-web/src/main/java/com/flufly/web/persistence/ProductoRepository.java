package com.flufly.web.persistence;

import com.flufly.web.domain.Product;
import com.flufly.web.domain.mapper.ProductMapper;
import com.flufly.web.domain.repository.ProductRepository;
import com.flufly.web.persistence.crud.ProductoCrudRepository;
import com.flufly.web.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository
public class ProductoRepository implements ProductRepository {

  @Autowired
  private ProductoCrudRepository productoCrudRepository;

  @Autowired
  private ProductMapper mapper;


  @Override
  public List<Product> getAll() {
    List<Producto> products = (List<Producto>)  productoCrudRepository.findAll();
    return mapper.toProducts(products);
  }

  @Override
  public Optional<Product> getProduct(int productId) {
    return productoCrudRepository.findById(productId).map((producto -> mapper.toProducto(producto)));
  }

  @Override
  public Product save(Product product) {
    return null;
  }



  @Override
   public void delete(int productId){
    productoCrudRepository.deleteById(productId);
  }

  @Override
  public void update(int productId) {

  }

  @Override
  public Optional<List<Product>> getByCategory(int categoryId) {
    return Optional.empty();
  }

  @Override
  public Optional<List<Product>> getBySpecie(int speciesId) {
    return Optional.empty();
  }

  @Override
  public Optional<List<Product>> getScarseProducts(int quantity) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(int productId) {

    return productoCrudRepository.existsById(productId);
  }
}
