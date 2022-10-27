package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.puerto.RepositorioComentario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadComentario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioComentarioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioComentarioPostgresql implements RepositorioComentario {

    private final RepositorioComentarioJpa repositorioComentarioJpa;

    public RepositorioComentarioPostgresql(RepositorioComentarioJpa repositorioComentarioJpa) {
        this.repositorioComentarioJpa = repositorioComentarioJpa;
    }
    @Override
    public List<Comentario> listar(Long id) {
        return null;
    }

    @Override
    public Long guardar(Comentario comentario) {
        EntidadComentario entidadComentario = new EntidadComentario(comentario.getIdSitioTuristico(), comentario.getDescripcion());
        return this.repositorioComentarioJpa.save(entidadComentario).getIdSitioTuristico();
    }
}
