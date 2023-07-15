package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categoria {

  //id_categoria, descripcion, estado
  @Column(name = "id_categoria")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idCategoria;
  private String  descripcion;
  private String estado;

  @OneToMany(mappedBy = "categoria")
  private List<Producto> productos;




}
