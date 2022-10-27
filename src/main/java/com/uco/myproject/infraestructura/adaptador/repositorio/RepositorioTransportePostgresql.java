package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Transporte;
import com.uco.myproject.dominio.puerto.RepositorioTransporte;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioTransporteJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioTransportePostgresql implements RepositorioTransporte {

    private final RepositorioTransporteJpa repositorioTransporteJpa;

    public RepositorioTransportePostgresql(RepositorioTransporteJpa repositorioTransporteJpa) {
        this.repositorioTransporteJpa = repositorioTransporteJpa;
    }
    @Override
    public List<Transporte> listar(Long id) {
        return null;
    }
}
