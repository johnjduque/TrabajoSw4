package com.uco.myproject.aplicacion.servicio.sitioturistico;

import com.uco.myproject.dominio.modelo.SitioTuristico;
import com.uco.myproject.dominio.puerto.RepositorioSitioTuristico;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarSitioTuristico {

    private final RepositorioSitioTuristico repositorioSitioTuristico;

    public ServicioAplicacionListarSitioTuristico(RepositorioSitioTuristico repositorioSitioTuristico) {
        this.repositorioSitioTuristico = repositorioSitioTuristico;
    }

    public List<SitioTuristico> ejecutar(){
        return repositorioSitioTuristico.listar();
    }
}
