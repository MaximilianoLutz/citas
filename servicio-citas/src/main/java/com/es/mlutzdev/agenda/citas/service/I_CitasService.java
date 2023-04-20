package com.es.mlutzdev.agenda.citas.service;

import com.es.mlutzdev.agenda.citas.entities.Cita;

import java.util.List;
import java.util.Optional;

public interface I_CitasService {

    public Optional<Cita> getCitaById(Long idCita);
    public List<Cita> getAllCitasByUser(String userId);
    public List<Cita> getAllCitas();
    public Cita guardarCita(Cita cita);
    public void eliminarCita(Long idCita);
}
