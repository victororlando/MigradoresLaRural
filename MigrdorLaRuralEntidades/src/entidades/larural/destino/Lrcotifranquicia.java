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
@Table(name = "LRCOTIFRANQUICIA")
@NamedQueries({
    @NamedQuery(name = "Lrcotifranquicia.findAll", query = "SELECT l FROM Lrcotifranquicia l"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciaid", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciaid = :lrcotifranquiciaid"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciaimpmin", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciaimpmin = :lrcotifranquiciaimpmin"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciavalor", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciavalor = :lrcotifranquiciavalor"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciaporc", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciaporc = :lrcotifranquiciaporc"),
    @NamedQuery(name = "Lrcotifranquicia.findBySeccid", query = "SELECT l FROM Lrcotifranquicia l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrcotifranquicia.findBySecctipofranquiciaid", query = "SELECT l FROM Lrcotifranquicia l WHERE l.secctipofranquiciaid = :secctipofranquiciaid"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciaual", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciaual = :lrcotifranquiciaual"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciafal", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciafal = :lrcotifranquiciafal"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciaumd", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciaumd = :lrcotifranquiciaumd"),
    @NamedQuery(name = "Lrcotifranquicia.findByLrcotifranquiciafmd", query = "SELECT l FROM Lrcotifranquicia l WHERE l.lrcotifranquiciafmd = :lrcotifranquiciafmd")})
public class Lrcotifranquicia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAID", nullable = false)
    private Long lrcotifranquiciaid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAIMPMIN", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotifranquiciaimpmin;
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotifranquiciavalor;
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAPORC", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrcotifranquiciaporc;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "SECCTIPOFRANQUICIAID", nullable = false)
    private short secctipofranquiciaid;
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAUAL", nullable = false, length = 30)
    private String lrcotifranquiciaual;
    @Basic(optional = false)
    @Column(name = "LRCOTIFRANQUICIAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotifranquiciafal;
    @Column(name = "LRCOTIFRANQUICIAUMD", length = 30)
    private String lrcotifranquiciaumd;
    @Column(name = "LRCOTIFRANQUICIAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotifranquiciafmd;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacionplan lrcotizacionplan;

    public Lrcotifranquicia() {
    }

    public Lrcotifranquicia(Long lrcotifranquiciaid) {
        this.lrcotifranquiciaid = lrcotifranquiciaid;
    }

    public Lrcotifranquicia(Long lrcotifranquiciaid, BigDecimal lrcotifranquiciaimpmin, BigDecimal lrcotifranquiciavalor, BigDecimal lrcotifranquiciaporc, short seccid, short secctipofranquiciaid, String lrcotifranquiciaual, Date lrcotifranquiciafal) {
        this.lrcotifranquiciaid = lrcotifranquiciaid;
        this.lrcotifranquiciaimpmin = lrcotifranquiciaimpmin;
        this.lrcotifranquiciavalor = lrcotifranquiciavalor;
        this.lrcotifranquiciaporc = lrcotifranquiciaporc;
        this.seccid = seccid;
        this.secctipofranquiciaid = secctipofranquiciaid;
        this.lrcotifranquiciaual = lrcotifranquiciaual;
        this.lrcotifranquiciafal = lrcotifranquiciafal;
    }

    public Long getLrcotifranquiciaid() {
        return lrcotifranquiciaid;
    }

    public void setLrcotifranquiciaid(Long lrcotifranquiciaid) {
        this.lrcotifranquiciaid = lrcotifranquiciaid;
    }

    public BigDecimal getLrcotifranquiciaimpmin() {
        return lrcotifranquiciaimpmin;
    }

    public void setLrcotifranquiciaimpmin(BigDecimal lrcotifranquiciaimpmin) {
        this.lrcotifranquiciaimpmin = lrcotifranquiciaimpmin;
    }

    public BigDecimal getLrcotifranquiciavalor() {
        return lrcotifranquiciavalor;
    }

    public void setLrcotifranquiciavalor(BigDecimal lrcotifranquiciavalor) {
        this.lrcotifranquiciavalor = lrcotifranquiciavalor;
    }

    public BigDecimal getLrcotifranquiciaporc() {
        return lrcotifranquiciaporc;
    }

    public void setLrcotifranquiciaporc(BigDecimal lrcotifranquiciaporc) {
        this.lrcotifranquiciaporc = lrcotifranquiciaporc;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public short getSecctipofranquiciaid() {
        return secctipofranquiciaid;
    }

    public void setSecctipofranquiciaid(short secctipofranquiciaid) {
        this.secctipofranquiciaid = secctipofranquiciaid;
    }

    public String getLrcotifranquiciaual() {
        return lrcotifranquiciaual;
    }

    public void setLrcotifranquiciaual(String lrcotifranquiciaual) {
        this.lrcotifranquiciaual = lrcotifranquiciaual;
    }

    public Date getLrcotifranquiciafal() {
        return lrcotifranquiciafal;
    }

    public void setLrcotifranquiciafal(Date lrcotifranquiciafal) {
        this.lrcotifranquiciafal = lrcotifranquiciafal;
    }

    public String getLrcotifranquiciaumd() {
        return lrcotifranquiciaumd;
    }

    public void setLrcotifranquiciaumd(String lrcotifranquiciaumd) {
        this.lrcotifranquiciaumd = lrcotifranquiciaumd;
    }

    public Date getLrcotifranquiciafmd() {
        return lrcotifranquiciafmd;
    }

    public void setLrcotifranquiciafmd(Date lrcotifranquiciafmd) {
        this.lrcotifranquiciafmd = lrcotifranquiciafmd;
    }

    public Lrcotizacionplan getLrcotizacionplan() {
        return lrcotizacionplan;
    }

    public void setLrcotizacionplan(Lrcotizacionplan lrcotizacionplan) {
        this.lrcotizacionplan = lrcotizacionplan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotifranquiciaid != null ? lrcotifranquiciaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotifranquicia)) {
            return false;
        }
        Lrcotifranquicia other = (Lrcotifranquicia) object;
        if ((this.lrcotifranquiciaid == null && other.lrcotifranquiciaid != null) || (this.lrcotifranquiciaid != null && !this.lrcotifranquiciaid.equals(other.lrcotifranquiciaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotifranquicia[ lrcotifranquiciaid=" + lrcotifranquiciaid + " ]";
    }
    
}
