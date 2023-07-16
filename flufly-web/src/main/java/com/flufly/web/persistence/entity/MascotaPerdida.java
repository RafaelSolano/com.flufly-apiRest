package com.flufly.web.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class MascotaPerdida {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column (name = "id_mascota_perdida")
  private  Integer idMascotaPerdida;


  @Column(name = "fecha_perdido")
  private LocalDate fechaPerdido;

  @Column(name = "lugar_perdido")
  private String lugarPerdido;

  @Column(name = "hora")
  private LocalTime hora;

  @Column(name = "recompensa")
  private String recompensa;

  @Column(name = "descripcion")
  private String descripcion;

  @OneToOne
  @JoinColumns({
          @JoinColumn(name = "mascotas_id_mascota", referencedColumnName = "id_mascota"),
          @JoinColumn(name = "mascotas_especie_id_especie", referencedColumnName = "especie_id_especie")
  })
  private Mascota mascota;

}
