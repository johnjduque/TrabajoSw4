package com.uco.myproject.aplicacion.servicio.calificacion;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.puerto.RepositorioCalificacion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarCalificacion {

    private final RepositorioCalificacion repositorioCalificacion;

    public ServicioAplicacionListarCalificacion(RepositorioCalificacion repositorioCalificacion) {
        this.repositorioCalificacion = repositorioCalificacion;
    }

    public List<Calificacion> ejecutar(){
        return repositorioCalificacion.listar();
    }
}
