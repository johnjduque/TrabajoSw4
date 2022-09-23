package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransporteTest {

    @Test
    void validarCreacionExitosa(){

        Long idSitioTuristico = 1234567890L;
        String ruta = "04";
        float tarifa = 2400;

        Transporte transporte = Transporte.of(idSitioTuristico,ruta,tarifa);

        Assertions.assertEquals(1234567890L,transporte.getIdSitioTuristico());
        Assertions.assertEquals("04",transporte.getRuta());
        Assertions.assertEquals(2400,transporte.getTarifa());
    }

    @Test
    void validarCamposFaltantes(){

        Long idSitioTuristico = 1234567890L;
        String ruta = null;
        float tarifa = 2400;

        Assertions.assertEquals("Por favor ingresar la ruta del transporte",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Transporte.of(idSitioTuristico,ruta,tarifa)
        ).getMessage());
    }

    @Test
    void validarCamposVacios(){

        Long idSitioTuristico = 1234567890L;
        String ruta = "";
        float tarifa = 2400;

        Assertions.assertEquals("Por favor ingresar la ruta del transporte",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Transporte.of(idSitioTuristico,ruta,tarifa)
        ).getMessage());
    }

    @Test
    void validarCamposNegativos(){

        Long idSitioTuristico = 1234567890L;
        String ruta = "04";
        float tarifa = -1;

        Assertions.assertEquals("La tarifa no puede ser vacía o menor a cero",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Transporte.of(idSitioTuristico,ruta,tarifa)
        ).getMessage());
    }
}