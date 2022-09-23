package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoComentario {

    private Long idSitioTuristico;
    private String descripcion;

    public DtoComentario(Long idSitioTuristico, String descripcion) {
        this.idSitioTuristico = idSitioTuristico;
        this.descripcion = descripcion;
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
