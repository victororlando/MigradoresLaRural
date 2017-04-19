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
@Table(name = "LRCLASIFICAINSPECCION")
@NamedQueries({
    @NamedQuery(name = "Lrclasificainspeccion.findAll", query = "SELECT l FROM Lrclasificainspeccion l"),
    @NamedQuery(name = "Lrclasificainspeccion.findByRubrosid", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrseccdetalleid", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLragrupaformularioid", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionPK.lragrupaformularioid = :lragrupaformularioid"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionimdesde", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionimdesde = :lrclasificainspeccionimdesde"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionimhasta", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionimhasta = :lrclasificainspeccionimhasta"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionac", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionac = :lrclasificainspeccionac"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionual", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionual = :lrclasificainspeccionual"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionfal", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionfal = :lrclasificainspeccionfal"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionumd", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionumd = :lrclasificainspeccionumd"),
    @NamedQuery(name = "Lrclasificainspeccion.findByLrclasificainspeccionfmd", query = "SELECT l FROM Lrclasificainspeccion l WHERE l.lrclasificainspeccionfmd = :lrclasificainspeccionfmd")})
public class Lrclasificainspeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrclasificainspeccionPK lrclasificainspeccionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCLASIFICAINSPECCIONIMDESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrclasificainspeccionimdesde;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICAINSPECCIONIMHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrclasificainspeccionimhasta;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICAINSPECCIONAC", nullable = false)
    private Character lrclasificainspeccionac;
    @Column(name = "LRCLASIFICAINSPECCIONUAL", length = 30)
    private String lrclasificainspeccionual;
    @Column(name = "LRCLASIFICAINSPECCIONFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificainspeccionfal;
    @Column(name = "LRCLASIFICAINSPECCIONUMD", length = 30)
    private String lrclasificainspeccionumd;
    @Column(name = "LRCLASIFICAINSPECCIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificainspeccionfmd;
    @JoinColumn(name = "LRAGRUPAFORMULARIOID", referencedColumnName = "LRAGRUPAFORMULARIOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lragrupaformulario lragrupaformulario;
    @JoinColumns({
        @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "RUBROSID", referencedColumnName = "RUBROSID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrtasarubroriesgo lrtasarubroriesgo;

    public Lrclasificainspeccion() {
    }

    public Lrclasificainspeccion(LrclasificainspeccionPK lrclasificainspeccionPK) {
        this.lrclasificainspeccionPK = lrclasificainspeccionPK;
    }

    public Lrclasificainspeccion(LrclasificainspeccionPK lrclasificainspeccionPK, BigDecimal lrclasificainspeccionimdesde, BigDecimal lrclasificainspeccionimhasta, Character lrclasificainspeccionac) {
        this.lrclasificainspeccionPK = lrclasificainspeccionPK;
        this.lrclasificainspeccionimdesde = lrclasificainspeccionimdesde;
        this.lrclasificainspeccionimhasta = lrclasificainspeccionimhasta;
        this.lrclasificainspeccionac = lrclasificainspeccionac;
    }

    public Lrclasificainspeccion(long rubrosid, long lrclasificacionriesgoid, long lrseccdetalleid, long lragrupaformularioid) {
        this.lrclasificainspeccionPK = new LrclasificainspeccionPK(rubrosid, lrclasificacionriesgoid, lrseccdetalleid, lragrupaformularioid);
    }

    public LrclasificainspeccionPK getLrclasificainspeccionPK() {
        return lrclasificainspeccionPK;
    }

    public void setLrclasificainspeccionPK(LrclasificainspeccionPK lrclasificainspeccionPK) {
        this.lrclasificainspeccionPK = lrclasificainspeccionPK;
    }

    public BigDecimal getLrclasificainspeccionimdesde() {
        return lrclasificainspeccionimdesde;
    }

    public void setLrclasificainspeccionimdesde(BigDecimal lrclasificainspeccionimdesde) {
        this.lrclasificainspeccionimdesde = lrclasificainspeccionimdesde;
    }

    public BigDecimal getLrclasificainspeccionimhasta() {
        return lrclasificainspeccionimhasta;
    }

    public void setLrclasificainspeccionimhasta(BigDecimal lrclasificainspeccionimhasta) {
        this.lrclasificainspeccionimhasta = lrclasificainspeccionimhasta;
    }

    public Character getLrclasificainspeccionac() {
        return lrclasificainspeccionac;
    }

    public void setLrclasificainspeccionac(Character lrclasificainspeccionac) {
        this.lrclasificainspeccionac = lrclasificainspeccionac;
    }

    public String getLrclasificainspeccionual() {
        return lrclasificainspeccionual;
    }

    public void setLrclasificainspeccionual(String lrclasificainspeccionual) {
        this.lrclasificainspeccionual = lrclasificainspeccionual;
    }

    public Date getLrclasificainspeccionfal() {
        return lrclasificainspeccionfal;
    }

    public void setLrclasificainspeccionfal(Date lrclasificainspeccionfal) {
        this.lrclasificainspeccionfal = lrclasificainspeccionfal;
    }

    public String getLrclasificainspeccionumd() {
        return lrclasificainspeccionumd;
    }

    public void setLrclasificainspeccionumd(String lrclasificainspeccionumd) {
        this.lrclasificainspeccionumd = lrclasificainspeccionumd;
    }

    public Date getLrclasificainspeccionfmd() {
        return lrclasificainspeccionfmd;
    }

    public void setLrclasificainspeccionfmd(Date lrclasificainspeccionfmd) {
        this.lrclasificainspeccionfmd = lrclasificainspeccionfmd;
    }

    public Lragrupaformulario getLragrupaformulario() {
        return lragrupaformulario;
    }

    public void setLragrupaformulario(Lragrupaformulario lragrupaformulario) {
        this.lragrupaformulario = lragrupaformulario;
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
        hash += (lrclasificainspeccionPK != null ? lrclasificainspeccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrclasificainspeccion)) {
            return false;
        }
        Lrclasificainspeccion other = (Lrclasificainspeccion) object;
        if ((this.lrclasificainspeccionPK == null && other.lrclasificainspeccionPK != null) || (this.lrclasificainspeccionPK != null && !this.lrclasificainspeccionPK.equals(other.lrclasificainspeccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrclasificainspeccion[ lrclasificainspeccionPK=" + lrclasificainspeccionPK + " ]";
    }
    
}
