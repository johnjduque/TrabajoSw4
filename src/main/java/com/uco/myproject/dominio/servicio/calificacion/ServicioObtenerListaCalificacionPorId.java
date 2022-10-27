package com.uco.myproject.dominio.servicio.calificacion;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.puerto.RepositorioCalificacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioObtenerListaCalificacionPorId {

    private static final String MENSAJE_NO_EXISTE = "No hay datos registrados";
    private static final String MENSAJE_EXISTE = "Consulta exitosa";

    private final RepositorioCalificacion repositorioCalificacion;

    public ServicioObtenerListaCalificacionPorId(RepositorioCalificacion repositorioCalificacion) {
        this.repositorioCalificacion = repositorioCalificacion;
    }

    public List<Calificacion> obtenerListaCalificacionesPorId(Long id){
        return  this.repositorioCalificacion.listar(id);
    }
}
