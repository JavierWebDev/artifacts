package com.campuslands.artifacts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSucursal;

    private String nombre;

    @ManyToOne
    @NotBlank(message = "La empresa no puede estar vacia")
    @JoinColumn(name = "sucursalEmpresa")
    private Sucursal sucursal;

    @ManyToOne
    @NotBlank(message = "La persona no puede estar vacia")
    @JoinColumn(name = "sucursalPersona")
    private Sucursal persona;

    @ManyToOne
    @NotBlank(message = "La ciudad no puede estar vacia")
    @JoinColumn(name = "sucursalCiudad")
    private Sucursal ciudad;

}
