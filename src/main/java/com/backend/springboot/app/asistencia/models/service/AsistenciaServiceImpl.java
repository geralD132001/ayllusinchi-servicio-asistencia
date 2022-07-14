package com.backend.springboot.app.asistencia.models.service;

import com.backend.springboot.app.asistencia.dto.AsistenciaDto;
import com.backend.springboot.app.asistencia.dto.AsistenciaDto2;
import com.backend.springboot.app.asistencia.integracion.EstudianteFeignService;
import com.backend.springboot.app.asistencia.integracion.PersonaFeignService;
import com.backend.springboot.app.asistencia.integracion.TallerFeignService;
import com.backend.springboot.app.asistencia.models.entiity.Asistencia;
import com.backend.springboot.app.asistencia.models.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AsistenciaServiceImpl implements IAsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Autowired
    private TallerFeignService serviceTaller;

    @Autowired
    private EstudianteFeignService serviceEstudiante;

    @Autowired
    private PersonaFeignService servicePersona;

    @Override
    @Transactional(readOnly = true)
    public List<Asistencia> findAll() {
        return (List<Asistencia>) asistenciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    /*
    @Override
    @Transactional
    public List<AsistenciaDto> saveAsistenciaEstudiante(AsistenciaDto asistencia,
                                                        Long idEstudiante,
                                                        Long idTaller) {

        List<Asistencia> responseEstudiante = asistenciaRepository.findByEstudiante(idEstudiante);
        List<Asistencia> responseTaller = asistenciaRepository.findByTaller(idTaller);

        var estudiante = serviceEstudiante.findByIdEstudiante(idEstudiante);
        var taller = serviceTaller.findByTaller(idTaller);

        System.out.println(estudiante.get().getCodigo() + " Estudiante-código");
        System.out.println(taller.get().getNombre() + " Taller-nombre");
        List<AsistenciaDto> listado = new ArrayList<>();

        for(Asistencia p : responseTaller){
            var asistenciaDto = new AsistenciaDto();
            asistenciaDto.setIdAsistencia(p.getIdAsistencia());
            asistenciaDto.setFecha(p.getFecha());
            asistenciaDto.setRptaDetalle(p.getRptadetalle());
            asistenciaDto.setRptanRelacion(p.getRptaRelacion());
            asistenciaDto.setRptaNecesidad(p.getRptaNecesidad());
            asistenciaDto.setRptaRegreso(p.getRptaRegreso());
            asistenciaDto.setRptaInteresado(p.getRptaInteresado());
            asistenciaDto.setTaller(taller.get());
            asistenciaDto.setEstudiante(estudiante.get());
            listado.add(asistenciaDto);
        }
        return listado;
    }*/



    /*
    @Override
    @Transactional
    public List<AsistenciaDto2> saveAsistenciaPersona(AsistenciaDto2 asistencia,
                                                      Long idPersona,
                                                      Long idTaller) {

        List<Asistencia> responseEstudiante = asistenciaRepository.findByPersona(idPersona);
        List<Asistencia> responseTaller = asistenciaRepository.findByTaller(idTaller);

        var persona = servicePersona.findByIdPersona(idPersona);
        var taller = serviceTaller.findByTaller(idTaller);

        System.out.println(persona.get().getNombres() + " Persona-nombre");
        System.out.println(taller.get().getNombre() + " Taller-nombre");
        List<AsistenciaDto2> listado = new ArrayList<>();
        for(Asistencia p : responseTaller){
            var asistenciaDto = new AsistenciaDto2();
            asistenciaDto.setIdAsistencia(p.getIdAsistencia());
            asistenciaDto.setFecha(p.getFecha());
            asistenciaDto.setRptaDetalle(p.getRptadetalle());
            asistenciaDto.setRptanRelacion(p.getRptaRelacion());
            asistenciaDto.setRptaNecesidad(p.getRptaNecesidad());
            asistenciaDto.setRptaRegreso(p.getRptaRegreso());
            asistenciaDto.setRptaInteresado(p.getRptaInteresado());
            asistenciaDto.setTaller(taller.get());
            asistenciaDto.setPersona(persona.get());
            listado.add(asistenciaDto);
        }
        return listado;
    }

     */


}
