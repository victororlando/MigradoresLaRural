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
@Table(name = "LRMEDIOSTRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "Lrmediostransporte.findAll", query = "SELECT l FROM Lrmediostransporte l"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransporteid", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransporteid = :lrmediostransporteid"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransportedesc", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransportedesc = :lrmediostransportedesc"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransporteual", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransporteual = :lrmediostransporteual"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransportefal", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransportefal = :lrmediostransportefal"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransportefmd", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransportefmd = :lrmediostransportefmd"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransporteumd", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransporteumd = :lrmediostransporteumd"),
    @NamedQuery(name = "Lrmediostransporte.findByLrmediostransportehab", query = "SELECT l FROM Lrmediostransporte l WHERE l.lrmediostransportehab = :lrmediostransportehab")})
public class Lrmediostransporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEID", nullable = false)
    private Long lrmediostransporteid;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEDESC", nullable = false, length = 30)
    private String lrmediostransportedesc;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEUAL", nullable = false, length = 30)
    private String lrmediostransporteual;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmediostransportefal;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmediostransportefmd;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEUMD", nullable = false, length = 30)
    private String lrmediostransporteumd;
    @Basic(optional = false)
    @Column(name = "LRMEDIOSTRANSPORTEHAB", nullable = false)
    private Character lrmediostransportehab;
    @JoinColumn(name = "LRVIATRANSPORTEID", referencedColumnName = "LRVIATRANSPORTEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrviatransporte lrviatransporteid;
    @OneToMany(mappedBy = "lrmediostransporteid")
    private List<Lrdetalletransporte> lrdetalletransporteList;

    public Lrmediostransporte() {
    }

    public Lrmediostransporte(Long lrmediostransporteid) {
        this.lrmediostransporteid = lrmediostransporteid;
    }

    public Lrmediostransporte(Long lrmediostransporteid, String lrmediostransportedesc, String lrmediostransporteual, Date lrmediostransportefal, Date lrmediostransportefmd, String lrmediostransporteumd, Character lrmediostransportehab) {
        this.lrmediostransporteid = lrmediostransporteid;
        this.lrmediostransportedesc = lrmediostransportedesc;
        this.lrmediostransporteual = lrmediostransporteual;
        this.lrmediostransportefal = lrmediostransportefal;
        this.lrmediostransportefmd = lrmediostransportefmd;
        this.lrmediostransporteumd = lrmediostransporteumd;
        this.lrmediostransportehab = lrmediostransportehab;
    }

    public Long getLrmediostransporteid() {
        return lrmediostransporteid;
    }

    public void setLrmediostransporteid(Long lrmediostransporteid) {
        this.lrmediostransporteid = lrmediostransporteid;
    }

    public String getLrmediostransportedesc() {
        return lrmediostransportedesc;
    }

    public void setLrmediostransportedesc(String lrmediostransportedesc) {
        this.lrmediostransportedesc = lrmediostransportedesc;
    }

    public String getLrmediostransporteual() {
        return lrmediostransporteual;
    }

    public void setLrmediostransporteual(String lrmediostransporteual) {
        this.lrmediostransporteual = lrmediostransporteual;
    }

    public Date getLrmediostransportefal() {
        return lrmediostransportefal;
    }

    public void setLrmediostransportefal(Date lrmediostransportefal) {
        this.lrmediostransportefal = lrmediostransportefal;
    }

    public Date getLrmediostransportefmd() {
        return lrmediostransportefmd;
    }

    public void setLrmediostransportefmd(Date lrmediostransportefmd) {
        this.lrmediostransportefmd = lrmediostransportefmd;
    }

    public String getLrmediostransporteumd() {
        return lrmediostransporteumd;
    }

    public void setLrmediostransporteumd(String lrmediostransporteumd) {
        this.lrmediostransporteumd = lrmediostransporteumd;
    }

    public Character getLrmediostransportehab() {
        return lrmediostransportehab;
    }

    public void setLrmediostransportehab(Character lrmediostransportehab) {
        this.lrmediostransportehab = lrmediostransportehab;
    }

    public Lrviatransporte getLrviatransporteid() {
        return lrviatransporteid;
    }

    public void setLrviatransporteid(Lrviatransporte lrviatransporteid) {
        this.lrviatransporteid = lrviatransporteid;
    }

    public List<Lrdetalletransporte> getLrdetalletransporteList() {
        return lrdetalletransporteList;
    }

    public void setLrdetalletransporteList(List<Lrdetalletransporte> lrdetalletransporteList) {
        this.lrdetalletransporteList = lrdetalletransporteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmediostransporteid != null ? lrmediostransporteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmediostransporte)) {
            return false;
        }
        Lrmediostransporte other = (Lrmediostransporte) object;
        if ((this.lrmediostransporteid == null && other.lrmediostransporteid != null) || (this.lrmediostransporteid != null && !this.lrmediostransporteid.equals(other.lrmediostransporteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmediostransporte[ lrmediostransporteid=" + lrmediostransporteid + " ]";
    }
    
}
