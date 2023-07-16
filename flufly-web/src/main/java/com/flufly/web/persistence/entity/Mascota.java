package com.flufly.web.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "mascotas")
@Entity
public class Mascota {

  @Column(name = "id_mascota")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer IdMascota;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "generro")
  private String generro;

  @Column(name = "talla")
  private Float talla;

  @Column(name = "peso")
  private Float peso;

  @Column(name = "fecha_Nacimiento")
  private LocalDate fechaNacimiento;

  @Column(name = "foto")
  private String foto;

  @ManyToOne
  @JoinColumn(name = "especie_id_especie")
  private Especie especie;

  @ManyToOne
  @JoinColumns({
          @JoinColumn(name = "clientes_id_cliente", referencedColumnName = "id_cliente"),
          @JoinColumn(name = "clientes_usuarios_id_usuario", referencedColumnName = "usuarios_id_usuario")
  })
  private Cliente cliente;


  @OneToOne(mappedBy = "mascota", cascade = CascadeType.ALL)
  private MascotaPerdida mascotaPerdida;

}
