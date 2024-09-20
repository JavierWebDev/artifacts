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
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleados;

    @ManyToOne
    @NotBlank(message = "Persona no puede ser vacia")
    @JoinColumn(name = "empleadoPersona")
    private Persona persona;

    private String puesto;
    
    private double salario;
}
