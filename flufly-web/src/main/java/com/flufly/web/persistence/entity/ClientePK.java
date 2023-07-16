package com.flufly.web.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ClientePK  implements Serializable {
  @Column(name = "id_cliente")
  private Integer idCliente;

  @Column(name = "usuarios_id_usuario")
  private Integer usuariosIdUsuario;
}
