package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalificacionTest {

    @Test
    void validarCreacionExitosa(){
        //patron 3a

        //arrange (preparando todos los datos para la prueba)
        Long idSitioTuristico = 1234567890L;
        int calificacion = 5;

        //act (ejecuta el metodo a probar)
        Calificacion valor = Calificacion.of(idSitioTuristico, calificacion);

        //assert (se válida el resultado)
        Assertions.assertEquals(1234567890L,valor.getIdSitioTuristico(),valor.getCalificacion());
    }

    @Test
    void validarCalificacionMenorAUno(){
        //patron 3a

        //arrange (preparando todos los datos para la prueba)
        Long idSitioTuristico = 1234567890L;
        int calificacion = -1;

        //act - assert
        Assertions.assertEquals("La calificación debe ser un número entero entre 1 y 5",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Calificacion.of(idSitioTuristico,calificacion)
        ).getMessage());
    }

    @Test
    void validarCalificacionMayorACinco(){
        //patron 3a

        //arrange (preparando todos los datos para la prueba)
        Long idSitioTuristico = 1234567890L;
        int calificacion = 6;

        //act - assert
        Assertions.assertEquals("La calificación debe ser un número entero entre 1 y 5",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Calificacion.of(idSitioTuristico,calificacion)
        ).getMessage());
    }

    @Test
    void validarCamposFaltantes(){
        //patron 3a

        //arrange (preparando todos los datos para la prueba)
        Long idSitioTuristico = null;
        int calificacion = 6;

        //act - assert
        Assertions.assertEquals("La identificación del sitio turistico no puede ser vacía o negativa",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Calificacion.of(idSitioTuristico,calificacion)
        ).getMessage());
    }

}