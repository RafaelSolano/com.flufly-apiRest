package com.flufly.web.persistence.crud;

import com.flufly.web.persistence.entity.Especie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieCrudRepository  extends CrudRepository<Especie, Integer> {
}
