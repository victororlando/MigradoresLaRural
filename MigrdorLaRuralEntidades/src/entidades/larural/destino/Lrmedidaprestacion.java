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
@Table(name = "LRMEDIDAPRESTACION")
@NamedQueries({
    @NamedQuery(name = "Lrmedidaprestacion.findAll", query = "SELECT l FROM Lrmedidaprestacion l"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionid", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionid = :lrmedidaprestacionid"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestaciondesc", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestaciondesc = :lrmedidaprestaciondesc"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionac", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionac = :lrmedidaprestacionac"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionual", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionual = :lrmedidaprestacionual"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionfal", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionfal = :lrmedidaprestacionfal"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionumd", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionumd = :lrmedidaprestacionumd"),
    @NamedQuery(name = "Lrmedidaprestacion.findByLrmedidaprestacionfmd", query = "SELECT l FROM Lrmedidaprestacion l WHERE l.lrmedidaprestacionfmd = :lrmedidaprestacionfmd")})
public class Lrmedidaprestacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONID", nullable = false)
    private Long lrmedidaprestacionid;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONDESC", nullable = false, length = 100)
    private String lrmedidaprestaciondesc;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONAC", nullable = false)
    private Character lrmedidaprestacionac;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONUAL", nullable = false, length = 30)
    private String lrmedidaprestacionual;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmedidaprestacionfal;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONUMD", nullable = false, length = 30)
    private String lrmedidaprestacionumd;
    @Basic(optional = false)
    @Column(name = "LRMEDIDAPRESTACIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmedidaprestacionfmd;

    public Lrmedidaprestacion() {
    }

    public Lrmedidaprestacion(Long lrmedidaprestacionid) {
        this.lrmedidaprestacionid = lrmedidaprestacionid;
    }

    public Lrmedidaprestacion(Long lrmedidaprestacionid, String lrmedidaprestaciondesc, Character lrmedidaprestacionac, String lrmedidaprestacionual, Date lrmedidaprestacionfal, String lrmedidaprestacionumd, Date lrmedidaprestacionfmd) {
        this.lrmedidaprestacionid = lrmedidaprestacionid;
        this.lrmedidaprestaciondesc = lrmedidaprestaciondesc;
        this.lrmedidaprestacionac = lrmedidaprestacionac;
        this.lrmedidaprestacionual = lrmedidaprestacionual;
        this.lrmedidaprestacionfal = lrmedidaprestacionfal;
        this.lrmedidaprestacionumd = lrmedidaprestacionumd;
        this.lrmedidaprestacionfmd = lrmedidaprestacionfmd;
    }

    public Long getLrmedidaprestacionid() {
        return lrmedidaprestacionid;
    }

    public void setLrmedidaprestacionid(Long lrmedidaprestacionid) {
        this.lrmedidaprestacionid = lrmedidaprestacionid;
    }

    public String getLrmedidaprestaciondesc() {
        return lrmedidaprestaciondesc;
    }

    public void setLrmedidaprestaciondesc(String lrmedidaprestaciondesc) {
        this.lrmedidaprestaciondesc = lrmedidaprestaciondesc;
    }

    public Character getLrmedidaprestacionac() {
        return lrmedidaprestacionac;
    }

    public void setLrmedidaprestacionac(Character lrmedidaprestacionac) {
        this.lrmedidaprestacionac = lrmedidaprestacionac;
    }

    public String getLrmedidaprestacionual() {
        return lrmedidaprestacionual;
    }

    public void setLrmedidaprestacionual(String lrmedidaprestacionual) {
        this.lrmedidaprestacionual = lrmedidaprestacionual;
    }

    public Date getLrmedidaprestacionfal() {
        return lrmedidaprestacionfal;
    }

    public void setLrmedidaprestacionfal(Date lrmedidaprestacionfal) {
        this.lrmedidaprestacionfal = lrmedidaprestacionfal;
    }

    public String getLrmedidaprestacionumd() {
        return lrmedidaprestacionumd;
    }

    public void setLrmedidaprestacionumd(String lrmedidaprestacionumd) {
        this.lrmedidaprestacionumd = lrmedidaprestacionumd;
    }

    public Date getLrmedidaprestacionfmd() {
        return lrmedidaprestacionfmd;
    }

    public void setLrmedidaprestacionfmd(Date lrmedidaprestacionfmd) {
        this.lrmedidaprestacionfmd = lrmedidaprestacionfmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmedidaprestacionid != null ? lrmedidaprestacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmedidaprestacion)) {
            return false;
        }
        Lrmedidaprestacion other = (Lrmedidaprestacion) object;
        if ((this.lrmedidaprestacionid == null && other.lrmedidaprestacionid != null) || (this.lrmedidaprestacionid != null && !this.lrmedidaprestacionid.equals(other.lrmedidaprestacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmedidaprestacion[ lrmedidaprestacionid=" + lrmedidaprestacionid + " ]";
    }
    
}
