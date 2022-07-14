package com.backend.springboot.app.asistencia.models.service;

import com.backend.springboot.app.asistencia.dto.AsistenciaDto;
import com.backend.springboot.app.asistencia.dto.AsistenciaDto2;
import com.backend.springboot.app.asistencia.models.entiity.Asistencia;

import java.util.List;

public interface IAsistenciaService {

    public List<Asistencia> findAll();
    public Asistencia findById(Long id);
    public Asistencia save(Asistencia asistencia);
    // public List<AsistenciaDto> saveAsistenciaEstudiante(AsistenciaDto asistencia, Long idEstudiante, Long idTaller);
    // public List<AsistenciaDto2> saveAsistenciaPersona(AsistenciaDto2 asistencia, Long idPersona, Long idTaller);

}
