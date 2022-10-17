package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transporte")
public class EntidadTransporte {

    @Id
    private Long idSitioTuristico;
    private String ruta;
    private float tarifa;

    public EntidadTransporte(Long idSitioTuristico, String ruta, float tarifa) {
        this.idSitioTuristico = idSitioTuristico;
        this.ruta = ruta;
        this.tarifa = tarifa;
    }

    public EntidadTransporte() {
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public void setIdSitioTuristico(Long idSitioTuristico) {
        this.idSitioTuristico = idSitioTuristico;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
}
