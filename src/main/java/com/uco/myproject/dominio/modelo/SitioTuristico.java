package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;
import com.uco.myproject.dominio.validarobligatorio.ValidarTexto;
public class SitioTuristico {

    private Long id;
    private String nombre;
    private String reseña;
    private String direccion;

    public static SitioTuristico of(Long id, String nombre, String reseña,String direccion){
        ValidarNumero.validarObligatorioNumero(id,"El código del sitio turistico no puede ser vacío");
        ValidarTexto.validarObligatorioTexto(nombre,"El nombre del sitio turistico no puede ser vacío");
        ValidarTexto.validarObligatorioTexto(reseña,"La reseña no puede ser vacía");
        ValidarTexto.validarObligatorioTexto(direccion,"La dirección no puede ser vacía");

        return new SitioTuristico(id,nombre,reseña,direccion);
    }
    public SitioTuristico(Long id, String nombre, String reseña, String direccion) {
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
