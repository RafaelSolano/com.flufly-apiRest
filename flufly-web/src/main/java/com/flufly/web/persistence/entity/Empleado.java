package com.flufly.web.persistence.entity;

import com.flufly.web.persistence.EmpleadoPK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "empleados")
@Entity
public class Empleado {
  @EmbeddedId
  private EmpleadoPK id;

  @Column(name = "sueldo")
  private Double sueldo;

  @Column(name = "contacto_emergencia")
  private String contactoEmergencia;

  @ManyToOne
  @JoinColumn(name = "departamentos_id_departamento")
  private Departamento departamento;

  @ManyToOne
  @MapsId
  @JoinColumn(name = "usuarios_id_usuario")
  private Usuario usuario;


}
