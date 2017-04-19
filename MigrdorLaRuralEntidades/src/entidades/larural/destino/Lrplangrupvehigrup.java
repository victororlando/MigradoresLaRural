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
@Table(name = "LRPLANGRUPVEHIGRUP")
@NamedQueries({
    @NamedQuery(name = "Lrplangrupvehigrup.findAll", query = "SELECT l FROM Lrplangrupvehigrup l"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrtipoplangrupid", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupPK.lrtipoplangrupid = :lrtipoplangrupid"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByVehiculostipgruid", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupPK.vehiculostipgruid = :vehiculostipgruid"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrplangrupvehigrupac", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupac = :lrplangrupvehigrupac"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrplangrupvehigrupual", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupual = :lrplangrupvehigrupual"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrplangrupvehigrupfal", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupfal = :lrplangrupvehigrupfal"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrplangrupvehigrupumd", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupumd = :lrplangrupvehigrupumd"),
    @NamedQuery(name = "Lrplangrupvehigrup.findByLrplangrupvehigrupfmd", query = "SELECT l FROM Lrplangrupvehigrup l WHERE l.lrplangrupvehigrupfmd = :lrplangrupvehigrupfmd")})
public class Lrplangrupvehigrup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrplangrupvehigrupPK lrplangrupvehigrupPK;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPVEHIGRUPAC", nullable = false)
    private Character lrplangrupvehigrupac;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPVEHIGRUPUAL", nullable = false, length = 30)
    private String lrplangrupvehigrupual;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPVEHIGRUPFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrplangrupvehigrupfal;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPVEHIGRUPUMD", nullable = false, length = 30)
    private String lrplangrupvehigrupumd;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPVEHIGRUPFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrplangrupvehigrupfmd;
    @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipoplangrup lrtipoplangrup;

    public Lrplangrupvehigrup() {
    }

    public Lrplangrupvehigrup(LrplangrupvehigrupPK lrplangrupvehigrupPK) {
        this.lrplangrupvehigrupPK = lrplangrupvehigrupPK;
    }

    public Lrplangrupvehigrup(LrplangrupvehigrupPK lrplangrupvehigrupPK, Character lrplangrupvehigrupac, String lrplangrupvehigrupual, Date lrplangrupvehigrupfal, String lrplangrupvehigrupumd, Date lrplangrupvehigrupfmd) {
        this.lrplangrupvehigrupPK = lrplangrupvehigrupPK;
        this.lrplangrupvehigrupac = lrplangrupvehigrupac;
        this.lrplangrupvehigrupual = lrplangrupvehigrupual;
        this.lrplangrupvehigrupfal = lrplangrupvehigrupfal;
        this.lrplangrupvehigrupumd = lrplangrupvehigrupumd;
        this.lrplangrupvehigrupfmd = lrplangrupvehigrupfmd;
    }

    public Lrplangrupvehigrup(long lrtipoplangrupid, long vehiculostipgruid) {
        this.lrplangrupvehigrupPK = new LrplangrupvehigrupPK(lrtipoplangrupid, vehiculostipgruid);
    }

    public LrplangrupvehigrupPK getLrplangrupvehigrupPK() {
        return lrplangrupvehigrupPK;
    }

    public void setLrplangrupvehigrupPK(LrplangrupvehigrupPK lrplangrupvehigrupPK) {
        this.lrplangrupvehigrupPK = lrplangrupvehigrupPK;
    }

    public Character getLrplangrupvehigrupac() {
        return lrplangrupvehigrupac;
    }

    public void setLrplangrupvehigrupac(Character lrplangrupvehigrupac) {
        this.lrplangrupvehigrupac = lrplangrupvehigrupac;
    }

    public String getLrplangrupvehigrupual() {
        return lrplangrupvehigrupual;
    }

    public void setLrplangrupvehigrupual(String lrplangrupvehigrupual) {
        this.lrplangrupvehigrupual = lrplangrupvehigrupual;
    }

    public Date getLrplangrupvehigrupfal() {
        return lrplangrupvehigrupfal;
    }

    public void setLrplangrupvehigrupfal(Date lrplangrupvehigrupfal) {
        this.lrplangrupvehigrupfal = lrplangrupvehigrupfal;
    }

    public String getLrplangrupvehigrupumd() {
        return lrplangrupvehigrupumd;
    }

    public void setLrplangrupvehigrupumd(String lrplangrupvehigrupumd) {
        this.lrplangrupvehigrupumd = lrplangrupvehigrupumd;
    }

    public Date getLrplangrupvehigrupfmd() {
        return lrplangrupvehigrupfmd;
    }

    public void setLrplangrupvehigrupfmd(Date lrplangrupvehigrupfmd) {
        this.lrplangrupvehigrupfmd = lrplangrupvehigrupfmd;
    }

    public Lrtipoplangrup getLrtipoplangrup() {
        return lrtipoplangrup;
    }

    public void setLrtipoplangrup(Lrtipoplangrup lrtipoplangrup) {
        this.lrtipoplangrup = lrtipoplangrup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrplangrupvehigrupPK != null ? lrplangrupvehigrupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrplangrupvehigrup)) {
            return false;
        }
        Lrplangrupvehigrup other = (Lrplangrupvehigrup) object;
        if ((this.lrplangrupvehigrupPK == null && other.lrplangrupvehigrupPK != null) || (this.lrplangrupvehigrupPK != null && !this.lrplangrupvehigrupPK.equals(other.lrplangrupvehigrupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrplangrupvehigrup[ lrplangrupvehigrupPK=" + lrplangrupvehigrupPK + " ]";
    }
    
}
