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
@Table(name = "LREXCEPCIONITEM")
@NamedQueries({
    @NamedQuery(name = "Lrexcepcionitem.findAll", query = "SELECT l FROM Lrexcepcionitem l"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemid", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemid = :lrexcepcionitemid"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrtasamodalidadid", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrtasamodalidadid = :lrtasamodalidadid"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemtasa", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemtasa = :lrexcepcionitemtasa"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemimpmax", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemimpmax = :lrexcepcionitemimpmax"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemac", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemac = :lrexcepcionitemac"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemual", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemual = :lrexcepcionitemual"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemfal", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemfal = :lrexcepcionitemfal"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemumd", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemumd = :lrexcepcionitemumd"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemfmd", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemfmd = :lrexcepcionitemfmd"),
    @NamedQuery(name = "Lrexcepcionitem.findByLrexcepcionitemriesgaseid", query = "SELECT l FROM Lrexcepcionitem l WHERE l.lrexcepcionitemriesgaseid = :lrexcepcionitemriesgaseid")})
public class Lrexcepcionitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMID", nullable = false)
    private Long lrexcepcionitemid;
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADID", nullable = false)
    private long lrtasamodalidadid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrexcepcionitemtasa;
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMIMPMAX", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrexcepcionitemimpmax;
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMAC", nullable = false)
    private Character lrexcepcionitemac;
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMUAL", nullable = false, length = 30)
    private String lrexcepcionitemual;
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexcepcionitemfal;
    @Column(name = "LREXCEPCIONITEMUMD", length = 30)
    private String lrexcepcionitemumd;
    @Column(name = "LREXCEPCIONITEMFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexcepcionitemfmd;
    @Basic(optional = false)
    @Column(name = "LREXCEPCIONITEMRIESGASEID", nullable = false)
    private short lrexcepcionitemriesgaseid;

    public Lrexcepcionitem() {
    }

    public Lrexcepcionitem(Long lrexcepcionitemid) {
        this.lrexcepcionitemid = lrexcepcionitemid;
    }

    public Lrexcepcionitem(Long lrexcepcionitemid, long lrtasamodalidadid, BigDecimal lrexcepcionitemtasa, BigDecimal lrexcepcionitemimpmax, Character lrexcepcionitemac, String lrexcepcionitemual, Date lrexcepcionitemfal, short lrexcepcionitemriesgaseid) {
        this.lrexcepcionitemid = lrexcepcionitemid;
        this.lrtasamodalidadid = lrtasamodalidadid;
        this.lrexcepcionitemtasa = lrexcepcionitemtasa;
        this.lrexcepcionitemimpmax = lrexcepcionitemimpmax;
        this.lrexcepcionitemac = lrexcepcionitemac;
        this.lrexcepcionitemual = lrexcepcionitemual;
        this.lrexcepcionitemfal = lrexcepcionitemfal;
        this.lrexcepcionitemriesgaseid = lrexcepcionitemriesgaseid;
    }

    public Long getLrexcepcionitemid() {
        return lrexcepcionitemid;
    }

    public void setLrexcepcionitemid(Long lrexcepcionitemid) {
        this.lrexcepcionitemid = lrexcepcionitemid;
    }

    public long getLrtasamodalidadid() {
        return lrtasamodalidadid;
    }

    public void setLrtasamodalidadid(long lrtasamodalidadid) {
        this.lrtasamodalidadid = lrtasamodalidadid;
    }

    public BigDecimal getLrexcepcionitemtasa() {
        return lrexcepcionitemtasa;
    }

    public void setLrexcepcionitemtasa(BigDecimal lrexcepcionitemtasa) {
        this.lrexcepcionitemtasa = lrexcepcionitemtasa;
    }

    public BigDecimal getLrexcepcionitemimpmax() {
        return lrexcepcionitemimpmax;
    }

    public void setLrexcepcionitemimpmax(BigDecimal lrexcepcionitemimpmax) {
        this.lrexcepcionitemimpmax = lrexcepcionitemimpmax;
    }

    public Character getLrexcepcionitemac() {
        return lrexcepcionitemac;
    }

    public void setLrexcepcionitemac(Character lrexcepcionitemac) {
        this.lrexcepcionitemac = lrexcepcionitemac;
    }

    public String getLrexcepcionitemual() {
        return lrexcepcionitemual;
    }

    public void setLrexcepcionitemual(String lrexcepcionitemual) {
        this.lrexcepcionitemual = lrexcepcionitemual;
    }

    public Date getLrexcepcionitemfal() {
        return lrexcepcionitemfal;
    }

    public void setLrexcepcionitemfal(Date lrexcepcionitemfal) {
        this.lrexcepcionitemfal = lrexcepcionitemfal;
    }

    public String getLrexcepcionitemumd() {
        return lrexcepcionitemumd;
    }

    public void setLrexcepcionitemumd(String lrexcepcionitemumd) {
        this.lrexcepcionitemumd = lrexcepcionitemumd;
    }

    public Date getLrexcepcionitemfmd() {
        return lrexcepcionitemfmd;
    }

    public void setLrexcepcionitemfmd(Date lrexcepcionitemfmd) {
        this.lrexcepcionitemfmd = lrexcepcionitemfmd;
    }

    public short getLrexcepcionitemriesgaseid() {
        return lrexcepcionitemriesgaseid;
    }

    public void setLrexcepcionitemriesgaseid(short lrexcepcionitemriesgaseid) {
        this.lrexcepcionitemriesgaseid = lrexcepcionitemriesgaseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrexcepcionitemid != null ? lrexcepcionitemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrexcepcionitem)) {
            return false;
        }
        Lrexcepcionitem other = (Lrexcepcionitem) object;
        if ((this.lrexcepcionitemid == null && other.lrexcepcionitemid != null) || (this.lrexcepcionitemid != null && !this.lrexcepcionitemid.equals(other.lrexcepcionitemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrexcepcionitem[ lrexcepcionitemid=" + lrexcepcionitemid + " ]";
    }
    
}
