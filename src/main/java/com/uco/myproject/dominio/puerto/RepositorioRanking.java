package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Ranking;

public interface RepositorioRanking {
    Long guardar(Ranking ranking);
}
