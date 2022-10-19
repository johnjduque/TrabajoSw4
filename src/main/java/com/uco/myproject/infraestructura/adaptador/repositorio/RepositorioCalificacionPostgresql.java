package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.puerto.RepositorioCalificacion;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCalificacion;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioCalificacionJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioCalificacionPostgresql implements RepositorioCalificacion {

    private final RepositorioCalificacionJpa repositorioCalificacionJpa;

    public RepositorioCalificacionPostgresql(RepositorioCalificacionJpa repositorioCalificacionJpa) {
        this.repositorioCalificacionJpa = repositorioCalificacionJpa;
    }

    @Override
    public List<Calificacion> listar() {
        return null;
    }

    @Override
    public Long guardar(Calificacion calificacion) {
        EntidadCalificacion entidadCalificacion = new EntidadCalificacion(calificacion.getIdSitioTuristico(), calificacion.getCalificacion());
        return this.repositorioCalificacionJpa.save(entidadCalificacion).getIdSitioTuristico();
    }
}
