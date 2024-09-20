package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Paises;

public interface PaisesRepository extends JpaRepository<Paises, Long> {

}
