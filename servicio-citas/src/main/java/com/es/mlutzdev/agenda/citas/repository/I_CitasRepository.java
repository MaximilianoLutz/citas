package com.es.mlutzdev.agenda.citas.repository;

import com.es.mlutzdev.agenda.citas.entities.Cita;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface I_CitasRepository extends CrudRepository<Cita, Long> {

    public List<Cita> findByIdCliente(String idCliente);

}
