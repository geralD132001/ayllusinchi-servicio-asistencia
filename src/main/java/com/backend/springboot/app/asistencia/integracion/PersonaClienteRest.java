package com.backend.springboot.app.asistencia.integracion;

import com.backend.springboot.app.asistencia.dto.PersonaDto2;
import com.backend.springboot.app.commons.beneficiarios.models.entity.Persona;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "servicio-beneficiarios")
public interface PersonaClienteRest {

    @GetMapping("/persona/{id}")
    public Optional<PersonaDto2> findPersona(@PathVariable Long id);
}
