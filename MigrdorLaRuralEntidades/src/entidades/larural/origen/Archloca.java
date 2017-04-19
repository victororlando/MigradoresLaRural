/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ARCHLOCA", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Archloca.findAll", query = "SELECT a FROM Archloca a"),
    @NamedQuery(name = "Archloca.findByCodLocalidad", query = "SELECT a FROM Archloca a WHERE a.codLocalidad = :codLocalidad"),
    @NamedQuery(name = "Archloca.findByNombre", query = "SELECT a FROM Archloca a WHERE a.nombre = :nombre")})
public class Archloca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_LOCALIDAD", nullable = false)
    private Short codLocalidad;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
    @OneToMany(mappedBy = "codLocalidad")
    private List<Proauemi> proauemiList;

    public Archloca() {
    }

    public Archloca(Short codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public Archloca(Short codLocalidad, String nombre) {
        this.codLocalidad = codLocalidad;
        this.nombre = nombre;
    }

    public Short getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(Short codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Proauemi> getProauemiList() {
        return proauemiList;
    }

    public void setProauemiList(List<Proauemi> proauemiList) {
        this.proauemiList = proauemiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLocalidad != null ? codLocalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Archloca)) {
            return false;
        }
        Archloca other = (Archloca) object;
        if ((this.codLocalidad == null && other.codLocalidad != null) || (this.codLocalidad != null && !this.codLocalidad.equals(other.codLocalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Archloca[ codLocalidad=" + codLocalidad + " ]";
    }
    
}
