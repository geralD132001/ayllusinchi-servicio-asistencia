package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="tcd_asistencia")
public class Asistencia {

    @Id
    @Column(name = "id_asistencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;

    @Column(name = "fe_asistencia")
    private Date fecha;

    @Column(name = "im_asistencia")
    private String evidencia;

    @Column(name = "co_detalle")
    private String rptadetalle;

    @Column(name = "co_relacion")
    private String rptaRelacion;

    @Column(name = "co_necesidad")
    private String rptaNecesidad;

    @Column(name = "co_regreso")
    private String rptaRegreso;

    @Column(name = "co_interesado")
    private String rptaInteresado;

    @ManyToOne
    @JoinColumn(name = "id_taller")
    // @JsonBackReference
    private Taller taller;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    // @JsonBackReference
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    // @JsonBackReference
    private Curso curso;

    public Long getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(Long idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public String getRptadetalle() {
        return rptadetalle;
    }

    public void setRptadetalle(String rptadetalle) {
        this.rptadetalle = rptadetalle;
    }

    public String getRptaRelacion() {
        return rptaRelacion;
    }

    public void setRptaRelacion(String rptaRelacion) {
        this.rptaRelacion = rptaRelacion;
    }

    public String getRptaNecesidad() {
        return rptaNecesidad;
    }

    public void setRptaNecesidad(String rptaNecesidad) {
        this.rptaNecesidad = rptaNecesidad;
    }

    public String getRptaRegreso() {
        return rptaRegreso;
    }

    public void setRptaRegreso(String rptaRegreso) {
        this.rptaRegreso = rptaRegreso;
    }

    public String getRptaInteresado() {
        return rptaInteresado;
    }

    public void setRptaInteresado(String rptaInteresado) {
        this.rptaInteresado = rptaInteresado;
    }


    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
