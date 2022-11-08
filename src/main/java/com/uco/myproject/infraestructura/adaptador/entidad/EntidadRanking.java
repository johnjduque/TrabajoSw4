package com.uco.myproject.infraestructura.adaptador.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ranking")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EntidadRanking {

    @Id
    private Long idUsuario;
    /*private List<SitioTuristico> sitiosTuristicos;

    public EntidadRanking(Long idUsuario, List<SitioTuristico> sitiosTuristicos) {
        this.idUsuario = idUsuario;
        this.sitiosTuristicos = new ArrayList<>();
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
    }*/
}
