package com.flufly.web.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "especie")
@Getter
@Setter
public class Especie {

  @Column(name = "id_especie")
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private int idEspecie;
  private String especie;

  @OneToMany(mappedBy = "especie")
  private List<Producto> productos;
}
