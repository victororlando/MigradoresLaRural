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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRPARMACCDURACION")
@NamedQueries({
    @NamedQuery(name = "Lrparmaccduracion.findAll", query = "SELECT l FROM Lrparmaccduracion l"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrparmaccduracionid = :lrparmaccduracionid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrareaid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrareaid = :lrareaid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrsubareaid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrsubareaid = :lrsubareaid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLraccionid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lraccionid = :lraccionid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrsubaccionid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrsubaccionid = :lrsubaccionid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrtipocotizacionid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrtipocotizacionid = :lrtipocotizacionid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrseccdetalleid", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionac", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionac = :lrparmaccduracionac"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracioncant", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracioncant = :lrparmaccduracioncant"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionfal", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionfal = :lrparmaccduracionfal"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionoual", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionoual = :lrparmaccduracionoual"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionfmd", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionfmd = :lrparmaccduracionfmd"),
    @NamedQuery(name = "Lrparmaccduracion.findByLrparmaccduracionumd", query = "SELECT l FROM Lrparmaccduracion l WHERE l.lrparmaccduracionumd = :lrparmaccduracionumd")})
public class Lrparmaccduracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmaccduracionPK lrparmaccduracionPK;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONAC", nullable = false)
    private Character lrparmaccduracionac;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONCANT", nullable = false)
    private int lrparmaccduracioncant;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmaccduracionfal;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONOUAL", nullable = false, length = 60)
    private String lrparmaccduracionoual;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmaccduracionfmd;
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONUMD", nullable = false, length = 60)
    private String lrparmaccduracionumd;
    @JoinColumns({
        @JoinColumn(name = "LRACCIONID", referencedColumnName = "LRACCIONID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSUBACCIONID", referencedColumnName = "LRSUBACCIONID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lraccionsubacccion lraccionsubacccion;
    @JoinColumns({
        @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrareasubarea lrareasubarea;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;
    @JoinColumn(name = "LRTIPOCOTIZACIONID", referencedColumnName = "LRTIPOCOTIZACIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipocotizacion lrtipocotizacion;

    public Lrparmaccduracion() {
    }

    public Lrparmaccduracion(LrparmaccduracionPK lrparmaccduracionPK) {
        this.lrparmaccduracionPK = lrparmaccduracionPK;
    }

    public Lrparmaccduracion(LrparmaccduracionPK lrparmaccduracionPK, Character lrparmaccduracionac, int lrparmaccduracioncant, Date lrparmaccduracionfal, String lrparmaccduracionoual, Date lrparmaccduracionfmd, String lrparmaccduracionumd) {
        this.lrparmaccduracionPK = lrparmaccduracionPK;
        this.lrparmaccduracionac = lrparmaccduracionac;
        this.lrparmaccduracioncant = lrparmaccduracioncant;
        this.lrparmaccduracionfal = lrparmaccduracionfal;
        this.lrparmaccduracionoual = lrparmaccduracionoual;
        this.lrparmaccduracionfmd = lrparmaccduracionfmd;
        this.lrparmaccduracionumd = lrparmaccduracionumd;
    }

    public Lrparmaccduracion(long lrparmaccduracionid, long lrareaid, long lrsubareaid, long lraccionid, long lrsubaccionid, long lrtipocotizacionid, long lrseccdetalleid) {
        this.lrparmaccduracionPK = new LrparmaccduracionPK(lrparmaccduracionid, lrareaid, lrsubareaid, lraccionid, lrsubaccionid, lrtipocotizacionid, lrseccdetalleid);
    }

    public LrparmaccduracionPK getLrparmaccduracionPK() {
        return lrparmaccduracionPK;
    }

    public void setLrparmaccduracionPK(LrparmaccduracionPK lrparmaccduracionPK) {
        this.lrparmaccduracionPK = lrparmaccduracionPK;
    }

    public Character getLrparmaccduracionac() {
        return lrparmaccduracionac;
    }

    public void setLrparmaccduracionac(Character lrparmaccduracionac) {
        this.lrparmaccduracionac = lrparmaccduracionac;
    }

    public int getLrparmaccduracioncant() {
        return lrparmaccduracioncant;
    }

    public void setLrparmaccduracioncant(int lrparmaccduracioncant) {
        this.lrparmaccduracioncant = lrparmaccduracioncant;
    }

    public Date getLrparmaccduracionfal() {
        return lrparmaccduracionfal;
    }

    public void setLrparmaccduracionfal(Date lrparmaccduracionfal) {
        this.lrparmaccduracionfal = lrparmaccduracionfal;
    }

    public String getLrparmaccduracionoual() {
        return lrparmaccduracionoual;
    }

    public void setLrparmaccduracionoual(String lrparmaccduracionoual) {
        this.lrparmaccduracionoual = lrparmaccduracionoual;
    }

    public Date getLrparmaccduracionfmd() {
        return lrparmaccduracionfmd;
    }

    public void setLrparmaccduracionfmd(Date lrparmaccduracionfmd) {
        this.lrparmaccduracionfmd = lrparmaccduracionfmd;
    }

    public String getLrparmaccduracionumd() {
        return lrparmaccduracionumd;
    }

    public void setLrparmaccduracionumd(String lrparmaccduracionumd) {
        this.lrparmaccduracionumd = lrparmaccduracionumd;
    }

    public Lraccionsubacccion getLraccionsubacccion() {
        return lraccionsubacccion;
    }

    public void setLraccionsubacccion(Lraccionsubacccion lraccionsubacccion) {
        this.lraccionsubacccion = lraccionsubacccion;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    public Lrtipocotizacion getLrtipocotizacion() {
        return lrtipocotizacion;
    }

    public void setLrtipocotizacion(Lrtipocotizacion lrtipocotizacion) {
        this.lrtipocotizacion = lrtipocotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmaccduracionPK != null ? lrparmaccduracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmaccduracion)) {
            return false;
        }
        Lrparmaccduracion other = (Lrparmaccduracion) object;
        if ((this.lrparmaccduracionPK == null && other.lrparmaccduracionPK != null) || (this.lrparmaccduracionPK != null && !this.lrparmaccduracionPK.equals(other.lrparmaccduracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmaccduracion[ lrparmaccduracionPK=" + lrparmaccduracionPK + " ]";
    }
    
}
