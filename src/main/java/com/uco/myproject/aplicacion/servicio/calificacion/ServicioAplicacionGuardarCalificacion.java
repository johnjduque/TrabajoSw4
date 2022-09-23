package com.uco.myproject.aplicacion.servicio.calificacion;

import com.uco.myproject.aplicacion.dto.DtoCalificacion;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.servicio.calificacion.ServicioGuardarCalificacion;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarCalificacion {

    private final ServicioGuardarCalificacion servicioGuardarCalificacion;

    public ServicioAplicacionGuardarCalificacion(ServicioGuardarCalificacion servicioGuardarCalificacion) {
        this.servicioGuardarCalificacion = servicioGuardarCalificacion;
    }

    public DtoRespuesta<Long> ejecutar(DtoCalificacion dtoCalificacion){
        Calificacion calificacion = Calificacion.of(dtoCalificacion.getIdSitioTuristico(),
                dtoCalificacion.getCalificacion());
        return new DtoRespuesta<>((Long) servicioGuardarCalificacion.ejecutar(calificacion));
    }
}
