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
@Table(name = "LRAJUSTE")
@NamedQueries({
    @NamedQuery(name = "Lrajuste.findAll", query = "SELECT l FROM Lrajuste l"),
    @NamedQuery(name = "Lrajuste.findByLrajusteid", query = "SELECT l FROM Lrajuste l WHERE l.lrajusteid = :lrajusteid"),
    @NamedQuery(name = "Lrajuste.findByLrajustedesc", query = "SELECT l FROM Lrajuste l WHERE l.lrajustedesc = :lrajustedesc"),
    @NamedQuery(name = "Lrajuste.findByLrajusteac", query = "SELECT l FROM Lrajuste l WHERE l.lrajusteac = :lrajusteac"),
    @NamedQuery(name = "Lrajuste.findByLrajusteual", query = "SELECT l FROM Lrajuste l WHERE l.lrajusteual = :lrajusteual"),
    @NamedQuery(name = "Lrajuste.findByLrajustefal", query = "SELECT l FROM Lrajuste l WHERE l.lrajustefal = :lrajustefal"),
    @NamedQuery(name = "Lrajuste.findByLrajusteumd", query = "SELECT l FROM Lrajuste l WHERE l.lrajusteumd = :lrajusteumd"),
    @NamedQuery(name = "Lrajuste.findByLrajustefmd", query = "SELECT l FROM Lrajuste l WHERE l.lrajustefmd = :lrajustefmd"),
    @NamedQuery(name = "Lrajuste.findByLrtipoajusteid", query = "SELECT l FROM Lrajuste l WHERE l.lrtipoajusteid = :lrtipoajusteid")})
public class Lrajuste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRAJUSTEID", nullable = false)
    private Long lrajusteid;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEDESC", nullable = false, length = 100)
    private String lrajustedesc;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEAC", nullable = false)
    private Character lrajusteac;
    @Column(name = "LRAJUSTEUAL", length = 30)
    private String lrajusteual;
    @Column(name = "LRAJUSTEFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrajustefal;
    @Column(name = "LRAJUSTEUMD", length = 30)
    private String lrajusteumd;
    @Column(name = "LRAJUSTEFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrajustefmd;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEID", nullable = false)
    private long lrtipoajusteid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrajuste")
    private List<Lrajusteplan> lrajusteplanList;
    @OneToMany(mappedBy = "lrajusteid")
    private List<Lrparmcotidetperfiles> lrparmcotidetperfilesList;

    public Lrajuste() {
    }

    public Lrajuste(Long lrajusteid) {
        this.lrajusteid = lrajusteid;
    }

    public Lrajuste(Long lrajusteid, String lrajustedesc, Character lrajusteac, long lrtipoajusteid) {
        this.lrajusteid = lrajusteid;
        this.lrajustedesc = lrajustedesc;
        this.lrajusteac = lrajusteac;
        this.lrtipoajusteid = lrtipoajusteid;
    }

    public Long getLrajusteid() {
        return lrajusteid;
    }

    public void setLrajusteid(Long lrajusteid) {
        this.lrajusteid = lrajusteid;
    }

    public String getLrajustedesc() {
        return lrajustedesc;
    }

    public void setLrajustedesc(String lrajustedesc) {
        this.lrajustedesc = lrajustedesc;
    }

    public Character getLrajusteac() {
        return lrajusteac;
    }

    public void setLrajusteac(Character lrajusteac) {
        this.lrajusteac = lrajusteac;
    }

    public String getLrajusteual() {
        return lrajusteual;
    }

    public void setLrajusteual(String lrajusteual) {
        this.lrajusteual = lrajusteual;
    }

    public Date getLrajustefal() {
        return lrajustefal;
    }

    public void setLrajustefal(Date lrajustefal) {
        this.lrajustefal = lrajustefal;
    }

    public String getLrajusteumd() {
        return lrajusteumd;
    }

    public void setLrajusteumd(String lrajusteumd) {
        this.lrajusteumd = lrajusteumd;
    }

    public Date getLrajustefmd() {
        return lrajustefmd;
    }

    public void setLrajustefmd(Date lrajustefmd) {
        this.lrajustefmd = lrajustefmd;
    }

    public long getLrtipoajusteid() {
        return lrtipoajusteid;
    }

    public void setLrtipoajusteid(long lrtipoajusteid) {
        this.lrtipoajusteid = lrtipoajusteid;
    }

    public List<Lrajusteplan> getLrajusteplanList() {
        return lrajusteplanList;
    }

    public void setLrajusteplanList(List<Lrajusteplan> lrajusteplanList) {
        this.lrajusteplanList = lrajusteplanList;
    }

    public List<Lrparmcotidetperfiles> getLrparmcotidetperfilesList() {
        return lrparmcotidetperfilesList;
    }

    public void setLrparmcotidetperfilesList(List<Lrparmcotidetperfiles> lrparmcotidetperfilesList) {
        this.lrparmcotidetperfilesList = lrparmcotidetperfilesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrajusteid != null ? lrajusteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrajuste)) {
            return false;
        }
        Lrajuste other = (Lrajuste) object;
        if ((this.lrajusteid == null && other.lrajusteid != null) || (this.lrajusteid != null && !this.lrajusteid.equals(other.lrajusteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrajuste[ lrajusteid=" + lrajusteid + " ]";
    }
    
}
