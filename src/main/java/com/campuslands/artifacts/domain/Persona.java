package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String nombre;

    @ManyToOne
    @NotNull(message = "El genero no puede ser nulo")
    @JoinColumn(name = "personaGenero")
    private Genero genero;

    @ManyToOne
    @NotNull(message = "El estado persona no puede ser nulo")
    @JoinColumn(name = "personaEstado")
    private Genero estado;
}
