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
@Table(name="antiguedades")
public class Antiguedades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAntiguedades;

    private String nombre;

    @ManyToOne
    @NotBlank(message = "Category cant be null")
    @JoinColumn(name = "categorias")
    private Categorias idcategoria;

    


}
