package com.backend.springboot.app.asistencia.dto;

import java.util.Date;

public class AsistenciaDto {

    private Long idAsistencia;
    private Date fecha;
    private String rptaDetalle;
    private String rptanRelacion;
    private String rptaNecesidad;
    private String rptaRegreso;
    private String rptaInteresado;
    private EstudianteDto estudiante;
    private TallerDto taller;

    public AsistenciaDto(Long idAsistencia, Date fecha, String rptaDetalle, String rptanRelacion, String rptaNecesidad, String rptaRegreso, String rptaInteresado, EstudianteDto estudiante, TallerDto taller) {
        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.rptaDetalle = rptaDetalle;
        this.rptanRelacion = rptanRelacion;
        this.rptaNecesidad = rptaNecesidad;
        this.rptaRegreso = rptaRegreso;
        this.rptaInteresado = rptaInteresado;
        this.estudiante = estudiante;
        this.taller = taller;
    }

    public AsistenciaDto() {

    }

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

    public String getRptaDetalle() {
        return rptaDetalle;
    }

    public void setRptaDetalle(String rptaDetalle) {
        this.rptaDetalle = rptaDetalle;
    }

    public String getRptanRelacion() {
        return rptanRelacion;
    }

    public void setRptanRelacion(String rptanRelacion) {
        this.rptanRelacion = rptanRelacion;
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

    public EstudianteDto getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDto estudiante) {
        this.estudiante = estudiante;
    }

    public TallerDto getTaller() {
        return taller;
    }

    public void setTaller(TallerDto taller) {
        this.taller = taller;
    }

}
