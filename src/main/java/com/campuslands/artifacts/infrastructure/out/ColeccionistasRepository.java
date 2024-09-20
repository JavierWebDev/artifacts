package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Coleccionistas;

public interface ColeccionistasRepository extends JpaRepository<Coleccionistas, Long> {

}
