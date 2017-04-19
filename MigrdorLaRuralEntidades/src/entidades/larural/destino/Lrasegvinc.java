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
@Table(name = "LRASEGVINC")
@NamedQueries({
    @NamedQuery(name = "Lrasegvinc.findAll", query = "SELECT l FROM Lrasegvinc l"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincid", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincPK.lrasegvincid = :lrasegvincid"),
    @NamedQuery(name = "Lrasegvinc.findByLrpersonaid", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincPK.lrpersonaid = :lrpersonaid"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincdesc", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincdesc = :lrasegvincdesc"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvinchab", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvinchab = :lrasegvinchab"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincfal", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincfal = :lrasegvincfal"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincual", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincual = :lrasegvincual"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincfmd", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincfmd = :lrasegvincfmd"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincumd", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincumd = :lrasegvincumd"),
    @NamedQuery(name = "Lrasegvinc.findByLrasegvincporcdesc", query = "SELECT l FROM Lrasegvinc l WHERE l.lrasegvincporcdesc = :lrasegvincporcdesc"),
    @NamedQuery(name = "Lrasegvinc.findByLrtiposvincdesc", query = "SELECT l FROM Lrasegvinc l WHERE l.lrtiposvincdesc = :lrtiposvincdesc")})
public class Lrasegvinc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrasegvincPK lrasegvincPK;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCDESC", nullable = false, length = 65)
    private String lrasegvincdesc;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCHAB", nullable = false)
    private Character lrasegvinchab;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrasegvincfal;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCUAL", nullable = false, length = 30)
    private String lrasegvincual;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrasegvincfmd;
    @Basic(optional = false)
    @Column(name = "LRASEGVINCUMD", nullable = false, length = 30)
    private String lrasegvincumd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LRASEGVINCPORCDESC", precision = 17, scale = 2)
    private BigDecimal lrasegvincporcdesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCDESC", nullable = false, length = 40)
    private String lrtiposvincdesc;
    @JoinColumn(name = "LRPERSONAID", referencedColumnName = "LRPERSONAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrpersona lrpersona;
    @JoinColumn(name = "SPERSONAIDVINC", referencedColumnName = "LRPERSONAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpersona spersonaidvinc;
    @JoinColumn(name = "LRTIPOSVINCID", referencedColumnName = "LRTIPOSVINCID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtiposvinc lrtiposvincid;

    public Lrasegvinc() {
    }

    public Lrasegvinc(LrasegvincPK lrasegvincPK) {
        this.lrasegvincPK = lrasegvincPK;
    }

    public Lrasegvinc(LrasegvincPK lrasegvincPK, String lrasegvincdesc, Character lrasegvinchab, Date lrasegvincfal, String lrasegvincual, Date lrasegvincfmd, String lrasegvincumd, String lrtiposvincdesc) {
        this.lrasegvincPK = lrasegvincPK;
        this.lrasegvincdesc = lrasegvincdesc;
        this.lrasegvinchab = lrasegvinchab;
        this.lrasegvincfal = lrasegvincfal;
        this.lrasegvincual = lrasegvincual;
        this.lrasegvincfmd = lrasegvincfmd;
        this.lrasegvincumd = lrasegvincumd;
        this.lrtiposvincdesc = lrtiposvincdesc;
    }

    public Lrasegvinc(long lrasegvincid, long lrpersonaid) {
        this.lrasegvincPK = new LrasegvincPK(lrasegvincid, lrpersonaid);
    }

    public LrasegvincPK getLrasegvincPK() {
        return lrasegvincPK;
    }

    public void setLrasegvincPK(LrasegvincPK lrasegvincPK) {
        this.lrasegvincPK = lrasegvincPK;
    }

    public String getLrasegvincdesc() {
        return lrasegvincdesc;
    }

    public void setLrasegvincdesc(String lrasegvincdesc) {
        this.lrasegvincdesc = lrasegvincdesc;
    }

    public Character getLrasegvinchab() {
        return lrasegvinchab;
    }

    public void setLrasegvinchab(Character lrasegvinchab) {
        this.lrasegvinchab = lrasegvinchab;
    }

    public Date getLrasegvincfal() {
        return lrasegvincfal;
    }

    public void setLrasegvincfal(Date lrasegvincfal) {
        this.lrasegvincfal = lrasegvincfal;
    }

    public String getLrasegvincual() {
        return lrasegvincual;
    }

    public void setLrasegvincual(String lrasegvincual) {
        this.lrasegvincual = lrasegvincual;
    }

    public Date getLrasegvincfmd() {
        return lrasegvincfmd;
    }

    public void setLrasegvincfmd(Date lrasegvincfmd) {
        this.lrasegvincfmd = lrasegvincfmd;
    }

    public String getLrasegvincumd() {
        return lrasegvincumd;
    }

    public void setLrasegvincumd(String lrasegvincumd) {
        this.lrasegvincumd = lrasegvincumd;
    }

    public BigDecimal getLrasegvincporcdesc() {
        return lrasegvincporcdesc;
    }

    public void setLrasegvincporcdesc(BigDecimal lrasegvincporcdesc) {
        this.lrasegvincporcdesc = lrasegvincporcdesc;
    }

    public String getLrtiposvincdesc() {
        return lrtiposvincdesc;
    }

    public void setLrtiposvincdesc(String lrtiposvincdesc) {
        this.lrtiposvincdesc = lrtiposvincdesc;
    }

    public Lrpersona getLrpersona() {
        return lrpersona;
    }

    public void setLrpersona(Lrpersona lrpersona) {
        this.lrpersona = lrpersona;
    }

    public Lrpersona getSpersonaidvinc() {
        return spersonaidvinc;
    }

    public void setSpersonaidvinc(Lrpersona spersonaidvinc) {
        this.spersonaidvinc = spersonaidvinc;
    }

    public Lrtiposvinc getLrtiposvincid() {
        return lrtiposvincid;
    }

    public void setLrtiposvincid(Lrtiposvinc lrtiposvincid) {
        this.lrtiposvincid = lrtiposvincid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrasegvincPK != null ? lrasegvincPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrasegvinc)) {
            return false;
        }
        Lrasegvinc other = (Lrasegvinc) object;
        if ((this.lrasegvincPK == null && other.lrasegvincPK != null) || (this.lrasegvincPK != null && !this.lrasegvincPK.equals(other.lrasegvincPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrasegvinc[ lrasegvincPK=" + lrasegvincPK + " ]";
    }
    
}
