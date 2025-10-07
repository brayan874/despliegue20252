package com.jdc.segundaapi.entity;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="estudiantes")
public class EstudianteEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    private String id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="tipo_documento")
    private Integer tipodocumento;

    @Column(name="telefono")
    private String telefono;

    @Column(name="extensionnumero")
    private String extensionnumero;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fkuniversidad", referencedColumnName = "iduniversidad")

    @OnDelete(action = OnDeleteAction.CASCADE)
    private UniversidadEntity universidad;
}
