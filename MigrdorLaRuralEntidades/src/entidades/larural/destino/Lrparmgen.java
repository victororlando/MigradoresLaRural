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
@Table(name = "LRPARMGEN")
@NamedQueries({
    @NamedQuery(name = "Lrparmgen.findAll", query = "SELECT l FROM Lrparmgen l"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenid", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenid = :lrparmgenid"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgennom", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgennom = :lrparmgennom"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenact", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenact = :lrparmgenact"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenfal", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenfal = :lrparmgenfal"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenual", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenual = :lrparmgenual"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenfmd", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenfmd = :lrparmgenfmd"),
    @NamedQuery(name = "Lrparmgen.findByLrparmgenumd", query = "SELECT l FROM Lrparmgen l WHERE l.lrparmgenumd = :lrparmgenumd")})
public class Lrparmgen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPARMGENID", nullable = false)
    private Long lrparmgenid;
    @Basic(optional = false)
    @Column(name = "LRPARMGENNOM", nullable = false, length = 60)
    private String lrparmgennom;
    @Basic(optional = false)
    @Column(name = "LRPARMGENACT", nullable = false)
    private Character lrparmgenact;
    @Basic(optional = false)
    @Column(name = "LRPARMGENFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgenfal;
    @Basic(optional = false)
    @Column(name = "LRPARMGENUAL", nullable = false, length = 30)
    private String lrparmgenual;
    @Basic(optional = false)
    @Column(name = "LRPARMGENFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgenfmd;
    @Basic(optional = false)
    @Column(name = "LRPARMGENUMD", nullable = false, length = 30)
    private String lrparmgenumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmgen")
    private List<Lrparmgengrup> lrparmgengrupList;

    public Lrparmgen() {
    }

    public Lrparmgen(Long lrparmgenid) {
        this.lrparmgenid = lrparmgenid;
    }

    public Lrparmgen(Long lrparmgenid, String lrparmgennom, Character lrparmgenact, Date lrparmgenfal, String lrparmgenual, Date lrparmgenfmd, String lrparmgenumd) {
        this.lrparmgenid = lrparmgenid;
        this.lrparmgennom = lrparmgennom;
        this.lrparmgenact = lrparmgenact;
        this.lrparmgenfal = lrparmgenfal;
        this.lrparmgenual = lrparmgenual;
        this.lrparmgenfmd = lrparmgenfmd;
        this.lrparmgenumd = lrparmgenumd;
    }

    public Long getLrparmgenid() {
        return lrparmgenid;
    }

    public void setLrparmgenid(Long lrparmgenid) {
        this.lrparmgenid = lrparmgenid;
    }

    public String getLrparmgennom() {
        return lrparmgennom;
    }

    public void setLrparmgennom(String lrparmgennom) {
        this.lrparmgennom = lrparmgennom;
    }

    public Character getLrparmgenact() {
        return lrparmgenact;
    }

    public void setLrparmgenact(Character lrparmgenact) {
        this.lrparmgenact = lrparmgenact;
    }

    public Date getLrparmgenfal() {
        return lrparmgenfal;
    }

    public void setLrparmgenfal(Date lrparmgenfal) {
        this.lrparmgenfal = lrparmgenfal;
    }

    public String getLrparmgenual() {
        return lrparmgenual;
    }

    public void setLrparmgenual(String lrparmgenual) {
        this.lrparmgenual = lrparmgenual;
    }

    public Date getLrparmgenfmd() {
        return lrparmgenfmd;
    }

    public void setLrparmgenfmd(Date lrparmgenfmd) {
        this.lrparmgenfmd = lrparmgenfmd;
    }

    public String getLrparmgenumd() {
        return lrparmgenumd;
    }

    public void setLrparmgenumd(String lrparmgenumd) {
        this.lrparmgenumd = lrparmgenumd;
    }

    public List<Lrparmgengrup> getLrparmgengrupList() {
        return lrparmgengrupList;
    }

    public void setLrparmgengrupList(List<Lrparmgengrup> lrparmgengrupList) {
        this.lrparmgengrupList = lrparmgengrupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmgenid != null ? lrparmgenid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmgen)) {
            return false;
        }
        Lrparmgen other = (Lrparmgen) object;
        if ((this.lrparmgenid == null && other.lrparmgenid != null) || (this.lrparmgenid != null && !this.lrparmgenid.equals(other.lrparmgenid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmgen[ lrparmgenid=" + lrparmgenid + " ]";
    }
    
}
