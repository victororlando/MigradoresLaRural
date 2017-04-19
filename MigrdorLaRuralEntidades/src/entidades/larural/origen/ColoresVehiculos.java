/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "COLORES_VEHICULOS",schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCION"})})
@NamedQueries({
    @NamedQuery(name = "ColoresVehiculos.findAll", query = "SELECT c FROM ColoresVehiculos c"),
    @NamedQuery(name = "ColoresVehiculos.findByCodColor", query = "SELECT c FROM ColoresVehiculos c WHERE c.codColor = :codColor"),
    @NamedQuery(name = "ColoresVehiculos.findByDescripcion", query = "SELECT c FROM ColoresVehiculos c WHERE c.descripcion = :descripcion")})
public class ColoresVehiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_COLOR", nullable = false)
    private Short codColor;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 30)
    private String descripcion;
    @OneToMany(mappedBy = "codColor")
    private List<Propauto> propautoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codColor")
    private List<Proauemi> proauemiList;

    public ColoresVehiculos() {
    }

    public ColoresVehiculos(Short codColor) {
        this.codColor = codColor;
    }

    public ColoresVehiculos(Short codColor, String descripcion) {
        this.codColor = codColor;
        this.descripcion = descripcion;
    }

    public Short getCodColor() {
        return codColor;
    }

    public void setCodColor(Short codColor) {
        this.codColor = codColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Propauto> getPropautoList() {
        return propautoList;
    }

    public void setPropautoList(List<Propauto> propautoList) {
        this.propautoList = propautoList;
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
        hash += (codColor != null ? codColor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColoresVehiculos)) {
            return false;
        }
        ColoresVehiculos other = (ColoresVehiculos) object;
        if ((this.codColor == null && other.codColor != null) || (this.codColor != null && !this.codColor.equals(other.codColor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ColoresVehiculos[ codColor=" + codColor + " ]";
    }
    
}
