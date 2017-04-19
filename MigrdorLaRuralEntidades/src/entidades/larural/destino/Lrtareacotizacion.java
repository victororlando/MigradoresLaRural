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
import javax.persistence.JoinColumns;
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
@Table(name = "LRTAREACOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrtareacotizacion.findAll", query = "SELECT l FROM Lrtareacotizacion l"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionid", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionid = :lrtareacotizacionid"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionarea", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionarea = :lrtareacotizacionarea"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionual", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionual = :lrtareacotizacionual"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionfal", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionfal = :lrtareacotizacionfal"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionumd", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionumd = :lrtareacotizacionumd"),
    @NamedQuery(name = "Lrtareacotizacion.findByLrtareacotizacionfmd", query = "SELECT l FROM Lrtareacotizacion l WHERE l.lrtareacotizacionfmd = :lrtareacotizacionfmd")})
public class Lrtareacotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTAREACOTIZACIONID", nullable = false)
    private Long lrtareacotizacionid;
    @Basic(optional = false)
    @Column(name = "LRTAREACOTIZACIONAREA", nullable = false, length = 500)
    private String lrtareacotizacionarea;
    @Basic(optional = false)
    @Column(name = "LRTAREACOTIZACIONUAL", nullable = false, length = 30)
    private String lrtareacotizacionual;
    @Basic(optional = false)
    @Column(name = "LRTAREACOTIZACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtareacotizacionfal;
    @Column(name = "LRTAREACOTIZACIONUMD", length = 30)
    private String lrtareacotizacionumd;
    @Column(name = "LRTAREACOTIZACIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtareacotizacionfmd;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacion lrcotizacion;

    public Lrtareacotizacion() {
    }

    public Lrtareacotizacion(Long lrtareacotizacionid) {
        this.lrtareacotizacionid = lrtareacotizacionid;
    }

    public Lrtareacotizacion(Long lrtareacotizacionid, String lrtareacotizacionarea, String lrtareacotizacionual, Date lrtareacotizacionfal) {
        this.lrtareacotizacionid = lrtareacotizacionid;
        this.lrtareacotizacionarea = lrtareacotizacionarea;
        this.lrtareacotizacionual = lrtareacotizacionual;
        this.lrtareacotizacionfal = lrtareacotizacionfal;
    }

    public Long getLrtareacotizacionid() {
        return lrtareacotizacionid;
    }

    public void setLrtareacotizacionid(Long lrtareacotizacionid) {
        this.lrtareacotizacionid = lrtareacotizacionid;
    }

    public String getLrtareacotizacionarea() {
        return lrtareacotizacionarea;
    }

    public void setLrtareacotizacionarea(String lrtareacotizacionarea) {
        this.lrtareacotizacionarea = lrtareacotizacionarea;
    }

    public String getLrtareacotizacionual() {
        return lrtareacotizacionual;
    }

    public void setLrtareacotizacionual(String lrtareacotizacionual) {
        this.lrtareacotizacionual = lrtareacotizacionual;
    }

    public Date getLrtareacotizacionfal() {
        return lrtareacotizacionfal;
    }

    public void setLrtareacotizacionfal(Date lrtareacotizacionfal) {
        this.lrtareacotizacionfal = lrtareacotizacionfal;
    }

    public String getLrtareacotizacionumd() {
        return lrtareacotizacionumd;
    }

    public void setLrtareacotizacionumd(String lrtareacotizacionumd) {
        this.lrtareacotizacionumd = lrtareacotizacionumd;
    }

    public Date getLrtareacotizacionfmd() {
        return lrtareacotizacionfmd;
    }

    public void setLrtareacotizacionfmd(Date lrtareacotizacionfmd) {
        this.lrtareacotizacionfmd = lrtareacotizacionfmd;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtareacotizacionid != null ? lrtareacotizacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtareacotizacion)) {
            return false;
        }
        Lrtareacotizacion other = (Lrtareacotizacion) object;
        if ((this.lrtareacotizacionid == null && other.lrtareacotizacionid != null) || (this.lrtareacotizacionid != null && !this.lrtareacotizacionid.equals(other.lrtareacotizacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtareacotizacion[ lrtareacotizacionid=" + lrtareacotizacionid + " ]";
    }
    
}
