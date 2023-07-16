package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "productos")
@Setter
@Getter
public class Producto {


  //    categoria_idcategoria, especie_id_especie

  @Column(name = "id_producto")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Integer idProducto;
  @Column(name = "nombre_producto")
  private  String nombreProducto;
  private  String referencia;
  @Column(name = "unidades_disponibles")
  private  Integer unidadesdisponibles;
  private Double precio;
  @Column(name = " fecha_compra")
  private LocalDateTime fechacompra;
  private String descripcion;
  private String beneficios;
  private String caracteristicas;
  private  String foto;
  @Column( name = "precio_compra")
  private  Double precioCompra;
  @Column(name = "precio_venta")
  private   Double precioVenta;

  @ManyToOne
  @JoinColumn(name = "categoria_idcategoria", insertable = true , updatable = true)
  private Categoria categoria;
  @ManyToOne
  @JoinColumn(name = " especie_id_especie", insertable = true, updatable = true)
  private Especie  especie;

  @OneToMany(mappedBy = "producto")
  private List<ComprasProducto>comprasProductos;





}
