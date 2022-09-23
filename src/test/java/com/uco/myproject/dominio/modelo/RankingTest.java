package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RankingTest {

    @Test
    void validarCreacionExitosa(){

        Long idUsuario = 1234567890L;
        SitioTuristico sitioTuristicoUno = new SitioTuristico(1L,"Casa de la Convención","Casa histórica","Rionegro");
        SitioTuristico sitioTuristicoDos = new SitioTuristico(2L,"Catedral San Nicolas","Catedral mas importante","Parque principal");
        SitioTuristico sitioTuristicoTres = new SitioTuristico(3L,"San Antonio","Mejores postres","Rionegro");
        List<SitioTuristico> sitiosTuristicos = List.of(new SitioTuristico[]{sitioTuristicoUno, sitioTuristicoDos, sitioTuristicoTres});

        Ranking ranking =Ranking.of(idUsuario,sitiosTuristicos);

        Assertions.assertEquals(1234567890L,ranking.getIdUsuario());
        Assertions.assertEquals(List.of(new SitioTuristico[]{sitioTuristicoUno, sitioTuristicoDos, sitioTuristicoTres}),ranking.getSitiosTuristicos());
    }

    @Test
    void validarNumeroSitiosRanking(){

        Long idUsuario = 1234567890L;
        SitioTuristico sitioTuristicoUno = new SitioTuristico(1L,"Casa de la Convención","Casa histórica","Rionegro");
        SitioTuristico sitioTuristicoDos = new SitioTuristico(2L,"Catedral San Nicolas","Catedral mas importante","Parque principal");
        SitioTuristico sitioTuristicoTres = new SitioTuristico(3L,"San Antonio","Mejores postres","Rionegro");
        SitioTuristico sitioTuristicoCuatro = new SitioTuristico(4L,"Comfama","Parque recreativo","Rionegro");
        List<SitioTuristico> sitiosTuristicos = List.of(new SitioTuristico[]{sitioTuristicoUno, sitioTuristicoDos, sitioTuristicoTres,sitioTuristicoCuatro});

        Assertions.assertEquals("Solo se puede realizar un ranking con 3 sitios turisticos",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Ranking.of(idUsuario,sitiosTuristicos)
        ).getMessage());
    }

}