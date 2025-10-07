package com.jdc.segundaapi.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name= "universidades")
@Data
public class UniversidadEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduniversidad")
    private Long universidad;

    @Column(name = "nit", unique = true)
    private String nit;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "puntuacion")
    private String puntuacion;

    @Column(name = "descripcion")
    private String descripcion;







}
