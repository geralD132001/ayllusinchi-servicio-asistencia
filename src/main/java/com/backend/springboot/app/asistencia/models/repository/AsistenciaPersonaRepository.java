package com.backend.springboot.app.asistencia.models.repository;

import com.backend.springboot.app.asistencia.models.entiity.AsistenciaPersona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsistenciaPersonaRepository extends JpaRepository<AsistenciaPersona, Long> {
}
