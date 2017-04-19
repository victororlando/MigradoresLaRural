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
@Table(name = "LRGRUPOASEG")
@NamedQueries({
    @NamedQuery(name = "Lrgrupoaseg.findAll", query = "SELECT l FROM Lrgrupoaseg l"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegid", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegPK.lrgrupoasegid = :lrgrupoasegid"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrpersonaid", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegPK.lrpersonaid = :lrpersonaid"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegporcdesc", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegporcdesc = :lrgrupoasegporcdesc"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoaseghab", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoaseghab = :lrgrupoaseghab"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegfal", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegfal = :lrgrupoasegfal"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegual", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegual = :lrgrupoasegual"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegfmd", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegfmd = :lrgrupoasegfmd"),
    @NamedQuery(name = "Lrgrupoaseg.findByLrgrupoasegumd", query = "SELECT l FROM Lrgrupoaseg l WHERE l.lrgrupoasegumd = :lrgrupoasegumd")})
public class Lrgrupoaseg implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrgrupoasegPK lrgrupoasegPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRGRUPOASEGPORCDESC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrgrupoasegporcdesc;
    @Basic(optional = false)
    @Column(name = "LRGRUPOASEGHAB", nullable = false)
    private Character lrgrupoaseghab;
    @Basic(optional = false)
    @Column(name = "LRGRUPOASEGFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgrupoasegfal;
    @Basic(optional = false)
    @Column(name = "LRGRUPOASEGUAL", nullable = false, length = 30)
    private String lrgrupoasegual;
    @Column(name = "LRGRUPOASEGFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgrupoasegfmd;
    @Column(name = "LRGRUPOASEGUMD", length = 30)
    private String lrgrupoasegumd;
    @JoinColumn(name = "LRTIPOSVINCID", referencedColumnName = "LRTIPOSVINCID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtiposvinc lrtiposvincid;

    public Lrgrupoaseg() {
    }

    public Lrgrupoaseg(LrgrupoasegPK lrgrupoasegPK) {
        this.lrgrupoasegPK = lrgrupoasegPK;
    }

    public Lrgrupoaseg(LrgrupoasegPK lrgrupoasegPK, BigDecimal lrgrupoasegporcdesc, Character lrgrupoaseghab, Date lrgrupoasegfal, String lrgrupoasegual) {
        this.lrgrupoasegPK = lrgrupoasegPK;
        this.lrgrupoasegporcdesc = lrgrupoasegporcdesc;
        this.lrgrupoaseghab = lrgrupoaseghab;
        this.lrgrupoasegfal = lrgrupoasegfal;
        this.lrgrupoasegual = lrgrupoasegual;
    }

    public Lrgrupoaseg(long lrgrupoasegid, long lrpersonaid) {
        this.lrgrupoasegPK = new LrgrupoasegPK(lrgrupoasegid, lrpersonaid);
    }

    public LrgrupoasegPK getLrgrupoasegPK() {
        return lrgrupoasegPK;
    }

    public void setLrgrupoasegPK(LrgrupoasegPK lrgrupoasegPK) {
        this.lrgrupoasegPK = lrgrupoasegPK;
    }

    public BigDecimal getLrgrupoasegporcdesc() {
        return lrgrupoasegporcdesc;
    }

    public void setLrgrupoasegporcdesc(BigDecimal lrgrupoasegporcdesc) {
        this.lrgrupoasegporcdesc = lrgrupoasegporcdesc;
    }

    public Character getLrgrupoaseghab() {
        return lrgrupoaseghab;
    }

    public void setLrgrupoaseghab(Character lrgrupoaseghab) {
        this.lrgrupoaseghab = lrgrupoaseghab;
    }

    public Date getLrgrupoasegfal() {
        return lrgrupoasegfal;
    }

    public void setLrgrupoasegfal(Date lrgrupoasegfal) {
        this.lrgrupoasegfal = lrgrupoasegfal;
    }

    public String getLrgrupoasegual() {
        return lrgrupoasegual;
    }

    public void setLrgrupoasegual(String lrgrupoasegual) {
        this.lrgrupoasegual = lrgrupoasegual;
    }

    public Date getLrgrupoasegfmd() {
        return lrgrupoasegfmd;
    }

    public void setLrgrupoasegfmd(Date lrgrupoasegfmd) {
        this.lrgrupoasegfmd = lrgrupoasegfmd;
    }

    public String getLrgrupoasegumd() {
        return lrgrupoasegumd;
    }

    public void setLrgrupoasegumd(String lrgrupoasegumd) {
        this.lrgrupoasegumd = lrgrupoasegumd;
    }

    public Lrtiposvinc getLrtiposvincid() {
        return lrtiposvincid;
    }

    public void setLrtiposvincid(Lrtiposvinc lrtiposvincid) {
        this.lrtiposvincid = lrtiposvincid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrgrupoasegPK != null ? lrgrupoasegPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrgrupoaseg)) {
            return false;
        }
        Lrgrupoaseg other = (Lrgrupoaseg) object;
        if ((this.lrgrupoasegPK == null && other.lrgrupoasegPK != null) || (this.lrgrupoasegPK != null && !this.lrgrupoasegPK.equals(other.lrgrupoasegPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrgrupoaseg[ lrgrupoasegPK=" + lrgrupoasegPK + " ]";
    }
    
}
