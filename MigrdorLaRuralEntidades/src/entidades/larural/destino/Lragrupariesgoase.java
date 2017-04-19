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
@Table(name = "LRAGRUPARIESGOASE")
@NamedQueries({
    @NamedQuery(name = "Lragrupariesgoase.findAll", query = "SELECT l FROM Lragrupariesgoase l"),
    @NamedQuery(name = "Lragrupariesgoase.findByLrcategoriariesgoaseid", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoasePK.lrcategoriariesgoaseid = :lrcategoriariesgoaseid"),
    @NamedQuery(name = "Lragrupariesgoase.findByRiesgosaseid", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoasePK.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lragrupariesgoase.findBySeccid", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoasePK.seccid = :seccid"),
    @NamedQuery(name = "Lragrupariesgoase.findByLragrupariesgoaseac", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoaseac = :lragrupariesgoaseac"),
    @NamedQuery(name = "Lragrupariesgoase.findByLragrupariesgoaseual", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoaseual = :lragrupariesgoaseual"),
    @NamedQuery(name = "Lragrupariesgoase.findByLragrupariesgoasefal", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoasefal = :lragrupariesgoasefal"),
    @NamedQuery(name = "Lragrupariesgoase.findByLragrupariesgoaseumd", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoaseumd = :lragrupariesgoaseumd"),
    @NamedQuery(name = "Lragrupariesgoase.findByLragrupariesgoasefmd", query = "SELECT l FROM Lragrupariesgoase l WHERE l.lragrupariesgoasefmd = :lragrupariesgoasefmd")})
public class Lragrupariesgoase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LragrupariesgoasePK lragrupariesgoasePK;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARIESGOASEAC", nullable = false)
    private Character lragrupariesgoaseac;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARIESGOASEUAL", nullable = false, length = 30)
    private String lragrupariesgoaseual;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARIESGOASEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupariesgoasefal;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARIESGOASEUMD", nullable = false, length = 30)
    private String lragrupariesgoaseumd;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARIESGOASEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupariesgoasefmd;
    @JoinColumn(name = "LRCATEGORIARIESGOASEID", referencedColumnName = "LRCATEGORIARIESGOASEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcategoriariesgoase lrcategoriariesgoase;

    public Lragrupariesgoase() {
    }

    public Lragrupariesgoase(LragrupariesgoasePK lragrupariesgoasePK) {
        this.lragrupariesgoasePK = lragrupariesgoasePK;
    }

    public Lragrupariesgoase(LragrupariesgoasePK lragrupariesgoasePK, Character lragrupariesgoaseac, String lragrupariesgoaseual, Date lragrupariesgoasefal, String lragrupariesgoaseumd, Date lragrupariesgoasefmd) {
        this.lragrupariesgoasePK = lragrupariesgoasePK;
        this.lragrupariesgoaseac = lragrupariesgoaseac;
        this.lragrupariesgoaseual = lragrupariesgoaseual;
        this.lragrupariesgoasefal = lragrupariesgoasefal;
        this.lragrupariesgoaseumd = lragrupariesgoaseumd;
        this.lragrupariesgoasefmd = lragrupariesgoasefmd;
    }

    public Lragrupariesgoase(long lrcategoriariesgoaseid, short riesgosaseid, short seccid) {
        this.lragrupariesgoasePK = new LragrupariesgoasePK(lrcategoriariesgoaseid, riesgosaseid, seccid);
    }

    public LragrupariesgoasePK getLragrupariesgoasePK() {
        return lragrupariesgoasePK;
    }

    public void setLragrupariesgoasePK(LragrupariesgoasePK lragrupariesgoasePK) {
        this.lragrupariesgoasePK = lragrupariesgoasePK;
    }

    public Character getLragrupariesgoaseac() {
        return lragrupariesgoaseac;
    }

    public void setLragrupariesgoaseac(Character lragrupariesgoaseac) {
        this.lragrupariesgoaseac = lragrupariesgoaseac;
    }

    public String getLragrupariesgoaseual() {
        return lragrupariesgoaseual;
    }

    public void setLragrupariesgoaseual(String lragrupariesgoaseual) {
        this.lragrupariesgoaseual = lragrupariesgoaseual;
    }

    public Date getLragrupariesgoasefal() {
        return lragrupariesgoasefal;
    }

    public void setLragrupariesgoasefal(Date lragrupariesgoasefal) {
        this.lragrupariesgoasefal = lragrupariesgoasefal;
    }

    public String getLragrupariesgoaseumd() {
        return lragrupariesgoaseumd;
    }

    public void setLragrupariesgoaseumd(String lragrupariesgoaseumd) {
        this.lragrupariesgoaseumd = lragrupariesgoaseumd;
    }

    public Date getLragrupariesgoasefmd() {
        return lragrupariesgoasefmd;
    }

    public void setLragrupariesgoasefmd(Date lragrupariesgoasefmd) {
        this.lragrupariesgoasefmd = lragrupariesgoasefmd;
    }

    public Lrcategoriariesgoase getLrcategoriariesgoase() {
        return lrcategoriariesgoase;
    }

    public void setLrcategoriariesgoase(Lrcategoriariesgoase lrcategoriariesgoase) {
        this.lrcategoriariesgoase = lrcategoriariesgoase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragrupariesgoasePK != null ? lragrupariesgoasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupariesgoase)) {
            return false;
        }
        Lragrupariesgoase other = (Lragrupariesgoase) object;
        if ((this.lragrupariesgoasePK == null && other.lragrupariesgoasePK != null) || (this.lragrupariesgoasePK != null && !this.lragrupariesgoasePK.equals(other.lragrupariesgoasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupariesgoase[ lragrupariesgoasePK=" + lragrupariesgoasePK + " ]";
    }
    
}
