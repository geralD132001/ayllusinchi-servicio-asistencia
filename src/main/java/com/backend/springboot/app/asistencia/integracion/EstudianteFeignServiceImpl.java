package com.backend.springboot.app.asistencia.integracion;

import com.backend.springboot.app.asistencia.dto.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteFeignServiceImpl implements EstudianteFeignService{

    @Autowired
    private EstudianteClienteRest estudianteFeign;

    /*
    @Override
    public Optional<EstudianteDto> findByIdEstudiante(Long idEstudiante) {

        var est = estudianteFeign.findEstudiante(idEstudiante);

        System.out.println("Estudiante " + est.get().getData().getCodigo());

        if(est.isPresent()){
            var estudianteDto = new EstudianteDto();
            estudianteDto.setIdEstudiante(est.get().getData().getIdEstudiante());
            estudianteDto.setCodigo(est.get().getData().getCodigo());

            return Optional.of(estudianteDto);
        }
        return Optional.empty();

    }*/
}
