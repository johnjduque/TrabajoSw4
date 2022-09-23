package com.uco.myproject.aplicacion.dto;

import com.uco.myproject.dominio.modelo.SitioTuristico;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class DtoRanking {

    private Long idUsuario;
    private List<SitioTuristico> sitiosTuristicos;

    public DtoRanking(Long idUsuario, List<SitioTuristico> sitiosTuristicos) {
        this.idUsuario = idUsuario;
        this.sitiosTuristicos = sitiosTuristicos;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public List<SitioTuristico> getSitiosTuristicos() {
        return sitiosTuristicos;
    }
}
