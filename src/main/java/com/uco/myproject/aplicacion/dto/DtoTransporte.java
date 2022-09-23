package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoTransporte {

    private Long idSitioTuristico;
    private String ruta;
    private float tarifa;

    public DtoTransporte(Long idSitioTuristico, String ruta, float tarifa) {
        this.idSitioTuristico = idSitioTuristico;
        this.ruta = ruta;
        this.tarifa = tarifa;
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public String getRuta() {
        return ruta;
    }

    public float getTarifa() {
        return tarifa;
    }
}
