package com.uco.myproject.dominio.servicio.transporte;

import com.uco.myproject.dominio.modelo.Transporte;
import com.uco.myproject.dominio.puerto.RepositorioTransporte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioObtenerListaTransportePorId {

    private static final String MENSAJE_NO_EXISTE = "No hay datos registrados";
    private static final String MENSAJE_EXISTE = "Consulta exitosa";

    private final RepositorioTransporte repositorioTransporte;

    public ServicioObtenerListaTransportePorId(RepositorioTransporte repositorioTransporte) {
        this.repositorioTransporte = repositorioTransporte;
    }

    public List<Transporte> obtenerListaTransportePorId(Long id){
        return this.repositorioTransporte.listar(id);
    }
}
