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
@Table(name = "LRSUBAREA")
@NamedQueries({
    @NamedQuery(name = "Lrsubarea.findAll", query = "SELECT l FROM Lrsubarea l"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareaid", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareaid = :lrsubareaid"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareadesc", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareadesc = :lrsubareadesc"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareaact", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareaact = :lrsubareaact"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareafal", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareafal = :lrsubareafal"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareaual", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareaual = :lrsubareaual"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareafmd", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareafmd = :lrsubareafmd"),
    @NamedQuery(name = "Lrsubarea.findByLrsubareaumd", query = "SELECT l FROM Lrsubarea l WHERE l.lrsubareaumd = :lrsubareaumd")})
public class Lrsubarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSUBAREAID", nullable = false)
    private Long lrsubareaid;
    @Basic(optional = false)
    @Column(name = "LRSUBAREADESC", nullable = false, length = 300)
    private String lrsubareadesc;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAACT", nullable = false)
    private Character lrsubareaact;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsubareafal;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAUAL", nullable = false, length = 30)
    private String lrsubareaual;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsubareafmd;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAUMD", nullable = false, length = 30)
    private String lrsubareaumd;
    @OneToMany(mappedBy = "lrsubareaid")
    private List<Lrflujoreglas> lrflujoreglasList;
    @OneToMany(mappedBy = "stsubareaid")
    private List<Lrflujoreglas> lrflujoreglasList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrsubarea")
    private List<Lrareasubarea> lrareasubareaList;

    public Lrsubarea() {
    }

    public Lrsubarea(Long lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    public Lrsubarea(Long lrsubareaid, String lrsubareadesc, Character lrsubareaact, Date lrsubareafal, String lrsubareaual, Date lrsubareafmd, String lrsubareaumd) {
        this.lrsubareaid = lrsubareaid;
        this.lrsubareadesc = lrsubareadesc;
        this.lrsubareaact = lrsubareaact;
        this.lrsubareafal = lrsubareafal;
        this.lrsubareaual = lrsubareaual;
        this.lrsubareafmd = lrsubareafmd;
        this.lrsubareaumd = lrsubareaumd;
    }

    public Long getLrsubareaid() {
        return lrsubareaid;
    }

    public void setLrsubareaid(Long lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    public String getLrsubareadesc() {
        return lrsubareadesc;
    }

    public void setLrsubareadesc(String lrsubareadesc) {
        this.lrsubareadesc = lrsubareadesc;
    }

    public Character getLrsubareaact() {
        return lrsubareaact;
    }

    public void setLrsubareaact(Character lrsubareaact) {
        this.lrsubareaact = lrsubareaact;
    }

    public Date getLrsubareafal() {
        return lrsubareafal;
    }

    public void setLrsubareafal(Date lrsubareafal) {
        this.lrsubareafal = lrsubareafal;
    }

    public String getLrsubareaual() {
        return lrsubareaual;
    }

    public void setLrsubareaual(String lrsubareaual) {
        this.lrsubareaual = lrsubareaual;
    }

    public Date getLrsubareafmd() {
        return lrsubareafmd;
    }

    public void setLrsubareafmd(Date lrsubareafmd) {
        this.lrsubareafmd = lrsubareafmd;
    }

    public String getLrsubareaumd() {
        return lrsubareaumd;
    }

    public void setLrsubareaumd(String lrsubareaumd) {
        this.lrsubareaumd = lrsubareaumd;
    }

    public List<Lrflujoreglas> getLrflujoreglasList() {
        return lrflujoreglasList;
    }

    public void setLrflujoreglasList(List<Lrflujoreglas> lrflujoreglasList) {
        this.lrflujoreglasList = lrflujoreglasList;
    }

    public List<Lrflujoreglas> getLrflujoreglasList1() {
        return lrflujoreglasList1;
    }

    public void setLrflujoreglasList1(List<Lrflujoreglas> lrflujoreglasList1) {
        this.lrflujoreglasList1 = lrflujoreglasList1;
    }

    public List<Lrareasubarea> getLrareasubareaList() {
        return lrareasubareaList;
    }

    public void setLrareasubareaList(List<Lrareasubarea> lrareasubareaList) {
        this.lrareasubareaList = lrareasubareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrsubareaid != null ? lrsubareaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrsubarea)) {
            return false;
        }
        Lrsubarea other = (Lrsubarea) object;
        if ((this.lrsubareaid == null && other.lrsubareaid != null) || (this.lrsubareaid != null && !this.lrsubareaid.equals(other.lrsubareaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrsubarea[ lrsubareaid=" + lrsubareaid + " ]";
    }
    
}
