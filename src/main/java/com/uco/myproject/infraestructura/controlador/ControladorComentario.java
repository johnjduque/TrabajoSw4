package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoComentario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.comentario.ServicioAplicacionGuardarComentario;
import com.uco.myproject.aplicacion.servicio.comentario.ServicioAplicacionListarComentarioPorId;
import com.uco.myproject.dominio.modelo.Comentario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentario")
public class ControladorComentario {

    private final ServicioAplicacionGuardarComentario servicioAplicacionGuardarComentario;

    private final ServicioAplicacionListarComentarioPorId servicioAplicacionListarComentarioPorId;

    public ControladorComentario(ServicioAplicacionGuardarComentario servicioAplicacionGuardarComentario, ServicioAplicacionListarComentarioPorId servicioAplicacionListarComentarioPorId) {
        this.servicioAplicacionGuardarComentario = servicioAplicacionGuardarComentario;
        this.servicioAplicacionListarComentarioPorId = servicioAplicacionListarComentarioPorId;
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoComentario dtoComentario){
        return this.servicioAplicacionGuardarComentario.ejecutar(dtoComentario);
    }

    @GetMapping("/{id}")
    public List<Comentario> listar(@PathVariable Long id){
        return servicioAplicacionListarComentarioPorId.ejecutar(id);
    }
}
