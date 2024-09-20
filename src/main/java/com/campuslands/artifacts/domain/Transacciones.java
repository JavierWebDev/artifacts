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
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacciones;

    @ManyToOne
    @NotBlank(message = "Persona no puede ser vacia")
    @JoinColumn(name = "transaccionPersona")
    private Persona persona;

    @ManyToOne
    @NotBlank(message = "TipoTransaccion no puede ser vacia")
    @JoinColumn(name = "tipoTransaccion")
    private Tipotransaccion tipotransaccion;

}
