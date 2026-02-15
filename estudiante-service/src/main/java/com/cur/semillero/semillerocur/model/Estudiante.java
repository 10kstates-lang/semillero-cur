package com.cur.semillero.semillerocur.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String programa;
    private String correo;

    // Aquí se guarda el ID del semillero seleccionado
    private Long semilleroId;
}