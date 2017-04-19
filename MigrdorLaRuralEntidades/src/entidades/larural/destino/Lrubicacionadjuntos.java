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
@Table(name = "LRUBICACIONADJUNTOS")
@NamedQueries({
    @NamedQuery(name = "Lrubicacionadjuntos.findAll", query = "SELECT l FROM Lrubicacionadjuntos l"),
    @NamedQuery(name = "Lrubicacionadjuntos.findByLrubicacionadjuntosid", query = "SELECT l FROM Lrubicacionadjuntos l WHERE l.lrubicacionadjuntosid = :lrubicacionadjuntosid"),
    @NamedQuery(name = "Lrubicacionadjuntos.findByLrubicacionadjuntosnombre", query = "SELECT l FROM Lrubicacionadjuntos l WHERE l.lrubicacionadjuntosnombre = :lrubicacionadjuntosnombre"),
    @NamedQuery(name = "Lrubicacionadjuntos.findByLrubicacionadjuntosarchivo", query = "SELECT l FROM Lrubicacionadjuntos l WHERE l.lrubicacionadjuntosarchivo = :lrubicacionadjuntosarchivo")})
public class Lrubicacionadjuntos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRUBICACIONADJUNTOSID", nullable = false)
    private Long lrubicacionadjuntosid;
    @Column(name = "LRUBICACIONADJUNTOSNOMBRE", length = 100)
    private String lrubicacionadjuntosnombre;
    @Column(name = "LRUBICACIONADJUNTOSARCHIVO", length = 300)
    private String lrubicacionadjuntosarchivo;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;

    public Lrubicacionadjuntos() {
    }

    public Lrubicacionadjuntos(Long lrubicacionadjuntosid) {
        this.lrubicacionadjuntosid = lrubicacionadjuntosid;
    }

    public Long getLrubicacionadjuntosid() {
        return lrubicacionadjuntosid;
    }

    public void setLrubicacionadjuntosid(Long lrubicacionadjuntosid) {
        this.lrubicacionadjuntosid = lrubicacionadjuntosid;
    }

    public String getLrubicacionadjuntosnombre() {
        return lrubicacionadjuntosnombre;
    }

    public void setLrubicacionadjuntosnombre(String lrubicacionadjuntosnombre) {
        this.lrubicacionadjuntosnombre = lrubicacionadjuntosnombre;
    }

    public String getLrubicacionadjuntosarchivo() {
        return lrubicacionadjuntosarchivo;
    }

    public void setLrubicacionadjuntosarchivo(String lrubicacionadjuntosarchivo) {
        this.lrubicacionadjuntosarchivo = lrubicacionadjuntosarchivo;
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
        hash += (lrubicacionadjuntosid != null ? lrubicacionadjuntosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrubicacionadjuntos)) {
            return false;
        }
        Lrubicacionadjuntos other = (Lrubicacionadjuntos) object;
        if ((this.lrubicacionadjuntosid == null && other.lrubicacionadjuntosid != null) || (this.lrubicacionadjuntosid != null && !this.lrubicacionadjuntosid.equals(other.lrubicacionadjuntosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrubicacionadjuntos[ lrubicacionadjuntosid=" + lrubicacionadjuntosid + " ]";
    }
    
}
