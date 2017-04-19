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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LRCUMULO")
@NamedQueries({
    @NamedQuery(name = "Lrcumulo.findAll", query = "SELECT l FROM Lrcumulo l"),
    @NamedQuery(name = "Lrcumulo.findByLrcumuloid", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumuloid = :lrcumuloid"),
    @NamedQuery(name = "Lrcumulo.findByLrcumuloac", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumuloac = :lrcumuloac"),
    @NamedQuery(name = "Lrcumulo.findByLrcumuloual", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumuloual = :lrcumuloual"),
    @NamedQuery(name = "Lrcumulo.findByLrcumulofal", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumulofal = :lrcumulofal"),
    @NamedQuery(name = "Lrcumulo.findByLrcumuloumd", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumuloumd = :lrcumuloumd"),
    @NamedQuery(name = "Lrcumulo.findByLrcumulofmd", query = "SELECT l FROM Lrcumulo l WHERE l.lrcumulofmd = :lrcumulofmd"),
    @NamedQuery(name = "Lrcumulo.findByLrubicacionidcumulo", query = "SELECT l FROM Lrcumulo l WHERE l.lrubicacionidcumulo = :lrubicacionidcumulo")})
public class Lrcumulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCUMULOID", nullable = false)
    private Long lrcumuloid;
    @Basic(optional = false)
    @Column(name = "LRCUMULOAC", nullable = false)
    private Character lrcumuloac;
    @Basic(optional = false)
    @Column(name = "LRCUMULOUAL", nullable = false, length = 30)
    private String lrcumuloual;
    @Basic(optional = false)
    @Column(name = "LRCUMULOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcumulofal;
    @Column(name = "LRCUMULOUMD", length = 30)
    private String lrcumuloumd;
    @Column(name = "LRCUMULOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcumulofmd;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONIDCUMULO", nullable = false)
    private long lrubicacionidcumulo;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;

    public Lrcumulo() {
    }

    public Lrcumulo(Long lrcumuloid) {
        this.lrcumuloid = lrcumuloid;
    }

    public Lrcumulo(Long lrcumuloid, Character lrcumuloac, String lrcumuloual, Date lrcumulofal, long lrubicacionidcumulo) {
        this.lrcumuloid = lrcumuloid;
        this.lrcumuloac = lrcumuloac;
        this.lrcumuloual = lrcumuloual;
        this.lrcumulofal = lrcumulofal;
        this.lrubicacionidcumulo = lrubicacionidcumulo;
    }

    public Long getLrcumuloid() {
        return lrcumuloid;
    }

    public void setLrcumuloid(Long lrcumuloid) {
        this.lrcumuloid = lrcumuloid;
    }

    public Character getLrcumuloac() {
        return lrcumuloac;
    }

    public void setLrcumuloac(Character lrcumuloac) {
        this.lrcumuloac = lrcumuloac;
    }

    public String getLrcumuloual() {
        return lrcumuloual;
    }

    public void setLrcumuloual(String lrcumuloual) {
        this.lrcumuloual = lrcumuloual;
    }

    public Date getLrcumulofal() {
        return lrcumulofal;
    }

    public void setLrcumulofal(Date lrcumulofal) {
        this.lrcumulofal = lrcumulofal;
    }

    public String getLrcumuloumd() {
        return lrcumuloumd;
    }

    public void setLrcumuloumd(String lrcumuloumd) {
        this.lrcumuloumd = lrcumuloumd;
    }

    public Date getLrcumulofmd() {
        return lrcumulofmd;
    }

    public void setLrcumulofmd(Date lrcumulofmd) {
        this.lrcumulofmd = lrcumulofmd;
    }

    public long getLrubicacionidcumulo() {
        return lrubicacionidcumulo;
    }

    public void setLrubicacionidcumulo(long lrubicacionidcumulo) {
        this.lrubicacionidcumulo = lrubicacionidcumulo;
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
        hash += (lrcumuloid != null ? lrcumuloid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcumulo)) {
            return false;
        }
        Lrcumulo other = (Lrcumulo) object;
        if ((this.lrcumuloid == null && other.lrcumuloid != null) || (this.lrcumuloid != null && !this.lrcumuloid.equals(other.lrcumuloid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcumulo[ lrcumuloid=" + lrcumuloid + " ]";
    }
    
}
