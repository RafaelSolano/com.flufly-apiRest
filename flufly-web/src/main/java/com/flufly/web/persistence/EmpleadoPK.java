package com.flufly.web.persistence;

import jakarta.persistence.Column;

import java.io.Serializable;

public class EmpleadoPK implements Serializable {
  @Column(name = "id_empleado")
  private Integer idEmpleado;

  @Column(name = "usuarios_id_usuario")
  private Integer idUsuario;
}
