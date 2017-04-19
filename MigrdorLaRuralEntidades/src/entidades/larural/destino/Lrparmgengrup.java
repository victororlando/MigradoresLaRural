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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRPARMGENGRUP")
@NamedQueries({
    @NamedQuery(name = "Lrparmgengrup.findAll", query = "SELECT l FROM Lrparmgengrup l"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgenid", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupPK.lrparmgenid = :lrparmgenid"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupid", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupPK.lrparmgengrupid = :lrparmgengrupid"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupnom", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupnom = :lrparmgengrupnom"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupact", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupact = :lrparmgengrupact"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupfal", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupfal = :lrparmgengrupfal"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupual", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupual = :lrparmgengrupual"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupfmd", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupfmd = :lrparmgengrupfmd"),
    @NamedQuery(name = "Lrparmgengrup.findByLrparmgengrupumd", query = "SELECT l FROM Lrparmgengrup l WHERE l.lrparmgengrupumd = :lrparmgengrupumd")})
public class Lrparmgengrup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmgengrupPK lrparmgengrupPK;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPNOM", nullable = false, length = 60)
    private String lrparmgengrupnom;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPACT", nullable = false)
    private Character lrparmgengrupact;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgengrupfal;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPUAL", nullable = false, length = 30)
    private String lrparmgengrupual;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgengrupfmd;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPUMD", nullable = false, length = 30)
    private String lrparmgengrupumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmgengrup")
    private List<Lrparmgengrupitem> lrparmgengrupitemList;
    @JoinColumn(name = "LRPARMGENID", referencedColumnName = "LRPARMGENID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrparmgen lrparmgen;

    public Lrparmgengrup() {
    }

    public Lrparmgengrup(LrparmgengrupPK lrparmgengrupPK) {
        this.lrparmgengrupPK = lrparmgengrupPK;
    }

    public Lrparmgengrup(LrparmgengrupPK lrparmgengrupPK, String lrparmgengrupnom, Character lrparmgengrupact, Date lrparmgengrupfal, String lrparmgengrupual, Date lrparmgengrupfmd, String lrparmgengrupumd) {
        this.lrparmgengrupPK = lrparmgengrupPK;
        this.lrparmgengrupnom = lrparmgengrupnom;
        this.lrparmgengrupact = lrparmgengrupact;
        this.lrparmgengrupfal = lrparmgengrupfal;
        this.lrparmgengrupual = lrparmgengrupual;
        this.lrparmgengrupfmd = lrparmgengrupfmd;
        this.lrparmgengrupumd = lrparmgengrupumd;
    }

    public Lrparmgengrup(long lrparmgenid, long lrparmgengrupid) {
        this.lrparmgengrupPK = new LrparmgengrupPK(lrparmgenid, lrparmgengrupid);
    }

    public LrparmgengrupPK getLrparmgengrupPK() {
        return lrparmgengrupPK;
    }

    public void setLrparmgengrupPK(LrparmgengrupPK lrparmgengrupPK) {
        this.lrparmgengrupPK = lrparmgengrupPK;
    }

    public String getLrparmgengrupnom() {
        return lrparmgengrupnom;
    }

    public void setLrparmgengrupnom(String lrparmgengrupnom) {
        this.lrparmgengrupnom = lrparmgengrupnom;
    }

    public Character getLrparmgengrupact() {
        return lrparmgengrupact;
    }

    public void setLrparmgengrupact(Character lrparmgengrupact) {
        this.lrparmgengrupact = lrparmgengrupact;
    }

    public Date getLrparmgengrupfal() {
        return lrparmgengrupfal;
    }

    public void setLrparmgengrupfal(Date lrparmgengrupfal) {
        this.lrparmgengrupfal = lrparmgengrupfal;
    }

    public String getLrparmgengrupual() {
        return lrparmgengrupual;
    }

    public void setLrparmgengrupual(String lrparmgengrupual) {
        this.lrparmgengrupual = lrparmgengrupual;
    }

    public Date getLrparmgengrupfmd() {
        return lrparmgengrupfmd;
    }

    public void setLrparmgengrupfmd(Date lrparmgengrupfmd) {
        this.lrparmgengrupfmd = lrparmgengrupfmd;
    }

    public String getLrparmgengrupumd() {
        return lrparmgengrupumd;
    }

    public void setLrparmgengrupumd(String lrparmgengrupumd) {
        this.lrparmgengrupumd = lrparmgengrupumd;
    }

    public List<Lrparmgengrupitem> getLrparmgengrupitemList() {
        return lrparmgengrupitemList;
    }

    public void setLrparmgengrupitemList(List<Lrparmgengrupitem> lrparmgengrupitemList) {
        this.lrparmgengrupitemList = lrparmgengrupitemList;
    }

    public Lrparmgen getLrparmgen() {
        return lrparmgen;
    }

    public void setLrparmgen(Lrparmgen lrparmgen) {
        this.lrparmgen = lrparmgen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmgengrupPK != null ? lrparmgengrupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmgengrup)) {
            return false;
        }
        Lrparmgengrup other = (Lrparmgengrup) object;
        if ((this.lrparmgengrupPK == null && other.lrparmgengrupPK != null) || (this.lrparmgengrupPK != null && !this.lrparmgengrupPK.equals(other.lrparmgengrupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmgengrup[ lrparmgengrupPK=" + lrparmgengrupPK + " ]";
    }
    
}
