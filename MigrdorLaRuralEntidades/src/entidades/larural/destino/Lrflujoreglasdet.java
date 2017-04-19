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
@Table(name = "LRFLUJOREGLASDET")
@NamedQueries({
    @NamedQuery(name = "Lrflujoreglasdet.findAll", query = "SELECT l FROM Lrflujoreglasdet l"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasid", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetPK.lrflujoreglasid = :lrflujoreglasid"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrseccdetalleid", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetid", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetPK.lrflujoreglasdetid = :lrflujoreglasdetid"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetformula", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetformula = :lrflujoreglasdetformula"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetac", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetac = :lrflujoreglasdetac"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetual", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetual = :lrflujoreglasdetual"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetfal", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetfal = :lrflujoreglasdetfal"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetumd", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetumd = :lrflujoreglasdetumd"),
    @NamedQuery(name = "Lrflujoreglasdet.findByLrflujoreglasdetfmd", query = "SELECT l FROM Lrflujoreglasdet l WHERE l.lrflujoreglasdetfmd = :lrflujoreglasdetfmd")})
public class Lrflujoreglasdet implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrflujoreglasdetPK lrflujoreglasdetPK;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASDETFORMULA", nullable = false, length = 4000)
    private String lrflujoreglasdetformula;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASDETAC", nullable = false)
    private Character lrflujoreglasdetac;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASDETUAL", nullable = false, length = 30)
    private String lrflujoreglasdetual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASDETFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoreglasdetfal;
    @Column(name = "LRFLUJOREGLASDETUMD", length = 30)
    private String lrflujoreglasdetumd;
    @Column(name = "LRFLUJOREGLASDETFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoreglasdetfmd;
    @JoinColumns({
        @JoinColumn(name = "LRFLUJOREGLASID", referencedColumnName = "LRFLUJOREGLASID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrflujoreglas lrflujoreglas;

    public Lrflujoreglasdet() {
    }

    public Lrflujoreglasdet(LrflujoreglasdetPK lrflujoreglasdetPK) {
        this.lrflujoreglasdetPK = lrflujoreglasdetPK;
    }

    public Lrflujoreglasdet(LrflujoreglasdetPK lrflujoreglasdetPK, String lrflujoreglasdetformula, Character lrflujoreglasdetac, String lrflujoreglasdetual, Date lrflujoreglasdetfal) {
        this.lrflujoreglasdetPK = lrflujoreglasdetPK;
        this.lrflujoreglasdetformula = lrflujoreglasdetformula;
        this.lrflujoreglasdetac = lrflujoreglasdetac;
        this.lrflujoreglasdetual = lrflujoreglasdetual;
        this.lrflujoreglasdetfal = lrflujoreglasdetfal;
    }

    public Lrflujoreglasdet(long lrflujoreglasid, long lrseccdetalleid, long lrflujoreglasdetid) {
        this.lrflujoreglasdetPK = new LrflujoreglasdetPK(lrflujoreglasid, lrseccdetalleid, lrflujoreglasdetid);
    }

    public LrflujoreglasdetPK getLrflujoreglasdetPK() {
        return lrflujoreglasdetPK;
    }

    public void setLrflujoreglasdetPK(LrflujoreglasdetPK lrflujoreglasdetPK) {
        this.lrflujoreglasdetPK = lrflujoreglasdetPK;
    }

    public String getLrflujoreglasdetformula() {
        return lrflujoreglasdetformula;
    }

    public void setLrflujoreglasdetformula(String lrflujoreglasdetformula) {
        this.lrflujoreglasdetformula = lrflujoreglasdetformula;
    }

    public Character getLrflujoreglasdetac() {
        return lrflujoreglasdetac;
    }

    public void setLrflujoreglasdetac(Character lrflujoreglasdetac) {
        this.lrflujoreglasdetac = lrflujoreglasdetac;
    }

    public String getLrflujoreglasdetual() {
        return lrflujoreglasdetual;
    }

    public void setLrflujoreglasdetual(String lrflujoreglasdetual) {
        this.lrflujoreglasdetual = lrflujoreglasdetual;
    }

    public Date getLrflujoreglasdetfal() {
        return lrflujoreglasdetfal;
    }

    public void setLrflujoreglasdetfal(Date lrflujoreglasdetfal) {
        this.lrflujoreglasdetfal = lrflujoreglasdetfal;
    }

    public String getLrflujoreglasdetumd() {
        return lrflujoreglasdetumd;
    }

    public void setLrflujoreglasdetumd(String lrflujoreglasdetumd) {
        this.lrflujoreglasdetumd = lrflujoreglasdetumd;
    }

    public Date getLrflujoreglasdetfmd() {
        return lrflujoreglasdetfmd;
    }

    public void setLrflujoreglasdetfmd(Date lrflujoreglasdetfmd) {
        this.lrflujoreglasdetfmd = lrflujoreglasdetfmd;
    }

    public Lrflujoreglas getLrflujoreglas() {
        return lrflujoreglas;
    }

    public void setLrflujoreglas(Lrflujoreglas lrflujoreglas) {
        this.lrflujoreglas = lrflujoreglas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujoreglasdetPK != null ? lrflujoreglasdetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujoreglasdet)) {
            return false;
        }
        Lrflujoreglasdet other = (Lrflujoreglasdet) object;
        if ((this.lrflujoreglasdetPK == null && other.lrflujoreglasdetPK != null) || (this.lrflujoreglasdetPK != null && !this.lrflujoreglasdetPK.equals(other.lrflujoreglasdetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujoreglasdet[ lrflujoreglasdetPK=" + lrflujoreglasdetPK + " ]";
    }
    
}
