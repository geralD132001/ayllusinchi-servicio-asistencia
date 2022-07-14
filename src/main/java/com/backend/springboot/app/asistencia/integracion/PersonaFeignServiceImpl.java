package com.backend.springboot.app.asistencia.integracion;

import com.backend.springboot.app.asistencia.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaFeignServiceImpl implements PersonaFeignService {

    @Autowired
    private PersonaClienteRest personaFeign;

    /*
    @Override
    public Optional<PersonaDto> findByIdPersona(Long idPersona) {
        var per = personaFeign.findPersona(idPersona);
        System.out.println("Persona " + per.get().getData().getDni());

        if (per.isPresent()) {
            var personaDto = new PersonaDto();
            personaDto.setIdPersona(per.get().getData().getIdPersona());
            personaDto.setNombres(per.get().getData().getNombres());
            personaDto.setApellidos(per.get().getData().getApellidos());
            personaDto.setFechaNacimiento(per.get().getData().getFechaNacimiento());
            personaDto.setNumCelular(per.get().getData().getNumCelular());
            personaDto.setSexo(per.get().getData().getSexo());
            personaDto.setDni(per.get().getData().getDni());
            return Optional.of(personaDto);
        }
        return Optional.empty();
    }
    */

}
