package com.uco.myproject.infraestructura.adaptador.repositorio.jpa;

import com.uco.myproject.infraestructura.adaptador.entidad.EntidadRanking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRankingJpa extends JpaRepository<EntidadRanking, Long> {
}
