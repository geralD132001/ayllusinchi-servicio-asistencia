package com.backend.springboot.app.asistencia.dto;

public class EstudianteDto {

    private Long idEstudiante;
    private String codigo;

    public EstudianteDto(Long idEstudiante, String codigo) {
        this.idEstudiante = idEstudiante;
        this.codigo = codigo;
    }

    public  EstudianteDto(){
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
