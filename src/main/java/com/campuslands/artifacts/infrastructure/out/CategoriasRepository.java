package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

}
