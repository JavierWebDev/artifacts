package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Detalle_transaccion;

public interface Detalle_transaccionRepository extends JpaRepository<Detalle_transaccion, Long> {

}
