package com.es.mlutzdev.agenda.citas.controller;

import com.es.mlutzdev.agenda.citas.entities.Cita;
import com.es.mlutzdev.agenda.citas.service.I_CitasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cita")
public class CitaController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private I_CitasService citasService;

    @PostMapping
    public ResponseEntity<Cita> saveCita(@RequestBody Cita cita){
        if(cita == null){
            return ResponseEntity.badRequest().build();
        }

        try{
            Cita  citaGuardada = citasService.guardarCita(cita);
            return ResponseEntity.ok().body(cita);

        }catch (Exception ex){
            logger.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping("/idCita")
    public ResponseEntity<Cita> obtenerCitaPorId(@PathVariable Long idCita ){
        try {
            Cita citaDB = citasService.getCitaById(idCita).orElse(null);
            return ResponseEntity.ok(citaDB);
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return ResponseEntity.notFound().build();
        }
    }
}
