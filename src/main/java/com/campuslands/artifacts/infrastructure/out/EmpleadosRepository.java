package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {

}
