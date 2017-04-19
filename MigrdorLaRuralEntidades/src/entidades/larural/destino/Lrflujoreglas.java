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
@Table(name = "LRFLUJOREGLAS")
@NamedQueries({
    @NamedQuery(name = "Lrflujoreglas.findAll", query = "SELECT l FROM Lrflujoreglas l"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasid", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasPK.lrflujoreglasid = :lrflujoreglasid"),
    @NamedQuery(name = "Lrflujoreglas.findByLrseccdetalleid", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasnombre", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasnombre = :lrflujoreglasnombre"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasac", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasac = :lrflujoreglasac"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasual", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasual = :lrflujoreglasual"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasfal", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasfal = :lrflujoreglasfal"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasumd", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasumd = :lrflujoreglasumd"),
    @NamedQuery(name = "Lrflujoreglas.findByFlujoreglaslastlineid", query = "SELECT l FROM Lrflujoreglas l WHERE l.flujoreglaslastlineid = :flujoreglaslastlineid"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasfmd", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasfmd = :lrflujoreglasfmd"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglastipo", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglastipo = :lrflujoreglastipo"),
    @NamedQuery(name = "Lrflujoreglas.findByLrflujoreglasespecial", query = "SELECT l FROM Lrflujoreglas l WHERE l.lrflujoreglasespecial = :lrflujoreglasespecial")})
