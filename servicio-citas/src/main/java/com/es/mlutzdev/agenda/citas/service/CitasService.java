package com.es.mlutzdev.agenda.citas.service;

import com.es.mlutzdev.agenda.citas.entities.Cita;
import com.es.mlutzdev.agenda.citas.repository.I_CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitasService implements I_CitasService {

    @Autowired
    private I_CitasRepository citasRepository;

    @Override
    public Optional<Cita> getCitaById(Long id) {
        return citasRepository.findById(id);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public List<Cita> getAllCitasByUser(String userId) {
        return citasRepository.findByIdCliente(userId);
    }

    /**
     * @return
     */
    @Override
    public List<Cita> getAllCitas() {
        return (List<Cita>) citasRepository.findAll();
    }

    /**
     * @param cita
     * @return
     */
    @Override
    public Cita guardarCita(Cita cita) {
        return citasRepository.save(cita);
    }

    /**
     * @param idCita
     * @return
     */
    @Override
    public void eliminarCita(Long idCita) {
         citasRepository.deleteById(idCita);
    }
}
