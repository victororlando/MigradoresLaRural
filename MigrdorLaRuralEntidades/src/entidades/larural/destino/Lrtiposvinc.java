/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRTIPOSVINC")
@NamedQueries({
    @NamedQuery(name = "Lrtiposvinc.findAll", query = "SELECT l FROM Lrtiposvinc l"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincid", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincid = :lrtiposvincid"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincdesc", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincdesc = :lrtiposvincdesc"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvinchab", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvinchab = :lrtiposvinchab"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincfal", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincfal = :lrtiposvincfal"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincual", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincual = :lrtiposvincual"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincfmd", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincfmd = :lrtiposvincfmd"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincumd", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincumd = :lrtiposvincumd"),
    @NamedQuery(name = "Lrtiposvinc.findByLrtiposvincporcdesc", query = "SELECT l FROM Lrtiposvinc l WHERE l.lrtiposvincporcdesc = :lrtiposvincporcdesc")})
public class Lrtiposvinc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCID", nullable = false)
    private Long lrtiposvincid;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCDESC", nullable = false, length = 40)
    private String lrtiposvincdesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCHAB", nullable = false)
    private Character lrtiposvinchab;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposvincfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCUAL", nullable = false, length = 40)
    private String lrtiposvincual;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposvincfmd;
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCUMD", nullable = false, length = 40)
    private String lrtiposvincumd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTIPOSVINCPORCDESC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtiposvincporcdesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtiposvincid")
    private List<Lrgrupoaseg> lrgrupoasegList;
    @OneToMany(mappedBy = "lrtiposvincid")
    private List<Lrbeneficiario> lrbeneficiarioList;
    @JoinColumn(name = "LRGRUPOTIPOSVINCID", referencedColumnName = "LRGRUPOTIPOSVINCID", nullable = false)
    @ManyToOne(optional = false)
    private Lrgrupotiposvinc lrgrupotiposvincid;
    @JoinColumn(name = "LRNIVELVINCID", referencedColumnName = "LRNIVELVINCID", nullable = false)
    @ManyToOne(optional = false)
    private Lrnivelvinc lrnivelvincid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtiposvincid")
    private List<Lrasegvinc> lrasegvincList;

    public Lrtiposvinc() {
    }

    public Lrtiposvinc(Long lrtiposvincid) {
        this.lrtiposvincid = lrtiposvincid;
    }

    public Lrtiposvinc(Long lrtiposvincid, String lrtiposvincdesc, Character lrtiposvinchab, Date lrtiposvincfal, String lrtiposvincual, Date lrtiposvincfmd, String lrtiposvincumd, BigDecimal lrtiposvincporcdesc) {
        this.lrtiposvincid = lrtiposvincid;
        this.lrtiposvincdesc = lrtiposvincdesc;
        this.lrtiposvinchab = lrtiposvinchab;
        this.lrtiposvincfal = lrtiposvincfal;
        this.lrtiposvincual = lrtiposvincual;
        this.lrtiposvincfmd = lrtiposvincfmd;
        this.lrtiposvincumd = lrtiposvincumd;
        this.lrtiposvincporcdesc = lrtiposvincporcdesc;
    }

    public Long getLrtiposvincid() {
        return lrtiposvincid;
    }

    public void setLrtiposvincid(Long lrtiposvincid) {
        this.lrtiposvincid = lrtiposvincid;
    }

    public String getLrtiposvincdesc() {
        return lrtiposvincdesc;
    }

    public void setLrtiposvincdesc(String lrtiposvincdesc) {
        this.lrtiposvincdesc = lrtiposvincdesc;
    }

    public Character getLrtiposvinchab() {
        return lrtiposvinchab;
    }

    public void setLrtiposvinchab(Character lrtiposvinchab) {
        this.lrtiposvinchab = lrtiposvinchab;
    }

    public Date getLrtiposvincfal() {
        return lrtiposvincfal;
    }

    public void setLrtiposvincfal(Date lrtiposvincfal) {
        this.lrtiposvincfal = lrtiposvincfal;
    }

    public String getLrtiposvincual() {
        return lrtiposvincual;
    }

    public void setLrtiposvincual(String lrtiposvincual) {
        this.lrtiposvincual = lrtiposvincual;
    }

    public Date getLrtiposvincfmd() {
        return lrtiposvincfmd;
    }

    public void setLrtiposvincfmd(Date lrtiposvincfmd) {
        this.lrtiposvincfmd = lrtiposvincfmd;
    }

    public String getLrtiposvincumd() {
        return lrtiposvincumd;
    }

    public void setLrtiposvincumd(String lrtiposvincumd) {
        this.lrtiposvincumd = lrtiposvincumd;
    }

    public BigDecimal getLrtiposvincporcdesc() {
        return lrtiposvincporcdesc;
    }

    public void setLrtiposvincporcdesc(BigDecimal lrtiposvincporcdesc) {
        this.lrtiposvincporcdesc = lrtiposvincporcdesc;
    }

    public List<Lrgrupoaseg> getLrgrupoasegList() {
        return lrgrupoasegList;
    }

    public void setLrgrupoasegList(List<Lrgrupoaseg> lrgrupoasegList) {
        this.lrgrupoasegList = lrgrupoasegList;
    }

    public List<Lrbeneficiario> getLrbeneficiarioList() {
        return lrbeneficiarioList;
    }

    public void setLrbeneficiarioList(List<Lrbeneficiario> lrbeneficiarioList) {
        this.lrbeneficiarioList = lrbeneficiarioList;
    }

    public Lrgrupotiposvinc getLrgrupotiposvincid() {
        return lrgrupotiposvincid;
    }

    public void setLrgrupotiposvincid(Lrgrupotiposvinc lrgrupotiposvincid) {
        this.lrgrupotiposvincid = lrgrupotiposvincid;
    }

    public Lrnivelvinc getLrnivelvincid() {
        return lrnivelvincid;
    }

    public void setLrnivelvincid(Lrnivelvinc lrnivelvincid) {
        this.lrnivelvincid = lrnivelvincid;
    }

    public List<Lrasegvinc> getLrasegvincList() {
        return lrasegvincList;
    }

    public void setLrasegvincList(List<Lrasegvinc> lrasegvincList) {
        this.lrasegvincList = lrasegvincList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtiposvincid != null ? lrtiposvincid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtiposvinc)) {
            return false;
        }
        Lrtiposvinc other = (Lrtiposvinc) object;
        if ((this.lrtiposvincid == null && other.lrtiposvincid != null) || (this.lrtiposvincid != null && !this.lrtiposvincid.equals(other.lrtiposvincid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtiposvinc[ lrtiposvincid=" + lrtiposvincid + " ]";
    }
    
}
