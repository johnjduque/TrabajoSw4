package com.uco.myproject.infraestructura.adaptador.repositorio.jpa;

import com.uco.myproject.dominio.modelo.Calificacion;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCalificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioCalificacionJpa extends JpaRepository<EntidadCalificacion, Long> {
}
