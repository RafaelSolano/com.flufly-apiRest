package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "compras")
public class Compra {


  @Id
  @Column(name = "id_compras")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idCompras;

  @Column(name = "medio_pago")
  private String medioPago;

  @Column(name = "comentario")
  private String comentario;

  @Column(name = "estado")
  private Boolean estado;





}