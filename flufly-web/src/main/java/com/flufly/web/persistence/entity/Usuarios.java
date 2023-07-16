package com.flufly.web.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuarios {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuarios")
  private  Integer idUsuarios;
  @Column(name = "documento_identidad")
  private String documentoIdentidad;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "edad")
  private Integer edad;

  @Column(name = "direccion")
  private String direccion;

  @Column(name = "telefono")
  private String telefono;

  @Column(name = "correo")
  private String correo;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;



}
