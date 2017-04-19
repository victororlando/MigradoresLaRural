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
import javax.persistence.Id;
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
@Table(name = "LRCOBERTURAPRINCIPAL")
@NamedQueries({
    @NamedQuery(name = "Lrcoberturaprincipal.findAll", query = "SELECT l FROM Lrcoberturaprincipal l"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalid", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalid = :lrcoberturaprincipalid"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalrespmax", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalrespmax = :lrcoberturaprincipalrespmax"),
    @NamedQuery(name = "Lrcoberturaprincipal.findBySeccid", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByRiesgosaseid", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByCoberturastipid", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.coberturastipid = :coberturastipid"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalac", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalac = :lrcoberturaprincipalac"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalual", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalual = :lrcoberturaprincipalual"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalfal", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalfal = :lrcoberturaprincipalfal"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalumd", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalumd = :lrcoberturaprincipalumd"),
    @NamedQuery(name = "Lrcoberturaprincipal.findByLrcoberturaprincipalfmd", query = "SELECT l FROM Lrcoberturaprincipal l WHERE l.lrcoberturaprincipalfmd = :lrcoberturaprincipalfmd")})
public class Lrcoberturaprincipal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALID", nullable = false)
    private Long lrcoberturaprincipalid;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALRESPMAX", nullable = false)
    private Character lrcoberturaprincipalrespmax;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @Basic(optional = false)
    @Column(name = "COBERTURASTIPID", nullable = false)
    private short coberturastipid;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALAC", nullable = false)
    private Character lrcoberturaprincipalac;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALUAL", nullable = false, length = 30)
    private String lrcoberturaprincipalual;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaprincipalfal;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALUMD", nullable = false, length = 30)
    private String lrcoberturaprincipalumd;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPRINCIPALFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaprincipalfmd;

    public Lrcoberturaprincipal() {
    }

    public Lrcoberturaprincipal(Long lrcoberturaprincipalid) {
        this.lrcoberturaprincipalid = lrcoberturaprincipalid;
    }

    public Lrcoberturaprincipal(Long lrcoberturaprincipalid, Character lrcoberturaprincipalrespmax, short seccid, short riesgosaseid, short coberturastipid, Character lrcoberturaprincipalac, String lrcoberturaprincipalual, Date lrcoberturaprincipalfal, String lrcoberturaprincipalumd, Date lrcoberturaprincipalfmd) {
        this.lrcoberturaprincipalid = lrcoberturaprincipalid;
        this.lrcoberturaprincipalrespmax = lrcoberturaprincipalrespmax;
        this.seccid = seccid;
        this.riesgosaseid = riesgosaseid;
        this.coberturastipid = coberturastipid;
        this.lrcoberturaprincipalac = lrcoberturaprincipalac;
        this.lrcoberturaprincipalual = lrcoberturaprincipalual;
        this.lrcoberturaprincipalfal = lrcoberturaprincipalfal;
        this.lrcoberturaprincipalumd = lrcoberturaprincipalumd;
        this.lrcoberturaprincipalfmd = lrcoberturaprincipalfmd;
    }

    public Long getLrcoberturaprincipalid() {
        return lrcoberturaprincipalid;
    }

    public void setLrcoberturaprincipalid(Long lrcoberturaprincipalid) {
        this.lrcoberturaprincipalid = lrcoberturaprincipalid;
    }

    public Character getLrcoberturaprincipalrespmax() {
        return lrcoberturaprincipalrespmax;
    }

    public void setLrcoberturaprincipalrespmax(Character lrcoberturaprincipalrespmax) {
        this.lrcoberturaprincipalrespmax = lrcoberturaprincipalrespmax;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public short getCoberturastipid() {
        return coberturastipid;
    }

    public void setCoberturastipid(short coberturastipid) {
        this.coberturastipid = coberturastipid;
    }

    public Character getLrcoberturaprincipalac() {
        return lrcoberturaprincipalac;
    }

    public void setLrcoberturaprincipalac(Character lrcoberturaprincipalac) {
        this.lrcoberturaprincipalac = lrcoberturaprincipalac;
    }

    public String getLrcoberturaprincipalual() {
        return lrcoberturaprincipalual;
    }

    public void setLrcoberturaprincipalual(String lrcoberturaprincipalual) {
        this.lrcoberturaprincipalual = lrcoberturaprincipalual;
    }

    public Date getLrcoberturaprincipalfal() {
        return lrcoberturaprincipalfal;
    }

    public void setLrcoberturaprincipalfal(Date lrcoberturaprincipalfal) {
        this.lrcoberturaprincipalfal = lrcoberturaprincipalfal;
    }

    public String getLrcoberturaprincipalumd() {
        return lrcoberturaprincipalumd;
    }

    public void setLrcoberturaprincipalumd(String lrcoberturaprincipalumd) {
        this.lrcoberturaprincipalumd = lrcoberturaprincipalumd;
    }

    public Date getLrcoberturaprincipalfmd() {
        return lrcoberturaprincipalfmd;
    }

    public void setLrcoberturaprincipalfmd(Date lrcoberturaprincipalfmd) {
        this.lrcoberturaprincipalfmd = lrcoberturaprincipalfmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcoberturaprincipalid != null ? lrcoberturaprincipalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcoberturaprincipal)) {
            return false;
        }
        Lrcoberturaprincipal other = (Lrcoberturaprincipal) object;
        if ((this.lrcoberturaprincipalid == null && other.lrcoberturaprincipalid != null) || (this.lrcoberturaprincipalid != null && !this.lrcoberturaprincipalid.equals(other.lrcoberturaprincipalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcoberturaprincipal[ lrcoberturaprincipalid=" + lrcoberturaprincipalid + " ]";
    }
    
}
