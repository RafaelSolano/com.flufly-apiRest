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
  @Column(name = "id_compra")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idCompra;

  @Column(name = "medio_pago")
  private String medioPago;

  @Column(name = "comentario")
  private String comentario;

  @Column(name = "estado")
  private Boolean estado;





}