package com.backend.springboot.app.asistencia.dto;

import com.backend.springboot.app.commons.proyecto.models.entity.Taller;

public class TallerDto2 {

    private Taller data;
    private String success;
    private String mesagge;

    public TallerDto2(Taller data, String success, String mesagge) {
        this.data = data;
        this.success = success;
        this.mesagge = mesagge;
    }
    public TallerDto2() {

    }

    public Taller getData() {
        return data;
    }

    public void setData(Taller data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMesagge() {
        return mesagge;
    }

    public void setMesagge(String mesagge) {
        this.mesagge = mesagge;
    }
}
