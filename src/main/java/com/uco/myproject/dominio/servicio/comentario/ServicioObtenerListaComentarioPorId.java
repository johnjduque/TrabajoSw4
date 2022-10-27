package com.uco.myproject.dominio.servicio.comentario;

import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.puerto.RepositorioComentario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioObtenerListaComentarioPorId {

    private static final String MENSAJE_NO_EXISTE = "No hay datos registrados";
    private static final String MENSAJE_EXISTE = "Consulta exitosa";

    private final RepositorioComentario repositorioComentario;

    public ServicioObtenerListaComentarioPorId(RepositorioComentario repositorioComentario) {
        this.repositorioComentario = repositorioComentario;
    }

    public List<Comentario> obtenerListaComentariosPorId(Long id){
        return this.repositorioComentario.listar(id);
    }
}
