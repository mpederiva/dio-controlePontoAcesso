package com.mpederiva.controlepontoacesso.repository;

import com.mpederiva.controlepontoacesso.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}