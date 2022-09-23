package com.uco.myproject.dominio.servicio.ranking;

import com.uco.myproject.dominio.modelo.Ranking;
import com.uco.myproject.dominio.puerto.RepositorioRanking;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarRanking {

    private final RepositorioRanking repositorioRanking;

    public ServicioGuardarRanking(RepositorioRanking repositorioRanking) {
        this.repositorioRanking = repositorioRanking;
    }

    public Long ejecutar(Ranking ranking){
        return repositorioRanking.guardar(ranking);
    }
}
