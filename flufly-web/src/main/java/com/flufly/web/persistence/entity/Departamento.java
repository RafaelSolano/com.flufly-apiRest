package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departamentos")
public class Departamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_departamento")
  private Integer idDepeartamento;

  @Column(name = "nombre_departamento")
  private String nombreDepartamento;
}
