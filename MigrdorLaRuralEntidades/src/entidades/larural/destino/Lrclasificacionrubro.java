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
@Table(name = "LRCLASIFICACIONRUBRO")
@NamedQueries({
    @NamedQuery(name = "Lrclasificacionrubro.findAll", query = "SELECT l FROM Lrclasificacionrubro l"),
    @NamedQuery(name = "Lrclasificacionrubro.findByRubrosid", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubroPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubroPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionrubrofal", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubrofal = :lrclasificacionrubrofal"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionrubroual", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubroual = :lrclasificacionrubroual"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionrubrofmd", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubrofmd = :lrclasificacionrubrofmd"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionrubrumd", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubrumd = :lrclasificacionrubrumd"),
    @NamedQuery(name = "Lrclasificacionrubro.findByLrclasificacionrubroac", query = "SELECT l FROM Lrclasificacionrubro l WHERE l.lrclasificacionrubroac = :lrclasificacionrubroac")})
public class Lrclasificacionrubro implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrclasificacionrubroPK lrclasificacionrubroPK;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRUBROFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificacionrubrofal;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRUBROUAL", nullable = false, length = 30)
    private String lrclasificacionrubroual;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRUBROFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificacionrubrofmd;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRUBRUMD", nullable = false, length = 30)
    private String lrclasificacionrubrumd;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRUBROAC", nullable = false)
    private Character lrclasificacionrubroac;
    @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrclasificacionriesgo lrclasificacionriesgo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrclasificacionrubro")
    private List<Lrtasarubroriesgo> lrtasarubroriesgoList;

    public Lrclasificacionrubro() {
    }

    public Lrclasificacionrubro(LrclasificacionrubroPK lrclasificacionrubroPK) {
        this.lrclasificacionrubroPK = lrclasificacionrubroPK;
    }

    public Lrclasificacionrubro(LrclasificacionrubroPK lrclasificacionrubroPK, Date lrclasificacionrubrofal, String lrclasificacionrubroual, Date lrclasificacionrubrofmd, String lrclasificacionrubrumd, Character lrclasificacionrubroac) {
        this.lrclasificacionrubroPK = lrclasificacionrubroPK;
        this.lrclasificacionrubrofal = lrclasificacionrubrofal;
        this.lrclasificacionrubroual = lrclasificacionrubroual;
        this.lrclasificacionrubrofmd = lrclasificacionrubrofmd;
        this.lrclasificacionrubrumd = lrclasificacionrubrumd;
        this.lrclasificacionrubroac = lrclasificacionrubroac;
    }

    public Lrclasificacionrubro(short rubrosid, long lrclasificacionriesgoid) {
        this.lrclasificacionrubroPK = new LrclasificacionrubroPK(rubrosid, lrclasificacionriesgoid);
    }

    public LrclasificacionrubroPK getLrclasificacionrubroPK() {
        return lrclasificacionrubroPK;
    }

    public void setLrclasificacionrubroPK(LrclasificacionrubroPK lrclasificacionrubroPK) {
        this.lrclasificacionrubroPK = lrclasificacionrubroPK;
    }

    public Date getLrclasificacionrubrofal() {
        return lrclasificacionrubrofal;
    }

    public void setLrclasificacionrubrofal(Date lrclasificacionrubrofal) {
        this.lrclasificacionrubrofal = lrclasificacionrubrofal;
    }

    public String getLrclasificacionrubroual() {
        return lrclasificacionrubroual;
    }

    public void setLrclasificacionrubroual(String lrclasificacionrubroual) {
        this.lrclasificacionrubroual = lrclasificacionrubroual;
    }

    public Date getLrclasificacionrubrofmd() {
        return lrclasificacionrubrofmd;
    }

    public void setLrclasificacionrubrofmd(Date lrclasificacionrubrofmd) {
        this.lrclasificacionrubrofmd = lrclasificacionrubrofmd;
    }

    public String getLrclasificacionrubrumd() {
        return lrclasificacionrubrumd;
    }

    public void setLrclasificacionrubrumd(String lrclasificacionrubrumd) {
        this.lrclasificacionrubrumd = lrclasificacionrubrumd;
    }

    public Character getLrclasificacionrubroac() {
        return lrclasificacionrubroac;
    }

    public void setLrclasificacionrubroac(Character lrclasificacionrubroac) {
        this.lrclasificacionrubroac = lrclasificacionrubroac;
    }

    public Lrclasificacionriesgo getLrclasificacionriesgo() {
        return lrclasificacionriesgo;
    }

    public void setLrclasificacionriesgo(Lrclasificacionriesgo lrclasificacionriesgo) {
        this.lrclasificacionriesgo = lrclasificacionriesgo;
    }

    public List<Lrtasarubroriesgo> getLrtasarubroriesgoList() {
        return lrtasarubroriesgoList;
    }

    public void setLrtasarubroriesgoList(List<Lrtasarubroriesgo> lrtasarubroriesgoList) {
        this.lrtasarubroriesgoList = lrtasarubroriesgoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrclasificacionrubroPK != null ? lrclasificacionrubroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrclasificacionrubro)) {
            return false;
        }
        Lrclasificacionrubro other = (Lrclasificacionrubro) object;
        if ((this.lrclasificacionrubroPK == null && other.lrclasificacionrubroPK != null) || (this.lrclasificacionrubroPK != null && !this.lrclasificacionrubroPK.equals(other.lrclasificacionrubroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrclasificacionrubro[ lrclasificacionrubroPK=" + lrclasificacionrubroPK + " ]";
    }
    
}
