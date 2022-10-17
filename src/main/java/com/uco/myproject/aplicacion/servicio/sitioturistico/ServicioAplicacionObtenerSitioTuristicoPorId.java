package com.uco.myproject.aplicacion.servicio.sitioturistico;

import com.uco.myproject.dominio.modelo.SitioTuristico;
import com.uco.myproject.dominio.servicio.sitioturistico.ServicioObtenerSitioTuristicoPorId;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionObtenerSitioTuristicoPorId {

    private final ServicioObtenerSitioTuristicoPorId servicioObtenerSitioTuristicoPorCodigo;

    public ServicioAplicacionObtenerSitioTuristicoPorId(ServicioObtenerSitioTuristicoPorId servicioObtenerSitioTuristicoPorCodigo) {
        this.servicioObtenerSitioTuristicoPorCodigo = servicioObtenerSitioTuristicoPorCodigo;
    }

    public SitioTuristico obtenerPorCodigo(Long id){
        SitioTuristico sitioTuristico = this.servicioObtenerSitioTuristicoPorCodigo.obtenerPorCodigo(id);

        return new SitioTuristico(sitioTuristico.getId(),sitioTuristico.getNombre(),sitioTuristico.getReseña(),
                sitioTuristico.getDireccion());
    }
}
