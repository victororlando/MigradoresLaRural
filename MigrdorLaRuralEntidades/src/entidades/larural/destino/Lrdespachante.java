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
@Table(name = "LRDESPACHANTE")
@NamedQueries({
    @NamedQuery(name = "Lrdespachante.findAll", query = "SELECT l FROM Lrdespachante l"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteid", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteid = :lrdespachanteid"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteci", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteci = :lrdespachanteci"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteruc", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteruc = :lrdespachanteruc"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanterazonsocial", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanterazonsocial = :lrdespachanterazonsocial"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachantematriculanro", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachantematriculanro = :lrdespachantematriculanro"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteoficina", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteoficina = :lrdespachanteoficina"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachantedireccion", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachantedireccion = :lrdespachantedireccion"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachantefal", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachantefal = :lrdespachantefal"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteual", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteual = :lrdespachanteual"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachantefmd", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachantefmd = :lrdespachantefmd"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachanteumd", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachanteumd = :lrdespachanteumd"),
    @NamedQuery(name = "Lrdespachante.findByLrdespachantehab", query = "SELECT l FROM Lrdespachante l WHERE l.lrdespachantehab = :lrdespachantehab")})
public class Lrdespachante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEID", nullable = false)
    private Long lrdespachanteid;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTECI", nullable = false, length = 20)
    private String lrdespachanteci;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTERUC", nullable = false, length = 20)
    private String lrdespachanteruc;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTERAZONSOCIAL", nullable = false, length = 200)
    private String lrdespachanterazonsocial;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEMATRICULANRO", nullable = false, length = 30)
    private String lrdespachantematriculanro;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEOFICINA", nullable = false, length = 100)
    private String lrdespachanteoficina;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEDIRECCION", nullable = false, length = 100)
    private String lrdespachantedireccion;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdespachantefal;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEUAL", nullable = false, length = 30)
    private String lrdespachanteual;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdespachantefmd;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEUMD", nullable = false, length = 30)
    private String lrdespachanteumd;
    @Basic(optional = false)
    @Column(name = "LRDESPACHANTEHAB", nullable = false)
    private Character lrdespachantehab;
    @OneToMany(mappedBy = "lrdespachanteid")
    private List<Lrcotidatbienase> lrcotidatbienaseList;

    public Lrdespachante() {
    }

    public Lrdespachante(Long lrdespachanteid) {
        this.lrdespachanteid = lrdespachanteid;
    }

    public Lrdespachante(Long lrdespachanteid, String lrdespachanteci, String lrdespachanteruc, String lrdespachanterazonsocial, String lrdespachantematriculanro, String lrdespachanteoficina, String lrdespachantedireccion, Date lrdespachantefal, String lrdespachanteual, Date lrdespachantefmd, String lrdespachanteumd, Character lrdespachantehab) {
        this.lrdespachanteid = lrdespachanteid;
        this.lrdespachanteci = lrdespachanteci;
        this.lrdespachanteruc = lrdespachanteruc;
        this.lrdespachanterazonsocial = lrdespachanterazonsocial;
        this.lrdespachantematriculanro = lrdespachantematriculanro;
        this.lrdespachanteoficina = lrdespachanteoficina;
        this.lrdespachantedireccion = lrdespachantedireccion;
        this.lrdespachantefal = lrdespachantefal;
        this.lrdespachanteual = lrdespachanteual;
        this.lrdespachantefmd = lrdespachantefmd;
        this.lrdespachanteumd = lrdespachanteumd;
        this.lrdespachantehab = lrdespachantehab;
    }

    public Long getLrdespachanteid() {
        return lrdespachanteid;
    }

    public void setLrdespachanteid(Long lrdespachanteid) {
        this.lrdespachanteid = lrdespachanteid;
    }

    public String getLrdespachanteci() {
        return lrdespachanteci;
    }

    public void setLrdespachanteci(String lrdespachanteci) {
        this.lrdespachanteci = lrdespachanteci;
    }

    public String getLrdespachanteruc() {
        return lrdespachanteruc;
    }

    public void setLrdespachanteruc(String lrdespachanteruc) {
        this.lrdespachanteruc = lrdespachanteruc;
    }

    public String getLrdespachanterazonsocial() {
        return lrdespachanterazonsocial;
    }

    public void setLrdespachanterazonsocial(String lrdespachanterazonsocial) {
        this.lrdespachanterazonsocial = lrdespachanterazonsocial;
    }

    public String getLrdespachantematriculanro() {
        return lrdespachantematriculanro;
    }

    public void setLrdespachantematriculanro(String lrdespachantematriculanro) {
        this.lrdespachantematriculanro = lrdespachantematriculanro;
    }

    public String getLrdespachanteoficina() {
        return lrdespachanteoficina;
    }

    public void setLrdespachanteoficina(String lrdespachanteoficina) {
        this.lrdespachanteoficina = lrdespachanteoficina;
    }

    public String getLrdespachantedireccion() {
        return lrdespachantedireccion;
    }

    public void setLrdespachantedireccion(String lrdespachantedireccion) {
        this.lrdespachantedireccion = lrdespachantedireccion;
    }

    public Date getLrdespachantefal() {
        return lrdespachantefal;
    }

    public void setLrdespachantefal(Date lrdespachantefal) {
        this.lrdespachantefal = lrdespachantefal;
    }

    public String getLrdespachanteual() {
        return lrdespachanteual;
    }

    public void setLrdespachanteual(String lrdespachanteual) {
        this.lrdespachanteual = lrdespachanteual;
    }

    public Date getLrdespachantefmd() {
        return lrdespachantefmd;
    }

    public void setLrdespachantefmd(Date lrdespachantefmd) {
        this.lrdespachantefmd = lrdespachantefmd;
    }

    public String getLrdespachanteumd() {
        return lrdespachanteumd;
    }

    public void setLrdespachanteumd(String lrdespachanteumd) {
        this.lrdespachanteumd = lrdespachanteumd;
    }

    public Character getLrdespachantehab() {
        return lrdespachantehab;
    }

    public void setLrdespachantehab(Character lrdespachantehab) {
        this.lrdespachantehab = lrdespachantehab;
    }

    public List<Lrcotidatbienase> getLrcotidatbienaseList() {
        return lrcotidatbienaseList;
    }

    public void setLrcotidatbienaseList(List<Lrcotidatbienase> lrcotidatbienaseList) {
        this.lrcotidatbienaseList = lrcotidatbienaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdespachanteid != null ? lrdespachanteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdespachante)) {
            return false;
        }
        Lrdespachante other = (Lrdespachante) object;
        if ((this.lrdespachanteid == null && other.lrdespachanteid != null) || (this.lrdespachanteid != null && !this.lrdespachanteid.equals(other.lrdespachanteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdespachante[ lrdespachanteid=" + lrdespachanteid + " ]";
    }
    
}
