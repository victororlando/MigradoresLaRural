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
@Table(name = "LRPRIMAMINCAUCION")
@NamedQueries({
    @NamedQuery(name = "Lrprimamincaucion.findAll", query = "SELECT l FROM Lrprimamincaucion l"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionid", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionid = :lrprimamincaucionid"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionmontocapdesde", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionmontocapdesde = :lrprimamincaucionmontocapdesde"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionmontocaphasta", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionmontocaphasta = :lrprimamincaucionmontocaphasta"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincauciondiasdesde", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincauciondiasdesde = :lrprimamincauciondiasdesde"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincauciondiashasta", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincauciondiashasta = :lrprimamincauciondiashasta"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionmontopremiomi", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionmontopremiomi = :lrprimamincaucionmontopremiomi"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionac", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionac = :lrprimamincaucionac"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionual", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionual = :lrprimamincaucionual"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionfal", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionfal = :lrprimamincaucionfal"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionumd", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionumd = :lrprimamincaucionumd"),
    @NamedQuery(name = "Lrprimamincaucion.findByLrprimamincaucionfmd", query = "SELECT l FROM Lrprimamincaucion l WHERE l.lrprimamincaucionfmd = :lrprimamincaucionfmd")})
public class Lrprimamincaucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONID", nullable = false)
    private Long lrprimamincaucionid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONMONTOCAPDESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimamincaucionmontocapdesde;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONMONTOCAPHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimamincaucionmontocaphasta;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONDIASDESDE", nullable = false)
    private int lrprimamincauciondiasdesde;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONDIASHASTA", nullable = false)
    private int lrprimamincauciondiashasta;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONMONTOPREMIOMI", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimamincaucionmontopremiomi;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONAC", nullable = false)
    private Character lrprimamincaucionac;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONUAL", nullable = false, length = 30)
    private String lrprimamincaucionual;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrprimamincaucionfal;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONUMD", nullable = false, length = 30)
    private String lrprimamincaucionumd;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINCAUCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrprimamincaucionfmd;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrprimamincaucion() {
    }

    public Lrprimamincaucion(Long lrprimamincaucionid) {
        this.lrprimamincaucionid = lrprimamincaucionid;
    }

    public Lrprimamincaucion(Long lrprimamincaucionid, BigDecimal lrprimamincaucionmontocapdesde, BigDecimal lrprimamincaucionmontocaphasta, int lrprimamincauciondiasdesde, int lrprimamincauciondiashasta, BigDecimal lrprimamincaucionmontopremiomi, Character lrprimamincaucionac, String lrprimamincaucionual, Date lrprimamincaucionfal, String lrprimamincaucionumd, Date lrprimamincaucionfmd) {
        this.lrprimamincaucionid = lrprimamincaucionid;
        this.lrprimamincaucionmontocapdesde = lrprimamincaucionmontocapdesde;
        this.lrprimamincaucionmontocaphasta = lrprimamincaucionmontocaphasta;
        this.lrprimamincauciondiasdesde = lrprimamincauciondiasdesde;
        this.lrprimamincauciondiashasta = lrprimamincauciondiashasta;
        this.lrprimamincaucionmontopremiomi = lrprimamincaucionmontopremiomi;
        this.lrprimamincaucionac = lrprimamincaucionac;
        this.lrprimamincaucionual = lrprimamincaucionual;
        this.lrprimamincaucionfal = lrprimamincaucionfal;
        this.lrprimamincaucionumd = lrprimamincaucionumd;
        this.lrprimamincaucionfmd = lrprimamincaucionfmd;
    }

    public Long getLrprimamincaucionid() {
        return lrprimamincaucionid;
    }

    public void setLrprimamincaucionid(Long lrprimamincaucionid) {
        this.lrprimamincaucionid = lrprimamincaucionid;
    }

    public BigDecimal getLrprimamincaucionmontocapdesde() {
        return lrprimamincaucionmontocapdesde;
    }

    public void setLrprimamincaucionmontocapdesde(BigDecimal lrprimamincaucionmontocapdesde) {
        this.lrprimamincaucionmontocapdesde = lrprimamincaucionmontocapdesde;
    }

    public BigDecimal getLrprimamincaucionmontocaphasta() {
        return lrprimamincaucionmontocaphasta;
    }

    public void setLrprimamincaucionmontocaphasta(BigDecimal lrprimamincaucionmontocaphasta) {
        this.lrprimamincaucionmontocaphasta = lrprimamincaucionmontocaphasta;
    }

    public int getLrprimamincauciondiasdesde() {
        return lrprimamincauciondiasdesde;
    }

    public void setLrprimamincauciondiasdesde(int lrprimamincauciondiasdesde) {
        this.lrprimamincauciondiasdesde = lrprimamincauciondiasdesde;
    }

    public int getLrprimamincauciondiashasta() {
        return lrprimamincauciondiashasta;
    }

    public void setLrprimamincauciondiashasta(int lrprimamincauciondiashasta) {
        this.lrprimamincauciondiashasta = lrprimamincauciondiashasta;
    }

    public BigDecimal getLrprimamincaucionmontopremiomi() {
        return lrprimamincaucionmontopremiomi;
    }

    public void setLrprimamincaucionmontopremiomi(BigDecimal lrprimamincaucionmontopremiomi) {
        this.lrprimamincaucionmontopremiomi = lrprimamincaucionmontopremiomi;
    }

    public Character getLrprimamincaucionac() {
        return lrprimamincaucionac;
    }

    public void setLrprimamincaucionac(Character lrprimamincaucionac) {
        this.lrprimamincaucionac = lrprimamincaucionac;
    }

    public String getLrprimamincaucionual() {
        return lrprimamincaucionual;
    }

    public void setLrprimamincaucionual(String lrprimamincaucionual) {
        this.lrprimamincaucionual = lrprimamincaucionual;
    }

    public Date getLrprimamincaucionfal() {
        return lrprimamincaucionfal;
    }

    public void setLrprimamincaucionfal(Date lrprimamincaucionfal) {
        this.lrprimamincaucionfal = lrprimamincaucionfal;
    }

    public String getLrprimamincaucionumd() {
        return lrprimamincaucionumd;
    }

    public void setLrprimamincaucionumd(String lrprimamincaucionumd) {
        this.lrprimamincaucionumd = lrprimamincaucionumd;
    }

    public Date getLrprimamincaucionfmd() {
        return lrprimamincaucionfmd;
    }

    public void setLrprimamincaucionfmd(Date lrprimamincaucionfmd) {
        this.lrprimamincaucionfmd = lrprimamincaucionfmd;
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
        hash += (lrprimamincaucionid != null ? lrprimamincaucionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrprimamincaucion)) {
            return false;
        }
        Lrprimamincaucion other = (Lrprimamincaucion) object;
        if ((this.lrprimamincaucionid == null && other.lrprimamincaucionid != null) || (this.lrprimamincaucionid != null && !this.lrprimamincaucionid.equals(other.lrprimamincaucionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrprimamincaucion[ lrprimamincaucionid=" + lrprimamincaucionid + " ]";
    }
    
}
