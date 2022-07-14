package com.backend.springboot.app.asistencia.models.service;

import com.backend.springboot.app.asistencia.models.entiity.AsistenciaPersona;

import java.util.List;

public interface IAsistenciaPersonaService {

    public List<AsistenciaPersona> findAll();
    public AsistenciaPersona save(AsistenciaPersona asistencia);

}
