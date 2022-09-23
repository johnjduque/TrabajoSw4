package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;
import com.uco.myproject.dominio.validarobligatorio.ValidarTexto;
public class Transporte {

    private Long idSitioTuristico;
    private String ruta;
    private float tarifa;

    public static Transporte of(Long idSitioTuristico, String ruta, float tarifa){
        ValidarNumero.validarObligatorioNumero(idSitioTuristico,"La identificacion no puede ser vacía o menor a cero");
        ValidarTexto.validarObligatorioTexto(ruta,"Por favor ingresar la ruta del transporte");
        ValidarNumero.validarObligatorioNumero(tarifa,"La tarifa no puede ser vacía o menor a cero");

        return new Transporte(idSitioTuristico,ruta,tarifa);
    }

    private Transporte(Long idSitioTuristico, String ruta, float tarifa) {
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
