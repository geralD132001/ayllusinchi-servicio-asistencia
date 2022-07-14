package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="tcd_carrera")
public class Carrera {

    @Id
    @Column(name = "id_carrera")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrera;

    @Column(name = "no_carrera")
    private String nombre;

    @Column(name = "ab_carrera")
    private String abreviacion;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tcd_curso",
            joinColumns = @JoinColumn(name = "id_carrera"),
            inverseJoinColumns = @JoinColumn(name = "id_ciclo"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"id_carrera","id_ciclo"})})
    private List<Ciclo> ciclos;

    public Long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        this.idCarrera = idCarrera;
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

    public List<Ciclo> getCiclos() {
        return ciclos;
    }

    public void setCiclos(List<Ciclo> ciclos) {
        this.ciclos = ciclos;
    }
}
