package com.backend.springboot.app.asistencia.dto;

import java.util.Date;

public class TallerDto {

    private Long idTaller;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;

    public TallerDto(Long idTaller, String nombre, String descripcion, Date fechaInicio) {
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public TallerDto(){
    }

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
}
