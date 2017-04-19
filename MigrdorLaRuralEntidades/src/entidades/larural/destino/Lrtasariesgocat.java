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
@Table(name = "LRTASARIESGOCAT")
@NamedQueries({
    @NamedQuery(name = "Lrtasariesgocat.findAll", query = "SELECT l FROM Lrtasariesgocat l"),
    @NamedQuery(name = "Lrtasariesgocat.findByRubrosid", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrseccdetalleid", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrcategoriariesgoaseid", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatPK.lrcategoriariesgoaseid = :lrcategoriariesgoaseid"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocattasa", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocattasa = :lrtasariesgocattasa"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocatac", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatac = :lrtasariesgocatac"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocatual", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatual = :lrtasariesgocatual"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocatfal", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatfal = :lrtasariesgocatfal"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocatumd", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatumd = :lrtasariesgocatumd"),
    @NamedQuery(name = "Lrtasariesgocat.findByLrtasariesgocatfmd", query = "SELECT l FROM Lrtasariesgocat l WHERE l.lrtasariesgocatfmd = :lrtasariesgocatfmd")})
public class Lrtasariesgocat implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrtasariesgocatPK lrtasariesgocatPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrtasariesgocattasa;
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATAC", nullable = false)
    private Character lrtasariesgocatac;
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATUAL", nullable = false, length = 30)
    private String lrtasariesgocatual;
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasariesgocatfal;
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATUMD", nullable = false, length = 30)
    private String lrtasariesgocatumd;
    @Basic(optional = false)
    @Column(name = "LRTASARIESGOCATFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasariesgocatfmd;
    @JoinColumn(name = "LRCATEGORIARIESGOASEID", referencedColumnName = "LRCATEGORIARIESGOASEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcategoriariesgoase lrcategoriariesgoase;
    @JoinColumns({
        @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "RUBROSID", referencedColumnName = "RUBROSID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrtasarubroriesgo lrtasarubroriesgo;

    public Lrtasariesgocat() {
    }

    public Lrtasariesgocat(LrtasariesgocatPK lrtasariesgocatPK) {
        this.lrtasariesgocatPK = lrtasariesgocatPK;
    }

    public Lrtasariesgocat(LrtasariesgocatPK lrtasariesgocatPK, BigDecimal lrtasariesgocattasa, Character lrtasariesgocatac, String lrtasariesgocatual, Date lrtasariesgocatfal, String lrtasariesgocatumd, Date lrtasariesgocatfmd) {
        this.lrtasariesgocatPK = lrtasariesgocatPK;
        this.lrtasariesgocattasa = lrtasariesgocattasa;
        this.lrtasariesgocatac = lrtasariesgocatac;
        this.lrtasariesgocatual = lrtasariesgocatual;
        this.lrtasariesgocatfal = lrtasariesgocatfal;
        this.lrtasariesgocatumd = lrtasariesgocatumd;
        this.lrtasariesgocatfmd = lrtasariesgocatfmd;
    }

    public Lrtasariesgocat(long rubrosid, long lrclasificacionriesgoid, long lrseccdetalleid, long lrcategoriariesgoaseid) {
        this.lrtasariesgocatPK = new LrtasariesgocatPK(rubrosid, lrclasificacionriesgoid, lrseccdetalleid, lrcategoriariesgoaseid);
    }

    public LrtasariesgocatPK getLrtasariesgocatPK() {
        return lrtasariesgocatPK;
    }

    public void setLrtasariesgocatPK(LrtasariesgocatPK lrtasariesgocatPK) {
        this.lrtasariesgocatPK = lrtasariesgocatPK;
    }

    public BigDecimal getLrtasariesgocattasa() {
        return lrtasariesgocattasa;
    }

    public void setLrtasariesgocattasa(BigDecimal lrtasariesgocattasa) {
        this.lrtasariesgocattasa = lrtasariesgocattasa;
    }

    public Character getLrtasariesgocatac() {
        return lrtasariesgocatac;
    }

    public void setLrtasariesgocatac(Character lrtasariesgocatac) {
        this.lrtasariesgocatac = lrtasariesgocatac;
    }

    public String getLrtasariesgocatual() {
        return lrtasariesgocatual;
    }

    public void setLrtasariesgocatual(String lrtasariesgocatual) {
        this.lrtasariesgocatual = lrtasariesgocatual;
    }

    public Date getLrtasariesgocatfal() {
        return lrtasariesgocatfal;
    }

    public void setLrtasariesgocatfal(Date lrtasariesgocatfal) {
        this.lrtasariesgocatfal = lrtasariesgocatfal;
    }

    public String getLrtasariesgocatumd() {
        return lrtasariesgocatumd;
    }

    public void setLrtasariesgocatumd(String lrtasariesgocatumd) {
        this.lrtasariesgocatumd = lrtasariesgocatumd;
    }

    public Date getLrtasariesgocatfmd() {
        return lrtasariesgocatfmd;
    }

    public void setLrtasariesgocatfmd(Date lrtasariesgocatfmd) {
        this.lrtasariesgocatfmd = lrtasariesgocatfmd;
    }

    public Lrcategoriariesgoase getLrcategoriariesgoase() {
        return lrcategoriariesgoase;
    }

    public void setLrcategoriariesgoase(Lrcategoriariesgoase lrcategoriariesgoase) {
        this.lrcategoriariesgoase = lrcategoriariesgoase;
    }

    public Lrtasarubroriesgo getLrtasarubroriesgo() {
        return lrtasarubroriesgo;
    }

    public void setLrtasarubroriesgo(Lrtasarubroriesgo lrtasarubroriesgo) {
        this.lrtasarubroriesgo = lrtasarubroriesgo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtasariesgocatPK != null ? lrtasariesgocatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasariesgocat)) {
            return false;
        }
        Lrtasariesgocat other = (Lrtasariesgocat) object;
        if ((this.lrtasariesgocatPK == null && other.lrtasariesgocatPK != null) || (this.lrtasariesgocatPK != null && !this.lrtasariesgocatPK.equals(other.lrtasariesgocatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasariesgocat[ lrtasariesgocatPK=" + lrtasariesgocatPK + " ]";
    }
    
}
