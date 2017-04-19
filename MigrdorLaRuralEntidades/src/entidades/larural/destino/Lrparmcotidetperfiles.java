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
@Table(name = "LRPARMCOTIDETPERFILES")
@NamedQueries({
    @NamedQuery(name = "Lrparmcotidetperfiles.findAll", query = "SELECT l FROM Lrparmcotidetperfiles l"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesid", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesid = :lrparmcotidetperfilesid"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findBySeccid", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByTiposserviciosseccid", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.tiposserviciosseccid = :tiposserviciosseccid"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByProvid", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.provid = :provid"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesed", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesed = :lrparmcotidetperfilesed"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesvis", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesvis = :lrparmcotidetperfilesvis"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesac", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesac = :lrparmcotidetperfilesac"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesual", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesual = :lrparmcotidetperfilesual"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesfal", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesfal = :lrparmcotidetperfilesfal"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesumd", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesumd = :lrparmcotidetperfilesumd"),
    @NamedQuery(name = "Lrparmcotidetperfiles.findByLrparmcotidetperfilesfmd", query = "SELECT l FROM Lrparmcotidetperfiles l WHERE l.lrparmcotidetperfilesfmd = :lrparmcotidetperfilesfmd")})
public class Lrparmcotidetperfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESID", nullable = false)
    private Long lrparmcotidetperfilesid;
    @Column(name = "SECCID")
    private Short seccid;
    @Column(name = "TIPOSSERVICIOSSECCID")
    private Short tiposserviciosseccid;
    @Column(name = "PROVID")
    private Integer provid;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESED", nullable = false)
    private Character lrparmcotidetperfilesed;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESVIS", nullable = false)
    private Character lrparmcotidetperfilesvis;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESAC", nullable = false)
    private Character lrparmcotidetperfilesac;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUAL", nullable = false, length = 30)
    private String lrparmcotidetperfilesual;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotidetperfilesfal;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUMD", nullable = false, length = 30)
    private String lrparmcotidetperfilesumd;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotidetperfilesfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotidetperfiles")
    private List<Lrparmcotidetperfilesusu> lrparmcotidetperfilesusuList;
    @JoinColumn(name = "LRAJUSTEID", referencedColumnName = "LRAJUSTEID")
    @ManyToOne
    private Lrajuste lrajusteid;
    @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false)
    @ManyToOne(optional = false)
    private Lrperfiles lrperfilesid;

    public Lrparmcotidetperfiles() {
    }

    public Lrparmcotidetperfiles(Long lrparmcotidetperfilesid) {
        this.lrparmcotidetperfilesid = lrparmcotidetperfilesid;
    }

    public Lrparmcotidetperfiles(Long lrparmcotidetperfilesid, Character lrparmcotidetperfilesed, Character lrparmcotidetperfilesvis, Character lrparmcotidetperfilesac, String lrparmcotidetperfilesual, Date lrparmcotidetperfilesfal, String lrparmcotidetperfilesumd, Date lrparmcotidetperfilesfmd) {
        this.lrparmcotidetperfilesid = lrparmcotidetperfilesid;
        this.lrparmcotidetperfilesed = lrparmcotidetperfilesed;
        this.lrparmcotidetperfilesvis = lrparmcotidetperfilesvis;
        this.lrparmcotidetperfilesac = lrparmcotidetperfilesac;
        this.lrparmcotidetperfilesual = lrparmcotidetperfilesual;
        this.lrparmcotidetperfilesfal = lrparmcotidetperfilesfal;
        this.lrparmcotidetperfilesumd = lrparmcotidetperfilesumd;
        this.lrparmcotidetperfilesfmd = lrparmcotidetperfilesfmd;
    }

    public Long getLrparmcotidetperfilesid() {
        return lrparmcotidetperfilesid;
    }

    public void setLrparmcotidetperfilesid(Long lrparmcotidetperfilesid) {
        this.lrparmcotidetperfilesid = lrparmcotidetperfilesid;
    }

    public Short getSeccid() {
        return seccid;
    }

    public void setSeccid(Short seccid) {
        this.seccid = seccid;
    }

    public Short getTiposserviciosseccid() {
        return tiposserviciosseccid;
    }

    public void setTiposserviciosseccid(Short tiposserviciosseccid) {
        this.tiposserviciosseccid = tiposserviciosseccid;
    }

    public Integer getProvid() {
        return provid;
    }

    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    public Character getLrparmcotidetperfilesed() {
        return lrparmcotidetperfilesed;
    }

    public void setLrparmcotidetperfilesed(Character lrparmcotidetperfilesed) {
        this.lrparmcotidetperfilesed = lrparmcotidetperfilesed;
    }

    public Character getLrparmcotidetperfilesvis() {
        return lrparmcotidetperfilesvis;
    }

    public void setLrparmcotidetperfilesvis(Character lrparmcotidetperfilesvis) {
        this.lrparmcotidetperfilesvis = lrparmcotidetperfilesvis;
    }

    public Character getLrparmcotidetperfilesac() {
        return lrparmcotidetperfilesac;
    }

    public void setLrparmcotidetperfilesac(Character lrparmcotidetperfilesac) {
        this.lrparmcotidetperfilesac = lrparmcotidetperfilesac;
    }

    public String getLrparmcotidetperfilesual() {
        return lrparmcotidetperfilesual;
    }

    public void setLrparmcotidetperfilesual(String lrparmcotidetperfilesual) {
        this.lrparmcotidetperfilesual = lrparmcotidetperfilesual;
    }

    public Date getLrparmcotidetperfilesfal() {
        return lrparmcotidetperfilesfal;
    }

    public void setLrparmcotidetperfilesfal(Date lrparmcotidetperfilesfal) {
        this.lrparmcotidetperfilesfal = lrparmcotidetperfilesfal;
    }

    public String getLrparmcotidetperfilesumd() {
        return lrparmcotidetperfilesumd;
    }

    public void setLrparmcotidetperfilesumd(String lrparmcotidetperfilesumd) {
        this.lrparmcotidetperfilesumd = lrparmcotidetperfilesumd;
    }

    public Date getLrparmcotidetperfilesfmd() {
        return lrparmcotidetperfilesfmd;
    }

    public void setLrparmcotidetperfilesfmd(Date lrparmcotidetperfilesfmd) {
        this.lrparmcotidetperfilesfmd = lrparmcotidetperfilesfmd;
    }

    public List<Lrparmcotidetperfilesusu> getLrparmcotidetperfilesusuList() {
        return lrparmcotidetperfilesusuList;
    }

    public void setLrparmcotidetperfilesusuList(List<Lrparmcotidetperfilesusu> lrparmcotidetperfilesusuList) {
        this.lrparmcotidetperfilesusuList = lrparmcotidetperfilesusuList;
    }

    public Lrajuste getLrajusteid() {
        return lrajusteid;
    }

    public void setLrajusteid(Lrajuste lrajusteid) {
        this.lrajusteid = lrajusteid;
    }

    public Lrperfiles getLrperfilesid() {
        return lrperfilesid;
    }

    public void setLrperfilesid(Lrperfiles lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmcotidetperfilesid != null ? lrparmcotidetperfilesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmcotidetperfiles)) {
            return false;
        }
        Lrparmcotidetperfiles other = (Lrparmcotidetperfiles) object;
        if ((this.lrparmcotidetperfilesid == null && other.lrparmcotidetperfilesid != null) || (this.lrparmcotidetperfilesid != null && !this.lrparmcotidetperfilesid.equals(other.lrparmcotidetperfilesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmcotidetperfiles[ lrparmcotidetperfilesid=" + lrparmcotidetperfilesid + " ]";
    }
    
}
