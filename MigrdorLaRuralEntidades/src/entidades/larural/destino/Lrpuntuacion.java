/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPUNTUACION")
@NamedQueries({
    @NamedQuery(name = "Lrpuntuacion.findAll", query = "SELECT l FROM Lrpuntuacion l"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionid", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionid = :lrpuntuacionid"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuaciondesc", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuaciondesc = :lrpuntuaciondesc"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionpuntaje", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionpuntaje = :lrpuntuacionpuntaje"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionac", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionac = :lrpuntuacionac"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionual", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionual = :lrpuntuacionual"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionfal", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionfal = :lrpuntuacionfal"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionumd", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionumd = :lrpuntuacionumd"),
    @NamedQuery(name = "Lrpuntuacion.findByLrpuntuacionfmd", query = "SELECT l FROM Lrpuntuacion l WHERE l.lrpuntuacionfmd = :lrpuntuacionfmd")})
public class Lrpuntuacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONID", nullable = false)
    private Long lrpuntuacionid;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDESC", nullable = false, length = 100)
    private String lrpuntuaciondesc;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONPUNTAJE", nullable = false)
    private long lrpuntuacionpuntaje;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONAC", nullable = false)
    private Character lrpuntuacionac;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONUAL", nullable = false, length = 30)
    private String lrpuntuacionual;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpuntuacionfal;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONUMD", nullable = false, length = 30)
    private String lrpuntuacionumd;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpuntuacionfmd;

    public Lrpuntuacion() {
    }

    public Lrpuntuacion(Long lrpuntuacionid) {
        this.lrpuntuacionid = lrpuntuacionid;
    }

    public Lrpuntuacion(Long lrpuntuacionid, String lrpuntuaciondesc, long lrpuntuacionpuntaje, Character lrpuntuacionac, String lrpuntuacionual, Date lrpuntuacionfal, String lrpuntuacionumd, Date lrpuntuacionfmd) {
        this.lrpuntuacionid = lrpuntuacionid;
        this.lrpuntuaciondesc = lrpuntuaciondesc;
        this.lrpuntuacionpuntaje = lrpuntuacionpuntaje;
        this.lrpuntuacionac = lrpuntuacionac;
        this.lrpuntuacionual = lrpuntuacionual;
        this.lrpuntuacionfal = lrpuntuacionfal;
        this.lrpuntuacionumd = lrpuntuacionumd;
        this.lrpuntuacionfmd = lrpuntuacionfmd;
    }

    public Long getLrpuntuacionid() {
        return lrpuntuacionid;
    }

    public void setLrpuntuacionid(Long lrpuntuacionid) {
        this.lrpuntuacionid = lrpuntuacionid;
    }

    public String getLrpuntuaciondesc() {
        return lrpuntuaciondesc;
    }

    public void setLrpuntuaciondesc(String lrpuntuaciondesc) {
        this.lrpuntuaciondesc = lrpuntuaciondesc;
    }

    public long getLrpuntuacionpuntaje() {
        return lrpuntuacionpuntaje;
    }

    public void setLrpuntuacionpuntaje(long lrpuntuacionpuntaje) {
        this.lrpuntuacionpuntaje = lrpuntuacionpuntaje;
    }

    public Character getLrpuntuacionac() {
        return lrpuntuacionac;
    }

    public void setLrpuntuacionac(Character lrpuntuacionac) {
        this.lrpuntuacionac = lrpuntuacionac;
    }

    public String getLrpuntuacionual() {
        return lrpuntuacionual;
    }

    public void setLrpuntuacionual(String lrpuntuacionual) {
        this.lrpuntuacionual = lrpuntuacionual;
    }

    public Date getLrpuntuacionfal() {
        return lrpuntuacionfal;
    }

    public void setLrpuntuacionfal(Date lrpuntuacionfal) {
        this.lrpuntuacionfal = lrpuntuacionfal;
    }

    public String getLrpuntuacionumd() {
        return lrpuntuacionumd;
    }

    public void setLrpuntuacionumd(String lrpuntuacionumd) {
        this.lrpuntuacionumd = lrpuntuacionumd;
    }

    public Date getLrpuntuacionfmd() {
        return lrpuntuacionfmd;
    }

    public void setLrpuntuacionfmd(Date lrpuntuacionfmd) {
        this.lrpuntuacionfmd = lrpuntuacionfmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpuntuacionid != null ? lrpuntuacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpuntuacion)) {
            return false;
        }
        Lrpuntuacion other = (Lrpuntuacion) object;
        if ((this.lrpuntuacionid == null && other.lrpuntuacionid != null) || (this.lrpuntuacionid != null && !this.lrpuntuacionid.equals(other.lrpuntuacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpuntuacion[ lrpuntuacionid=" + lrpuntuacionid + " ]";
    }
    
}
