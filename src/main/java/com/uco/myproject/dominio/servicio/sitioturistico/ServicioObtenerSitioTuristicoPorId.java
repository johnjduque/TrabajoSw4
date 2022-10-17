package com.uco.myproject.dominio.servicio.sitioturistico;

import com.uco.myproject.dominio.modelo.SitioTuristico;
import com.uco.myproject.dominio.puerto.RepositorioSitioTuristico;
import org.springframework.stereotype.Service;

@Service
public class ServicioObtenerSitioTuristicoPorId {

    private static final String MENSAJE_NO_EXISTE = "El Sitio no se encuentra registrado";
    private static final String MENSAJE_EXISTE = "Consulta exitosa";
    private final RepositorioSitioTuristico repositorioSitioTuristico;

    public ServicioObtenerSitioTuristicoPorId(RepositorioSitioTuristico repositorioSitioTuristico) {
        this.repositorioSitioTuristico = repositorioSitioTuristico;
    }

    public SitioTuristico obtenerPorCodigo(Long id){
        if(!this.repositorioSitioTuristico.existe(this.repositorioSitioTuristico.consultarPorId(id))){
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
        if(this.repositorioSitioTuristico.existe(this.repositorioSitioTuristico.consultarPorId(id))){
            throw new IllegalStateException(MENSAJE_EXISTE);
        }
        return this.repositorioSitioTuristico.consultarPorId(id);
    }
}
