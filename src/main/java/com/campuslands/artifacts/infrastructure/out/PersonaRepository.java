package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
