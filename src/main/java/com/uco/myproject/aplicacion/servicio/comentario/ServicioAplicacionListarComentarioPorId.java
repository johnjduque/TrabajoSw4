package com.uco.myproject.aplicacion.servicio.comentario;

import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.puerto.RepositorioComentario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarComentarioPorId {

    private final RepositorioComentario repositorioComentario;

    public ServicioAplicacionListarComentarioPorId(RepositorioComentario repositorioComentario) {
        this.repositorioComentario = repositorioComentario;
    }

    public List<Comentario> ejecutar(){
        return null;
    }
}
