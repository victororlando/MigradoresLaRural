/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LROTROSRIESGOSTECNICOS")
@NamedQueries({
    @NamedQuery(name = "Lrotrosriesgostecnicos.findAll", query = "SELECT l FROM Lrotrosriesgostecnicos l"),
    @NamedQuery(name = "Lrotrosriesgostecnicos.findByLrotrosriesgostecnicosid", query = "SELECT l FROM Lrotrosriesgostecnicos l WHERE l.lrotrosriesgostecnicosid = :lrotrosriesgostecnicosid"),
    @NamedQuery(name = "Lrotrosriesgostecnicos.findByLrotrosriesgostecnicosseccion", query = "SELECT l FROM Lrotrosriesgostecnicos l WHERE l.lrotrosriesgostecnicosseccion = :lrotrosriesgostecnicosseccion")})
public class Lrotrosriesgostecnicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LROTROSRIESGOSTECNICOSID", nullable = false)
    private Long lrotrosriesgostecnicosid;
    @Column(name = "LROTROSRIESGOSTECNICOSSECCION")
    private Long lrotrosriesgostecnicosseccion;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;

    public Lrotrosriesgostecnicos() {
    }

    public Lrotrosriesgostecnicos(Long lrotrosriesgostecnicosid) {
        this.lrotrosriesgostecnicosid = lrotrosriesgostecnicosid;
    }

    public Long getLrotrosriesgostecnicosid() {
        return lrotrosriesgostecnicosid;
    }

    public void setLrotrosriesgostecnicosid(Long lrotrosriesgostecnicosid) {
        this.lrotrosriesgostecnicosid = lrotrosriesgostecnicosid;
    }

    public Long getLrotrosriesgostecnicosseccion() {
        return lrotrosriesgostecnicosseccion;
    }

    public void setLrotrosriesgostecnicosseccion(Long lrotrosriesgostecnicosseccion) {
        this.lrotrosriesgostecnicosseccion = lrotrosriesgostecnicosseccion;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrotrosriesgostecnicosid != null ? lrotrosriesgostecnicosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrotrosriesgostecnicos)) {
            return false;
        }
        Lrotrosriesgostecnicos other = (Lrotrosriesgostecnicos) object;
        if ((this.lrotrosriesgostecnicosid == null && other.lrotrosriesgostecnicosid != null) || (this.lrotrosriesgostecnicosid != null && !this.lrotrosriesgostecnicosid.equals(other.lrotrosriesgostecnicosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrotrosriesgostecnicos[ lrotrosriesgostecnicosid=" + lrotrosriesgostecnicosid + " ]";
    }
    
}
