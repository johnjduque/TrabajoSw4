package com.uco.myproject.dominio.modelo;
import com.uco.myproject.dominio.validarobligatorio.ValidarLongitudRanking;
import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;

import java.util.List;

public class Ranking {

    private Long idUsuario;
    private List<SitioTuristico> sitiosTuristicos;

    public static Ranking of(Long idUsuario,List<SitioTuristico> sitiosTuristicos){
        ValidarNumero.validarObligatorioNumero(idUsuario,"El id del usuario no puede ser vacío");
        ValidarLongitudRanking.validarNumeroSitiosTuristicos(sitiosTuristicos.size(),"Solo se puede realizar un ranking con 3 sitios turisticos");

        return new Ranking(idUsuario,sitiosTuristicos);
    }

    private Ranking(Long idUsuario,List<SitioTuristico> sitiosTuristicos) {
        this.idUsuario = idUsuario;
        this.sitiosTuristicos = sitiosTuristicos;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public List<SitioTuristico> getSitiosTuristicos() {
        return sitiosTuristicos;
    }
}
