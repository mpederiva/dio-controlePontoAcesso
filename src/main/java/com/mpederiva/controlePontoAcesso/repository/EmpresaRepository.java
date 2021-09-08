package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.Empresa;
import com.mpederiva.controlepontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}