package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoCalificacion {

    private Long idSitioTuristico;
    private int calificacion;

    public DtoCalificacion(Long idSitioTuristico, int calificacion) {
        this.idSitioTuristico = idSitioTuristico;
        this.calificacion = calificacion;
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
