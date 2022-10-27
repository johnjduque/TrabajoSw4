package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoCalificacion;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.calificacion.ServicioAplicacionGuardarCalificacion;
import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.dominio.servicio.calificacion.ServicioObtenerListaCalificacionPorId;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificacion")
public class ControladorCalificacion {

    private final ServicioAplicacionGuardarCalificacion servicioAplicacionGuardarCalificacion;
    private final ServicioObtenerListaCalificacionPorId servicioObtenerListaCalificacionPorId;

    public ControladorCalificacion(ServicioAplicacionGuardarCalificacion servicioAplicacionGuardarCalificacion, ServicioObtenerListaCalificacionPorId servicioObtenerListaCalificacionPorId) {
        this.servicioAplicacionGuardarCalificacion = servicioAplicacionGuardarCalificacion;
        this.servicioObtenerListaCalificacionPorId = servicioObtenerListaCalificacionPorId;
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoCalificacion dtoCalificacion){
        return this.servicioAplicacionGuardarCalificacion.ejecutar(dtoCalificacion);
    }

    @GetMapping("/{id}")
    public List<Calificacion> listar(@PathVariable Long id){
        return servicioObtenerListaCalificacionPorId.obtenerListaCalificacionesPorId(id);
    }
}
