package com.uco.myproject.aplicacion.servicio.calificacion;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.servicio.calificacion.ServicioObtenerListaCalificacionPorId;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarCalificacionPorId {

    private final ServicioObtenerListaCalificacionPorId servicioObtenerListaCalificacionPorId;

    public ServicioAplicacionListarCalificacionPorId(ServicioObtenerListaCalificacionPorId servicioObtenerListaCalificacionPorId) {
        this.servicioObtenerListaCalificacionPorId = servicioObtenerListaCalificacionPorId;
    }

    public List<Calificacion> ejecutar(Long id){

        return servicioObtenerListaCalificacionPorId.obtenerListaCalificacionesPorId(id);

    }
}
