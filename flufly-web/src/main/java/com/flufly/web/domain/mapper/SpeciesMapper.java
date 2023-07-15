package com.flufly.web.domain.mapper;

import com.flufly.web.domain.Species;
import com.flufly.web.persistence.entity.Especie;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;



@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface SpeciesMapper {

  @Mappings({
          @Mapping(target = "speciesId", source = "idEspecie"),
          @Mapping(target = "speciesName", source = "especie")
  })
  Species toSpecies (Especie especie);
  @InheritInverseConfiguration
  @Mapping(target = "productos", ignore = true)
  Especie toEspecie(Species species);


}
