package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Tipo_persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo_persona;

    private String nombre;
}
