package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComentarioTest {

    @Test
    void validarCreacionExitosa(){

        Long idSitioTuristico = 1234567890L;
        String descripcion = "Sitio muy conocido en Rionegro por su riqueza Histórica para el País";

        Comentario comentario = Comentario.of(idSitioTuristico,descripcion);

        Assertions.assertEquals(1234567890L,comentario.getIdSitioTuristico());
        Assertions.assertEquals("Sitio muy conocido en Rionegro por su riqueza Histórica para el País",comentario.getDescripcion());
    }

    @Test
    void validarCamposVacios(){

        Long idSitioTuristico = 1234567890L;
        String descripcion = "";

        //act - assert
        Assertions.assertEquals("El comentario no puede ser vacío",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Comentario.of(idSitioTuristico,descripcion)
        ).getMessage());
    }

    @Test
    void validarCamposFaltantes(){

        Long idSitioTuristico = 1234567890L;
        String descripcion = null;

        //act - assert
        Assertions.assertEquals("El comentario no puede ser vacío",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Comentario.of(idSitioTuristico,descripcion)
        ).getMessage());
    }
}