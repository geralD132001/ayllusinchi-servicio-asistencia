package com.backend.springboot.app.asistencia.models.entiity;

import javax.persistence.*;

@Entity
@Table(name ="tcd_curso")
public class Curso {

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "no_curso")
    private String curso;

    @Column(name = "no_profesor")
    private String profesor;

    @ManyToOne()
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    @ManyToOne()
    @JoinColumn(name = "id_ciclo")
    private Ciclo ciclo;

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
}
