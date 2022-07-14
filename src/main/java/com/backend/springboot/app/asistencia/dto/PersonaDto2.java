package com.backend.springboot.app.asistencia.dto;

import com.backend.springboot.app.commons.beneficiarios.models.entity.Persona;

public class PersonaDto2 {

    private Persona data;
    private String succes;
    private String message;

    public PersonaDto2(Persona data, String succes, String message) {
        this.data = data;
        this.succes = succes;
        this.message = message;
    }

    public PersonaDto2(){

    }


    public Persona getData() {
        return data;
    }

    public void setData(Persona data) {
        this.data = data;
    }

    public String getSucces() {
        return succes;
    }

    public void setSucces(String succes) {
        this.succes = succes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
