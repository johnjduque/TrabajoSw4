package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.servicio.transporte.ServicioAplicacionListarTransportePorId;
import com.uco.myproject.dominio.modelo.Transporte;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transporte")
public class ControladorTransporte {

    private final ServicioAplicacionListarTransportePorId servicioAplicacionListarTransportePorId;

    public ControladorTransporte(ServicioAplicacionListarTransportePorId servicioAplicacionListarTransportePorId) {
        this.servicioAplicacionListarTransportePorId = servicioAplicacionListarTransportePorId;
    }

    @GetMapping("/{id}")
    public List<Transporte> listar(@PathVariable Long id){
        return servicioAplicacionListarTransportePorId.ejecutar(id);
    }
}
