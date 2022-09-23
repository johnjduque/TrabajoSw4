package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;

public class Calificacion {

    private Long idSitioTuristico;
    private int calificacion;

    public static Calificacion of(Long idSitioTuristico,int calificacion){
        ValidarNumero.validarObligatorioNumero(idSitioTuristico,"La identificación del sitio turistico no puede ser vacía o negativa");
        ValidarNumero.validarCalificacion(calificacion,"La calificación debe ser un número entero entre 1 y 5");
        return new Calificacion(idSitioTuristico,calificacion);
    }

    private Calificacion(Long idSitioTuristico,int calificacion) {
        this.idSitioTuristico = idSitioTuristico;
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }
}
