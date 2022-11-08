package com.uco.myproject.aplicacion.servicio.transporte;

import com.uco.myproject.dominio.modelo.Transporte;
import com.uco.myproject.dominio.servicio.transporte.ServicioObtenerListaTransportePorId;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarTransportePorId {

    private final ServicioObtenerListaTransportePorId servicioObtenerListaTransportePorId;

    public ServicioAplicacionListarTransportePorId(ServicioObtenerListaTransportePorId servicioObtenerListaTransportePorId) {
        this.servicioObtenerListaTransportePorId = servicioObtenerListaTransportePorId;
    }

    public List<Transporte> ejecutar(Long id){

        return servicioObtenerListaTransportePorId.obtenerListaTransportePorId(id);

    }
}
