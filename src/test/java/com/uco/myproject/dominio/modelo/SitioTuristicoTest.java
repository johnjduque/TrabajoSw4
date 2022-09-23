package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SitioTuristicoTest {

    @Test
    void validarCreacionExitosa(){

        Long id = 1234567890L;
        String nombre = "Casa de la Convención";
        String reseña = "Casa donde se firmo la Constitución de 1863 de los Estados Unidos de Colombia";
        String direccion = "Cl. 51, Rionegro, Antioquia";

        SitioTuristico sitioTuristico = SitioTuristico.of(id,nombre,reseña,direccion);

        Assertions.assertEquals(1234567890L,sitioTuristico.getId());;
        Assertions.assertEquals("Casa de la Convención",sitioTuristico.getNombre());;
        Assertions.assertEquals("Casa donde se firmo la Constitución de 1863 de los Estados Unidos de Colombia",sitioTuristico.getReseña());
        Assertions.assertEquals("Cl. 51, Rionegro, Antioquia",sitioTuristico.getDireccion());
    }

    @Test
    void validarCamposFaltantes(){

        Long id = 1234567890L;
        String nombre = null;
        String reseña = "Casa donde se firmo la Constitución de 1863 de los Estados Unidos de Colombia";
        String direccion = "Cl. 51, Rionegro, Antioquia";

        Assertions.assertEquals("El nombre del sitio turistico no puede ser vacío",Assertions.assertThrows(IllegalArgumentException.class, () ->
                SitioTuristico.of(id,nombre,reseña,direccion)
        ).getMessage());
    }

    @Test
    void validarCamposVacios(){

        Long id = 1234567890L;
        String nombre = "Casa de la Convención";
        String reseña = "";
        String direccion = "Cl. 51, Rionegro, Antioquia";

        Assertions.assertEquals("La reseña no puede ser vacía",Assertions.assertThrows(IllegalArgumentException.class, () ->
                SitioTuristico.of(id,nombre,reseña,direccion)
        ).getMessage());
    }
}