package com.uco.myproject.aplicacion.servicio.comentario;

import com.uco.myproject.aplicacion.dto.DtoComentario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Comentario;
import com.uco.myproject.dominio.servicio.comentario.ServicioGuardarComentario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarComentario {
    private final ServicioGuardarComentario servicioGuardarComentario;

    public ServicioAplicacionGuardarComentario(ServicioGuardarComentario servicioGuardarComentario) {
        this.servicioGuardarComentario = servicioGuardarComentario;
    }

    public DtoRespuesta<Long> ejecutar(DtoComentario dtoComentario){
        Comentario comentario = Comentario.of(dtoComentario.getIdSitioTuristico(),
                dtoComentario.getDescripcion());
        return new DtoRespuesta<>((Long) servicioGuardarComentario.ejecutar(comentario));
    }
}
