package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {


  @EmbeddedId
  private ClientePK id;


  @OneToOne
  @MapsId("usuariosIdUsuario")
  @JoinColumn(name = "usuarios_id_usuario")
  private Usuario usuario;

  @OneToMany(mappedBy = "cliente")
  private List<Compra> compras;


  @OneToOne(mappedBy = "cliente")
  private Mascota mascota;




}
