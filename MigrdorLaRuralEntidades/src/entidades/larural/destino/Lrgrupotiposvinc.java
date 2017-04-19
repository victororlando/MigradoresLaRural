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
@Table(name = "LRGRUPOTIPOSVINC")
@NamedQueries({
    @NamedQuery(name = "Lrgrupotiposvinc.findAll", query = "SELECT l FROM Lrgrupotiposvinc l"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincid", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincid = :lrgrupotiposvincid"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincdesc", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincdesc = :lrgrupotiposvincdesc"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvinchab", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvinchab = :lrgrupotiposvinchab"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincfal", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincfal = :lrgrupotiposvincfal"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincual", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincual = :lrgrupotiposvincual"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincfmd", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincfmd = :lrgrupotiposvincfmd"),
    @NamedQuery(name = "Lrgrupotiposvinc.findByLrgrupotiposvincumd", query = "SELECT l FROM Lrgrupotiposvinc l WHERE l.lrgrupotiposvincumd = :lrgrupotiposvincumd")})
public class Lrgrupotiposvinc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCID", nullable = false)
    private Long lrgrupotiposvincid;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCDESC", nullable = false, length = 40)
    private String lrgrupotiposvincdesc;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCHAB", nullable = false)
    private Character lrgrupotiposvinchab;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgrupotiposvincfal;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCUAL", nullable = false, length = 30)
    private String lrgrupotiposvincual;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgrupotiposvincfmd;
    @Basic(optional = false)
    @Column(name = "LRGRUPOTIPOSVINCUMD", nullable = false, length = 30)
    private String lrgrupotiposvincumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrgrupotiposvincid")
    private List<Lrtiposvinc> lrtiposvincList;

    public Lrgrupotiposvinc() {
    }

    public Lrgrupotiposvinc(Long lrgrupotiposvincid) {
        this.lrgrupotiposvincid = lrgrupotiposvincid;
    }

    public Lrgrupotiposvinc(Long lrgrupotiposvincid, String lrgrupotiposvincdesc, Character lrgrupotiposvinchab, Date lrgrupotiposvincfal, String lrgrupotiposvincual, Date lrgrupotiposvincfmd, String lrgrupotiposvincumd) {
        this.lrgrupotiposvincid = lrgrupotiposvincid;
        this.lrgrupotiposvincdesc = lrgrupotiposvincdesc;
        this.lrgrupotiposvinchab = lrgrupotiposvinchab;
        this.lrgrupotiposvincfal = lrgrupotiposvincfal;
        this.lrgrupotiposvincual = lrgrupotiposvincual;
        this.lrgrupotiposvincfmd = lrgrupotiposvincfmd;
        this.lrgrupotiposvincumd = lrgrupotiposvincumd;
    }

    public Long getLrgrupotiposvincid() {
        return lrgrupotiposvincid;
    }

    public void setLrgrupotiposvincid(Long lrgrupotiposvincid) {
        this.lrgrupotiposvincid = lrgrupotiposvincid;
    }

    public String getLrgrupotiposvincdesc() {
        return lrgrupotiposvincdesc;
    }

    public void setLrgrupotiposvincdesc(String lrgrupotiposvincdesc) {
        this.lrgrupotiposvincdesc = lrgrupotiposvincdesc;
    }

    public Character getLrgrupotiposvinchab() {
        return lrgrupotiposvinchab;
    }

    public void setLrgrupotiposvinchab(Character lrgrupotiposvinchab) {
        this.lrgrupotiposvinchab = lrgrupotiposvinchab;
    }

    public Date getLrgrupotiposvincfal() {
        return lrgrupotiposvincfal;
    }

    public void setLrgrupotiposvincfal(Date lrgrupotiposvincfal) {
        this.lrgrupotiposvincfal = lrgrupotiposvincfal;
    }

    public String getLrgrupotiposvincual() {
        return lrgrupotiposvincual;
    }

    public void setLrgrupotiposvincual(String lrgrupotiposvincual) {
        this.lrgrupotiposvincual = lrgrupotiposvincual;
    }

    public Date getLrgrupotiposvincfmd() {
        return lrgrupotiposvincfmd;
    }

    public void setLrgrupotiposvincfmd(Date lrgrupotiposvincfmd) {
        this.lrgrupotiposvincfmd = lrgrupotiposvincfmd;
    }

    public String getLrgrupotiposvincumd() {
        return lrgrupotiposvincumd;
    }

    public void setLrgrupotiposvincumd(String lrgrupotiposvincumd) {
        this.lrgrupotiposvincumd = lrgrupotiposvincumd;
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
        hash += (lrgrupotiposvincid != null ? lrgrupotiposvincid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrgrupotiposvinc)) {
            return false;
        }
        Lrgrupotiposvinc other = (Lrgrupotiposvinc) object;
        if ((this.lrgrupotiposvincid == null && other.lrgrupotiposvincid != null) || (this.lrgrupotiposvincid != null && !this.lrgrupotiposvincid.equals(other.lrgrupotiposvincid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrgrupotiposvinc[ lrgrupotiposvincid=" + lrgrupotiposvincid + " ]";
    }
    
}
