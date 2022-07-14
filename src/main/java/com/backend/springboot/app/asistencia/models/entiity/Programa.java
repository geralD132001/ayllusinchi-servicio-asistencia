package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;

@Entity
@Table(name = "tcd_programa")
public class Programa {

    @Id
    @Column(name = "id_programa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrograma;

    @Column(name = "no_programa")
    private String nombre;

    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