public class Lrflujoreglas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrflujoreglasPK lrflujoreglasPK;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASNOMBRE", nullable = false, length = 100)
    private String lrflujoreglasnombre;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASAC", nullable = false)
    private Character lrflujoreglasac;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASUAL", nullable = false, length = 30)
    private String lrflujoreglasual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoreglasfal;
    @Column(name = "LRFLUJOREGLASUMD", length = 30)
    private String lrflujoreglasumd;
    @Basic(optional = false)
    @Column(name = "FLUJOREGLASLASTLINEID", nullable = false)
    private long flujoreglaslastlineid;
    @Column(name = "LRFLUJOREGLASFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoreglasfmd;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASTIPO", nullable = false)
    private Character lrflujoreglastipo;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASESPECIAL", nullable = false)
    private Character lrflujoreglasespecial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrflujoreglas")
    private List<Lrflujoreglasdet> lrflujoreglasdetList;
    @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID")
    @ManyToOne
    private Lrarea lrareaid;
    @JoinColumn(name = "STLRAREAID", referencedColumnName = "LRAREAID")
    @ManyToOne
    private Lrarea stlrareaid;
    @JoinColumns({
        @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", insertable = false, updatable = false),
        @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID")})
    @ManyToOne
    private Lrareasubarea lrareasubarea;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;
    @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", insertable = false, updatable = false)
    @ManyToOne
    private Lrsubarea lrsubareaid;
    @JoinColumn(name = "STSUBAREAID", referencedColumnName = "LRSUBAREAID")
    @ManyToOne
    private Lrsubarea stsubareaid;

    public Lrflujoreglas() {
    }

    public Lrflujoreglas(LrflujoreglasPK lrflujoreglasPK) {
        this.lrflujoreglasPK = lrflujoreglasPK;
    }

    public Lrflujoreglas(LrflujoreglasPK lrflujoreglasPK, String lrflujoreglasnombre, Character lrflujoreglasac, String lrflujoreglasual, Date lrflujoreglasfal, long flujoreglaslastlineid, Character lrflujoreglastipo, Character lrflujoreglasespecial) {
        this.lrflujoreglasPK = lrflujoreglasPK;
        this.lrflujoreglasnombre = lrflujoreglasnombre;
        this.lrflujoreglasac = lrflujoreglasac;
        this.lrflujoreglasual = lrflujoreglasual;
        this.lrflujoreglasfal = lrflujoreglasfal;
        this.flujoreglaslastlineid = flujoreglaslastlineid;
        this.lrflujoreglastipo = lrflujoreglastipo;
        this.lrflujoreglasespecial = lrflujoreglasespecial;
    }

    public Lrflujoreglas(long lrflujoreglasid, long lrseccdetalleid) {
        this.lrflujoreglasPK = new LrflujoreglasPK(lrflujoreglasid, lrseccdetalleid);
    }

    public LrflujoreglasPK getLrflujoreglasPK() {
        return lrflujoreglasPK;
    }

    public void setLrflujoreglasPK(LrflujoreglasPK lrflujoreglasPK) {
        this.lrflujoreglasPK = lrflujoreglasPK;
    }

    public String getLrflujoreglasnombre() {
        return lrflujoreglasnombre;
    }

    public void setLrflujoreglasnombre(String lrflujoreglasnombre) {
        this.lrflujoreglasnombre = lrflujoreglasnombre;
    }

    public Character getLrflujoreglasac() {
        return lrflujoreglasac;
    }

    public void setLrflujoreglasac(Character lrflujoreglasac) {
        this.lrflujoreglasac = lrflujoreglasac;
    }

    public String getLrflujoreglasual() {
        return lrflujoreglasual;
    }

    public void setLrflujoreglasual(String lrflujoreglasual) {
        this.lrflujoreglasual = lrflujoreglasual;
    }

    public Date getLrflujoreglasfal() {
        return lrflujoreglasfal;
    }

    public void setLrflujoreglasfal(Date lrflujoreglasfal) {
        this.lrflujoreglasfal = lrflujoreglasfal;
    }

    public String getLrflujoreglasumd() {
        return lrflujoreglasumd;
    }

    public void setLrflujoreglasumd(String lrflujoreglasumd) {
        this.lrflujoreglasumd = lrflujoreglasumd;
    }

    public long getFlujoreglaslastlineid() {
        return flujoreglaslastlineid;
    }

    public void setFlujoreglaslastlineid(long flujoreglaslastlineid) {
        this.flujoreglaslastlineid = flujoreglaslastlineid;
    }

    public Date getLrflujoreglasfmd() {
        return lrflujoreglasfmd;
    }

    public void setLrflujoreglasfmd(Date lrflujoreglasfmd) {
        this.lrflujoreglasfmd = lrflujoreglasfmd;
    }

    public Character getLrflujoreglastipo() {
        return lrflujoreglastipo;
    }

    public void setLrflujoreglastipo(Character lrflujoreglastipo) {
        this.lrflujoreglastipo = lrflujoreglastipo;
    }

    public Character getLrflujoreglasespecial() {
        return lrflujoreglasespecial;
    }

    public void setLrflujoreglasespecial(Character lrflujoreglasespecial) {
        this.lrflujoreglasespecial = lrflujoreglasespecial;
    }

    public List<Lrflujoreglasdet> getLrflujoreglasdetList() {
        return lrflujoreglasdetList;
    }

    public void setLrflujoreglasdetList(List<Lrflujoreglasdet> lrflujoreglasdetList) {
        this.lrflujoreglasdetList = lrflujoreglasdetList;
    }

    public Lrarea getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(Lrarea lrareaid) {
        this.lrareaid = lrareaid;
    }

    public Lrarea getStlrareaid() {
        return stlrareaid;
    }

    public void setStlrareaid(Lrarea stlrareaid) {
        this.stlrareaid = stlrareaid;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    public Lrsubarea getLrsubareaid() {
        return lrsubareaid;
    }

    public void setLrsubareaid(Lrsubarea lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    public Lrsubarea getStsubareaid() {
        return stsubareaid;
    }

    public void setStsubareaid(Lrsubarea stsubareaid) {
        this.stsubareaid = stsubareaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujoreglasPK != null ? lrflujoreglasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujoreglas)) {
            return false;
        }
        Lrflujoreglas other = (Lrflujoreglas) object;
        if ((this.lrflujoreglasPK == null && other.lrflujoreglasPK != null) || (this.lrflujoreglasPK != null && !this.lrflujoreglasPK.equals(other.lrflujoreglasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujoreglas[ lrflujoreglasPK=" + lrflujoreglasPK + " ]";
    }
    
}
