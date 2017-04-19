/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRESTADOCOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrestadocotizacion.findAll", query = "SELECT l FROM Lrestadocotizacion l"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionid", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionid = :lrestadocotizacionid"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizaciondesc", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizaciondesc = :lrestadocotizaciondesc"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionact", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionact = :lrestadocotizacionact"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionual", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionual = :lrestadocotizacionual"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionfal", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionfal = :lrestadocotizacionfal"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionumd", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionumd = :lrestadocotizacionumd"),
    @NamedQuery(name = "Lrestadocotizacion.findByLrestadocotizacionfmd", query = "SELECT l FROM Lrestadocotizacion l WHERE l.lrestadocotizacionfmd = :lrestadocotizacionfmd")})
public class Lrestadocotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRESTADOCOTIZACIONID", nullable = false)
    private Long lrestadocotizacionid;
    @Basic(optional = false)
    @Column(name = "LRESTADOCOTIZACIONDESC", nullable = false, length = 100)
    private String lrestadocotizaciondesc;
    @Basic(optional = false)
    @Column(name = "LRESTADOCOTIZACIONACT", nullable = false)
    private Character lrestadocotizacionact;
    @Basic(optional = false)
    @Column(name = "LRESTADOCOTIZACIONUAL", nullable = false, length = 30)
    private String lrestadocotizacionual;
    @Basic(optional = false)
    @Column(name = "LRESTADOCOTIZACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadocotizacionfal;
    @Column(name = "LRESTADOCOTIZACIONUMD", length = 30)
    private String lrestadocotizacionumd;
    @Column(name = "LRESTADOCOTIZACIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadocotizacionfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrestadocotizacionid")
    private List<Lrcotizacion> lrcotizacionList;

    public Lrestadocotizacion() {
    }

    public Lrestadocotizacion(Long lrestadocotizacionid) {
        this.lrestadocotizacionid = lrestadocotizacionid;
    }

    public Lrestadocotizacion(Long lrestadocotizacionid, String lrestadocotizaciondesc, Character lrestadocotizacionact, String lrestadocotizacionual, Date lrestadocotizacionfal) {
        this.lrestadocotizacionid = lrestadocotizacionid;
        this.lrestadocotizaciondesc = lrestadocotizaciondesc;
        this.lrestadocotizacionact = lrestadocotizacionact;
        this.lrestadocotizacionual = lrestadocotizacionual;
        this.lrestadocotizacionfal = lrestadocotizacionfal;
    }

    public Long getLrestadocotizacionid() {
        return lrestadocotizacionid;
    }

    public void setLrestadocotizacionid(Long lrestadocotizacionid) {
        this.lrestadocotizacionid = lrestadocotizacionid;
    }

    public String getLrestadocotizaciondesc() {
        return lrestadocotizaciondesc;
    }

    public void setLrestadocotizaciondesc(String lrestadocotizaciondesc) {
        this.lrestadocotizaciondesc = lrestadocotizaciondesc;
    }

    public Character getLrestadocotizacionact() {
        return lrestadocotizacionact;
    }

    public void setLrestadocotizacionact(Character lrestadocotizacionact) {
        this.lrestadocotizacionact = lrestadocotizacionact;
    }

    public String getLrestadocotizacionual() {
        return lrestadocotizacionual;
    }

    public void setLrestadocotizacionual(String lrestadocotizacionual) {
        this.lrestadocotizacionual = lrestadocotizacionual;
    }

    public Date getLrestadocotizacionfal() {
        return lrestadocotizacionfal;
    }

    public void setLrestadocotizacionfal(Date lrestadocotizacionfal) {
        this.lrestadocotizacionfal = lrestadocotizacionfal;
    }

    public String getLrestadocotizacionumd() {
        return lrestadocotizacionumd;
    }

    public void setLrestadocotizacionumd(String lrestadocotizacionumd) {
        this.lrestadocotizacionumd = lrestadocotizacionumd;
    }

    public Date getLrestadocotizacionfmd() {
        return lrestadocotizacionfmd;
    }

    public void setLrestadocotizacionfmd(Date lrestadocotizacionfmd) {
        this.lrestadocotizacionfmd = lrestadocotizacionfmd;
    }

    public List<Lrcotizacion> getLrcotizacionList() {
        return lrcotizacionList;
    }

    public void setLrcotizacionList(List<Lrcotizacion> lrcotizacionList) {
        this.lrcotizacionList = lrcotizacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrestadocotizacionid != null ? lrestadocotizacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrestadocotizacion)) {
            return false;
        }
        Lrestadocotizacion other = (Lrestadocotizacion) object;
        if ((this.lrestadocotizacionid == null && other.lrestadocotizacionid != null) || (this.lrestadocotizacionid != null && !this.lrestadocotizacionid.equals(other.lrestadocotizacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrestadocotizacion[ lrestadocotizacionid=" + lrestadocotizacionid + " ]";
    }
    
}
