package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sitioturistico")
public class EntidadSitioTuristico {

    @Id
    private Long id;
    private String nombre;
    private String reseña;
    private String direccion;

    public EntidadSitioTuristico(Long id, String nombre, String reseña, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.reseña = reseña;
        this.direccion = direccion;
    }

    public EntidadSitioTuristico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
