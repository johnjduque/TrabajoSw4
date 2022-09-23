package com.uco.myproject.aplicacion.servicio.transporte;

import com.uco.myproject.dominio.modelo.Transporte;
import com.uco.myproject.dominio.puerto.RepositorioTransporte;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarTransporte {

    private final RepositorioTransporte repositorioTransporte;

    public ServicioAplicacionListarTransporte(RepositorioTransporte repositorioTransporte) {
        this.repositorioTransporte = repositorioTransporte;
    }

    public List<Transporte> ejecutar(){
        return repositorioTransporte.listar();
    }
}
