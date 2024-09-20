package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Despachos;

public interface DespachosRepository extends JpaRepository<Despachos, Long> {

}
