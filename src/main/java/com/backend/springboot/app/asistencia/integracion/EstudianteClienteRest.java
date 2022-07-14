package com.backend.springboot.app.asistencia.integracion;


import com.backend.springboot.app.asistencia.dto.EstudianteDto2;
import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "servicio-estudiante")
public interface EstudianteClienteRest {

    @GetMapping("/{id}")
    public Optional<EstudianteDto2> findEstudiante(@PathVariable Long id);

}
