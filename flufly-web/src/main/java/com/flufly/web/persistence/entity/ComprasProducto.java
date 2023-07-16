package com.flufly.web.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {


  @Id
  @Column(name = "id_compras_productos")
  private Integer idComprasProducto;

  @Column(name = "cantidad")
  private Integer cantidad;

  @Column(name = "total")
  private Double total;

  @Column(name = "estado")
  private Boolean estado;

}
