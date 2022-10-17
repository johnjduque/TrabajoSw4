package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.SitioTuristico;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ranking")
public class EntidadRanking {

    @Id
    private Long idUsuario;
    private List<SitioTuristico> sitiosTuristicos;

    public EntidadRanking(Long idUsuario, List<SitioTuristico> sitiosTuristicos) {
        this.idUsuario = idUsuario;
        this.sitiosTuristicos = sitiosTuristicos;
    }

    public EntidadRanking() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<SitioTuristico> getSitiosTuristicos() {
        return sitiosTuristicos;
    }

    public void setSitiosTuristicos(List<SitioTuristico> sitiosTuristicos) {
        this.sitiosTuristicos = sitiosTuristicos;
    }
}
