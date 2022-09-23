package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;
import com.uco.myproject.dominio.validarobligatorio.ValidarTexto;

public class Comentario {

    private Long idSitioTuristico;
    private String descripcion;

    public static Comentario of(Long idSitioTuristico, String descripcion){
        ValidarNumero.validarObligatorioNumero(idSitioTuristico,"La identificación del sitio turistico no puede ser vacía");
        ValidarTexto.validarObligatorioTexto(descripcion,"El comentario no puede ser vacío");

        return new Comentario(idSitioTuristico,descripcion);
    }

    private Comentario(Long idSitioTuristico,String descripcion) {
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
