package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "empleados")
@Entity
public class Empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_empleado")
  private  Integer idEmpleado;


  @Column(name = "sueldo")
  private Double sueldo;

  @Column(name = "contacto_emergencia")
  private String contactoEmergencia;


}
