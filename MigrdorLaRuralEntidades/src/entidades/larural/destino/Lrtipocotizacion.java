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
@Table(name = "LRTIPOCOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrtipocotizacion.findAll", query = "SELECT l FROM Lrtipocotizacion l"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionid", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionid = :lrtipocotizacionid"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizaciondesc", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizaciondesc = :lrtipocotizaciondesc"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionfal", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionfal = :lrtipocotizacionfal"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionual", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionual = :lrtipocotizacionual"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionfmd", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionfmd = :lrtipocotizacionfmd"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionumd", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionumd = :lrtipocotizacionumd"),
    @NamedQuery(name = "Lrtipocotizacion.findByLrtipocotizacionac", query = "SELECT l FROM Lrtipocotizacion l WHERE l.lrtipocotizacionac = :lrtipocotizacionac")})
public class Lrtipocotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONID", nullable = false)
    private Long lrtipocotizacionid;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONDESC", nullable = false, length = 300)
    private String lrtipocotizaciondesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipocotizacionfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONUAL", nullable = false, length = 30)
    private String lrtipocotizacionual;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipocotizacionfmd;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONUMD", nullable = false, length = 30)
    private String lrtipocotizacionumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONAC", nullable = false)
    private Character lrtipocotizacionac;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipocotizacion")
    private List<Lrparmaccduracion> lrparmaccduracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipocotizacionid")
    private List<Lrtasarubroriesgo> lrtasarubroriesgoList;

    public Lrtipocotizacion() {
    }

    public Lrtipocotizacion(Long lrtipocotizacionid) {
        this.lrtipocotizacionid = lrtipocotizacionid;
    }

    public Lrtipocotizacion(Long lrtipocotizacionid, String lrtipocotizaciondesc, Date lrtipocotizacionfal, String lrtipocotizacionual, Date lrtipocotizacionfmd, String lrtipocotizacionumd, Character lrtipocotizacionac) {
        this.lrtipocotizacionid = lrtipocotizacionid;
        this.lrtipocotizaciondesc = lrtipocotizaciondesc;
        this.lrtipocotizacionfal = lrtipocotizacionfal;
        this.lrtipocotizacionual = lrtipocotizacionual;
        this.lrtipocotizacionfmd = lrtipocotizacionfmd;
        this.lrtipocotizacionumd = lrtipocotizacionumd;
        this.lrtipocotizacionac = lrtipocotizacionac;
    }

    public Long getLrtipocotizacionid() {
        return lrtipocotizacionid;
    }

    public void setLrtipocotizacionid(Long lrtipocotizacionid) {
        this.lrtipocotizacionid = lrtipocotizacionid;
    }

    public String getLrtipocotizaciondesc() {
        return lrtipocotizaciondesc;
    }

    public void setLrtipocotizaciondesc(String lrtipocotizaciondesc) {
        this.lrtipocotizaciondesc = lrtipocotizaciondesc;
    }

    public Date getLrtipocotizacionfal() {
        return lrtipocotizacionfal;
    }

    public void setLrtipocotizacionfal(Date lrtipocotizacionfal) {
        this.lrtipocotizacionfal = lrtipocotizacionfal;
    }

    public String getLrtipocotizacionual() {
        return lrtipocotizacionual;
    }

    public void setLrtipocotizacionual(String lrtipocotizacionual) {
        this.lrtipocotizacionual = lrtipocotizacionual;
    }

    public Date getLrtipocotizacionfmd() {
        return lrtipocotizacionfmd;
    }

    public void setLrtipocotizacionfmd(Date lrtipocotizacionfmd) {
        this.lrtipocotizacionfmd = lrtipocotizacionfmd;
    }

    public String getLrtipocotizacionumd() {
        return lrtipocotizacionumd;
    }

    public void setLrtipocotizacionumd(String lrtipocotizacionumd) {
        this.lrtipocotizacionumd = lrtipocotizacionumd;
    }

    public Character getLrtipocotizacionac() {
        return lrtipocotizacionac;
    }

    public void setLrtipocotizacionac(Character lrtipocotizacionac) {
        this.lrtipocotizacionac = lrtipocotizacionac;
    }

    public List<Lrparmaccduracion> getLrparmaccduracionList() {
        return lrparmaccduracionList;
    }

    public void setLrparmaccduracionList(List<Lrparmaccduracion> lrparmaccduracionList) {
        this.lrparmaccduracionList = lrparmaccduracionList;
    }

    public List<Lrtasarubroriesgo> getLrtasarubroriesgoList() {
        return lrtasarubroriesgoList;
    }

    public void setLrtasarubroriesgoList(List<Lrtasarubroriesgo> lrtasarubroriesgoList) {
        this.lrtasarubroriesgoList = lrtasarubroriesgoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipocotizacionid != null ? lrtipocotizacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipocotizacion)) {
            return false;
        }
        Lrtipocotizacion other = (Lrtipocotizacion) object;
        if ((this.lrtipocotizacionid == null && other.lrtipocotizacionid != null) || (this.lrtipocotizacionid != null && !this.lrtipocotizacionid.equals(other.lrtipocotizacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipocotizacion[ lrtipocotizacionid=" + lrtipocotizacionid + " ]";
    }
    
}
