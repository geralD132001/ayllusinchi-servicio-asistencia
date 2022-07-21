package com.backend.springboot.app.asistencia.controllers;

import com.backend.springboot.app.asistencia.dto.AsistenciaDto;
import com.backend.springboot.app.asistencia.dto.AsistenciaDto2;
import com.backend.springboot.app.asistencia.models.entiity.Asistencia;
import com.backend.springboot.app.asistencia.models.service.IAsistenciaService;
import com.backend.springboot.app.asistencia.models.service.IUploadFileService;
import com.backend.springboot.app.commons.proyecto.models.entity.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = { "https://ayllusinchis-app.azurewebsites.net" })
@RestController
public class AsistenciaController {

    @Autowired
    private IAsistenciaService asistenciaService;

    @Autowired
    private IUploadFileService uploadService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta");
        result.put("data", asistenciaService.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/ver/{id}")
    public ResponseEntity<?> detalle(@PathVariable Long id) throws InterruptedException{
        HashMap<String, Object> result = new HashMap<>();
        Asistencia data = asistenciaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro de asitencia con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        result.put("success", true);
        result.put("message", "Se ha encontrado el registro.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /*
    @PostMapping("/estudiante/{idEstudiante}/taller/{idTaller}")
    public  List<AsistenciaDto> crear(@RequestBody AsistenciaDto asistencia,
                                      @PathVariable Long idEstudiante,
                                      @PathVariable Long idTaller) {
        return  asistenciaService.saveAsistenciaEstudiante(asistencia, idEstudiante, idTaller);
    }
     */

    /*
    @PostMapping("/persona/{idPersona}/taller/{idTaller}")
    public  List<AsistenciaDto2> crearA(@RequestBody AsistenciaDto2 asistencia,
                                      @PathVariable Long idPersona,
                                      @PathVariable Long idTaller) {
        return  asistenciaService.saveAsistenciaPersona(asistencia, idPersona, idTaller);
    }

     */

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public  ResponseEntity<?> crear(@RequestBody Asistencia asistencia) {
        HashMap<String, Object> result = new HashMap<>();
        Asistencia data = asistenciaService.save(asistencia);

        result.put("success", true);
        result.put("message", "La asistencia del estudiante se ha registrado correctamente.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("idAsistencia") Long idAsistencia){
        Map<String, Object> response = new HashMap<>();

        Asistencia asistencia = asistenciaService.findById(idAsistencia);
        System.out.println(asistencia.getIdAsistencia()+ "Prueba");

        if(!archivo.isEmpty()) {

            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiar(archivo);
            } catch (IOException e) {
                response.put("mensaje", "Error al subir la imagen de la asistencia");
                response.put("error", e.getMessage().concat(": ").concat(e.getCause().getMessage()));
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

            String nombreFotoAnterior = asistencia.getEvidencia();

            uploadService.eliminar(nombreFotoAnterior);

            asistencia.setEvidencia(nombreArchivo);

            asistenciaService.save(asistencia);

            response.put("asistencia", asistencia);
            response.put("mensaje", "Has subido correctamente la imagen: " + nombreArchivo);

        }

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @GetMapping("/uploads/img/{nombreFoto:.+}")
    public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto){

        Resource recurso = null;

        try {
            recurso = uploadService.cargar(nombreFoto);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpHeaders cabecera = new HttpHeaders();
        cabecera.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"");

        return new ResponseEntity<Resource>(recurso, cabecera, HttpStatus.OK);
    }


}
