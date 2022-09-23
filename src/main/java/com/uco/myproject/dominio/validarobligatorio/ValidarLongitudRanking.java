package com.uco.myproject.dominio.validarobligatorio;

public class ValidarLongitudRanking {

    private static final int NUMERO_SITIOS_RANKING = 3;

    public ValidarLongitudRanking() {
    }

    public static void validarNumeroSitiosTuristicos (int tamaño, String mensaje){

        if(tamaño > NUMERO_SITIOS_RANKING){
            throw new NumberFormatException(mensaje);
        }
    }
}
