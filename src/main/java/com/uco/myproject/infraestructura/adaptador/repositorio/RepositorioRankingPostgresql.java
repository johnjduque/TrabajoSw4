package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Ranking;
import com.uco.myproject.dominio.puerto.RepositorioRanking;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioRankingJpa;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioRankingPostgresql implements RepositorioRanking {

    private final RepositorioRankingJpa repositorioRankingJpa;

    public RepositorioRankingPostgresql(RepositorioRankingJpa repositorioRankingJpa) {
        this.repositorioRankingJpa = repositorioRankingJpa;
    }

    @Override
    public Long guardar(Ranking ranking) {
        return null;
    }
}
