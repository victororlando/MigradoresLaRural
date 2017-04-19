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
@Table(name = "LRACCION")
@NamedQueries({
    @NamedQuery(name = "Lraccion.findAll", query = "SELECT l FROM Lraccion l"),
    @NamedQuery(name = "Lraccion.findByLraccionid", query = "SELECT l FROM Lraccion l WHERE l.lraccionid = :lraccionid"),
    @NamedQuery(name = "Lraccion.findByLracciondesc", query = "SELECT l FROM Lraccion l WHERE l.lracciondesc = :lracciondesc"),
    @NamedQuery(name = "Lraccion.findByLraccionactivo", query = "SELECT l FROM Lraccion l WHERE l.lraccionactivo = :lraccionactivo"),
    @NamedQuery(name = "Lraccion.findByLraccionfal", query = "SELECT l FROM Lraccion l WHERE l.lraccionfal = :lraccionfal"),
    @NamedQuery(name = "Lraccion.findByLraccionual", query = "SELECT l FROM Lraccion l WHERE l.lraccionual = :lraccionual"),
    @NamedQuery(name = "Lraccion.findByLraccionfmd", query = "SELECT l FROM Lraccion l WHERE l.lraccionfmd = :lraccionfmd"),
    @NamedQuery(name = "Lraccion.findByLraccionumd", query = "SELECT l FROM Lraccion l WHERE l.lraccionumd = :lraccionumd"),
    @NamedQuery(name = "Lraccion.findByLracciontipo", query = "SELECT l FROM Lraccion l WHERE l.lracciontipo = :lracciontipo")})
public class Lraccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRACCIONID", nullable = false)
    private Long lraccionid;
    @Basic(optional = false)
    @Column(name = "LRACCIONDESC", nullable = false, length = 300)
    private String lracciondesc;
    @Basic(optional = false)
    @Column(name = "LRACCIONACTIVO", nullable = false)
    private Character lraccionactivo;
    @Basic(optional = false)
    @Column(name = "LRACCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lraccionfal;
    @Basic(optional = false)
    @Column(name = "LRACCIONUAL", nullable = false, length = 30)
    private String lraccionual;
    @Basic(optional = false)
    @Column(name = "LRACCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lraccionfmd;
    @Basic(optional = false)
    @Column(name = "LRACCIONUMD", nullable = false, length = 30)
    private String lraccionumd;
    @Basic(optional = false)
    @Column(name = "LRACCIONTIPO", nullable = false)
    private Character lracciontipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lraccion")
    private List<Lraccionsubacccion> lraccionsubacccionList;

    public Lraccion() {
    }

    public Lraccion(Long lraccionid) {
        this.lraccionid = lraccionid;
    }

    public Lraccion(Long lraccionid, String lracciondesc, Character lraccionactivo, Date lraccionfal, String lraccionual, Date lraccionfmd, String lraccionumd, Character lracciontipo) {
        this.lraccionid = lraccionid;
        this.lracciondesc = lracciondesc;
        this.lraccionactivo = lraccionactivo;
        this.lraccionfal = lraccionfal;
        this.lraccionual = lraccionual;
        this.lraccionfmd = lraccionfmd;
        this.lraccionumd = lraccionumd;
        this.lracciontipo = lracciontipo;
    }

    public Long getLraccionid() {
        return lraccionid;
    }

    public void setLraccionid(Long lraccionid) {
        this.lraccionid = lraccionid;
    }

    public String getLracciondesc() {
        return lracciondesc;
    }

    public void setLracciondesc(String lracciondesc) {
        this.lracciondesc = lracciondesc;
    }

    public Character getLraccionactivo() {
        return lraccionactivo;
    }

    public void setLraccionactivo(Character lraccionactivo) {
        this.lraccionactivo = lraccionactivo;
    }

    public Date getLraccionfal() {
        return lraccionfal;
    }

    public void setLraccionfal(Date lraccionfal) {
        this.lraccionfal = lraccionfal;
    }

    public String getLraccionual() {
        return lraccionual;
    }

    public void setLraccionual(String lraccionual) {
        this.lraccionual = lraccionual;
    }

    public Date getLraccionfmd() {
        return lraccionfmd;
    }

    public void setLraccionfmd(Date lraccionfmd) {
        this.lraccionfmd = lraccionfmd;
    }

    public String getLraccionumd() {
        return lraccionumd;
    }

    public void setLraccionumd(String lraccionumd) {
        this.lraccionumd = lraccionumd;
    }

    public Character getLracciontipo() {
        return lracciontipo;
    }

    public void setLracciontipo(Character lracciontipo) {
        this.lracciontipo = lracciontipo;
    }

    public List<Lraccionsubacccion> getLraccionsubacccionList() {
        return lraccionsubacccionList;
    }

    public void setLraccionsubacccionList(List<Lraccionsubacccion> lraccionsubacccionList) {
        this.lraccionsubacccionList = lraccionsubacccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lraccionid != null ? lraccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lraccion)) {
            return false;
        }
        Lraccion other = (Lraccion) object;
        if ((this.lraccionid == null && other.lraccionid != null) || (this.lraccionid != null && !this.lraccionid.equals(other.lraccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lraccion[ lraccionid=" + lraccionid + " ]";
    }
    
}
