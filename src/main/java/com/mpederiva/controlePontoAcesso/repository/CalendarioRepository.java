package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.Calendario;
import com.mpederiva.controlepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}