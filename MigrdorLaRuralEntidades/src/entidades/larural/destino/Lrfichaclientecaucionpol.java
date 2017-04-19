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
@Table(name = "LRFICHACLIENTECAUCIONPOL")
@NamedQueries({
    @NamedQuery(name = "Lrfichaclientecaucionpol.findAll", query = "SELECT l FROM Lrfichaclientecaucionpol l"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpolid", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpolid = :lrfichaclientecaucionpolid"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpolnro", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpolnro = :lrfichaclientecaucionpolnro"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpolfecha", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpolfecha = :lrfichaclientecaucionpolfecha"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpolsuma", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpolsuma = :lrfichaclientecaucionpolsuma"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpoldesac", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpoldesac = :lrfichaclientecaucionpoldesac"),
    @NamedQuery(name = "Lrfichaclientecaucionpol.findByLrfichaclientecaucionpolseccid", query = "SELECT l FROM Lrfichaclientecaucionpol l WHERE l.lrfichaclientecaucionpolseccid = :lrfichaclientecaucionpolseccid")})
public class Lrfichaclientecaucionpol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLID", nullable = false)
    private Long lrfichaclientecaucionpolid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLNRO", nullable = false)
    private int lrfichaclientecaucionpolnro;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLFECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientecaucionpolfecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLSUMA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclientecaucionpolsuma;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLDESAC", nullable = false)
    private Character lrfichaclientecaucionpoldesac;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTECAUCIONPOLSECCID", nullable = false)
    private long lrfichaclientecaucionpolseccid;
    @JoinColumn(name = "LRFICHACLIENTEID", referencedColumnName = "LRFICHACLIENTEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrfichacliente lrfichaclienteid;

    public Lrfichaclientecaucionpol() {
    }

    public Lrfichaclientecaucionpol(Long lrfichaclientecaucionpolid) {
        this.lrfichaclientecaucionpolid = lrfichaclientecaucionpolid;
    }

    public Lrfichaclientecaucionpol(Long lrfichaclientecaucionpolid, int lrfichaclientecaucionpolnro, Date lrfichaclientecaucionpolfecha, BigDecimal lrfichaclientecaucionpolsuma, Character lrfichaclientecaucionpoldesac, long lrfichaclientecaucionpolseccid) {
        this.lrfichaclientecaucionpolid = lrfichaclientecaucionpolid;
        this.lrfichaclientecaucionpolnro = lrfichaclientecaucionpolnro;
        this.lrfichaclientecaucionpolfecha = lrfichaclientecaucionpolfecha;
        this.lrfichaclientecaucionpolsuma = lrfichaclientecaucionpolsuma;
        this.lrfichaclientecaucionpoldesac = lrfichaclientecaucionpoldesac;
        this.lrfichaclientecaucionpolseccid = lrfichaclientecaucionpolseccid;
    }

    public Long getLrfichaclientecaucionpolid() {
        return lrfichaclientecaucionpolid;
    }

    public void setLrfichaclientecaucionpolid(Long lrfichaclientecaucionpolid) {
        this.lrfichaclientecaucionpolid = lrfichaclientecaucionpolid;
    }

    public int getLrfichaclientecaucionpolnro() {
        return lrfichaclientecaucionpolnro;
    }

    public void setLrfichaclientecaucionpolnro(int lrfichaclientecaucionpolnro) {
        this.lrfichaclientecaucionpolnro = lrfichaclientecaucionpolnro;
    }

    public Date getLrfichaclientecaucionpolfecha() {
        return lrfichaclientecaucionpolfecha;
    }

    public void setLrfichaclientecaucionpolfecha(Date lrfichaclientecaucionpolfecha) {
        this.lrfichaclientecaucionpolfecha = lrfichaclientecaucionpolfecha;
    }

    public BigDecimal getLrfichaclientecaucionpolsuma() {
        return lrfichaclientecaucionpolsuma;
    }

    public void setLrfichaclientecaucionpolsuma(BigDecimal lrfichaclientecaucionpolsuma) {
        this.lrfichaclientecaucionpolsuma = lrfichaclientecaucionpolsuma;
    }

    public Character getLrfichaclientecaucionpoldesac() {
        return lrfichaclientecaucionpoldesac;
    }

    public void setLrfichaclientecaucionpoldesac(Character lrfichaclientecaucionpoldesac) {
        this.lrfichaclientecaucionpoldesac = lrfichaclientecaucionpoldesac;
    }

    public long getLrfichaclientecaucionpolseccid() {
        return lrfichaclientecaucionpolseccid;
    }

    public void setLrfichaclientecaucionpolseccid(long lrfichaclientecaucionpolseccid) {
        this.lrfichaclientecaucionpolseccid = lrfichaclientecaucionpolseccid;
    }

    public Lrfichacliente getLrfichaclienteid() {
        return lrfichaclienteid;
    }

    public void setLrfichaclienteid(Lrfichacliente lrfichaclienteid) {
        this.lrfichaclienteid = lrfichaclienteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrfichaclientecaucionpolid != null ? lrfichaclientecaucionpolid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichaclientecaucionpol)) {
            return false;
        }
        Lrfichaclientecaucionpol other = (Lrfichaclientecaucionpol) object;
        if ((this.lrfichaclientecaucionpolid == null && other.lrfichaclientecaucionpolid != null) || (this.lrfichaclientecaucionpolid != null && !this.lrfichaclientecaucionpolid.equals(other.lrfichaclientecaucionpolid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichaclientecaucionpol[ lrfichaclientecaucionpolid=" + lrfichaclientecaucionpolid + " ]";
    }
    
}
