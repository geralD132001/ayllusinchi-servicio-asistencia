package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;

@Entity
@Table(name ="tcd_facultad")
public class Facultad {

    @Id
    @Column(name = "id_facultad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacultad;

    @Column(name = "no_facultad")
    private String nombre;

    @Column(name = "ab_facultad")
    private String abreviacion;

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

}