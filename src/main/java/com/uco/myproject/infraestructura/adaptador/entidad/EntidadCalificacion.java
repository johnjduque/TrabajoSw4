package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calificacion")
public class EntidadCalificacion {

    @Id
    private Long idSitioTuristico;
    private int calificacion;

    public EntidadCalificacion(Long idSitioTuristico, int calificacion) {
        this.idSitioTuristico = idSitioTuristico;
        this.calificacion = calificacion;
    }

    public EntidadCalificacion() {
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public void setIdSitioTuristico(Long idSitioTuristico) {
        this.idSitioTuristico = idSitioTuristico;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
