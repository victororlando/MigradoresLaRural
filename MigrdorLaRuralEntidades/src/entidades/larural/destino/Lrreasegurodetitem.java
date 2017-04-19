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
@Table(name = "LRREASEGURODETITEM")
@NamedQueries({
    @NamedQuery(name = "Lrreasegurodetitem.findAll", query = "SELECT l FROM Lrreasegurodetitem l"),
    @NamedQuery(name = "Lrreasegurodetitem.findByRiesgosaseid", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemPK.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetid", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemPK.lrreasegurodetid = :lrreasegurodetid"),
    @NamedQuery(name = "Lrreasegurodetitem.findBySeccid", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemsumase", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemsumase = :lrreasegurodetitemsumase"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemporc", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemporc = :lrreasegurodetitemporc"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemimporte", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemimporte = :lrreasegurodetitemimporte"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemual", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemual = :lrreasegurodetitemual"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemfal", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemfal = :lrreasegurodetitemfal"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemumd", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemumd = :lrreasegurodetitemumd"),
    @NamedQuery(name = "Lrreasegurodetitem.findByLrreasegurodetitemfmd", query = "SELECT l FROM Lrreasegurodetitem l WHERE l.lrreasegurodetitemfmd = :lrreasegurodetitemfmd")})
public class Lrreasegurodetitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrreasegurodetitemPK lrreasegurodetitemPK;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMSUMASE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetitemsumase;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMPORC", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetitemporc;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMIMPORTE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetitemimporte;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMUAL", nullable = false, length = 30)
    private String lrreasegurodetitemual;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurodetitemfal;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMUMD", nullable = false, length = 30)
    private String lrreasegurodetitemumd;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETITEMFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurodetitemfmd;
    @JoinColumn(name = "LRREASEGURODETID", referencedColumnName = "LRREASEGURODETID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrreasegurodet lrreasegurodet;

    public Lrreasegurodetitem() {
    }

    public Lrreasegurodetitem(LrreasegurodetitemPK lrreasegurodetitemPK) {
        this.lrreasegurodetitemPK = lrreasegurodetitemPK;
    }

    public Lrreasegurodetitem(LrreasegurodetitemPK lrreasegurodetitemPK, short seccid, BigDecimal lrreasegurodetitemsumase, BigDecimal lrreasegurodetitemporc, BigDecimal lrreasegurodetitemimporte, String lrreasegurodetitemual, Date lrreasegurodetitemfal, String lrreasegurodetitemumd, Date lrreasegurodetitemfmd) {
        this.lrreasegurodetitemPK = lrreasegurodetitemPK;
        this.seccid = seccid;
        this.lrreasegurodetitemsumase = lrreasegurodetitemsumase;
        this.lrreasegurodetitemporc = lrreasegurodetitemporc;
        this.lrreasegurodetitemimporte = lrreasegurodetitemimporte;
        this.lrreasegurodetitemual = lrreasegurodetitemual;
        this.lrreasegurodetitemfal = lrreasegurodetitemfal;
        this.lrreasegurodetitemumd = lrreasegurodetitemumd;
        this.lrreasegurodetitemfmd = lrreasegurodetitemfmd;
    }

    public Lrreasegurodetitem(short riesgosaseid, long lrreasegurodetid) {
        this.lrreasegurodetitemPK = new LrreasegurodetitemPK(riesgosaseid, lrreasegurodetid);
    }

    public LrreasegurodetitemPK getLrreasegurodetitemPK() {
        return lrreasegurodetitemPK;
    }

    public void setLrreasegurodetitemPK(LrreasegurodetitemPK lrreasegurodetitemPK) {
        this.lrreasegurodetitemPK = lrreasegurodetitemPK;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public BigDecimal getLrreasegurodetitemsumase() {
        return lrreasegurodetitemsumase;
    }

    public void setLrreasegurodetitemsumase(BigDecimal lrreasegurodetitemsumase) {
        this.lrreasegurodetitemsumase = lrreasegurodetitemsumase;
    }

    public BigDecimal getLrreasegurodetitemporc() {
        return lrreasegurodetitemporc;
    }

    public void setLrreasegurodetitemporc(BigDecimal lrreasegurodetitemporc) {
        this.lrreasegurodetitemporc = lrreasegurodetitemporc;
    }

    public BigDecimal getLrreasegurodetitemimporte() {
        return lrreasegurodetitemimporte;
    }

    public void setLrreasegurodetitemimporte(BigDecimal lrreasegurodetitemimporte) {
        this.lrreasegurodetitemimporte = lrreasegurodetitemimporte;
    }

    public String getLrreasegurodetitemual() {
        return lrreasegurodetitemual;
    }

    public void setLrreasegurodetitemual(String lrreasegurodetitemual) {
        this.lrreasegurodetitemual = lrreasegurodetitemual;
    }

    public Date getLrreasegurodetitemfal() {
        return lrreasegurodetitemfal;
    }

    public void setLrreasegurodetitemfal(Date lrreasegurodetitemfal) {
        this.lrreasegurodetitemfal = lrreasegurodetitemfal;
    }

    public String getLrreasegurodetitemumd() {
        return lrreasegurodetitemumd;
    }

    public void setLrreasegurodetitemumd(String lrreasegurodetitemumd) {
        this.lrreasegurodetitemumd = lrreasegurodetitemumd;
    }

    public Date getLrreasegurodetitemfmd() {
        return lrreasegurodetitemfmd;
    }

    public void setLrreasegurodetitemfmd(Date lrreasegurodetitemfmd) {
        this.lrreasegurodetitemfmd = lrreasegurodetitemfmd;
    }

    public Lrreasegurodet getLrreasegurodet() {
        return lrreasegurodet;
    }

    public void setLrreasegurodet(Lrreasegurodet lrreasegurodet) {
        this.lrreasegurodet = lrreasegurodet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrreasegurodetitemPK != null ? lrreasegurodetitemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrreasegurodetitem)) {
            return false;
        }
        Lrreasegurodetitem other = (Lrreasegurodetitem) object;
        if ((this.lrreasegurodetitemPK == null && other.lrreasegurodetitemPK != null) || (this.lrreasegurodetitemPK != null && !this.lrreasegurodetitemPK.equals(other.lrreasegurodetitemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrreasegurodetitem[ lrreasegurodetitemPK=" + lrreasegurodetitemPK + " ]";
    }
    
}
