package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.BancoHoras;
import com.mpederiva.controlepontoacesso.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}