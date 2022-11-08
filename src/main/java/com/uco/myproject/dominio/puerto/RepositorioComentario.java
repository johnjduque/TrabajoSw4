package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Comentario;

import java.util.List;
public interface RepositorioComentario {

    List<Comentario> listar(Long id);
    Long guardar(Comentario comentario);
}
