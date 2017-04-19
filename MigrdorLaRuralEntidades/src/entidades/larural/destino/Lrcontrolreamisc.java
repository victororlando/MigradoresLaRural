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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCONTROLREAMISC", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRCONTROLREAMISCMONID", "LRCONTROLREAMISCCOMREACOAID", "LRCONTROLREAMISCCATEGORIAID"})})
@NamedQueries({
    @NamedQuery(name = "Lrcontrolreamisc.findAll", query = "SELECT l FROM Lrcontrolreamisc l"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscid", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscid = :lrcontrolreamiscid"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscimp", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscimp = :lrcontrolreamiscimp"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscac", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscac = :lrcontrolreamiscac"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscual", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscual = :lrcontrolreamiscual"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscfal", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscfal = :lrcontrolreamiscfal"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscumd", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscumd = :lrcontrolreamiscumd"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscfmd", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscfmd = :lrcontrolreamiscfmd"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamisccategoriaid", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamisccategoriaid = :lrcontrolreamisccategoriaid"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamisccomreacoaid", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamisccomreacoaid = :lrcontrolreamisccomreacoaid"),
    @NamedQuery(name = "Lrcontrolreamisc.findByLrcontrolreamiscmonid", query = "SELECT l FROM Lrcontrolreamisc l WHERE l.lrcontrolreamiscmonid = :lrcontrolreamiscmonid")})
public class Lrcontrolreamisc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCID", nullable = false)
    private Long lrcontrolreamiscid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCIMP", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcontrolreamiscimp;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCAC", nullable = false)
    private Character lrcontrolreamiscac;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCUAL", nullable = false, length = 30)
    private String lrcontrolreamiscual;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontrolreamiscfal;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCUMD", nullable = false, length = 30)
    private String lrcontrolreamiscumd;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontrolreamiscfmd;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCCATEGORIAID", nullable = false)
    private long lrcontrolreamisccategoriaid;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCCOMREACOAID", nullable = false)
    private long lrcontrolreamisccomreacoaid;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREAMISCMONID", nullable = false)
    private long lrcontrolreamiscmonid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrcontrolreamisc() {
    }

    public Lrcontrolreamisc(Long lrcontrolreamiscid) {
        this.lrcontrolreamiscid = lrcontrolreamiscid;
    }

    public Lrcontrolreamisc(Long lrcontrolreamiscid, BigDecimal lrcontrolreamiscimp, Character lrcontrolreamiscac, String lrcontrolreamiscual, Date lrcontrolreamiscfal, String lrcontrolreamiscumd, Date lrcontrolreamiscfmd, long lrcontrolreamisccategoriaid, long lrcontrolreamisccomreacoaid, long lrcontrolreamiscmonid) {
        this.lrcontrolreamiscid = lrcontrolreamiscid;
        this.lrcontrolreamiscimp = lrcontrolreamiscimp;
        this.lrcontrolreamiscac = lrcontrolreamiscac;
        this.lrcontrolreamiscual = lrcontrolreamiscual;
        this.lrcontrolreamiscfal = lrcontrolreamiscfal;
        this.lrcontrolreamiscumd = lrcontrolreamiscumd;
        this.lrcontrolreamiscfmd = lrcontrolreamiscfmd;
        this.lrcontrolreamisccategoriaid = lrcontrolreamisccategoriaid;
        this.lrcontrolreamisccomreacoaid = lrcontrolreamisccomreacoaid;
        this.lrcontrolreamiscmonid = lrcontrolreamiscmonid;
    }

    public Long getLrcontrolreamiscid() {
        return lrcontrolreamiscid;
    }

    public void setLrcontrolreamiscid(Long lrcontrolreamiscid) {
        this.lrcontrolreamiscid = lrcontrolreamiscid;
    }

    public BigDecimal getLrcontrolreamiscimp() {
        return lrcontrolreamiscimp;
    }

    public void setLrcontrolreamiscimp(BigDecimal lrcontrolreamiscimp) {
        this.lrcontrolreamiscimp = lrcontrolreamiscimp;
    }

    public Character getLrcontrolreamiscac() {
        return lrcontrolreamiscac;
    }

    public void setLrcontrolreamiscac(Character lrcontrolreamiscac) {
        this.lrcontrolreamiscac = lrcontrolreamiscac;
    }

    public String getLrcontrolreamiscual() {
        return lrcontrolreamiscual;
    }

    public void setLrcontrolreamiscual(String lrcontrolreamiscual) {
        this.lrcontrolreamiscual = lrcontrolreamiscual;
    }

    public Date getLrcontrolreamiscfal() {
        return lrcontrolreamiscfal;
    }

    public void setLrcontrolreamiscfal(Date lrcontrolreamiscfal) {
        this.lrcontrolreamiscfal = lrcontrolreamiscfal;
    }

    public String getLrcontrolreamiscumd() {
        return lrcontrolreamiscumd;
    }

    public void setLrcontrolreamiscumd(String lrcontrolreamiscumd) {
        this.lrcontrolreamiscumd = lrcontrolreamiscumd;
    }

    public Date getLrcontrolreamiscfmd() {
        return lrcontrolreamiscfmd;
    }

    public void setLrcontrolreamiscfmd(Date lrcontrolreamiscfmd) {
        this.lrcontrolreamiscfmd = lrcontrolreamiscfmd;
    }

    public long getLrcontrolreamisccategoriaid() {
        return lrcontrolreamisccategoriaid;
    }

    public void setLrcontrolreamisccategoriaid(long lrcontrolreamisccategoriaid) {
        this.lrcontrolreamisccategoriaid = lrcontrolreamisccategoriaid;
    }

    public long getLrcontrolreamisccomreacoaid() {
        return lrcontrolreamisccomreacoaid;
    }

    public void setLrcontrolreamisccomreacoaid(long lrcontrolreamisccomreacoaid) {
        this.lrcontrolreamisccomreacoaid = lrcontrolreamisccomreacoaid;
    }

    public long getLrcontrolreamiscmonid() {
        return lrcontrolreamiscmonid;
    }

    public void setLrcontrolreamiscmonid(long lrcontrolreamiscmonid) {
        this.lrcontrolreamiscmonid = lrcontrolreamiscmonid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcontrolreamiscid != null ? lrcontrolreamiscid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcontrolreamisc)) {
            return false;
        }
        Lrcontrolreamisc other = (Lrcontrolreamisc) object;
        if ((this.lrcontrolreamiscid == null && other.lrcontrolreamiscid != null) || (this.lrcontrolreamiscid != null && !this.lrcontrolreamiscid.equals(other.lrcontrolreamiscid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcontrolreamisc[ lrcontrolreamiscid=" + lrcontrolreamiscid + " ]";
    }
    
}
