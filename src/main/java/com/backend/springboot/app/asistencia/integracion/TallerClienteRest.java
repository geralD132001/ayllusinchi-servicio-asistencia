package com.backend.springboot.app.asistencia.integracion;

import com.backend.springboot.app.asistencia.dto.TallerDto2;
import com.backend.springboot.app.commons.proyecto.models.entity.Taller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "servicio-proyecto")
public interface TallerClienteRest {

    @GetMapping("/taller/ver/{id}")
    public Optional<TallerDto2> findTaller(@PathVariable Long id);


}
