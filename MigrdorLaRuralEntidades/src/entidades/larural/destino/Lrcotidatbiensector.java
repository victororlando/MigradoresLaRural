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
@Table(name = "LRCOTIDATBIENSECTOR")
@NamedQueries({
    @NamedQuery(name = "Lrcotidatbiensector.findAll", query = "SELECT l FROM Lrcotidatbiensector l"),
    @NamedQuery(name = "Lrcotidatbiensector.findByLrcotidatbiensectorid", query = "SELECT l FROM Lrcotidatbiensector l WHERE l.lrcotidatbiensectorid = :lrcotidatbiensectorid"),
    @NamedQuery(name = "Lrcotidatbiensector.findBySuiCotidatbienaseid", query = "SELECT l FROM Lrcotidatbiensector l WHERE l.suiCotidatbienaseid = :suiCotidatbienaseid"),
    @NamedQuery(name = "Lrcotidatbiensector.findBySuiUbicacionid", query = "SELECT l FROM Lrcotidatbiensector l WHERE l.suiUbicacionid = :suiUbicacionid")})
public class Lrcotidatbiensector implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENSECTORID", nullable = false)
    private Long lrcotidatbiensectorid;
    @Basic(optional = false)
    @Column(name = "SUI_COTIDATBIENASEID", nullable = false)
    private long suiCotidatbienaseid;
    @Basic(optional = false)
    @Column(name = "SUI_UBICACIONID", nullable = false)
    private long suiUbicacionid;
    @JoinColumn(name = "LRCOTINSPECCIONID", referencedColumnName = "LRCOTINSPECCIONID")
    @ManyToOne
    private Lrcotinspeccion lrcotinspeccionid;
    @JoinColumn(name = "LRSECTORID", referencedColumnName = "LRSECTORID")
    @ManyToOne
    private Lrsector lrsectorid;

    public Lrcotidatbiensector() {
    }

    public Lrcotidatbiensector(Long lrcotidatbiensectorid) {
        this.lrcotidatbiensectorid = lrcotidatbiensectorid;
    }

    public Lrcotidatbiensector(Long lrcotidatbiensectorid, long suiCotidatbienaseid, long suiUbicacionid) {
        this.lrcotidatbiensectorid = lrcotidatbiensectorid;
        this.suiCotidatbienaseid = suiCotidatbienaseid;
        this.suiUbicacionid = suiUbicacionid;
    }

    public Long getLrcotidatbiensectorid() {
        return lrcotidatbiensectorid;
    }

    public void setLrcotidatbiensectorid(Long lrcotidatbiensectorid) {
        this.lrcotidatbiensectorid = lrcotidatbiensectorid;
    }

    public long getSuiCotidatbienaseid() {
        return suiCotidatbienaseid;
    }

    public void setSuiCotidatbienaseid(long suiCotidatbienaseid) {
        this.suiCotidatbienaseid = suiCotidatbienaseid;
    }

    public long getSuiUbicacionid() {
        return suiUbicacionid;
    }

    public void setSuiUbicacionid(long suiUbicacionid) {
        this.suiUbicacionid = suiUbicacionid;
    }

    public Lrcotinspeccion getLrcotinspeccionid() {
        return lrcotinspeccionid;
    }

    public void setLrcotinspeccionid(Lrcotinspeccion lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public Lrsector getLrsectorid() {
        return lrsectorid;
    }

    public void setLrsectorid(Lrsector lrsectorid) {
        this.lrsectorid = lrsectorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotidatbiensectorid != null ? lrcotidatbiensectorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotidatbiensector)) {
            return false;
        }
        Lrcotidatbiensector other = (Lrcotidatbiensector) object;
        if ((this.lrcotidatbiensectorid == null && other.lrcotidatbiensectorid != null) || (this.lrcotidatbiensectorid != null && !this.lrcotidatbiensectorid.equals(other.lrcotidatbiensectorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotidatbiensector[ lrcotidatbiensectorid=" + lrcotidatbiensectorid + " ]";
    }
    
}
