package com.flufly.web.persistence.crud;

import com.flufly.web.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
}
