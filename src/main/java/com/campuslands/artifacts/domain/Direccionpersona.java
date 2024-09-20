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
public class Direccionpersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccionpersona;

    private String direccion;

    @ManyToOne
    @NotBlank(message = "Tipo Direccion no puede ser vacia")
    @JoinColumn(name = "direccionTipoDir")
    private Tipodireccion tipoDireccion;

    @ManyToOne
    @NotBlank(message = "Clase persona no puede ser vacia")
    @JoinColumn(name = "direccionPersona")
    private Persona persona;
}
