package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Transacciones;

public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {

}
