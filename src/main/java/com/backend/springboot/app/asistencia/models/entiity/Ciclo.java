package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;

@Entity
@Table(name ="tcd_ciclo")
public class Ciclo {

    @Id
    @Column(name = "id_ciclo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCiclo;

    @Column(name = "nu_ciclo")
    private Integer ciclo;

    @Column(name = "gr_ciclo")
    private Integer grupo;

    @Column(name = "se_ciclo")
    private String semestre;

    public Long getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Long idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
