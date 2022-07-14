package com.backend.springboot.app.asistencia.dto;

import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;

public class EstudianteDto2 {

    private Estudiante data;
    private String success;
    private String messagge;

    public EstudianteDto2(Estudiante data, String success, String messagge) {
        this.data = data;
        this.success = success;
        this.messagge = messagge;
    }

    public EstudianteDto2() {

    }

    public Estudiante getData() {
        return data;
    }

    public void setData(Estudiante data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessagge() {
        return messagge;
    }

    public void setMessagge(String messagge) {
        this.messagge = messagge;
    }
}
