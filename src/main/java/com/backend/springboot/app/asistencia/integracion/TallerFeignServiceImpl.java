package com.backend.springboot.app.asistencia.integracion;

import com.backend.springboot.app.asistencia.dto.TallerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TallerFeignServiceImpl implements TallerFeignService {

    @Autowired
    private TallerClienteRest tallerFeign;

    /*
    @Override
    public Optional<TallerDto> findByTaller(Long idTaller) {
        var tall = tallerFeign.findTaller(idTaller);

        System.out.println("Taller-descripción "+ tall.get().getData().getDescripcion());

        if (tall.isPresent()) {
            var tallerDto = new TallerDto();
            tallerDto.setIdTaller(tall.get().getData().getIdTaller());
            tallerDto.setNombre(tall.get().getData().getNombre());
            tallerDto.setDescripcion(tall.get().getData().getDescripcion());
            tallerDto.setFechaInicio(tall.get().getData().getFechaInicio());
            return Optional.of(tallerDto);
        }

        return Optional.empty();
    }*/
}
