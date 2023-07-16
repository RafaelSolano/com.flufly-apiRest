package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {


  @Id
  @GeneratedValue
  @Column(name = "id_cliente")
  private Integer idCliente;





}
