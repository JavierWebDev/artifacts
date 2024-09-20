package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Ciudades;

public interface CiudadesRepository extends JpaRepository<Ciudades, Long> {

}
