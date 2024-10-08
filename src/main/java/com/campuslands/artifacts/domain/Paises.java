package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "paises")
public class Paises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;

    private String nombre;
}
