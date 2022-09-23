package com.uco.myproject.aplicacion.servicio.comentario;

import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.puerto.RepositorioComentario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarComentario {

    private final RepositorioComentario repositorioComentario;

    public ServicioAplicacionListarComentario(RepositorioComentario repositorioComentario) {
        this.repositorioComentario = repositorioComentario;
    }

    public List<Comentario> ejecutar(){
        return repositorioComentario.listar();
    }
}
