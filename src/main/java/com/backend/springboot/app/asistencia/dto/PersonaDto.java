package com.backend.springboot.app.asistencia.dto;

import java.util.Date;

public class PersonaDto {

    private Long idPersona;
    private String nombres;
    private String apellidos;
    private Character sexo;
    private Date fechaNacimiento;
    private Integer numCelular;
    private Integer dni;

    public PersonaDto(Long idPersona, String nombres, String apellidos, Character sexo, Date fechaNacimiento, Integer numCelular, Integer dni) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.numCelular = numCelular;
        this.dni = dni;
    }

    public PersonaDto(){

    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(Integer numCelular) {
        this.numCelular = numCelular;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
}
