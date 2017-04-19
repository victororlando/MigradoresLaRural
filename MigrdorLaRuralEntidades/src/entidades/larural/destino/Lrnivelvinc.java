/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LRNIVELVINC")
@NamedQueries({
    @NamedQuery(name = "Lrnivelvinc.findAll", query = "SELECT l FROM Lrnivelvinc l"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincid", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincid = :lrnivelvincid"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincdesc", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincdesc = :lrnivelvincdesc"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincfal", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincfal = :lrnivelvincfal"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincual", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincual = :lrnivelvincual"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincfmd", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincfmd = :lrnivelvincfmd"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvincumd", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvincumd = :lrnivelvincumd"),
    @NamedQuery(name = "Lrnivelvinc.findByLrnivelvinchab", query = "SELECT l FROM Lrnivelvinc l WHERE l.lrnivelvinchab = :lrnivelvinchab")})
public class Lrnivelvinc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCID", nullable = false)
    private Long lrnivelvincid;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCDESC", nullable = false, length = 40)
    private String lrnivelvincdesc;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrnivelvincfal;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCUAL", nullable = false, length = 40)
    private String lrnivelvincual;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrnivelvincfmd;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCUMD", nullable = false, length = 40)
    private String lrnivelvincumd;
    @Basic(optional = false)
    @Column(name = "LRNIVELVINCHAB", nullable = false)
    private Character lrnivelvinchab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrnivelvincid")
    private List<Lrtiposvinc> lrtiposvincList;

    public Lrnivelvinc() {
    }

    public Lrnivelvinc(Long lrnivelvincid) {
        this.lrnivelvincid = lrnivelvincid;
    }

    public Lrnivelvinc(Long lrnivelvincid, String lrnivelvincdesc, Date lrnivelvincfal, String lrnivelvincual, Date lrnivelvincfmd, String lrnivelvincumd, Character lrnivelvinchab) {
        this.lrnivelvincid = lrnivelvincid;
        this.lrnivelvincdesc = lrnivelvincdesc;
        this.lrnivelvincfal = lrnivelvincfal;
        this.lrnivelvincual = lrnivelvincual;
        this.lrnivelvincfmd = lrnivelvincfmd;
        this.lrnivelvincumd = lrnivelvincumd;
        this.lrnivelvinchab = lrnivelvinchab;
    }

    public Long getLrnivelvincid() {
        return lrnivelvincid;
    }

    public void setLrnivelvincid(Long lrnivelvincid) {
        this.lrnivelvincid = lrnivelvincid;
    }

    public String getLrnivelvincdesc() {
        return lrnivelvincdesc;
    }

    public void setLrnivelvincdesc(String lrnivelvincdesc) {
        this.lrnivelvincdesc = lrnivelvincdesc;
    }

    public Date getLrnivelvincfal() {
        return lrnivelvincfal;
    }

    public void setLrnivelvincfal(Date lrnivelvincfal) {
        this.lrnivelvincfal = lrnivelvincfal;
    }

    public String getLrnivelvincual() {
        return lrnivelvincual;
    }

    public void setLrnivelvincual(String lrnivelvincual) {
        this.lrnivelvincual = lrnivelvincual;
    }

    public Date getLrnivelvincfmd() {
        return lrnivelvincfmd;
    }

    public void setLrnivelvincfmd(Date lrnivelvincfmd) {
        this.lrnivelvincfmd = lrnivelvincfmd;
    }

    public String getLrnivelvincumd() {
        return lrnivelvincumd;
    }

    public void setLrnivelvincumd(String lrnivelvincumd) {
        this.lrnivelvincumd = lrnivelvincumd;
    }

    public Character getLrnivelvinchab() {
        return lrnivelvinchab;
    }

    public void setLrnivelvinchab(Character lrnivelvinchab) {
        this.lrnivelvinchab = lrnivelvinchab;
    }

    public List<Lrtiposvinc> getLrtiposvincList() {
        return lrtiposvincList;
    }

    public void setLrtiposvincList(List<Lrtiposvinc> lrtiposvincList) {
        this.lrtiposvincList = lrtiposvincList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrnivelvincid != null ? lrnivelvincid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrnivelvinc)) {
            return false;
        }
        Lrnivelvinc other = (Lrnivelvinc) object;
        if ((this.lrnivelvincid == null && other.lrnivelvincid != null) || (this.lrnivelvincid != null && !this.lrnivelvincid.equals(other.lrnivelvincid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrnivelvinc[ lrnivelvincid=" + lrnivelvincid + " ]";
    }
    
}
