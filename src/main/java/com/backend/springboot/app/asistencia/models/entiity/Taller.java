package com.backend.springboot.app.asistencia.models.entiity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tcd_taller")
public class Taller {

    @Id
    @Column(name = "id_taller")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTaller;

    @Column(name = "no_taller")
    private String nombre;

    @Column(name = "de_taller")
    private String descripcion;

    @Column(name = "fe_taller")
    private Date fechaInicio;

    @ManyToOne
    @JoinColumn(name = "id_programa")
    // @JsonBackReference
    private Programa programa;


    public Long getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(Long idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}

