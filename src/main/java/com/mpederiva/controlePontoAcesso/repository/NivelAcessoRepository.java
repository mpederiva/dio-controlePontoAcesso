package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.JornadaTrabalho;
import com.mpederiva.controlepontoacesso.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}