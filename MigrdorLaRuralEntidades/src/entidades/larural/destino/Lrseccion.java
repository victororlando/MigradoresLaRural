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
@Table(name = "LRSECCION")
@NamedQueries({
    @NamedQuery(name = "Lrseccion.findAll", query = "SELECT l FROM Lrseccion l"),
    @NamedQuery(name = "Lrseccion.findByLrseccionid", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionid = :lrseccionid"),
    @NamedQuery(name = "Lrseccion.findByLrseccionnom", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionnom = :lrseccionnom"),
    @NamedQuery(name = "Lrseccion.findByLrseccionhab", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionhab = :lrseccionhab"),
    @NamedQuery(name = "Lrseccion.findByLrseccionual", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionual = :lrseccionual"),
    @NamedQuery(name = "Lrseccion.findByLrseccionfal", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionfal = :lrseccionfal"),
    @NamedQuery(name = "Lrseccion.findByLrseccionumd", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionumd = :lrseccionumd"),
    @NamedQuery(name = "Lrseccion.findByLrseccionfmd", query = "SELECT l FROM Lrseccion l WHERE l.lrseccionfmd = :lrseccionfmd")})
public class Lrseccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSECCIONID", nullable = false)
    private Long lrseccionid;
    @Basic(optional = false)
    @Column(name = "LRSECCIONNOM", nullable = false, length = 100)
    private String lrseccionnom;
    @Basic(optional = false)
    @Column(name = "LRSECCIONHAB", nullable = false)
    private Character lrseccionhab;
    @Basic(optional = false)
    @Column(name = "LRSECCIONUAL", nullable = false, length = 30)
    private String lrseccionual;
    @Basic(optional = false)
    @Column(name = "LRSECCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccionfal;
    @Basic(optional = false)
    @Column(name = "LRSECCIONUMD", nullable = false, length = 30)
    private String lrseccionumd;
    @Basic(optional = false)
    @Column(name = "LRSECCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccionfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccionid")
    private List<Lrseccdetalle> lrseccdetalleList;

    public Lrseccion() {
    }

    public Lrseccion(Long lrseccionid) {
        this.lrseccionid = lrseccionid;
    }

    public Lrseccion(Long lrseccionid, String lrseccionnom, Character lrseccionhab, String lrseccionual, Date lrseccionfal, String lrseccionumd, Date lrseccionfmd) {
        this.lrseccionid = lrseccionid;
        this.lrseccionnom = lrseccionnom;
        this.lrseccionhab = lrseccionhab;
        this.lrseccionual = lrseccionual;
        this.lrseccionfal = lrseccionfal;
        this.lrseccionumd = lrseccionumd;
        this.lrseccionfmd = lrseccionfmd;
    }

    public Long getLrseccionid() {
        return lrseccionid;
    }

    public void setLrseccionid(Long lrseccionid) {
        this.lrseccionid = lrseccionid;
    }

    public String getLrseccionnom() {
        return lrseccionnom;
    }

    public void setLrseccionnom(String lrseccionnom) {
        this.lrseccionnom = lrseccionnom;
    }

    public Character getLrseccionhab() {
        return lrseccionhab;
    }

    public void setLrseccionhab(Character lrseccionhab) {
        this.lrseccionhab = lrseccionhab;
    }

    public String getLrseccionual() {
        return lrseccionual;
    }

    public void setLrseccionual(String lrseccionual) {
        this.lrseccionual = lrseccionual;
    }

    public Date getLrseccionfal() {
        return lrseccionfal;
    }

    public void setLrseccionfal(Date lrseccionfal) {
        this.lrseccionfal = lrseccionfal;
    }

    public String getLrseccionumd() {
        return lrseccionumd;
    }

    public void setLrseccionumd(String lrseccionumd) {
        this.lrseccionumd = lrseccionumd;
    }

    public Date getLrseccionfmd() {
        return lrseccionfmd;
    }

    public void setLrseccionfmd(Date lrseccionfmd) {
        this.lrseccionfmd = lrseccionfmd;
    }

    public List<Lrseccdetalle> getLrseccdetalleList() {
        return lrseccdetalleList;
    }

    public void setLrseccdetalleList(List<Lrseccdetalle> lrseccdetalleList) {
        this.lrseccdetalleList = lrseccdetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrseccionid != null ? lrseccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrseccion)) {
            return false;
        }
        Lrseccion other = (Lrseccion) object;
        if ((this.lrseccionid == null && other.lrseccionid != null) || (this.lrseccionid != null && !this.lrseccionid.equals(other.lrseccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrseccion[ lrseccionid=" + lrseccionid + " ]";
    }
    
}
