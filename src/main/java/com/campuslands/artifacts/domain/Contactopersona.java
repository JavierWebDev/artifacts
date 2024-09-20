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
public class Contactopersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContactopersona;

    @ManyToOne
    @NotBlank(message = "Clase persona no puede ser vacia")
    @JoinColumn(name = "contactoClaseContacto")
    private Clasecontacto claseContacto;

    @ManyToOne
    @NotBlank(message = "Persona no puede ser vacia")
    @JoinColumn(name = "contactoPersona")
    private Persona persona;
}
