package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Personatipopersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonatipopersona;

    @ManyToOne
    @NotBlank(message = "Persona no puede ser vacia")
    @JoinColumn(name = "contactoClaseContacto")
    private Persona persona;

    @ManyToOne
    @NotBlank(message = "Persona no puede ser vacia")
    @JoinColumn(name = "contactoClaseContacto")
    private Tipo_persona personaTipoPersona;
}
