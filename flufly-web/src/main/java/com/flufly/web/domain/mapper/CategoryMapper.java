package com.flufly.web.domain.mapper;

import com.flufly.web.domain.Category;
import com.flufly.web.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;



@Mapper (componentModel = "spring", uses = {ProductMapper.class})
public interface CategoryMapper {
  @Mappings({
          @Mapping(target = "categoryId", source = "idCategoria"),
          @Mapping(target = "description", source = "descripcion"),
          @Mapping(target = "status", source = "estado"),

  })
  Category toCategory(Categoria categoria);

  @InheritInverseConfiguration
  @Mapping(target = "productos", ignore = true)
  Categoria toCategoria(Category category);
}
