package com.uco.myproject.aplicacion.servicio.comentario;

import com.uco.myproject.dominio.modelo.Comentario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarComentarioPorId {

    private final ServicioAplicacionListarComentarioPorId servicioAplicacionListarComentarioPorId;

    public ServicioAplicacionListarComentarioPorId(ServicioAplicacionListarComentarioPorId servicioAplicacionListarComentarioPorId) {
        this.servicioAplicacionListarComentarioPorId = servicioAplicacionListarComentarioPorId;
    }

    public List<Comentario> ejecutar(Long id){

        return servicioAplicacionListarComentarioPorId.ejecutar(id);

    }
}
