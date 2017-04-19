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
import javax.persistence.JoinColumns;
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
@Table(name = "LRPARMCOTIPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrparmcotiplan.findAll", query = "SELECT l FROM Lrparmcotiplan l"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanid", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanPK.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrtipoplanid", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplandesc", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplandesc = :lrparmcotiplandesc"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanabre", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanabre = :lrparmcotiplanabre"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanact", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanact = :lrparmcotiplanact"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanual", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanual = :lrparmcotiplanual"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanfal", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanfal = :lrparmcotiplanfal"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanumd", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanumd = :lrparmcotiplanumd"),
    @NamedQuery(name = "Lrparmcotiplan.findByLrparmcotiplanfmd", query = "SELECT l FROM Lrparmcotiplan l WHERE l.lrparmcotiplanfmd = :lrparmcotiplanfmd")})
public class Lrparmcotiplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmcotiplanPK lrparmcotiplanPK;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANDESC", nullable = false, length = 150)
    private String lrparmcotiplandesc;
    @Column(name = "LRPARMCOTIPLANABRE", length = 20)
    private String lrparmcotiplanabre;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANACT", nullable = false)
    private Character lrparmcotiplanact;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANUAL", nullable = false, length = 30)
    private String lrparmcotiplanual;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotiplanfal;
    @Column(name = "LRPARMCOTIPLANUMD", length = 30)
    private String lrparmcotiplanumd;
    @Column(name = "LRPARMCOTIPLANFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotiplanfmd;
    @JoinColumns({
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrtipoplan lrtipoplan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplan")
    private List<Lrparmcotiplansecc> lrparmcotiplanseccList;

    public Lrparmcotiplan() {
    }

    public Lrparmcotiplan(LrparmcotiplanPK lrparmcotiplanPK) {
        this.lrparmcotiplanPK = lrparmcotiplanPK;
    }

    public Lrparmcotiplan(LrparmcotiplanPK lrparmcotiplanPK, String lrparmcotiplandesc, Character lrparmcotiplanact, String lrparmcotiplanual, Date lrparmcotiplanfal) {
        this.lrparmcotiplanPK = lrparmcotiplanPK;
        this.lrparmcotiplandesc = lrparmcotiplandesc;
        this.lrparmcotiplanact = lrparmcotiplanact;
        this.lrparmcotiplanual = lrparmcotiplanual;
        this.lrparmcotiplanfal = lrparmcotiplanfal;
    }

    public Lrparmcotiplan(long lrparmcotiplanid, long lrtipoplanid) {
        this.lrparmcotiplanPK = new LrparmcotiplanPK(lrparmcotiplanid, lrtipoplanid);
    }

    public LrparmcotiplanPK getLrparmcotiplanPK() {
        return lrparmcotiplanPK;
    }

    public void setLrparmcotiplanPK(LrparmcotiplanPK lrparmcotiplanPK) {
        this.lrparmcotiplanPK = lrparmcotiplanPK;
    }

    public String getLrparmcotiplandesc() {
        return lrparmcotiplandesc;
    }

    public void setLrparmcotiplandesc(String lrparmcotiplandesc) {
        this.lrparmcotiplandesc = lrparmcotiplandesc;
    }

    public String getLrparmcotiplanabre() {
        return lrparmcotiplanabre;
    }

    public void setLrparmcotiplanabre(String lrparmcotiplanabre) {
        this.lrparmcotiplanabre = lrparmcotiplanabre;
    }

    public Character getLrparmcotiplanact() {
        return lrparmcotiplanact;
    }

    public void setLrparmcotiplanact(Character lrparmcotiplanact) {
        this.lrparmcotiplanact = lrparmcotiplanact;
    }

    public String getLrparmcotiplanual() {
        return lrparmcotiplanual;
    }

    public void setLrparmcotiplanual(String lrparmcotiplanual) {
        this.lrparmcotiplanual = lrparmcotiplanual;
    }

    public Date getLrparmcotiplanfal() {
        return lrparmcotiplanfal;
    }

    public void setLrparmcotiplanfal(Date lrparmcotiplanfal) {
        this.lrparmcotiplanfal = lrparmcotiplanfal;
    }

    public String getLrparmcotiplanumd() {
        return lrparmcotiplanumd;
    }

    public void setLrparmcotiplanumd(String lrparmcotiplanumd) {
        this.lrparmcotiplanumd = lrparmcotiplanumd;
    }

    public Date getLrparmcotiplanfmd() {
        return lrparmcotiplanfmd;
    }

    public void setLrparmcotiplanfmd(Date lrparmcotiplanfmd) {
        this.lrparmcotiplanfmd = lrparmcotiplanfmd;
    }

    public Lrtipoplan getLrtipoplan() {
        return lrtipoplan;
    }

    public void setLrtipoplan(Lrtipoplan lrtipoplan) {
        this.lrtipoplan = lrtipoplan;
    }

    public List<Lrparmcotiplansecc> getLrparmcotiplanseccList() {
        return lrparmcotiplanseccList;
    }

    public void setLrparmcotiplanseccList(List<Lrparmcotiplansecc> lrparmcotiplanseccList) {
        this.lrparmcotiplanseccList = lrparmcotiplanseccList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmcotiplanPK != null ? lrparmcotiplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmcotiplan)) {
            return false;
        }
        Lrparmcotiplan other = (Lrparmcotiplan) object;
        if ((this.lrparmcotiplanPK == null && other.lrparmcotiplanPK != null) || (this.lrparmcotiplanPK != null && !this.lrparmcotiplanPK.equals(other.lrparmcotiplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmcotiplan[ lrparmcotiplanPK=" + lrparmcotiplanPK + " ]";
    }
    
}
