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
@Table(name = "LREXCEPVINC")
@NamedQueries({
    @NamedQuery(name = "Lrexcepvinc.findAll", query = "SELECT l FROM Lrexcepvinc l"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincid", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincid = :lrexcepvincid"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincpordesc", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincpordesc = :lrexcepvincpordesc"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvinchab", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvinchab = :lrexcepvinchab"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincfal", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincfal = :lrexcepvincfal"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincual", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincual = :lrexcepvincual"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincfmd", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincfmd = :lrexcepvincfmd"),
    @NamedQuery(name = "Lrexcepvinc.findByLrexcepvincumd", query = "SELECT l FROM Lrexcepvinc l WHERE l.lrexcepvincumd = :lrexcepvincumd")})
public class Lrexcepvinc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCID", nullable = false)
    private Long lrexcepvincid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCPORDESC", nullable = false, precision = 6, scale = 2)
    private BigDecimal lrexcepvincpordesc;
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCHAB", nullable = false)
    private Character lrexcepvinchab;
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexcepvincfal;
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCUAL", nullable = false, length = 40)
    private String lrexcepvincual;
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexcepvincfmd;
    @Basic(optional = false)
    @Column(name = "LREXCEPVINCUMD", nullable = false, length = 40)
    private String lrexcepvincumd;

    public Lrexcepvinc() {
    }

    public Lrexcepvinc(Long lrexcepvincid) {
        this.lrexcepvincid = lrexcepvincid;
    }

    public Lrexcepvinc(Long lrexcepvincid, BigDecimal lrexcepvincpordesc, Character lrexcepvinchab, Date lrexcepvincfal, String lrexcepvincual, Date lrexcepvincfmd, String lrexcepvincumd) {
        this.lrexcepvincid = lrexcepvincid;
        this.lrexcepvincpordesc = lrexcepvincpordesc;
        this.lrexcepvinchab = lrexcepvinchab;
        this.lrexcepvincfal = lrexcepvincfal;
        this.lrexcepvincual = lrexcepvincual;
        this.lrexcepvincfmd = lrexcepvincfmd;
        this.lrexcepvincumd = lrexcepvincumd;
    }

    public Long getLrexcepvincid() {
        return lrexcepvincid;
    }

    public void setLrexcepvincid(Long lrexcepvincid) {
        this.lrexcepvincid = lrexcepvincid;
    }

    public BigDecimal getLrexcepvincpordesc() {
        return lrexcepvincpordesc;
    }

    public void setLrexcepvincpordesc(BigDecimal lrexcepvincpordesc) {
        this.lrexcepvincpordesc = lrexcepvincpordesc;
    }

    public Character getLrexcepvinchab() {
        return lrexcepvinchab;
    }

    public void setLrexcepvinchab(Character lrexcepvinchab) {
        this.lrexcepvinchab = lrexcepvinchab;
    }

    public Date getLrexcepvincfal() {
        return lrexcepvincfal;
    }

    public void setLrexcepvincfal(Date lrexcepvincfal) {
        this.lrexcepvincfal = lrexcepvincfal;
    }

    public String getLrexcepvincual() {
        return lrexcepvincual;
    }

    public void setLrexcepvincual(String lrexcepvincual) {
        this.lrexcepvincual = lrexcepvincual;
    }

    public Date getLrexcepvincfmd() {
        return lrexcepvincfmd;
    }

    public void setLrexcepvincfmd(Date lrexcepvincfmd) {
        this.lrexcepvincfmd = lrexcepvincfmd;
    }

    public String getLrexcepvincumd() {
        return lrexcepvincumd;
    }

    public void setLrexcepvincumd(String lrexcepvincumd) {
        this.lrexcepvincumd = lrexcepvincumd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrexcepvincid != null ? lrexcepvincid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrexcepvinc)) {
            return false;
        }
        Lrexcepvinc other = (Lrexcepvinc) object;
        if ((this.lrexcepvincid == null && other.lrexcepvincid != null) || (this.lrexcepvincid != null && !this.lrexcepvincid.equals(other.lrexcepvincid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrexcepvinc[ lrexcepvincid=" + lrexcepvincid + " ]";
    }
    
}
