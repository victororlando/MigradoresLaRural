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
@Table(name = "LRCOBERTURACLASIF")
@NamedQueries({
    @NamedQuery(name = "Lrcoberturaclasif.findAll", query = "SELECT l FROM Lrcoberturaclasif l"),
    @NamedQuery(name = "Lrcoberturaclasif.findBySeccid", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifPK.seccid = :seccid"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrcoberturaclasif.findByCoberturastipid", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifPK.coberturastipid = :coberturastipid"),
    @NamedQuery(name = "Lrcoberturaclasif.findByRiesgosaseid", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifPK.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasiftasa", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasiftasa = :lrcoberturaclasiftasa"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasifac", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifac = :lrcoberturaclasifac"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasifual", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifual = :lrcoberturaclasifual"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasiffal", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasiffal = :lrcoberturaclasiffal"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasifumd", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasifumd = :lrcoberturaclasifumd"),
    @NamedQuery(name = "Lrcoberturaclasif.findByLrcoberturaclasiffmd", query = "SELECT l FROM Lrcoberturaclasif l WHERE l.lrcoberturaclasiffmd = :lrcoberturaclasiffmd")})
public class Lrcoberturaclasif implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcoberturaclasifPK lrcoberturaclasifPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOBERTURACLASIFTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrcoberturaclasiftasa;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURACLASIFAC", nullable = false)
    private Character lrcoberturaclasifac;
    @Column(name = "LRCOBERTURACLASIFUAL", length = 40)
    private String lrcoberturaclasifual;
    @Column(name = "LRCOBERTURACLASIFFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaclasiffal;
    @Column(name = "LRCOBERTURACLASIFUMD", length = 40)
    private String lrcoberturaclasifumd;
    @Column(name = "LRCOBERTURACLASIFFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaclasiffmd;
    @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrclasificacionriesgo lrclasificacionriesgo;

    public Lrcoberturaclasif() {
    }

    public Lrcoberturaclasif(LrcoberturaclasifPK lrcoberturaclasifPK) {
        this.lrcoberturaclasifPK = lrcoberturaclasifPK;
    }

    public Lrcoberturaclasif(LrcoberturaclasifPK lrcoberturaclasifPK, BigDecimal lrcoberturaclasiftasa, Character lrcoberturaclasifac) {
        this.lrcoberturaclasifPK = lrcoberturaclasifPK;
        this.lrcoberturaclasiftasa = lrcoberturaclasiftasa;
        this.lrcoberturaclasifac = lrcoberturaclasifac;
    }

    public Lrcoberturaclasif(short seccid, long lrclasificacionriesgoid, short coberturastipid, short riesgosaseid) {
        this.lrcoberturaclasifPK = new LrcoberturaclasifPK(seccid, lrclasificacionriesgoid, coberturastipid, riesgosaseid);
    }

    public LrcoberturaclasifPK getLrcoberturaclasifPK() {
        return lrcoberturaclasifPK;
    }

    public void setLrcoberturaclasifPK(LrcoberturaclasifPK lrcoberturaclasifPK) {
        this.lrcoberturaclasifPK = lrcoberturaclasifPK;
    }

    public BigDecimal getLrcoberturaclasiftasa() {
        return lrcoberturaclasiftasa;
    }

    public void setLrcoberturaclasiftasa(BigDecimal lrcoberturaclasiftasa) {
        this.lrcoberturaclasiftasa = lrcoberturaclasiftasa;
    }

    public Character getLrcoberturaclasifac() {
        return lrcoberturaclasifac;
    }

    public void setLrcoberturaclasifac(Character lrcoberturaclasifac) {
        this.lrcoberturaclasifac = lrcoberturaclasifac;
    }

    public String getLrcoberturaclasifual() {
        return lrcoberturaclasifual;
    }

    public void setLrcoberturaclasifual(String lrcoberturaclasifual) {
        this.lrcoberturaclasifual = lrcoberturaclasifual;
    }

    public Date getLrcoberturaclasiffal() {
        return lrcoberturaclasiffal;
    }

    public void setLrcoberturaclasiffal(Date lrcoberturaclasiffal) {
        this.lrcoberturaclasiffal = lrcoberturaclasiffal;
    }

    public String getLrcoberturaclasifumd() {
        return lrcoberturaclasifumd;
    }

    public void setLrcoberturaclasifumd(String lrcoberturaclasifumd) {
        this.lrcoberturaclasifumd = lrcoberturaclasifumd;
    }

    public Date getLrcoberturaclasiffmd() {
        return lrcoberturaclasiffmd;
    }

    public void setLrcoberturaclasiffmd(Date lrcoberturaclasiffmd) {
        this.lrcoberturaclasiffmd = lrcoberturaclasiffmd;
    }

    public Lrclasificacionriesgo getLrclasificacionriesgo() {
        return lrclasificacionriesgo;
    }

    public void setLrclasificacionriesgo(Lrclasificacionriesgo lrclasificacionriesgo) {
        this.lrclasificacionriesgo = lrclasificacionriesgo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcoberturaclasifPK != null ? lrcoberturaclasifPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcoberturaclasif)) {
            return false;
        }
        Lrcoberturaclasif other = (Lrcoberturaclasif) object;
        if ((this.lrcoberturaclasifPK == null && other.lrcoberturaclasifPK != null) || (this.lrcoberturaclasifPK != null && !this.lrcoberturaclasifPK.equals(other.lrcoberturaclasifPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcoberturaclasif[ lrcoberturaclasifPK=" + lrcoberturaclasifPK + " ]";
    }
    
}
