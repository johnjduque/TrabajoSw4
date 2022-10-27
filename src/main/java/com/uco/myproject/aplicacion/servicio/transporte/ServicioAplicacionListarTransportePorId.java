package com.uco.myproject.aplicacion.servicio.transporte;

import com.uco.myproject.dominio.modelo.Transporte;
import com.uco.myproject.dominio.puerto.RepositorioTransporte;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarTransportePorId {

    private final RepositorioTransporte repositorioTransporte;

    public ServicioAplicacionListarTransportePorId(RepositorioTransporte repositorioTransporte) {
        this.repositorioTransporte = repositorioTransporte;
    }

    public List<Transporte> ejecutar(){
        return null;
    }
}
