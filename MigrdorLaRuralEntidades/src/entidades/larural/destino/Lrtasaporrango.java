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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRTASAPORRANGO")
@NamedQueries({
    @NamedQuery(name = "Lrtasaporrango.findAll", query = "SELECT l FROM Lrtasaporrango l"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangoid", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangoid = :lrtasaporrangoid"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangotasamin", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangotasamin = :lrtasaporrangotasamin"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangotasamax", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangotasamax = :lrtasaporrangotasamax"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangoac", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangoac = :lrtasaporrangoac"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangoual", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangoual = :lrtasaporrangoual"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangofal", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangofal = :lrtasaporrangofal"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangoumd", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangoumd = :lrtasaporrangoumd"),
    @NamedQuery(name = "Lrtasaporrango.findByLrtasaporrangofmd", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrtasaporrangofmd = :lrtasaporrangofmd"),
    @NamedQuery(name = "Lrtasaporrango.findByLrsecciondesc", query = "SELECT l FROM Lrtasaporrango l WHERE l.lrsecciondesc = :lrsecciondesc")})
public class Lrtasaporrango implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOID", nullable = false)
    private Long lrtasaporrangoid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOTASAMIN", nullable = false, precision = 8, scale = 2)
    private BigDecimal lrtasaporrangotasamin;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOTASAMAX", nullable = false, precision = 8, scale = 2)
    private BigDecimal lrtasaporrangotasamax;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOAC", nullable = false)
    private Character lrtasaporrangoac;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOUAL", nullable = false, length = 40)
    private String lrtasaporrangoual;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasaporrangofal;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOUMD", nullable = false, length = 40)
    private String lrtasaporrangoumd;
    @Basic(optional = false)
    @Column(name = "LRTASAPORRANGOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasaporrangofmd;
    @Basic(optional = false)
    @Column(name = "LRSECCIONDESC", nullable = false, length = 40)
    private String lrsecciondesc;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrtasaporrango() {
    }

    public Lrtasaporrango(Long lrtasaporrangoid) {
        this.lrtasaporrangoid = lrtasaporrangoid;
    }

    public Lrtasaporrango(Long lrtasaporrangoid, BigDecimal lrtasaporrangotasamin, BigDecimal lrtasaporrangotasamax, Character lrtasaporrangoac, String lrtasaporrangoual, Date lrtasaporrangofal, String lrtasaporrangoumd, Date lrtasaporrangofmd, String lrsecciondesc) {
        this.lrtasaporrangoid = lrtasaporrangoid;
        this.lrtasaporrangotasamin = lrtasaporrangotasamin;
        this.lrtasaporrangotasamax = lrtasaporrangotasamax;
        this.lrtasaporrangoac = lrtasaporrangoac;
        this.lrtasaporrangoual = lrtasaporrangoual;
        this.lrtasaporrangofal = lrtasaporrangofal;
        this.lrtasaporrangoumd = lrtasaporrangoumd;
        this.lrtasaporrangofmd = lrtasaporrangofmd;
        this.lrsecciondesc = lrsecciondesc;
    }

    public Long getLrtasaporrangoid() {
        return lrtasaporrangoid;
    }

    public void setLrtasaporrangoid(Long lrtasaporrangoid) {
        this.lrtasaporrangoid = lrtasaporrangoid;
    }

    public BigDecimal getLrtasaporrangotasamin() {
        return lrtasaporrangotasamin;
    }

    public void setLrtasaporrangotasamin(BigDecimal lrtasaporrangotasamin) {
        this.lrtasaporrangotasamin = lrtasaporrangotasamin;
    }

    public BigDecimal getLrtasaporrangotasamax() {
        return lrtasaporrangotasamax;
    }

    public void setLrtasaporrangotasamax(BigDecimal lrtasaporrangotasamax) {
        this.lrtasaporrangotasamax = lrtasaporrangotasamax;
    }

    public Character getLrtasaporrangoac() {
        return lrtasaporrangoac;
    }

    public void setLrtasaporrangoac(Character lrtasaporrangoac) {
        this.lrtasaporrangoac = lrtasaporrangoac;
    }

    public String getLrtasaporrangoual() {
        return lrtasaporrangoual;
    }

    public void setLrtasaporrangoual(String lrtasaporrangoual) {
        this.lrtasaporrangoual = lrtasaporrangoual;
    }

    public Date getLrtasaporrangofal() {
        return lrtasaporrangofal;
    }

    public void setLrtasaporrangofal(Date lrtasaporrangofal) {
        this.lrtasaporrangofal = lrtasaporrangofal;
    }

    public String getLrtasaporrangoumd() {
        return lrtasaporrangoumd;
    }

    public void setLrtasaporrangoumd(String lrtasaporrangoumd) {
        this.lrtasaporrangoumd = lrtasaporrangoumd;
    }

    public Date getLrtasaporrangofmd() {
        return lrtasaporrangofmd;
    }

    public void setLrtasaporrangofmd(Date lrtasaporrangofmd) {
        this.lrtasaporrangofmd = lrtasaporrangofmd;
    }

    public String getLrsecciondesc() {
        return lrsecciondesc;
    }

    public void setLrsecciondesc(String lrsecciondesc) {
        this.lrsecciondesc = lrsecciondesc;
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
        hash += (lrtasaporrangoid != null ? lrtasaporrangoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasaporrango)) {
            return false;
        }
        Lrtasaporrango other = (Lrtasaporrango) object;
        if ((this.lrtasaporrangoid == null && other.lrtasaporrangoid != null) || (this.lrtasaporrangoid != null && !this.lrtasaporrangoid.equals(other.lrtasaporrangoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasaporrango[ lrtasaporrangoid=" + lrtasaporrangoid + " ]";
    }
    
}
