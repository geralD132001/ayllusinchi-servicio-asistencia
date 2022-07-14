package com.backend.springboot.app.asistencia.controllers;

import com.backend.springboot.app.asistencia.models.entiity.AsistenciaPersona;
import com.backend.springboot.app.asistencia.models.service.IAsistenciaPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class AsistenciaPersonaController {

    @Autowired
    private IAsistenciaPersonaService personaAsistenciaService;

    @GetMapping("/listar-asistencia-persona")
    public ResponseEntity<?> listar() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta");
        result.put("data", personaAsistenciaService.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/crear-asistencia-persona")
    @ResponseStatus(HttpStatus.CREATED)
    public  ResponseEntity<?> crear(@RequestBody AsistenciaPersona asistencia) {
        HashMap<String, Object> result = new HashMap<>();
        AsistenciaPersona data = personaAsistenciaService.save(asistencia);

        result.put("success", true);
        result.put("message", "La asistencia de la persona se ha registrado correctamente.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
