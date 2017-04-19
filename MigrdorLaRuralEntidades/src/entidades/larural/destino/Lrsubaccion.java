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
@Table(name = "LRSUBACCION")
@NamedQueries({
    @NamedQuery(name = "Lrsubaccion.findAll", query = "SELECT l FROM Lrsubaccion l"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionid", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionid = :lrsubaccionid"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubacciondesc", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubacciondesc = :lrsubacciondesc"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionact", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionact = :lrsubaccionact"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionfal", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionfal = :lrsubaccionfal"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionual", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionual = :lrsubaccionual"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionfmd", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionfmd = :lrsubaccionfmd"),
    @NamedQuery(name = "Lrsubaccion.findByLrsubaccionumd", query = "SELECT l FROM Lrsubaccion l WHERE l.lrsubaccionumd = :lrsubaccionumd")})
public class Lrsubaccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONID", nullable = false)
    private Long lrsubaccionid;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONDESC", nullable = false, length = 300)
    private String lrsubacciondesc;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONACT", nullable = false)
    private Character lrsubaccionact;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsubaccionfal;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONUAL", nullable = false, length = 30)
    private String lrsubaccionual;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsubaccionfmd;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONUMD", nullable = false, length = 30)
    private String lrsubaccionumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrsubaccion")
    private List<Lraccionsubacccion> lraccionsubacccionList;

    public Lrsubaccion() {
    }

    public Lrsubaccion(Long lrsubaccionid) {
        this.lrsubaccionid = lrsubaccionid;
    }

    public Lrsubaccion(Long lrsubaccionid, String lrsubacciondesc, Character lrsubaccionact, Date lrsubaccionfal, String lrsubaccionual, Date lrsubaccionfmd, String lrsubaccionumd) {
        this.lrsubaccionid = lrsubaccionid;
        this.lrsubacciondesc = lrsubacciondesc;
        this.lrsubaccionact = lrsubaccionact;
        this.lrsubaccionfal = lrsubaccionfal;
        this.lrsubaccionual = lrsubaccionual;
        this.lrsubaccionfmd = lrsubaccionfmd;
        this.lrsubaccionumd = lrsubaccionumd;
    }

    public Long getLrsubaccionid() {
        return lrsubaccionid;
    }

    public void setLrsubaccionid(Long lrsubaccionid) {
        this.lrsubaccionid = lrsubaccionid;
    }

    public String getLrsubacciondesc() {
        return lrsubacciondesc;
    }

    public void setLrsubacciondesc(String lrsubacciondesc) {
        this.lrsubacciondesc = lrsubacciondesc;
    }

    public Character getLrsubaccionact() {
        return lrsubaccionact;
    }

    public void setLrsubaccionact(Character lrsubaccionact) {
        this.lrsubaccionact = lrsubaccionact;
    }

    public Date getLrsubaccionfal() {
        return lrsubaccionfal;
    }

    public void setLrsubaccionfal(Date lrsubaccionfal) {
        this.lrsubaccionfal = lrsubaccionfal;
    }

    public String getLrsubaccionual() {
        return lrsubaccionual;
    }

    public void setLrsubaccionual(String lrsubaccionual) {
        this.lrsubaccionual = lrsubaccionual;
    }

    public Date getLrsubaccionfmd() {
        return lrsubaccionfmd;
    }

    public void setLrsubaccionfmd(Date lrsubaccionfmd) {
        this.lrsubaccionfmd = lrsubaccionfmd;
    }

    public String getLrsubaccionumd() {
        return lrsubaccionumd;
    }

    public void setLrsubaccionumd(String lrsubaccionumd) {
        this.lrsubaccionumd = lrsubaccionumd;
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
        hash += (lrsubaccionid != null ? lrsubaccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrsubaccion)) {
            return false;
        }
        Lrsubaccion other = (Lrsubaccion) object;
        if ((this.lrsubaccionid == null && other.lrsubaccionid != null) || (this.lrsubaccionid != null && !this.lrsubaccionid.equals(other.lrsubaccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrsubaccion[ lrsubaccionid=" + lrsubaccionid + " ]";
    }
    
}
