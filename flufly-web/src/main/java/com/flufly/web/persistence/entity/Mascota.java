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

}
