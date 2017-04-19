/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LRFLUJOINSPECCIONDET")
@NamedQueries({
    @NamedQuery(name = "Lrflujoinspecciondet.findAll", query = "SELECT l FROM Lrflujoinspecciondet l"),
    @NamedQuery(name = "Lrflujoinspecciondet.findByLrflujoinspecciondetid", query = "SELECT l FROM Lrflujoinspecciondet l WHERE l.lrflujoinspecciondetid = :lrflujoinspecciondetid"),
    @NamedQuery(name = "Lrflujoinspecciondet.findByLrflujoinspecciondetcant", query = "SELECT l FROM Lrflujoinspecciondet l WHERE l.lrflujoinspecciondetcant = :lrflujoinspecciondetcant"),
    @NamedQuery(name = "Lrflujoinspecciondet.findByLrflujoinspecciondetual", query = "SELECT l FROM Lrflujoinspecciondet l WHERE l.lrflujoinspecciondetual = :lrflujoinspecciondetual"),
    @NamedQuery(name = "Lrflujoinspecciondet.findByLrflujoinspecciondetfal", query = "SELECT l FROM Lrflujoinspecciondet l WHERE l.lrflujoinspecciondetfal = :lrflujoinspecciondetfal")})
public class Lrflujoinspecciondet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONDETID", nullable = false)
    private Long lrflujoinspecciondetid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONDETCANT", nullable = false, precision = 9, scale = 2)
    private BigDecimal lrflujoinspecciondetcant;
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONDETUAL", nullable = false, length = 30)
    private String lrflujoinspecciondetual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONDETFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoinspecciondetfal;
    @JoinColumns({
        @JoinColumn(name = "LRFLUJOINSACCIONID", referencedColumnName = "LRACCIONID", nullable = false),
        @JoinColumn(name = "LRFLUJOINSSUBACCIONID", referencedColumnName = "LRSUBACCIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lraccionsubacccion lraccionsubacccion;
    @JoinColumn(name = "LRFLUJOINSPECCIONID", referencedColumnName = "LRFLUJOINSPECCIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrflujoinspeccion lrflujoinspeccionid;

    public Lrflujoinspecciondet() {
    }

    public Lrflujoinspecciondet(Long lrflujoinspecciondetid) {
        this.lrflujoinspecciondetid = lrflujoinspecciondetid;
    }

    public Lrflujoinspecciondet(Long lrflujoinspecciondetid, BigDecimal lrflujoinspecciondetcant, String lrflujoinspecciondetual, Date lrflujoinspecciondetfal) {
        this.lrflujoinspecciondetid = lrflujoinspecciondetid;
        this.lrflujoinspecciondetcant = lrflujoinspecciondetcant;
        this.lrflujoinspecciondetual = lrflujoinspecciondetual;
        this.lrflujoinspecciondetfal = lrflujoinspecciondetfal;
    }

    public Long getLrflujoinspecciondetid() {
        return lrflujoinspecciondetid;
    }

    public void setLrflujoinspecciondetid(Long lrflujoinspecciondetid) {
        this.lrflujoinspecciondetid = lrflujoinspecciondetid;
    }

    public BigDecimal getLrflujoinspecciondetcant() {
        return lrflujoinspecciondetcant;
    }

    public void setLrflujoinspecciondetcant(BigDecimal lrflujoinspecciondetcant) {
        this.lrflujoinspecciondetcant = lrflujoinspecciondetcant;
    }

    public String getLrflujoinspecciondetual() {
        return lrflujoinspecciondetual;
    }

    public void setLrflujoinspecciondetual(String lrflujoinspecciondetual) {
        this.lrflujoinspecciondetual = lrflujoinspecciondetual;
    }

    public Date getLrflujoinspecciondetfal() {
        return lrflujoinspecciondetfal;
    }

    public void setLrflujoinspecciondetfal(Date lrflujoinspecciondetfal) {
        this.lrflujoinspecciondetfal = lrflujoinspecciondetfal;
    }

    public Lraccionsubacccion getLraccionsubacccion() {
        return lraccionsubacccion;
    }

    public void setLraccionsubacccion(Lraccionsubacccion lraccionsubacccion) {
        this.lraccionsubacccion = lraccionsubacccion;
    }

    public Lrflujoinspeccion getLrflujoinspeccionid() {
        return lrflujoinspeccionid;
    }

    public void setLrflujoinspeccionid(Lrflujoinspeccion lrflujoinspeccionid) {
        this.lrflujoinspeccionid = lrflujoinspeccionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujoinspecciondetid != null ? lrflujoinspecciondetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujoinspecciondet)) {
            return false;
        }
        Lrflujoinspecciondet other = (Lrflujoinspecciondet) object;
        if ((this.lrflujoinspecciondetid == null && other.lrflujoinspecciondetid != null) || (this.lrflujoinspecciondetid != null && !this.lrflujoinspecciondetid.equals(other.lrflujoinspecciondetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujoinspecciondet[ lrflujoinspecciondetid=" + lrflujoinspecciondetid + " ]";
    }
    
}
