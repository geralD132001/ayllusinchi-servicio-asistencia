package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="ths_asistencia")
public class AsistenciaPersona {

    @Id
    @Column(name = "id_asistencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;

    @Column(name = "fe_asistencia")
    private Date fecha;

    @Column(name = "co_detalle")
    private String rptadetalle;

    @Column(name = "co_regreso")
    private String rptaRegreso;

    @Column(name = "co_interesado")
    private String rptaInteresado;

    @ManyToOne
    @JoinColumn(name = "id_taller")
    // @JsonBackReference
    private Taller taller;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    // @JsonBackReference
    private Persona persona;


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

    public String getRptadetalle() {
        return rptadetalle;
    }

    public void setRptadetalle(String rptadetalle) {
        this.rptadetalle = rptadetalle;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
