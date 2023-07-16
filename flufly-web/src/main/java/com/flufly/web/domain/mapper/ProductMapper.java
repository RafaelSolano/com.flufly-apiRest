package com.flufly.web.domain.mapper;

import com.flufly.web.domain.Product;
import com.flufly.web.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, SpeciesMapper.class})
public interface ProductMapper {
  @Mappings({
          @Mapping(target = "productId", source = "idProducto"),
          @Mapping(target = "productName", source = "nombreProducto"),
          @Mapping(target = "reference", source = "referencia"),
          @Mapping(target = "stock", source = "unidadesdisponibles"),
          @Mapping(target = "price", source = "precio"),
          @Mapping(target = "purchaseDate", source = "fechacompra"),
          @Mapping(target = "description", source = "descripcion"),
          @Mapping(target = "benefits", source = "beneficios"),
          @Mapping(target = "features", source = "caracteristicas"),
          @Mapping(target = "photo", source = "foto"),
          @Mapping(target = "purchasePrice", source = "precioCompra"),
          @Mapping(target = "sellingPrice", source = "precioVenta"),
          @Mapping(target = "category", source = "categoria"),
          @Mapping(target = "species", source = "especie")
  })
  Product toProduct(Producto producto);
  List<Product> toProducts(List<Producto> productos);

  @InheritInverseConfiguration
  Producto toProducto(Product product);
}
