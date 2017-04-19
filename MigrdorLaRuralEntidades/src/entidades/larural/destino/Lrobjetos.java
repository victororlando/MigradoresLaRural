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
@Table(name = "LROBJETOS")
@NamedQueries({
    @NamedQuery(name = "Lrobjetos.findAll", query = "SELECT l FROM Lrobjetos l"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosid", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosid = :lrobjetosid"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosnom", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosnom = :lrobjetosnom"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetoshab", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetoshab = :lrobjetoshab"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosfva", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosfva = :lrobjetosfva"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosniv", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosniv = :lrobjetosniv"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosord", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosord = :lrobjetosord"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosfal", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosfal = :lrobjetosfal"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosual", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosual = :lrobjetosual"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosfmd", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosfmd = :lrobjetosfmd"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosumd", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosumd = :lrobjetosumd"),
    @NamedQuery(name = "Lrobjetos.findByLrobjetosdes", query = "SELECT l FROM Lrobjetos l WHERE l.lrobjetosdes = :lrobjetosdes")})
public class Lrobjetos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LROBJETOSID", nullable = false)
    private Long lrobjetosid;
    @Basic(optional = false)
    @Column(name = "LROBJETOSNOM", nullable = false, length = 60)
    private String lrobjetosnom;
    @Basic(optional = false)
    @Column(name = "LROBJETOSHAB", nullable = false)
    private Character lrobjetoshab;
    @Basic(optional = false)
    @Column(name = "LROBJETOSFVA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjetosfva;
    @Column(name = "LROBJETOSNIV")
    private Short lrobjetosniv;
    @Basic(optional = false)
    @Column(name = "LROBJETOSORD", nullable = false)
    private short lrobjetosord;
    @Basic(optional = false)
    @Column(name = "LROBJETOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjetosfal;
    @Basic(optional = false)
    @Column(name = "LROBJETOSUAL", nullable = false, length = 30)
    private String lrobjetosual;
    @Column(name = "LROBJETOSFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjetosfmd;
    @Column(name = "LROBJETOSUMD", length = 30)
    private String lrobjetosumd;
    @Column(name = "LROBJETOSDES", length = 500)
    private String lrobjetosdes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrobjetos")
    private List<Lrobjperf> lrobjperfList;
    @JoinColumn(name = "LRGRUPOSOBJETOSID", referencedColumnName = "LRGRUPOSOBJETOSID")
    @ManyToOne
    private Lrgruposobjetos lrgruposobjetosid;
    @OneToMany(mappedBy = "lrobjetossid")
    private List<Lrobjetos> lrobjetosList;
    @JoinColumn(name = "LROBJETOSSID", referencedColumnName = "LROBJETOSID")
    @ManyToOne
    private Lrobjetos lrobjetossid;
    @OneToMany(mappedBy = "lrobjetosprg")
    private List<Lrobjetos> lrobjetosList1;
    @JoinColumn(name = "LROBJETOSPRG", referencedColumnName = "LROBJETOSID")
    @ManyToOne
    private Lrobjetos lrobjetosprg;
    @JoinColumn(name = "LRTIPOSOBJETOSID", referencedColumnName = "LRTIPOSOBJETOSID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtiposobjetos lrtiposobjetosid;

    public Lrobjetos() {
    }

    public Lrobjetos(Long lrobjetosid) {
        this.lrobjetosid = lrobjetosid;
    }

    public Lrobjetos(Long lrobjetosid, String lrobjetosnom, Character lrobjetoshab, Date lrobjetosfva, short lrobjetosord, Date lrobjetosfal, String lrobjetosual) {
        this.lrobjetosid = lrobjetosid;
        this.lrobjetosnom = lrobjetosnom;
        this.lrobjetoshab = lrobjetoshab;
        this.lrobjetosfva = lrobjetosfva;
        this.lrobjetosord = lrobjetosord;
        this.lrobjetosfal = lrobjetosfal;
        this.lrobjetosual = lrobjetosual;
    }

    public Long getLrobjetosid() {
        return lrobjetosid;
    }

    public void setLrobjetosid(Long lrobjetosid) {
        this.lrobjetosid = lrobjetosid;
    }

    public String getLrobjetosnom() {
        return lrobjetosnom;
    }

    public void setLrobjetosnom(String lrobjetosnom) {
        this.lrobjetosnom = lrobjetosnom;
    }

    public Character getLrobjetoshab() {
        return lrobjetoshab;
    }

    public void setLrobjetoshab(Character lrobjetoshab) {
        this.lrobjetoshab = lrobjetoshab;
    }

    public Date getLrobjetosfva() {
        return lrobjetosfva;
    }

    public void setLrobjetosfva(Date lrobjetosfva) {
        this.lrobjetosfva = lrobjetosfva;
    }

    public Short getLrobjetosniv() {
        return lrobjetosniv;
    }

    public void setLrobjetosniv(Short lrobjetosniv) {
        this.lrobjetosniv = lrobjetosniv;
    }

    public short getLrobjetosord() {
        return lrobjetosord;
    }

    public void setLrobjetosord(short lrobjetosord) {
        this.lrobjetosord = lrobjetosord;
    }

    public Date getLrobjetosfal() {
        return lrobjetosfal;
    }

    public void setLrobjetosfal(Date lrobjetosfal) {
        this.lrobjetosfal = lrobjetosfal;
    }

    public String getLrobjetosual() {
        return lrobjetosual;
    }

    public void setLrobjetosual(String lrobjetosual) {
        this.lrobjetosual = lrobjetosual;
    }

    public Date getLrobjetosfmd() {
        return lrobjetosfmd;
    }

    public void setLrobjetosfmd(Date lrobjetosfmd) {
        this.lrobjetosfmd = lrobjetosfmd;
    }

    public String getLrobjetosumd() {
        return lrobjetosumd;
    }

    public void setLrobjetosumd(String lrobjetosumd) {
        this.lrobjetosumd = lrobjetosumd;
    }

    public String getLrobjetosdes() {
        return lrobjetosdes;
    }

    public void setLrobjetosdes(String lrobjetosdes) {
        this.lrobjetosdes = lrobjetosdes;
    }

    public List<Lrobjperf> getLrobjperfList() {
        return lrobjperfList;
    }

    public void setLrobjperfList(List<Lrobjperf> lrobjperfList) {
        this.lrobjperfList = lrobjperfList;
    }

    public Lrgruposobjetos getLrgruposobjetosid() {
        return lrgruposobjetosid;
    }

    public void setLrgruposobjetosid(Lrgruposobjetos lrgruposobjetosid) {
        this.lrgruposobjetosid = lrgruposobjetosid;
    }

    public List<Lrobjetos> getLrobjetosList() {
        return lrobjetosList;
    }

    public void setLrobjetosList(List<Lrobjetos> lrobjetosList) {
        this.lrobjetosList = lrobjetosList;
    }

    public Lrobjetos getLrobjetossid() {
        return lrobjetossid;
    }

    public void setLrobjetossid(Lrobjetos lrobjetossid) {
        this.lrobjetossid = lrobjetossid;
    }

    public List<Lrobjetos> getLrobjetosList1() {
        return lrobjetosList1;
    }

    public void setLrobjetosList1(List<Lrobjetos> lrobjetosList1) {
        this.lrobjetosList1 = lrobjetosList1;
    }

    public Lrobjetos getLrobjetosprg() {
        return lrobjetosprg;
    }

    public void setLrobjetosprg(Lrobjetos lrobjetosprg) {
        this.lrobjetosprg = lrobjetosprg;
    }

    public Lrtiposobjetos getLrtiposobjetosid() {
        return lrtiposobjetosid;
    }

    public void setLrtiposobjetosid(Lrtiposobjetos lrtiposobjetosid) {
        this.lrtiposobjetosid = lrtiposobjetosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrobjetosid != null ? lrobjetosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrobjetos)) {
            return false;
        }
        Lrobjetos other = (Lrobjetos) object;
        if ((this.lrobjetosid == null && other.lrobjetosid != null) || (this.lrobjetosid != null && !this.lrobjetosid.equals(other.lrobjetosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrobjetos[ lrobjetosid=" + lrobjetosid + " ]";
    }
    
}
