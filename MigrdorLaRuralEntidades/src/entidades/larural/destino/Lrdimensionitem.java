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
@Table(name = "LRDIMENSIONITEM")
@NamedQueries({
    @NamedQuery(name = "Lrdimensionitem.findAll", query = "SELECT l FROM Lrdimensionitem l"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemid", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemid = :lrdimensionitemid"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemnom", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemnom = :lrdimensionitemnom"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemac", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemac = :lrdimensionitemac"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemual", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemual = :lrdimensionitemual"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemfal", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemfal = :lrdimensionitemfal"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemumd", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemumd = :lrdimensionitemumd"),
    @NamedQuery(name = "Lrdimensionitem.findByLrdimensionitemfmd", query = "SELECT l FROM Lrdimensionitem l WHERE l.lrdimensionitemfmd = :lrdimensionitemfmd")})
public class Lrdimensionitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMID", nullable = false)
    private Long lrdimensionitemid;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMNOM", nullable = false, length = 400)
    private String lrdimensionitemnom;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMAC", nullable = false)
    private Character lrdimensionitemac;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMUAL", nullable = false, length = 30)
    private String lrdimensionitemual;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionitemfal;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMUMD", nullable = false, length = 30)
    private String lrdimensionitemumd;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONITEMFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionitemfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrdimensionitemid")
    private List<Lrdimension> lrdimensionList;

    public Lrdimensionitem() {
    }

    public Lrdimensionitem(Long lrdimensionitemid) {
        this.lrdimensionitemid = lrdimensionitemid;
    }

    public Lrdimensionitem(Long lrdimensionitemid, String lrdimensionitemnom, Character lrdimensionitemac, String lrdimensionitemual, Date lrdimensionitemfal, String lrdimensionitemumd, Date lrdimensionitemfmd) {
        this.lrdimensionitemid = lrdimensionitemid;
        this.lrdimensionitemnom = lrdimensionitemnom;
        this.lrdimensionitemac = lrdimensionitemac;
        this.lrdimensionitemual = lrdimensionitemual;
        this.lrdimensionitemfal = lrdimensionitemfal;
        this.lrdimensionitemumd = lrdimensionitemumd;
        this.lrdimensionitemfmd = lrdimensionitemfmd;
    }

    public Long getLrdimensionitemid() {
        return lrdimensionitemid;
    }

    public void setLrdimensionitemid(Long lrdimensionitemid) {
        this.lrdimensionitemid = lrdimensionitemid;
    }

    public String getLrdimensionitemnom() {
        return lrdimensionitemnom;
    }

    public void setLrdimensionitemnom(String lrdimensionitemnom) {
        this.lrdimensionitemnom = lrdimensionitemnom;
    }

    public Character getLrdimensionitemac() {
        return lrdimensionitemac;
    }

    public void setLrdimensionitemac(Character lrdimensionitemac) {
        this.lrdimensionitemac = lrdimensionitemac;
    }

    public String getLrdimensionitemual() {
        return lrdimensionitemual;
    }

    public void setLrdimensionitemual(String lrdimensionitemual) {
        this.lrdimensionitemual = lrdimensionitemual;
    }

    public Date getLrdimensionitemfal() {
        return lrdimensionitemfal;
    }

    public void setLrdimensionitemfal(Date lrdimensionitemfal) {
        this.lrdimensionitemfal = lrdimensionitemfal;
    }

    public String getLrdimensionitemumd() {
        return lrdimensionitemumd;
    }

    public void setLrdimensionitemumd(String lrdimensionitemumd) {
        this.lrdimensionitemumd = lrdimensionitemumd;
    }

    public Date getLrdimensionitemfmd() {
        return lrdimensionitemfmd;
    }

    public void setLrdimensionitemfmd(Date lrdimensionitemfmd) {
        this.lrdimensionitemfmd = lrdimensionitemfmd;
    }

    public List<Lrdimension> getLrdimensionList() {
        return lrdimensionList;
    }

    public void setLrdimensionList(List<Lrdimension> lrdimensionList) {
        this.lrdimensionList = lrdimensionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdimensionitemid != null ? lrdimensionitemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdimensionitem)) {
            return false;
        }
        Lrdimensionitem other = (Lrdimensionitem) object;
        if ((this.lrdimensionitemid == null && other.lrdimensionitemid != null) || (this.lrdimensionitemid != null && !this.lrdimensionitemid.equals(other.lrdimensionitemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdimensionitem[ lrdimensionitemid=" + lrdimensionitemid + " ]";
    }
    
}
