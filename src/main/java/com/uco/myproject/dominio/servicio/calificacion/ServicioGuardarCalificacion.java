package com.uco.myproject.dominio.servicio.calificacion;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.puerto.RepositorioCalificacion;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarCalificacion {
    private final RepositorioCalificacion repositorioCalificacion;

    public ServicioGuardarCalificacion(RepositorioCalificacion repositorioCalificacion) {
        this.repositorioCalificacion = repositorioCalificacion;
    }

    public Long ejecutar(Calificacion calificacion){
        return repositorioCalificacion.guardar(calificacion);
    }
}
