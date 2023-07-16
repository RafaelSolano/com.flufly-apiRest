package com.flufly.web.persistence.entity;

import jakarta.persistence.*;

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

  // Relación muchos a uno con la entidad Producto
  @ManyToOne
  @JoinColumn(name = "productos_id_producto")
  private Producto producto;

  // Relación muchos a uno con la entidad Compra
  @ManyToOne
  @JoinColumn(name = "compras_id_compra")
  private Compra compra;


}
