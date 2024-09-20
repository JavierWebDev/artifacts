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
public class Movcaja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovcaja;

    @ManyToOne
    @NotBlank(message = "tipomovcaja no puede ser vacia")
    @JoinColumn(name = "cajaTipoMovCaja")
    private Tipomovcaja tipoMovCaja;
}
