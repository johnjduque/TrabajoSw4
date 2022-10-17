package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comentario")
public class EntidadComentario {

    @Id
    private Long idSitioTuristico;
    private String descripcion;

    public EntidadComentario(Long idSitioTuristico, String descripcion) {
        this.idSitioTuristico = idSitioTuristico;
        this.descripcion = descripcion;
    }

    public EntidadComentario() {
    }

    public Long getIdSitioTuristico() {
        return idSitioTuristico;
    }

    public void setIdSitioTuristico(Long idSitioTuristico) {
        this.idSitioTuristico = idSitioTuristico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
