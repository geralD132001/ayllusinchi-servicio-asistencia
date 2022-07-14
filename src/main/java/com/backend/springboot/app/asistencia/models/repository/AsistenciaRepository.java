package com.backend.springboot.app.asistencia.models.repository;

import com.backend.springboot.app.asistencia.models.entiity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {

    // List<Asistencia> findByEstudiante(Long idEstudiante);
    // List<Asistencia> findByTaller(Long idTaller);
    // List<Asistencia> findByPersona(Long idPersona);

}
