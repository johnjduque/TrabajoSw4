package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.puerto.RepositorioCalificacion;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCalificacion;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioCalificacionJpa;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RepositorioCalificacionPostgresql implements RepositorioCalificacion {

    private final RepositorioCalificacionJpa repositorioCalificacionJpa;

    public RepositorioCalificacionPostgresql(RepositorioCalificacionJpa repositorioCalificacionJpa) {
        this.repositorioCalificacionJpa = repositorioCalificacionJpa;
    }
    @Override
    public List<Calificacion> listar(Long id) {
        List<EntidadCalificacion> entidadCalificaciones = repositorioCalificacionJpa.findAll();
        List<Calificacion> calificaciones = entidadCalificaciones.stream().map(calificacion -> new Calificacion(calificacion.getIdSitioTuristico(),
                calificacion.getCalificacion())).toList();

        return calificaciones.stream().filter(calificacion -> calificacion.getIdSitioTuristico()== id).collect(Collectors.toList());
    }

    @Override
    public Long guardar(Calificacion calificacion) {
        EntidadCalificacion entidadCalificacion = new EntidadCalificacion(calificacion.getIdSitioTuristico(), calificacion.getCalificacion());
        return this.repositorioCalificacionJpa.save(entidadCalificacion).getIdSitioTuristico();
    }
}
