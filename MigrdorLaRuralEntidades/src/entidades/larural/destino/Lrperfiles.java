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
@Table(name = "LRPERFILES")
@NamedQueries({
    @NamedQuery(name = "Lrperfiles.findAll", query = "SELECT l FROM Lrperfiles l"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesid", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesid = :lrperfilesid"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesnom", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesnom = :lrperfilesnom"),
    @NamedQuery(name = "Lrperfiles.findByLrperfileshab", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfileshab = :lrperfileshab"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesadm", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesadm = :lrperfilesadm"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesfal", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesfal = :lrperfilesfal"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesual", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesual = :lrperfilesual"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesfmd", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesfmd = :lrperfilesfmd"),
    @NamedQuery(name = "Lrperfiles.findByLrperfilesumd", query = "SELECT l FROM Lrperfiles l WHERE l.lrperfilesumd = :lrperfilesumd"),
    @NamedQuery(name = "Lrperfiles.findByLrsubareaid", query = "SELECT l FROM Lrperfiles l WHERE l.lrsubareaid = :lrsubareaid"),
    @NamedQuery(name = "Lrperfiles.findByLrareaid", query = "SELECT l FROM Lrperfiles l WHERE l.lrareaid = :lrareaid")})
public class Lrperfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERFILESID", nullable = false)
    private Long lrperfilesid;
    @Basic(optional = false)
    @Column(name = "LRPERFILESNOM", nullable = false, length = 60)
    private String lrperfilesnom;
    @Basic(optional = false)
    @Column(name = "LRPERFILESHAB", nullable = false)
    private Character lrperfileshab;
    @Basic(optional = false)
    @Column(name = "LRPERFILESADM", nullable = false)
    private Character lrperfilesadm;
    @Basic(optional = false)
    @Column(name = "LRPERFILESFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperfilesfal;
    @Basic(optional = false)
    @Column(name = "LRPERFILESUAL", nullable = false, length = 30)
    private String lrperfilesual;
    @Column(name = "LRPERFILESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperfilesfmd;
    @Column(name = "LRPERFILESUMD", length = 30)
    private String lrperfilesumd;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAID", nullable = false)
    private long lrsubareaid;
    @Basic(optional = false)
    @Column(name = "LRAREAID", nullable = false)
    private long lrareaid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrperfiles")
    private List<Lrusuperfiles> lrusuperfilesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrperfilesid")
    private List<Lrflujopantalla> lrflujopantallaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrperfilesid")
    private List<Lrparmcotidetperfiles> lrparmcotidetperfilesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrperfiles")
    private List<Lrobjperf> lrobjperfList;

    public Lrperfiles() {
    }

    public Lrperfiles(Long lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    public Lrperfiles(Long lrperfilesid, String lrperfilesnom, Character lrperfileshab, Character lrperfilesadm, Date lrperfilesfal, String lrperfilesual, long lrsubareaid, long lrareaid) {
        this.lrperfilesid = lrperfilesid;
        this.lrperfilesnom = lrperfilesnom;
        this.lrperfileshab = lrperfileshab;
        this.lrperfilesadm = lrperfilesadm;
        this.lrperfilesfal = lrperfilesfal;
        this.lrperfilesual = lrperfilesual;
        this.lrsubareaid = lrsubareaid;
        this.lrareaid = lrareaid;
    }

    public Long getLrperfilesid() {
        return lrperfilesid;
    }

    public void setLrperfilesid(Long lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    public String getLrperfilesnom() {
        return lrperfilesnom;
    }

    public void setLrperfilesnom(String lrperfilesnom) {
        this.lrperfilesnom = lrperfilesnom;
    }

    public Character getLrperfileshab() {
        return lrperfileshab;
    }

    public void setLrperfileshab(Character lrperfileshab) {
        this.lrperfileshab = lrperfileshab;
    }

    public Character getLrperfilesadm() {
        return lrperfilesadm;
    }

    public void setLrperfilesadm(Character lrperfilesadm) {
        this.lrperfilesadm = lrperfilesadm;
    }

    public Date getLrperfilesfal() {
        return lrperfilesfal;
    }

    public void setLrperfilesfal(Date lrperfilesfal) {
        this.lrperfilesfal = lrperfilesfal;
    }

    public String getLrperfilesual() {
        return lrperfilesual;
    }

    public void setLrperfilesual(String lrperfilesual) {
        this.lrperfilesual = lrperfilesual;
    }

    public Date getLrperfilesfmd() {
        return lrperfilesfmd;
    }

    public void setLrperfilesfmd(Date lrperfilesfmd) {
        this.lrperfilesfmd = lrperfilesfmd;
    }

    public String getLrperfilesumd() {
        return lrperfilesumd;
    }

    public void setLrperfilesumd(String lrperfilesumd) {
        this.lrperfilesumd = lrperfilesumd;
    }

    public long getLrsubareaid() {
        return lrsubareaid;
    }

    public void setLrsubareaid(long lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    public long getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(long lrareaid) {
        this.lrareaid = lrareaid;
    }

    public List<Lrusuperfiles> getLrusuperfilesList() {
        return lrusuperfilesList;
    }

    public void setLrusuperfilesList(List<Lrusuperfiles> lrusuperfilesList) {
        this.lrusuperfilesList = lrusuperfilesList;
    }

    public List<Lrflujopantalla> getLrflujopantallaList() {
        return lrflujopantallaList;
    }

    public void setLrflujopantallaList(List<Lrflujopantalla> lrflujopantallaList) {
        this.lrflujopantallaList = lrflujopantallaList;
    }

    public List<Lrparmcotidetperfiles> getLrparmcotidetperfilesList() {
        return lrparmcotidetperfilesList;
    }

    public void setLrparmcotidetperfilesList(List<Lrparmcotidetperfiles> lrparmcotidetperfilesList) {
        this.lrparmcotidetperfilesList = lrparmcotidetperfilesList;
    }

    public List<Lrobjperf> getLrobjperfList() {
        return lrobjperfList;
    }

    public void setLrobjperfList(List<Lrobjperf> lrobjperfList) {
        this.lrobjperfList = lrobjperfList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrperfilesid != null ? lrperfilesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrperfiles)) {
            return false;
        }
        Lrperfiles other = (Lrperfiles) object;
        if ((this.lrperfilesid == null && other.lrperfilesid != null) || (this.lrperfilesid != null && !this.lrperfilesid.equals(other.lrperfilesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrperfiles[ lrperfilesid=" + lrperfilesid + " ]";
    }
    
}
