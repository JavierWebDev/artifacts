package com.campuslands.artifacts.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.artifacts.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
