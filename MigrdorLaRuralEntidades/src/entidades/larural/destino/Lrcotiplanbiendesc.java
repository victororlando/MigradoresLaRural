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
@Table(name = "LRCOTIPLANBIENDESC")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbiendesc.findAll", query = "SELECT l FROM Lrcotiplanbiendesc l"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescid", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescid = :lrcotiplanbiendescid"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescporc", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescporc = :lrcotiplanbiendescporc"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescvalor", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescvalor = :lrcotiplanbiendescvalor"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescual", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescual = :lrcotiplanbiendescual"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescfal", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescfal = :lrcotiplanbiendescfal"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescumd", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescumd = :lrcotiplanbiendescumd"),
    @NamedQuery(name = "Lrcotiplanbiendesc.findByLrcotiplanbiendescfmd", query = "SELECT l FROM Lrcotiplanbiendesc l WHERE l.lrcotiplanbiendescfmd = :lrcotiplanbiendescfmd")})
public class Lrcotiplanbiendesc implements Serializable {
    @JoinColumns({
        @JoinColumn(name = "LRAJUSTEID", referencedColumnName = "LRAJUSTEID", nullable = false),
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrajusteplan lrajusteplan;
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRCOTIPLANBIENDESCID_SEQ_GENERATOR", sequenceName = "LRCOTIPLANBIENDESCID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRCOTIPLANBIENDESCID_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCID", nullable = false)
    private Long lrcotiplanbiendescid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCPORC", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrcotiplanbiendescporc;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendescvalor;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCUAL", nullable = false, length = 30)
    private String lrcotiplanbiendescual;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiendescfal;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCUMD", nullable = false, length = 30)
    private String lrcotiplanbiendescumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiendescfmd;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "SCOTIZACIONVERSION", nullable = false),
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "SCOTIDATBIENASEID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotiplanbien lrcotiplanbien;

    public Lrcotiplanbiendesc() {
    }

    public Lrcotiplanbiendesc(Long lrcotiplanbiendescid) {
        this.lrcotiplanbiendescid = lrcotiplanbiendescid;
    }

    public Lrcotiplanbiendesc(Long lrcotiplanbiendescid, BigDecimal lrcotiplanbiendescporc, BigDecimal lrcotiplanbiendescvalor, String lrcotiplanbiendescual, Date lrcotiplanbiendescfal, String lrcotiplanbiendescumd, Date lrcotiplanbiendescfmd) {
        this.lrcotiplanbiendescid = lrcotiplanbiendescid;
        this.lrcotiplanbiendescporc = lrcotiplanbiendescporc;
        this.lrcotiplanbiendescvalor = lrcotiplanbiendescvalor;
        this.lrcotiplanbiendescual = lrcotiplanbiendescual;
        this.lrcotiplanbiendescfal = lrcotiplanbiendescfal;
        this.lrcotiplanbiendescumd = lrcotiplanbiendescumd;
        this.lrcotiplanbiendescfmd = lrcotiplanbiendescfmd;
    }

    public Long getLrcotiplanbiendescid() {
        return lrcotiplanbiendescid;
    }

    public void setLrcotiplanbiendescid(Long lrcotiplanbiendescid) {
        this.lrcotiplanbiendescid = lrcotiplanbiendescid;
    }

    public BigDecimal getLrcotiplanbiendescporc() {
        return lrcotiplanbiendescporc;
    }

    public void setLrcotiplanbiendescporc(BigDecimal lrcotiplanbiendescporc) {
        this.lrcotiplanbiendescporc = lrcotiplanbiendescporc;
    }

    public BigDecimal getLrcotiplanbiendescvalor() {
        return lrcotiplanbiendescvalor;
    }

    public void setLrcotiplanbiendescvalor(BigDecimal lrcotiplanbiendescvalor) {
        this.lrcotiplanbiendescvalor = lrcotiplanbiendescvalor;
    }

    public String getLrcotiplanbiendescual() {
        return lrcotiplanbiendescual;
    }

    public void setLrcotiplanbiendescual(String lrcotiplanbiendescual) {
        this.lrcotiplanbiendescual = lrcotiplanbiendescual;
    }

    public Date getLrcotiplanbiendescfal() {
        return lrcotiplanbiendescfal;
    }

    public void setLrcotiplanbiendescfal(Date lrcotiplanbiendescfal) {
        this.lrcotiplanbiendescfal = lrcotiplanbiendescfal;
    }

    public String getLrcotiplanbiendescumd() {
        return lrcotiplanbiendescumd;
    }

    public void setLrcotiplanbiendescumd(String lrcotiplanbiendescumd) {
        this.lrcotiplanbiendescumd = lrcotiplanbiendescumd;
    }

    public Date getLrcotiplanbiendescfmd() {
        return lrcotiplanbiendescfmd;
    }

    public void setLrcotiplanbiendescfmd(Date lrcotiplanbiendescfmd) {
        this.lrcotiplanbiendescfmd = lrcotiplanbiendescfmd;
    }

    public Lrcotiplanbien getLrcotiplanbien() {
        return lrcotiplanbien;
    }

    public void setLrcotiplanbien(Lrcotiplanbien lrcotiplanbien) {
        this.lrcotiplanbien = lrcotiplanbien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanbiendescid != null ? lrcotiplanbiendescid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbiendesc)) {
            return false;
        }
        Lrcotiplanbiendesc other = (Lrcotiplanbiendesc) object;
        if ((this.lrcotiplanbiendescid == null && other.lrcotiplanbiendescid != null) || (this.lrcotiplanbiendescid != null && !this.lrcotiplanbiendescid.equals(other.lrcotiplanbiendescid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbiendesc[ lrcotiplanbiendescid=" + lrcotiplanbiendescid + " ]";
    }

    public Lrajusteplan getLrajusteplan() {
        return lrajusteplan;
    }

    public void setLrajusteplan(Lrajusteplan lrajusteplan) {
        this.lrajusteplan = lrajusteplan;
    }

}
