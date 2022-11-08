package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoRanking;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.ranking.ServicioAplicacionGuardarRanking;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ranking")
public class ControladorRanking {

    private final ServicioAplicacionGuardarRanking servicioAplicacionGuardarRanking;

    public ControladorRanking(ServicioAplicacionGuardarRanking servicioAplicacionGuardarRanking) {
        this.servicioAplicacionGuardarRanking = servicioAplicacionGuardarRanking;
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoRanking dtoRanking){
        return this.servicioAplicacionGuardarRanking.ejecutar(dtoRanking);
    }
}
