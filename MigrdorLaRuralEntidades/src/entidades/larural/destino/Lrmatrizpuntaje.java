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
@Table(name = "LRMATRIZPUNTAJE")
@NamedQueries({
    @NamedQuery(name = "Lrmatrizpuntaje.findAll", query = "SELECT l FROM Lrmatrizpuntaje l"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrcalificacionriesgoid", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajePK.lrcalificacionriesgoid = :lrcalificacionriesgoid"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajePK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrseccdetalleid", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajePK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajevalor", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajevalor = :lrmatrizpuntajevalor"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajetipovalor", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajetipovalor = :lrmatrizpuntajetipovalor"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajeact", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajeact = :lrmatrizpuntajeact"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajefal", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajefal = :lrmatrizpuntajefal"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajeual", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajeual = :lrmatrizpuntajeual"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajefmd", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajefmd = :lrmatrizpuntajefmd"),
    @NamedQuery(name = "Lrmatrizpuntaje.findByLrmatrizpuntajeumd", query = "SELECT l FROM Lrmatrizpuntaje l WHERE l.lrmatrizpuntajeumd = :lrmatrizpuntajeumd")})
public class Lrmatrizpuntaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrmatrizpuntajePK lrmatrizpuntajePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEVALOR", nullable = false, precision = 17, scale = 4)
    private BigDecimal lrmatrizpuntajevalor;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJETIPOVALOR", nullable = false)
    private Character lrmatrizpuntajetipovalor;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEACT", nullable = false)
    private Character lrmatrizpuntajeact;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmatrizpuntajefal;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEUAL", nullable = false, length = 30)
    private String lrmatrizpuntajeual;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmatrizpuntajefmd;
    @Basic(optional = false)
    @Column(name = "LRMATRIZPUNTAJEUMD", nullable = false, length = 30)
    private String lrmatrizpuntajeumd;
    @JoinColumn(name = "LRCALIFICACIONRIESGOID", referencedColumnName = "LRCALIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcalificacionriesgo lrcalificacionriesgo;
    @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrclasificacionriesgo lrclasificacionriesgo;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;

    public Lrmatrizpuntaje() {
    }

    public Lrmatrizpuntaje(LrmatrizpuntajePK lrmatrizpuntajePK) {
        this.lrmatrizpuntajePK = lrmatrizpuntajePK;
    }

    public Lrmatrizpuntaje(LrmatrizpuntajePK lrmatrizpuntajePK, BigDecimal lrmatrizpuntajevalor, Character lrmatrizpuntajetipovalor, Character lrmatrizpuntajeact, Date lrmatrizpuntajefal, String lrmatrizpuntajeual, Date lrmatrizpuntajefmd, String lrmatrizpuntajeumd) {
        this.lrmatrizpuntajePK = lrmatrizpuntajePK;
        this.lrmatrizpuntajevalor = lrmatrizpuntajevalor;
        this.lrmatrizpuntajetipovalor = lrmatrizpuntajetipovalor;
        this.lrmatrizpuntajeact = lrmatrizpuntajeact;
        this.lrmatrizpuntajefal = lrmatrizpuntajefal;
        this.lrmatrizpuntajeual = lrmatrizpuntajeual;
        this.lrmatrizpuntajefmd = lrmatrizpuntajefmd;
        this.lrmatrizpuntajeumd = lrmatrizpuntajeumd;
    }

    public Lrmatrizpuntaje(long lrcalificacionriesgoid, long lrclasificacionriesgoid, long lrseccdetalleid) {
        this.lrmatrizpuntajePK = new LrmatrizpuntajePK(lrcalificacionriesgoid, lrclasificacionriesgoid, lrseccdetalleid);
    }

    public LrmatrizpuntajePK getLrmatrizpuntajePK() {
        return lrmatrizpuntajePK;
    }

    public void setLrmatrizpuntajePK(LrmatrizpuntajePK lrmatrizpuntajePK) {
        this.lrmatrizpuntajePK = lrmatrizpuntajePK;
    }

    public BigDecimal getLrmatrizpuntajevalor() {
        return lrmatrizpuntajevalor;
    }

    public void setLrmatrizpuntajevalor(BigDecimal lrmatrizpuntajevalor) {
        this.lrmatrizpuntajevalor = lrmatrizpuntajevalor;
    }

    public Character getLrmatrizpuntajetipovalor() {
        return lrmatrizpuntajetipovalor;
    }

    public void setLrmatrizpuntajetipovalor(Character lrmatrizpuntajetipovalor) {
        this.lrmatrizpuntajetipovalor = lrmatrizpuntajetipovalor;
    }

    public Character getLrmatrizpuntajeact() {
        return lrmatrizpuntajeact;
    }

    public void setLrmatrizpuntajeact(Character lrmatrizpuntajeact) {
        this.lrmatrizpuntajeact = lrmatrizpuntajeact;
    }

    public Date getLrmatrizpuntajefal() {
        return lrmatrizpuntajefal;
    }

    public void setLrmatrizpuntajefal(Date lrmatrizpuntajefal) {
        this.lrmatrizpuntajefal = lrmatrizpuntajefal;
    }

    public String getLrmatrizpuntajeual() {
        return lrmatrizpuntajeual;
    }

    public void setLrmatrizpuntajeual(String lrmatrizpuntajeual) {
        this.lrmatrizpuntajeual = lrmatrizpuntajeual;
    }

    public Date getLrmatrizpuntajefmd() {
        return lrmatrizpuntajefmd;
    }

    public void setLrmatrizpuntajefmd(Date lrmatrizpuntajefmd) {
        this.lrmatrizpuntajefmd = lrmatrizpuntajefmd;
    }

    public String getLrmatrizpuntajeumd() {
        return lrmatrizpuntajeumd;
    }

    public void setLrmatrizpuntajeumd(String lrmatrizpuntajeumd) {
        this.lrmatrizpuntajeumd = lrmatrizpuntajeumd;
    }

    public Lrcalificacionriesgo getLrcalificacionriesgo() {
        return lrcalificacionriesgo;
    }

    public void setLrcalificacionriesgo(Lrcalificacionriesgo lrcalificacionriesgo) {
        this.lrcalificacionriesgo = lrcalificacionriesgo;
    }

    public Lrclasificacionriesgo getLrclasificacionriesgo() {
        return lrclasificacionriesgo;
    }

    public void setLrclasificacionriesgo(Lrclasificacionriesgo lrclasificacionriesgo) {
        this.lrclasificacionriesgo = lrclasificacionriesgo;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmatrizpuntajePK != null ? lrmatrizpuntajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmatrizpuntaje)) {
            return false;
        }
        Lrmatrizpuntaje other = (Lrmatrizpuntaje) object;
        if ((this.lrmatrizpuntajePK == null && other.lrmatrizpuntajePK != null) || (this.lrmatrizpuntajePK != null && !this.lrmatrizpuntajePK.equals(other.lrmatrizpuntajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmatrizpuntaje[ lrmatrizpuntajePK=" + lrmatrizpuntajePK + " ]";
    }
    
}
