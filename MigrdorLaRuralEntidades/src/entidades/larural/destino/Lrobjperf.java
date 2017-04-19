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
@Table(name = "LROBJPERF")
@NamedQueries({
    @NamedQuery(name = "Lrobjperf.findAll", query = "SELECT l FROM Lrobjperf l"),
    @NamedQuery(name = "Lrobjperf.findByLrperfilesid", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfPK.lrperfilesid = :lrperfilesid"),
    @NamedQuery(name = "Lrobjperf.findByLrobjetosid", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfPK.lrobjetosid = :lrobjetosid"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfhab", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfhab = :lrobjperfhab"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfsel", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfsel = :lrobjperfsel"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfins", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfins = :lrobjperfins"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfupd", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfupd = :lrobjperfupd"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfdel", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfdel = :lrobjperfdel"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfgar", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfgar = :lrobjperfgar"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperffal", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperffal = :lrobjperffal"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfual", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfual = :lrobjperfual"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperffmd", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperffmd = :lrobjperffmd"),
    @NamedQuery(name = "Lrobjperf.findByLrobjperfumd", query = "SELECT l FROM Lrobjperf l WHERE l.lrobjperfumd = :lrobjperfumd")})
public class Lrobjperf implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrobjperfPK lrobjperfPK;
    @Basic(optional = false)
    @Column(name = "LROBJPERFHAB", nullable = false)
    private Character lrobjperfhab;
    @Column(name = "LROBJPERFSEL")
    private Character lrobjperfsel;
    @Column(name = "LROBJPERFINS")
    private Character lrobjperfins;
    @Column(name = "LROBJPERFUPD")
    private Character lrobjperfupd;
    @Column(name = "LROBJPERFDEL")
    private Character lrobjperfdel;
    @Column(name = "LROBJPERFGAR")
    private Character lrobjperfgar;
    @Basic(optional = false)
    @Column(name = "LROBJPERFFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjperffal;
    @Basic(optional = false)
    @Column(name = "LROBJPERFUAL", nullable = false, length = 30)
    private String lrobjperfual;
    @Column(name = "LROBJPERFFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjperffmd;
    @Column(name = "LROBJPERFUMD", length = 30)
    private String lrobjperfumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrobjperf")
    private List<Lrflujopantalla> lrflujopantallaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrobjperf1")
    private List<Lrflujopantalla> lrflujopantallaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrobjperf2")
    private List<Lrflujopantalla> lrflujopantallaList2;
    @JoinColumn(name = "LROBJETOSID", referencedColumnName = "LROBJETOSID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrobjetos lrobjetos;
    @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrperfiles lrperfiles;

    public Lrobjperf() {
    }

    public Lrobjperf(LrobjperfPK lrobjperfPK) {
        this.lrobjperfPK = lrobjperfPK;
    }

    public Lrobjperf(LrobjperfPK lrobjperfPK, Character lrobjperfhab, Date lrobjperffal, String lrobjperfual) {
        this.lrobjperfPK = lrobjperfPK;
        this.lrobjperfhab = lrobjperfhab;
        this.lrobjperffal = lrobjperffal;
        this.lrobjperfual = lrobjperfual;
    }

    public Lrobjperf(long lrperfilesid, long lrobjetosid) {
        this.lrobjperfPK = new LrobjperfPK(lrperfilesid, lrobjetosid);
    }

    public LrobjperfPK getLrobjperfPK() {
        return lrobjperfPK;
    }

    public void setLrobjperfPK(LrobjperfPK lrobjperfPK) {
        this.lrobjperfPK = lrobjperfPK;
    }

    public Character getLrobjperfhab() {
        return lrobjperfhab;
    }

    public void setLrobjperfhab(Character lrobjperfhab) {
        this.lrobjperfhab = lrobjperfhab;
    }

    public Character getLrobjperfsel() {
        return lrobjperfsel;
    }

    public void setLrobjperfsel(Character lrobjperfsel) {
        this.lrobjperfsel = lrobjperfsel;
    }

    public Character getLrobjperfins() {
        return lrobjperfins;
    }

    public void setLrobjperfins(Character lrobjperfins) {
        this.lrobjperfins = lrobjperfins;
    }

    public Character getLrobjperfupd() {
        return lrobjperfupd;
    }

    public void setLrobjperfupd(Character lrobjperfupd) {
        this.lrobjperfupd = lrobjperfupd;
    }

    public Character getLrobjperfdel() {
        return lrobjperfdel;
    }

    public void setLrobjperfdel(Character lrobjperfdel) {
        this.lrobjperfdel = lrobjperfdel;
    }

    public Character getLrobjperfgar() {
        return lrobjperfgar;
    }

    public void setLrobjperfgar(Character lrobjperfgar) {
        this.lrobjperfgar = lrobjperfgar;
    }

    public Date getLrobjperffal() {
        return lrobjperffal;
    }

    public void setLrobjperffal(Date lrobjperffal) {
        this.lrobjperffal = lrobjperffal;
    }

    public String getLrobjperfual() {
        return lrobjperfual;
    }

    public void setLrobjperfual(String lrobjperfual) {
        this.lrobjperfual = lrobjperfual;
    }

    public Date getLrobjperffmd() {
        return lrobjperffmd;
    }

    public void setLrobjperffmd(Date lrobjperffmd) {
        this.lrobjperffmd = lrobjperffmd;
    }

    public String getLrobjperfumd() {
        return lrobjperfumd;
    }

    public void setLrobjperfumd(String lrobjperfumd) {
        this.lrobjperfumd = lrobjperfumd;
    }

    public List<Lrflujopantalla> getLrflujopantallaList() {
        return lrflujopantallaList;
    }

    public void setLrflujopantallaList(List<Lrflujopantalla> lrflujopantallaList) {
        this.lrflujopantallaList = lrflujopantallaList;
    }

    public List<Lrflujopantalla> getLrflujopantallaList1() {
        return lrflujopantallaList1;
    }

    public void setLrflujopantallaList1(List<Lrflujopantalla> lrflujopantallaList1) {
        this.lrflujopantallaList1 = lrflujopantallaList1;
    }

    public List<Lrflujopantalla> getLrflujopantallaList2() {
        return lrflujopantallaList2;
    }

    public void setLrflujopantallaList2(List<Lrflujopantalla> lrflujopantallaList2) {
        this.lrflujopantallaList2 = lrflujopantallaList2;
    }

    public Lrobjetos getLrobjetos() {
        return lrobjetos;
    }

    public void setLrobjetos(Lrobjetos lrobjetos) {
        this.lrobjetos = lrobjetos;
    }

    public Lrperfiles getLrperfiles() {
        return lrperfiles;
    }

    public void setLrperfiles(Lrperfiles lrperfiles) {
        this.lrperfiles = lrperfiles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrobjperfPK != null ? lrobjperfPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrobjperf)) {
            return false;
        }
        Lrobjperf other = (Lrobjperf) object;
        if ((this.lrobjperfPK == null && other.lrobjperfPK != null) || (this.lrobjperfPK != null && !this.lrobjperfPK.equals(other.lrobjperfPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrobjperf[ lrobjperfPK=" + lrobjperfPK + " ]";
    }
    
}
