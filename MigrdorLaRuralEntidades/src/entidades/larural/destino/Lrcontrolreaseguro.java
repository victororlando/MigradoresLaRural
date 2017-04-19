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
@Table(name = "LRCONTROLREASEGURO")
@NamedQueries({
    @NamedQuery(name = "Lrcontrolreaseguro.findAll", query = "SELECT l FROM Lrcontrolreaseguro l"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByRubrosid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrseccdetalleid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreasegurocatid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.lrcontrolreasegurocatid = :lrcontrolreasegurocatid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreaseguroreacoaid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.lrcontrolreaseguroreacoaid = :lrcontrolreaseguroreacoaid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreaseguromonid", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroPK.lrcontrolreaseguromonid = :lrcontrolreaseguromonid"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreaseguroac", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroac = :lrcontrolreaseguroac"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreaseguroual", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroual = :lrcontrolreaseguroual"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreasegurofal", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreasegurofal = :lrcontrolreasegurofal"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreaseguroumd", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreaseguroumd = :lrcontrolreaseguroumd"),
    @NamedQuery(name = "Lrcontrolreaseguro.findByLrcontrolreasegurofmd", query = "SELECT l FROM Lrcontrolreaseguro l WHERE l.lrcontrolreasegurofmd = :lrcontrolreasegurofmd")})
public class Lrcontrolreaseguro implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcontrolreaseguroPK lrcontrolreaseguroPK;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREASEGUROAC", nullable = false)
    private Character lrcontrolreaseguroac;
    @Column(name = "LRCONTROLREASEGUROUAL", length = 30)
    private String lrcontrolreaseguroual;
    @Column(name = "LRCONTROLREASEGUROFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontrolreasegurofal;
    @Column(name = "LRCONTROLREASEGUROUMD", length = 30)
    private String lrcontrolreaseguroumd;
    @Column(name = "LRCONTROLREASEGUROFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontrolreasegurofmd;
    @JoinColumns({
        @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "RUBROSID", referencedColumnName = "RUBROSID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrtasarubroriesgo lrtasarubroriesgo;

    public Lrcontrolreaseguro() {
    }

    public Lrcontrolreaseguro(LrcontrolreaseguroPK lrcontrolreaseguroPK) {
        this.lrcontrolreaseguroPK = lrcontrolreaseguroPK;
    }

    public Lrcontrolreaseguro(LrcontrolreaseguroPK lrcontrolreaseguroPK, Character lrcontrolreaseguroac) {
        this.lrcontrolreaseguroPK = lrcontrolreaseguroPK;
        this.lrcontrolreaseguroac = lrcontrolreaseguroac;
    }

    public Lrcontrolreaseguro(long rubrosid, long lrclasificacionriesgoid, long lrseccdetalleid, long lrcontrolreasegurocatid, short lrcontrolreaseguroreacoaid, short lrcontrolreaseguromonid) {
        this.lrcontrolreaseguroPK = new LrcontrolreaseguroPK(rubrosid, lrclasificacionriesgoid, lrseccdetalleid, lrcontrolreasegurocatid, lrcontrolreaseguroreacoaid, lrcontrolreaseguromonid);
    }

    public LrcontrolreaseguroPK getLrcontrolreaseguroPK() {
        return lrcontrolreaseguroPK;
    }

    public void setLrcontrolreaseguroPK(LrcontrolreaseguroPK lrcontrolreaseguroPK) {
        this.lrcontrolreaseguroPK = lrcontrolreaseguroPK;
    }

    public Character getLrcontrolreaseguroac() {
        return lrcontrolreaseguroac;
    }

    public void setLrcontrolreaseguroac(Character lrcontrolreaseguroac) {
        this.lrcontrolreaseguroac = lrcontrolreaseguroac;
    }

    public String getLrcontrolreaseguroual() {
        return lrcontrolreaseguroual;
    }

    public void setLrcontrolreaseguroual(String lrcontrolreaseguroual) {
        this.lrcontrolreaseguroual = lrcontrolreaseguroual;
    }

    public Date getLrcontrolreasegurofal() {
        return lrcontrolreasegurofal;
    }

    public void setLrcontrolreasegurofal(Date lrcontrolreasegurofal) {
        this.lrcontrolreasegurofal = lrcontrolreasegurofal;
    }

    public String getLrcontrolreaseguroumd() {
        return lrcontrolreaseguroumd;
    }

    public void setLrcontrolreaseguroumd(String lrcontrolreaseguroumd) {
        this.lrcontrolreaseguroumd = lrcontrolreaseguroumd;
    }

    public Date getLrcontrolreasegurofmd() {
        return lrcontrolreasegurofmd;
    }

    public void setLrcontrolreasegurofmd(Date lrcontrolreasegurofmd) {
        this.lrcontrolreasegurofmd = lrcontrolreasegurofmd;
    }

    public Lrtasarubroriesgo getLrtasarubroriesgo() {
        return lrtasarubroriesgo;
    }

    public void setLrtasarubroriesgo(Lrtasarubroriesgo lrtasarubroriesgo) {
        this.lrtasarubroriesgo = lrtasarubroriesgo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcontrolreaseguroPK != null ? lrcontrolreaseguroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcontrolreaseguro)) {
            return false;
        }
        Lrcontrolreaseguro other = (Lrcontrolreaseguro) object;
        if ((this.lrcontrolreaseguroPK == null && other.lrcontrolreaseguroPK != null) || (this.lrcontrolreaseguroPK != null && !this.lrcontrolreaseguroPK.equals(other.lrcontrolreaseguroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcontrolreaseguro[ lrcontrolreaseguroPK=" + lrcontrolreaseguroPK + " ]";
    }
    
}
