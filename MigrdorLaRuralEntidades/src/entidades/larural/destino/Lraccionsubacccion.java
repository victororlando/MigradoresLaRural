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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LRACCIONSUBACCCION")
@NamedQueries({
    @NamedQuery(name = "Lraccionsubacccion.findAll", query = "SELECT l FROM Lraccionsubacccion l"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionid", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionPK.lraccionid = :lraccionid"),
    @NamedQuery(name = "Lraccionsubacccion.findByLrsubaccionid", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionPK.lrsubaccionid = :lrsubaccionid"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionac", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionac = :lraccionsubacccionac"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionfal", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionfal = :lraccionsubacccionfal"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionual", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionual = :lraccionsubacccionual"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionfmd", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionfmd = :lraccionsubacccionfmd"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionumd", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionumd = :lraccionsubacccionumd"),
    @NamedQuery(name = "Lraccionsubacccion.findByLraccionsubacccionvisible", query = "SELECT l FROM Lraccionsubacccion l WHERE l.lraccionsubacccionvisible = :lraccionsubacccionvisible")})
public class Lraccionsubacccion implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lraccionsubacccion")
    private List<Lrflujocotizaciondet> lrflujocotizaciondetList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LraccionsubacccionPK lraccionsubacccionPK;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONAC", nullable = false)
    private Character lraccionsubacccionac;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lraccionsubacccionfal;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONUAL", nullable = false, length = 30)
    private String lraccionsubacccionual;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lraccionsubacccionfmd;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONUMD", nullable = false, length = 30)
    private String lraccionsubacccionumd;
    @Basic(optional = false)
    @Column(name = "LRACCIONSUBACCCIONVISIBLE", nullable = false)
    private Character lraccionsubacccionvisible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lraccionsubacccion")
    private List<Lrparmaccduracion> lrparmaccduracionList;
    @JoinColumn(name = "LRACCIONID", referencedColumnName = "LRACCIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lraccion lraccion;
    @JoinColumn(name = "LRSUBACCIONID", referencedColumnName = "LRSUBACCIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrsubaccion lrsubaccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lraccionsubacccion")
    private List<Lrflujoinspecciondet> lrflujoinspecciondetList;

    public Lraccionsubacccion() {
    }

    public Lraccionsubacccion(LraccionsubacccionPK lraccionsubacccionPK) {
        this.lraccionsubacccionPK = lraccionsubacccionPK;
    }

    public Lraccionsubacccion(LraccionsubacccionPK lraccionsubacccionPK, Character lraccionsubacccionac, Date lraccionsubacccionfal, String lraccionsubacccionual, Date lraccionsubacccionfmd, String lraccionsubacccionumd, Character lraccionsubacccionvisible) {
        this.lraccionsubacccionPK = lraccionsubacccionPK;
        this.lraccionsubacccionac = lraccionsubacccionac;
        this.lraccionsubacccionfal = lraccionsubacccionfal;
        this.lraccionsubacccionual = lraccionsubacccionual;
        this.lraccionsubacccionfmd = lraccionsubacccionfmd;
        this.lraccionsubacccionumd = lraccionsubacccionumd;
        this.lraccionsubacccionvisible = lraccionsubacccionvisible;
    }

    public Lraccionsubacccion(long lraccionid, long lrsubaccionid) {
        this.lraccionsubacccionPK = new LraccionsubacccionPK(lraccionid, lrsubaccionid);
    }

    public LraccionsubacccionPK getLraccionsubacccionPK() {
        return lraccionsubacccionPK;
    }

    public void setLraccionsubacccionPK(LraccionsubacccionPK lraccionsubacccionPK) {
        this.lraccionsubacccionPK = lraccionsubacccionPK;
    }

    public Character getLraccionsubacccionac() {
        return lraccionsubacccionac;
    }

    public void setLraccionsubacccionac(Character lraccionsubacccionac) {
        this.lraccionsubacccionac = lraccionsubacccionac;
    }

    public Date getLraccionsubacccionfal() {
        return lraccionsubacccionfal;
    }

    public void setLraccionsubacccionfal(Date lraccionsubacccionfal) {
        this.lraccionsubacccionfal = lraccionsubacccionfal;
    }

    public String getLraccionsubacccionual() {
        return lraccionsubacccionual;
    }

    public void setLraccionsubacccionual(String lraccionsubacccionual) {
        this.lraccionsubacccionual = lraccionsubacccionual;
    }

    public Date getLraccionsubacccionfmd() {
        return lraccionsubacccionfmd;
    }

    public void setLraccionsubacccionfmd(Date lraccionsubacccionfmd) {
        this.lraccionsubacccionfmd = lraccionsubacccionfmd;
    }

    public String getLraccionsubacccionumd() {
        return lraccionsubacccionumd;
    }

    public void setLraccionsubacccionumd(String lraccionsubacccionumd) {
        this.lraccionsubacccionumd = lraccionsubacccionumd;
    }

    public Character getLraccionsubacccionvisible() {
        return lraccionsubacccionvisible;
    }

    public void setLraccionsubacccionvisible(Character lraccionsubacccionvisible) {
        this.lraccionsubacccionvisible = lraccionsubacccionvisible;
    }

    public List<Lrparmaccduracion> getLrparmaccduracionList() {
        return lrparmaccduracionList;
    }

    public void setLrparmaccduracionList(List<Lrparmaccduracion> lrparmaccduracionList) {
        this.lrparmaccduracionList = lrparmaccduracionList;
    }

    public Lraccion getLraccion() {
        return lraccion;
    }

    public void setLraccion(Lraccion lraccion) {
        this.lraccion = lraccion;
    }

    public Lrsubaccion getLrsubaccion() {
        return lrsubaccion;
    }

    public void setLrsubaccion(Lrsubaccion lrsubaccion) {
        this.lrsubaccion = lrsubaccion;
    }

    public List<Lrflujoinspecciondet> getLrflujoinspecciondetList() {
        return lrflujoinspecciondetList;
    }

    public void setLrflujoinspecciondetList(List<Lrflujoinspecciondet> lrflujoinspecciondetList) {
        this.lrflujoinspecciondetList = lrflujoinspecciondetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lraccionsubacccionPK != null ? lraccionsubacccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lraccionsubacccion)) {
            return false;
        }
        Lraccionsubacccion other = (Lraccionsubacccion) object;
        if ((this.lraccionsubacccionPK == null && other.lraccionsubacccionPK != null) || (this.lraccionsubacccionPK != null && !this.lraccionsubacccionPK.equals(other.lraccionsubacccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lraccionsubacccion[ lraccionsubacccionPK=" + lraccionsubacccionPK + " ]";
    }

    public List<Lrflujocotizaciondet> getLrflujocotizaciondetList() {
        return lrflujocotizaciondetList;
    }

    public void setLrflujocotizaciondetList(List<Lrflujocotizaciondet> lrflujocotizaciondetList) {
        this.lrflujocotizaciondetList = lrflujocotizaciondetList;
    }
    
}
