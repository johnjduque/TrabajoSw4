package com.uco.myproject.dominio.servicio.comentario;

import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.puerto.RepositorioComentario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarComentario {

    private final RepositorioComentario repositorioComentario;

    public ServicioGuardarComentario(RepositorioComentario repositorioComentario) {
        this.repositorioComentario = repositorioComentario;
    }

    public Long ejecutar(Comentario comentario){
        return repositorioComentario.guardar(comentario);
    }
}
