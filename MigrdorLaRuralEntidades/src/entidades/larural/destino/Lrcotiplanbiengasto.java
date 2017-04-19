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
@Table(name = "LRCOTIPLANBIENGASTO")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbiengasto.findAll", query = "SELECT l FROM Lrcotiplanbiengasto l"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastoid", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastoid = :lrcotiplanbiengastoid"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastotiposervid", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastotiposervid = :lrcotiplanbiengastotiposervid"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastotiposervdes", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastotiposervdes = :lrcotiplanbiengastotiposervdes"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastoprovid", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastoprovid = :lrcotiplanbiengastoprovid"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastovalor", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastovalor = :lrcotiplanbiengastovalor"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastoporc", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastoporc = :lrcotiplanbiengastoporc"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastoual", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastoual = :lrcotiplanbiengastoual"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastofal", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastofal = :lrcotiplanbiengastofal"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastoumd", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastoumd = :lrcotiplanbiengastoumd"),
    @NamedQuery(name = "Lrcotiplanbiengasto.findByLrcotiplanbiengastofmd", query = "SELECT l FROM Lrcotiplanbiengasto l WHERE l.lrcotiplanbiengastofmd = :lrcotiplanbiengastofmd")})
public class Lrcotiplanbiengasto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRCOTIPLANBIENGASTOID_SEQ_GENERATOR", sequenceName = "LRCOTIPLANBIENGASTOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRCOTIPLANBIENGASTOID_SEQ_GENERATOR")

    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOID", nullable = false)
    private Long lrcotiplanbiengastoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOTIPOSERVID", nullable = false)
    private long lrcotiplanbiengastotiposervid;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOTIPOSERVDES", nullable = false, length = 100)
    private String lrcotiplanbiengastotiposervdes;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOPROVID", nullable = false)
    private long lrcotiplanbiengastoprovid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LRCOTIPLANBIENGASTOVALOR", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiengastovalor;
    @Column(name = "LRCOTIPLANBIENGASTOPORC", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiengastoporc;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOUAL", nullable = false, length = 30)
    private String lrcotiplanbiengastoual;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiengastofal;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOUMD", nullable = false, length = 30)
    private String lrcotiplanbiengastoumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGASTOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiengastofmd;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "SCOTIZACIONVERSION", nullable = false),
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "SCOTIDATBIENASEID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotiplanbien lrcotiplanbien;

    public Lrcotiplanbiengasto() {
    }

    public Lrcotiplanbiengasto(Long lrcotiplanbiengastoid) {
        this.lrcotiplanbiengastoid = lrcotiplanbiengastoid;
    }

    public Lrcotiplanbiengasto(Long lrcotiplanbiengastoid, long lrcotiplanbiengastotiposervid, String lrcotiplanbiengastotiposervdes, long lrcotiplanbiengastoprovid, String lrcotiplanbiengastoual, Date lrcotiplanbiengastofal, String lrcotiplanbiengastoumd, Date lrcotiplanbiengastofmd) {
        this.lrcotiplanbiengastoid = lrcotiplanbiengastoid;
        this.lrcotiplanbiengastotiposervid = lrcotiplanbiengastotiposervid;
        this.lrcotiplanbiengastotiposervdes = lrcotiplanbiengastotiposervdes;
        this.lrcotiplanbiengastoprovid = lrcotiplanbiengastoprovid;
        this.lrcotiplanbiengastoual = lrcotiplanbiengastoual;
        this.lrcotiplanbiengastofal = lrcotiplanbiengastofal;
        this.lrcotiplanbiengastoumd = lrcotiplanbiengastoumd;
        this.lrcotiplanbiengastofmd = lrcotiplanbiengastofmd;
    }

    public Long getLrcotiplanbiengastoid() {
        return lrcotiplanbiengastoid;
    }

    public void setLrcotiplanbiengastoid(Long lrcotiplanbiengastoid) {
        this.lrcotiplanbiengastoid = lrcotiplanbiengastoid;
    }

    public long getLrcotiplanbiengastotiposervid() {
        return lrcotiplanbiengastotiposervid;
    }

    public void setLrcotiplanbiengastotiposervid(long lrcotiplanbiengastotiposervid) {
        this.lrcotiplanbiengastotiposervid = lrcotiplanbiengastotiposervid;
    }

    public String getLrcotiplanbiengastotiposervdes() {
        return lrcotiplanbiengastotiposervdes;
    }

    public void setLrcotiplanbiengastotiposervdes(String lrcotiplanbiengastotiposervdes) {
        this.lrcotiplanbiengastotiposervdes = lrcotiplanbiengastotiposervdes;
    }

    public long getLrcotiplanbiengastoprovid() {
        return lrcotiplanbiengastoprovid;
    }

    public void setLrcotiplanbiengastoprovid(long lrcotiplanbiengastoprovid) {
        this.lrcotiplanbiengastoprovid = lrcotiplanbiengastoprovid;
    }

    public BigDecimal getLrcotiplanbiengastovalor() {
        return lrcotiplanbiengastovalor;
    }

    public void setLrcotiplanbiengastovalor(BigDecimal lrcotiplanbiengastovalor) {
        this.lrcotiplanbiengastovalor = lrcotiplanbiengastovalor;
    }

    public BigDecimal getLrcotiplanbiengastoporc() {
        return lrcotiplanbiengastoporc;
    }

    public void setLrcotiplanbiengastoporc(BigDecimal lrcotiplanbiengastoporc) {
        this.lrcotiplanbiengastoporc = lrcotiplanbiengastoporc;
    }

    public String getLrcotiplanbiengastoual() {
        return lrcotiplanbiengastoual;
    }

    public void setLrcotiplanbiengastoual(String lrcotiplanbiengastoual) {
        this.lrcotiplanbiengastoual = lrcotiplanbiengastoual;
    }

    public Date getLrcotiplanbiengastofal() {
        return lrcotiplanbiengastofal;
    }

    public void setLrcotiplanbiengastofal(Date lrcotiplanbiengastofal) {
        this.lrcotiplanbiengastofal = lrcotiplanbiengastofal;
    }

    public String getLrcotiplanbiengastoumd() {
        return lrcotiplanbiengastoumd;
    }

    public void setLrcotiplanbiengastoumd(String lrcotiplanbiengastoumd) {
        this.lrcotiplanbiengastoumd = lrcotiplanbiengastoumd;
    }

    public Date getLrcotiplanbiengastofmd() {
        return lrcotiplanbiengastofmd;
    }

    public void setLrcotiplanbiengastofmd(Date lrcotiplanbiengastofmd) {
        this.lrcotiplanbiengastofmd = lrcotiplanbiengastofmd;
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
        hash += (lrcotiplanbiengastoid != null ? lrcotiplanbiengastoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbiengasto)) {
            return false;
        }
        Lrcotiplanbiengasto other = (Lrcotiplanbiengasto) object;
        if ((this.lrcotiplanbiengastoid == null && other.lrcotiplanbiengastoid != null) || (this.lrcotiplanbiengastoid != null && !this.lrcotiplanbiengastoid.equals(other.lrcotiplanbiengastoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbiengasto[ lrcotiplanbiengastoid=" + lrcotiplanbiengastoid + " ]";
    }

}
