package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.Localidade;
import com.mpederiva.controlepontoacesso.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}