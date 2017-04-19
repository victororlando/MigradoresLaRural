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
@Table(name = "LRTASAMODALIDAD")
@NamedQueries({
    @NamedQuery(name = "Lrtasamodalidad.findAll", query = "SELECT l FROM Lrtasamodalidad l"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadid", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadid = :lrtasamodalidadid"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadtasa", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadtasa = :lrtasamodalidadtasa"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadual", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadual = :lrtasamodalidadual"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadfal", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadfal = :lrtasamodalidadfal"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadumd", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadumd = :lrtasamodalidadumd"),
    @NamedQuery(name = "Lrtasamodalidad.findByLrtasamodalidadfmd", query = "SELECT l FROM Lrtasamodalidad l WHERE l.lrtasamodalidadfmd = :lrtasamodalidadfmd")})
public class Lrtasamodalidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADID", nullable = false)
    private Long lrtasamodalidadid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrtasamodalidadtasa;
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADUAL", nullable = false, length = 30)
    private String lrtasamodalidadual;
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasamodalidadfal;
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADUMD", nullable = false, length = 30)
    private String lrtasamodalidadumd;
    @Basic(optional = false)
    @Column(name = "LRTASAMODALIDADFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasamodalidadfmd;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrtasamodalidad() {
    }

    public Lrtasamodalidad(Long lrtasamodalidadid) {
        this.lrtasamodalidadid = lrtasamodalidadid;
    }

    public Lrtasamodalidad(Long lrtasamodalidadid, BigDecimal lrtasamodalidadtasa, String lrtasamodalidadual, Date lrtasamodalidadfal, String lrtasamodalidadumd, Date lrtasamodalidadfmd) {
        this.lrtasamodalidadid = lrtasamodalidadid;
        this.lrtasamodalidadtasa = lrtasamodalidadtasa;
        this.lrtasamodalidadual = lrtasamodalidadual;
        this.lrtasamodalidadfal = lrtasamodalidadfal;
        this.lrtasamodalidadumd = lrtasamodalidadumd;
        this.lrtasamodalidadfmd = lrtasamodalidadfmd;
    }

    public Long getLrtasamodalidadid() {
        return lrtasamodalidadid;
    }

    public void setLrtasamodalidadid(Long lrtasamodalidadid) {
        this.lrtasamodalidadid = lrtasamodalidadid;
    }

    public BigDecimal getLrtasamodalidadtasa() {
        return lrtasamodalidadtasa;
    }

    public void setLrtasamodalidadtasa(BigDecimal lrtasamodalidadtasa) {
        this.lrtasamodalidadtasa = lrtasamodalidadtasa;
    }

    public String getLrtasamodalidadual() {
        return lrtasamodalidadual;
    }

    public void setLrtasamodalidadual(String lrtasamodalidadual) {
        this.lrtasamodalidadual = lrtasamodalidadual;
    }

    public Date getLrtasamodalidadfal() {
        return lrtasamodalidadfal;
    }

    public void setLrtasamodalidadfal(Date lrtasamodalidadfal) {
        this.lrtasamodalidadfal = lrtasamodalidadfal;
    }

    public String getLrtasamodalidadumd() {
        return lrtasamodalidadumd;
    }

    public void setLrtasamodalidadumd(String lrtasamodalidadumd) {
        this.lrtasamodalidadumd = lrtasamodalidadumd;
    }

    public Date getLrtasamodalidadfmd() {
        return lrtasamodalidadfmd;
    }

    public void setLrtasamodalidadfmd(Date lrtasamodalidadfmd) {
        this.lrtasamodalidadfmd = lrtasamodalidadfmd;
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
        hash += (lrtasamodalidadid != null ? lrtasamodalidadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasamodalidad)) {
            return false;
        }
        Lrtasamodalidad other = (Lrtasamodalidad) object;
        if ((this.lrtasamodalidadid == null && other.lrtasamodalidadid != null) || (this.lrtasamodalidadid != null && !this.lrtasamodalidadid.equals(other.lrtasamodalidadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasamodalidad[ lrtasamodalidadid=" + lrtasamodalidadid + " ]";
    }
    
}
