package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

}
