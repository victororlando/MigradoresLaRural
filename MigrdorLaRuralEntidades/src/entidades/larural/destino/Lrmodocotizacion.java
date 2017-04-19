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
@Table(name = "LRMODOCOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrmodocotizacion.findAll", query = "SELECT l FROM Lrmodocotizacion l"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionid", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionid = :lrmodocotizacionid"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacioncod", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacioncod = :lrmodocotizacioncod"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizaciondesc", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizaciondesc = :lrmodocotizaciondesc"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionac", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionac = :lrmodocotizacionac"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionual", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionual = :lrmodocotizacionual"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionfal", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionfal = :lrmodocotizacionfal"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionumd", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionumd = :lrmodocotizacionumd"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionfmd", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionfmd = :lrmodocotizacionfmd"),
    @NamedQuery(name = "Lrmodocotizacion.findByLrmodocotizacionesdeclaracion", query = "SELECT l FROM Lrmodocotizacion l WHERE l.lrmodocotizacionesdeclaracion = :lrmodocotizacionesdeclaracion")})
public class Lrmodocotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMODOCOTIZACIONID", nullable = false)
    private Long lrmodocotizacionid;
    @Basic(optional = false)
    @Column(name = "LRMODOCOTIZACIONCOD", nullable = false, length = 3)
    private String lrmodocotizacioncod;
    @Basic(optional = false)
    @Column(name = "LRMODOCOTIZACIONDESC", nullable = false, length = 100)
    private String lrmodocotizaciondesc;
    @Basic(optional = false)
    @Column(name = "LRMODOCOTIZACIONAC", nullable = false)
    private Character lrmodocotizacionac;
    @Column(name = "LRMODOCOTIZACIONUAL", length = 30)
    private String lrmodocotizacionual;
    @Column(name = "LRMODOCOTIZACIONFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmodocotizacionfal;
    @Column(name = "LRMODOCOTIZACIONUMD", length = 30)
    private String lrmodocotizacionumd;
    @Column(name = "LRMODOCOTIZACIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmodocotizacionfmd;
    @Basic(optional = false)
    @Column(name = "LRMODOCOTIZACIONESDECLARACION", nullable = false)
    private Character lrmodocotizacionesdeclaracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrmodocotizacionid")
    private List<Lrcotizacion> lrcotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrmodocotizacionid")
    private List<Lrtasatransporte> lrtasatransporteList;

    public Lrmodocotizacion() {
    }

    public Lrmodocotizacion(Long lrmodocotizacionid) {
        this.lrmodocotizacionid = lrmodocotizacionid;
    }

    public Lrmodocotizacion(Long lrmodocotizacionid, String lrmodocotizacioncod, String lrmodocotizaciondesc, Character lrmodocotizacionac, Character lrmodocotizacionesdeclaracion) {
        this.lrmodocotizacionid = lrmodocotizacionid;
        this.lrmodocotizacioncod = lrmodocotizacioncod;
        this.lrmodocotizaciondesc = lrmodocotizaciondesc;
        this.lrmodocotizacionac = lrmodocotizacionac;
        this.lrmodocotizacionesdeclaracion = lrmodocotizacionesdeclaracion;
    }

    public Long getLrmodocotizacionid() {
        return lrmodocotizacionid;
    }

    public void setLrmodocotizacionid(Long lrmodocotizacionid) {
        this.lrmodocotizacionid = lrmodocotizacionid;
    }

    public String getLrmodocotizacioncod() {
        return lrmodocotizacioncod;
    }

    public void setLrmodocotizacioncod(String lrmodocotizacioncod) {
        this.lrmodocotizacioncod = lrmodocotizacioncod;
    }

    public String getLrmodocotizaciondesc() {
        return lrmodocotizaciondesc;
    }

    public void setLrmodocotizaciondesc(String lrmodocotizaciondesc) {
        this.lrmodocotizaciondesc = lrmodocotizaciondesc;
    }

    public Character getLrmodocotizacionac() {
        return lrmodocotizacionac;
    }

    public void setLrmodocotizacionac(Character lrmodocotizacionac) {
        this.lrmodocotizacionac = lrmodocotizacionac;
    }

    public String getLrmodocotizacionual() {
        return lrmodocotizacionual;
    }

    public void setLrmodocotizacionual(String lrmodocotizacionual) {
        this.lrmodocotizacionual = lrmodocotizacionual;
    }

    public Date getLrmodocotizacionfal() {
        return lrmodocotizacionfal;
    }

    public void setLrmodocotizacionfal(Date lrmodocotizacionfal) {
        this.lrmodocotizacionfal = lrmodocotizacionfal;
    }

    public String getLrmodocotizacionumd() {
        return lrmodocotizacionumd;
    }

    public void setLrmodocotizacionumd(String lrmodocotizacionumd) {
        this.lrmodocotizacionumd = lrmodocotizacionumd;
    }

    public Date getLrmodocotizacionfmd() {
        return lrmodocotizacionfmd;
    }

    public void setLrmodocotizacionfmd(Date lrmodocotizacionfmd) {
        this.lrmodocotizacionfmd = lrmodocotizacionfmd;
    }

    public Character getLrmodocotizacionesdeclaracion() {
        return lrmodocotizacionesdeclaracion;
    }

    public void setLrmodocotizacionesdeclaracion(Character lrmodocotizacionesdeclaracion) {
        this.lrmodocotizacionesdeclaracion = lrmodocotizacionesdeclaracion;
    }

    public List<Lrcotizacion> getLrcotizacionList() {
        return lrcotizacionList;
    }

    public void setLrcotizacionList(List<Lrcotizacion> lrcotizacionList) {
        this.lrcotizacionList = lrcotizacionList;
    }

    public List<Lrtasatransporte> getLrtasatransporteList() {
        return lrtasatransporteList;
    }

    public void setLrtasatransporteList(List<Lrtasatransporte> lrtasatransporteList) {
        this.lrtasatransporteList = lrtasatransporteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmodocotizacionid != null ? lrmodocotizacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmodocotizacion)) {
            return false;
        }
        Lrmodocotizacion other = (Lrmodocotizacion) object;
        if ((this.lrmodocotizacionid == null && other.lrmodocotizacionid != null) || (this.lrmodocotizacionid != null && !this.lrmodocotizacionid.equals(other.lrmodocotizacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmodocotizacion[ lrmodocotizacionid=" + lrmodocotizacionid + " ]";
    }
    
}
