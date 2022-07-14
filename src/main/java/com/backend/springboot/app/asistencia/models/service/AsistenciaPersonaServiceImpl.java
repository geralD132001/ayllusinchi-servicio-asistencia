package com.backend.springboot.app.asistencia.models.service;

import com.backend.springboot.app.asistencia.models.entiity.Asistencia;
import com.backend.springboot.app.asistencia.models.entiity.AsistenciaPersona;
import com.backend.springboot.app.asistencia.models.repository.AsistenciaPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class AsistenciaPersonaServiceImpl implements IAsistenciaPersonaService{

    @Autowired
    private AsistenciaPersonaRepository personaRepository;

    @Override
    @Transactional(readOnly = false)
    public List<AsistenciaPersona> findAll() {
        return (List<AsistenciaPersona>) personaRepository.findAll();
    }

    @Override
    @Transactional
    public AsistenciaPersona save(AsistenciaPersona asistencia) {
        return personaRepository.save(asistencia);
    }
}
