package com.uco.myproject.aplicacion.servicio.ranking;

import com.uco.myproject.aplicacion.dto.DtoRanking;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.dto.DtoSitioTuristico;
import com.uco.myproject.dominio.modelo.Ranking;
import com.uco.myproject.dominio.modelo.SitioTuristico;
import com.uco.myproject.dominio.servicio.ranking.ServicioGuardarRanking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionGuardarRanking {

    private final ServicioGuardarRanking servicioGuardarRanking;

    public ServicioAplicacionGuardarRanking(ServicioGuardarRanking servicioGuardarRanking) {
        this.servicioGuardarRanking = servicioGuardarRanking;
    }

    public DtoRespuesta<Long> ejecutar(DtoRanking dtoRanking){

        return new DtoRespuesta<>((Long) servicioGuardarRanking.ejecutar((Ranking) ensamblarSitiosTuristicos((List<DtoSitioTuristico>) dtoRanking)));
    }

    private List<SitioTuristico> ensamblarSitiosTuristicos(List<DtoSitioTuristico> sitioTuristicos){
        return sitioTuristicos.stream().map(this::ensamblarSitioTuristico).toList();
    }

    private SitioTuristico ensamblarSitioTuristico(DtoSitioTuristico sitioTuristico){
        return SitioTuristico.of(sitioTuristico.getId(), sitioTuristico.getNombre(),
                sitioTuristico.getReseña(), sitioTuristico.getDireccion());
    }
}
