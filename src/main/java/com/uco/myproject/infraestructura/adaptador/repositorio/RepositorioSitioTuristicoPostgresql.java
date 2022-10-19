package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.SitioTuristico;
import com.uco.myproject.dominio.puerto.RepositorioSitioTuristico;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadSitioTuristico;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioSitioTuristicoJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioSitioTuristicoPostgresql implements RepositorioSitioTuristico {

    private final RepositorioSitioTuristicoJpa repositorioSitioTuristicoJpa;

    public RepositorioSitioTuristicoPostgresql(RepositorioSitioTuristicoJpa repositorioSitioTuristicoJpa) {
        this.repositorioSitioTuristicoJpa = repositorioSitioTuristicoJpa;
    }

    @Override
    public List<SitioTuristico> listar() {
        List<EntidadSitioTuristico> entidadSitioTuristico = repositorioSitioTuristicoJpa.findAll();
        return entidadSitioTuristico.stream().map(sitioTuristico -> new SitioTuristico(sitioTuristico.getId(),
                sitioTuristico.getNombre(),sitioTuristico.getReseña(),sitioTuristico.getDireccion())).toList();
    }

    @Override
    public SitioTuristico consultarPorId(Long id) {
        return this.repositorioSitioTuristicoJpa.findById(id)
                .map(entidad -> SitioTuristico.of(entidad.getId(),entidad.getNombre(),
                        entidad.getReseña(),entidad.getDireccion())).orElse(null);
    }

    @Override
    public boolean existe(SitioTuristico sitioTuristico) {
        return this.repositorioSitioTuristicoJpa.existsById((Long) sitioTuristico.getId());
    }
}
