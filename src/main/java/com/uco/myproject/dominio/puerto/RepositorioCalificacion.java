package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Calificacion;

import java.util.List;
public interface RepositorioCalificacion {

    List<Calificacion> listar(Long id);
    Long guardar(Calificacion calificacion);
}
