package com.flufly.web.persistence.crud;


import com.flufly.web.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoCrudRepository extends CrudRepository <Producto, Integer> {
}
