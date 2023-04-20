package com.es.mlutzdev.agenda.citas.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime horario;
    @Column(name = "id_cliente")
    private String idCliente;
    private String localizacion;


}
