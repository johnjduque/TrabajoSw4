package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoSitioTuristico {

    private Long id;
    private String nombre;
    private String reseña;
    private String direccion;

    public DtoSitioTuristico(Long id, String nombre, String reseña, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.reseña = reseña;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReseña() {
        return reseña;
    }

    public String getDireccion() {
        return direccion;
    }
}
