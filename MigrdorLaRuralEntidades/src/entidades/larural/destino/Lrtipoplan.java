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
@Table(name = "LRTIPOPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrtipoplan.findAll", query = "SELECT l FROM Lrtipoplan l"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanid", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplangrupid", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanPK.lrtipoplangrupid = :lrtipoplangrupid"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplandesc", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplandesc = :lrtipoplandesc"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanpac", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanpac = :lrtipoplanpac"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanual", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanual = :lrtipoplanual"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanfal", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanfal = :lrtipoplanfal"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanumd", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanumd = :lrtipoplanumd"),
    @NamedQuery(name = "Lrtipoplan.findByLrtipoplanfmd", query = "SELECT l FROM Lrtipoplan l WHERE l.lrtipoplanfmd = :lrtipoplanfmd")})
public class Lrtipoplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrtipoplanPK lrtipoplanPK;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANDESC", nullable = false, length = 500)
    private String lrtipoplandesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANPAC", nullable = false)
    private Character lrtipoplanpac;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUAL", nullable = false, length = 30)
    private String lrtipoplanual;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplanfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUMD", nullable = false, length = 30)
    private String lrtipoplanumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplanfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoplan")
    private List<Lrparmcotiplan> lrparmcotiplanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoplan")
    private List<Lrtipoplanusuexcep> lrtipoplanusuexcepList;
    @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipoplangrup lrtipoplangrup;

    public Lrtipoplan() {
    }

    public Lrtipoplan(LrtipoplanPK lrtipoplanPK) {
        this.lrtipoplanPK = lrtipoplanPK;
    }

    public Lrtipoplan(LrtipoplanPK lrtipoplanPK, String lrtipoplandesc, Character lrtipoplanpac, String lrtipoplanual, Date lrtipoplanfal, String lrtipoplanumd, Date lrtipoplanfmd) {
        this.lrtipoplanPK = lrtipoplanPK;
        this.lrtipoplandesc = lrtipoplandesc;
        this.lrtipoplanpac = lrtipoplanpac;
        this.lrtipoplanual = lrtipoplanual;
        this.lrtipoplanfal = lrtipoplanfal;
        this.lrtipoplanumd = lrtipoplanumd;
        this.lrtipoplanfmd = lrtipoplanfmd;
    }

    public Lrtipoplan(long lrtipoplanid, long lrtipoplangrupid) {
        this.lrtipoplanPK = new LrtipoplanPK(lrtipoplanid, lrtipoplangrupid);
    }

    public LrtipoplanPK getLrtipoplanPK() {
        return lrtipoplanPK;
    }

    public void setLrtipoplanPK(LrtipoplanPK lrtipoplanPK) {
        this.lrtipoplanPK = lrtipoplanPK;
    }

    public String getLrtipoplandesc() {
        return lrtipoplandesc;
    }

    public void setLrtipoplandesc(String lrtipoplandesc) {
        this.lrtipoplandesc = lrtipoplandesc;
    }

    public Character getLrtipoplanpac() {
        return lrtipoplanpac;
    }

    public void setLrtipoplanpac(Character lrtipoplanpac) {
        this.lrtipoplanpac = lrtipoplanpac;
    }

    public String getLrtipoplanual() {
        return lrtipoplanual;
    }

    public void setLrtipoplanual(String lrtipoplanual) {
        this.lrtipoplanual = lrtipoplanual;
    }

    public Date getLrtipoplanfal() {
        return lrtipoplanfal;
    }

    public void setLrtipoplanfal(Date lrtipoplanfal) {
        this.lrtipoplanfal = lrtipoplanfal;
    }

    public String getLrtipoplanumd() {
        return lrtipoplanumd;
    }

    public void setLrtipoplanumd(String lrtipoplanumd) {
        this.lrtipoplanumd = lrtipoplanumd;
    }

    public Date getLrtipoplanfmd() {
        return lrtipoplanfmd;
    }

    public void setLrtipoplanfmd(Date lrtipoplanfmd) {
        this.lrtipoplanfmd = lrtipoplanfmd;
    }

    public List<Lrparmcotiplan> getLrparmcotiplanList() {
        return lrparmcotiplanList;
    }

    public void setLrparmcotiplanList(List<Lrparmcotiplan> lrparmcotiplanList) {
        this.lrparmcotiplanList = lrparmcotiplanList;
    }

    public List<Lrtipoplanusuexcep> getLrtipoplanusuexcepList() {
        return lrtipoplanusuexcepList;
    }

    public void setLrtipoplanusuexcepList(List<Lrtipoplanusuexcep> lrtipoplanusuexcepList) {
        this.lrtipoplanusuexcepList = lrtipoplanusuexcepList;
    }

    public Lrtipoplangrup getLrtipoplangrup() {
        return lrtipoplangrup;
    }

    public void setLrtipoplangrup(Lrtipoplangrup lrtipoplangrup) {
        this.lrtipoplangrup = lrtipoplangrup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipoplanPK != null ? lrtipoplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoplan)) {
            return false;
        }
        Lrtipoplan other = (Lrtipoplan) object;
        if ((this.lrtipoplanPK == null && other.lrtipoplanPK != null) || (this.lrtipoplanPK != null && !this.lrtipoplanPK.equals(other.lrtipoplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoplan[ lrtipoplanPK=" + lrtipoplanPK + " ]";
    }
    
}
