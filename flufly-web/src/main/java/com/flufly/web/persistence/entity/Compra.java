package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

  // Relación muchos a uno con la entidad Cliente
  @ManyToOne
  @JoinColumns({
          @JoinColumn(name = "clientes_id_cliente", referencedColumnName = "id_cliente"),
          @JoinColumn(name = "clientes_usuarios_id_usuario", referencedColumnName = "usuarios_id_usuario")
  })
  private Cliente cliente;

  // Relación uno a muchos con la entidad CompraProducto
  @OneToMany(mappedBy = "compra")
  private List<ComprasProducto>comprasProductos;





}