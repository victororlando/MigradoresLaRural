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
@Table(name = "LRTIPOAJUSTE")
@NamedQueries({
    @NamedQuery(name = "Lrtipoajuste.findAll", query = "SELECT l FROM Lrtipoajuste l"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajusteid", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajusteid = :lrtipoajusteid"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajustedesc", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajustedesc = :lrtipoajustedesc"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajusteac", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajusteac = :lrtipoajusteac"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajusteual", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajusteual = :lrtipoajusteual"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajustefal", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajustefal = :lrtipoajustefal"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajusteumd", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajusteumd = :lrtipoajusteumd"),
    @NamedQuery(name = "Lrtipoajuste.findByLrtipoajustefmd", query = "SELECT l FROM Lrtipoajuste l WHERE l.lrtipoajustefmd = :lrtipoajustefmd")})
public class Lrtipoajuste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEID", nullable = false)
    private Long lrtipoajusteid;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEDESC", nullable = false, length = 100)
    private String lrtipoajustedesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEAC", nullable = false)
    private Character lrtipoajusteac;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEUAL", nullable = false, length = 30)
    private String lrtipoajusteual;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoajustefal;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEUMD", nullable = false, length = 30)
    private String lrtipoajusteumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoajustefmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoajuste")
    private List<Lrprovservtipo> lrprovservtipoList;

    public Lrtipoajuste() {
    }

    public Lrtipoajuste(Long lrtipoajusteid) {
        this.lrtipoajusteid = lrtipoajusteid;
    }

    public Lrtipoajuste(Long lrtipoajusteid, String lrtipoajustedesc, Character lrtipoajusteac, String lrtipoajusteual, Date lrtipoajustefal, String lrtipoajusteumd, Date lrtipoajustefmd) {
        this.lrtipoajusteid = lrtipoajusteid;
        this.lrtipoajustedesc = lrtipoajustedesc;
        this.lrtipoajusteac = lrtipoajusteac;
        this.lrtipoajusteual = lrtipoajusteual;
        this.lrtipoajustefal = lrtipoajustefal;
        this.lrtipoajusteumd = lrtipoajusteumd;
        this.lrtipoajustefmd = lrtipoajustefmd;
    }

    public Long getLrtipoajusteid() {
        return lrtipoajusteid;
    }

    public void setLrtipoajusteid(Long lrtipoajusteid) {
        this.lrtipoajusteid = lrtipoajusteid;
    }

    public String getLrtipoajustedesc() {
        return lrtipoajustedesc;
    }

    public void setLrtipoajustedesc(String lrtipoajustedesc) {
        this.lrtipoajustedesc = lrtipoajustedesc;
    }

    public Character getLrtipoajusteac() {
        return lrtipoajusteac;
    }

    public void setLrtipoajusteac(Character lrtipoajusteac) {
        this.lrtipoajusteac = lrtipoajusteac;
    }

    public String getLrtipoajusteual() {
        return lrtipoajusteual;
    }

    public void setLrtipoajusteual(String lrtipoajusteual) {
        this.lrtipoajusteual = lrtipoajusteual;
    }

    public Date getLrtipoajustefal() {
        return lrtipoajustefal;
    }

    public void setLrtipoajustefal(Date lrtipoajustefal) {
        this.lrtipoajustefal = lrtipoajustefal;
    }

    public String getLrtipoajusteumd() {
        return lrtipoajusteumd;
    }

    public void setLrtipoajusteumd(String lrtipoajusteumd) {
        this.lrtipoajusteumd = lrtipoajusteumd;
    }

    public Date getLrtipoajustefmd() {
        return lrtipoajustefmd;
    }

    public void setLrtipoajustefmd(Date lrtipoajustefmd) {
        this.lrtipoajustefmd = lrtipoajustefmd;
    }

    public List<Lrprovservtipo> getLrprovservtipoList() {
        return lrprovservtipoList;
    }

    public void setLrprovservtipoList(List<Lrprovservtipo> lrprovservtipoList) {
        this.lrprovservtipoList = lrprovservtipoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipoajusteid != null ? lrtipoajusteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoajuste)) {
            return false;
        }
        Lrtipoajuste other = (Lrtipoajuste) object;
        if ((this.lrtipoajusteid == null && other.lrtipoajusteid != null) || (this.lrtipoajusteid != null && !this.lrtipoajusteid.equals(other.lrtipoajusteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoajuste[ lrtipoajusteid=" + lrtipoajusteid + " ]";
    }
    
}
