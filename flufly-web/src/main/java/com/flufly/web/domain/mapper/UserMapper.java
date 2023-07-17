package com.flufly.web.domain.mapper;

import com.flufly.web.domain.User;
import com.flufly.web.persistence.entity.Usuario;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mappings({
          @Mapping(source = "idUsuario", target = "userId"),
          @Mapping(source = "documentoIdentidad", target = "identificationDocument"),
          @Mapping(source = "nombre", target = "name"),
          @Mapping(source = "edad", target = "age"),
          @Mapping(source = "direccion", target = "address"),
          @Mapping(source = "telefono", target = "phoneNumber"),
          @Mapping(source = "correo", target = "email"),
          @Mapping(source = "fechaNacimiento", target = "dateOfBirth"),
          //@Mapping(source = "Cliente", target = "Client"),
          //@Mapping(source = "Empleado", target = "Employee")
  })
  User usuarioToUser(Usuario usuario);

List<User> toUsers(List<Usuario> usuarios);
  @InheritInverseConfiguration
  Usuario UserToUsuario(User user);


}
