package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.SitioTuristico;

import java.util.List;

public interface RepositorioSitioTuristico {

    List<SitioTuristico> listar();
    SitioTuristico consultarPorId(Long id);
    boolean existe(SitioTuristico sitioTuristico);
}
