package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Mediopago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMediopago;

    private String nombre;
}
