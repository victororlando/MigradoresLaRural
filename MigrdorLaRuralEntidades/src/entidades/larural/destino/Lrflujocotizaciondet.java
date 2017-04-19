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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRFLUJOCOTIZACIONDET")
@NamedQueries({
    @NamedQuery(name = "Lrflujocotizaciondet.findAll", query = "SELECT l FROM Lrflujocotizaciondet l"),
    @NamedQuery(name = "Lrflujocotizaciondet.findByLrflujocotizaciondetid", query = "SELECT l FROM Lrflujocotizaciondet l WHERE l.lrflujocotizaciondetid = :lrflujocotizaciondetid"),
    @NamedQuery(name = "Lrflujocotizaciondet.findByLrflujocotizacionid", query = "SELECT l FROM Lrflujocotizaciondet l WHERE l.lrflujocotizacionid = :lrflujocotizacionid"),
    @NamedQuery(name = "Lrflujocotizaciondet.findByLrflujocotizaciondetcant", query = "SELECT l FROM Lrflujocotizaciondet l WHERE l.lrflujocotizaciondetcant = :lrflujocotizaciondetcant"),
    @NamedQuery(name = "Lrflujocotizaciondet.findByLrflujocotizaciondetual", query = "SELECT l FROM Lrflujocotizaciondet l WHERE l.lrflujocotizaciondetual = :lrflujocotizaciondetual"),
    @NamedQuery(name = "Lrflujocotizaciondet.findByLrflujocotizaciondetfal", query = "SELECT l FROM Lrflujocotizaciondet l WHERE l.lrflujocotizaciondetfal = :lrflujocotizaciondetfal")})
public class Lrflujocotizaciondet implements Serializable {

    @JoinColumns({
        @JoinColumn(name = "LRACCIONID", referencedColumnName = "LRACCIONID", nullable = false),
        @JoinColumn(name = "LRSUBACCIONID", referencedColumnName = "LRSUBACCIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lraccionsubacccion lraccionsubacccion;
    @JoinColumn(name = "LRFLUJOCOTIZACIONID", referencedColumnName = "LRFLUJOCOTIZACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrflujocotizacion lrflujocotizacionid;
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRFLUJOCOTIZACIONDET_SEQ_GENERATOR", sequenceName = "LRFLUJOCOTIZACIONDETID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRFLUJOCOTIZACIONDET_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONDETID", nullable = false)
    private Long lrflujocotizaciondetid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONDETCANT", nullable = false)
    private long lrflujocotizaciondetcant;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONDETUAL", nullable = false, length = 30)
    private String lrflujocotizaciondetual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONDETFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujocotizaciondetfal;

    public Lrflujocotizaciondet() {
    }

    public Lrflujocotizaciondet(Long lrflujocotizaciondetid) {
        this.lrflujocotizaciondetid = lrflujocotizaciondetid;
    }

    public Lrflujocotizaciondet(Long lrflujocotizaciondetid, long lrflujocotizacionid, long lrflujocotizaciondetcant, String lrflujocotizaciondetual, Date lrflujocotizaciondetfal, long lraccionid, long lrsubaccionid) {
        this.lrflujocotizaciondetid = lrflujocotizaciondetid;
        this.lrflujocotizaciondetcant = lrflujocotizaciondetcant;
        this.lrflujocotizaciondetual = lrflujocotizaciondetual;
        this.lrflujocotizaciondetfal = lrflujocotizaciondetfal;
    }

    public Long getLrflujocotizaciondetid() {
        return lrflujocotizaciondetid;
    }

    public void setLrflujocotizaciondetid(Long lrflujocotizaciondetid) {
        this.lrflujocotizaciondetid = lrflujocotizaciondetid;
    }

    public long getLrflujocotizaciondetcant() {
        return lrflujocotizaciondetcant;
    }

    public void setLrflujocotizaciondetcant(long lrflujocotizaciondetcant) {
        this.lrflujocotizaciondetcant = lrflujocotizaciondetcant;
    }

    public String getLrflujocotizaciondetual() {
        return lrflujocotizaciondetual;
    }

    public void setLrflujocotizaciondetual(String lrflujocotizaciondetual) {
        this.lrflujocotizaciondetual = lrflujocotizaciondetual;
    }

    public Date getLrflujocotizaciondetfal() {
        return lrflujocotizaciondetfal;
    }

    public void setLrflujocotizaciondetfal(Date lrflujocotizaciondetfal) {
        this.lrflujocotizaciondetfal = lrflujocotizaciondetfal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujocotizaciondetid != null ? lrflujocotizaciondetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujocotizaciondet)) {
            return false;
        }
        Lrflujocotizaciondet other = (Lrflujocotizaciondet) object;
        if ((this.lrflujocotizaciondetid == null && other.lrflujocotizaciondetid != null) || (this.lrflujocotizaciondetid != null && !this.lrflujocotizaciondetid.equals(other.lrflujocotizaciondetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujocotizaciondet[ lrflujocotizaciondetid=" + lrflujocotizaciondetid + " ]";
    }

    public Lraccionsubacccion getLraccionsubacccion() {
        return lraccionsubacccion;
    }

    public void setLraccionsubacccion(Lraccionsubacccion lraccionsubacccion) {
        this.lraccionsubacccion = lraccionsubacccion;
    }

    public Lrflujocotizacion getLrflujocotizacionid() {
        return lrflujocotizacionid;
    }

    public void setLrflujocotizacionid(Lrflujocotizacion lrflujocotizacionid) {
        this.lrflujocotizacionid = lrflujocotizacionid;
    }

}
