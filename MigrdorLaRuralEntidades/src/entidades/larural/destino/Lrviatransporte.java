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
@Table(name = "LRVIATRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "Lrviatransporte.findAll", query = "SELECT l FROM Lrviatransporte l"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransporteid", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransporteid = :lrviatransporteid"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransportedesc", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransportedesc = :lrviatransportedesc"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransporteual", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransporteual = :lrviatransporteual"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransportefal", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransportefal = :lrviatransportefal"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransporteumd", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransporteumd = :lrviatransporteumd"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransportefmd", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransportefmd = :lrviatransportefmd"),
    @NamedQuery(name = "Lrviatransporte.findByLrviatransportehab", query = "SELECT l FROM Lrviatransporte l WHERE l.lrviatransportehab = :lrviatransportehab")})
public class Lrviatransporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEID", nullable = false)
    private Long lrviatransporteid;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEDESC", nullable = false, length = 100)
    private String lrviatransportedesc;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEUAL", nullable = false, length = 30)
    private String lrviatransporteual;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrviatransportefal;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEUMD", nullable = false, length = 30)
    private String lrviatransporteumd;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrviatransportefmd;
    @Basic(optional = false)
    @Column(name = "LRVIATRANSPORTEHAB", nullable = false)
    private Character lrviatransportehab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrviatransporteid")
    private List<Lrmediostransporte> lrmediostransporteList;
    @OneToMany(mappedBy = "slrviatransporteid")
    private List<Lrdetalletransporte> lrdetalletransporteList;

    public Lrviatransporte() {
    }

    public Lrviatransporte(Long lrviatransporteid) {
        this.lrviatransporteid = lrviatransporteid;
    }

    public Lrviatransporte(Long lrviatransporteid, String lrviatransportedesc, String lrviatransporteual, Date lrviatransportefal, String lrviatransporteumd, Date lrviatransportefmd, Character lrviatransportehab) {
        this.lrviatransporteid = lrviatransporteid;
        this.lrviatransportedesc = lrviatransportedesc;
        this.lrviatransporteual = lrviatransporteual;
        this.lrviatransportefal = lrviatransportefal;
        this.lrviatransporteumd = lrviatransporteumd;
        this.lrviatransportefmd = lrviatransportefmd;
        this.lrviatransportehab = lrviatransportehab;
    }

    public Long getLrviatransporteid() {
        return lrviatransporteid;
    }

    public void setLrviatransporteid(Long lrviatransporteid) {
        this.lrviatransporteid = lrviatransporteid;
    }

    public String getLrviatransportedesc() {
        return lrviatransportedesc;
    }

    public void setLrviatransportedesc(String lrviatransportedesc) {
        this.lrviatransportedesc = lrviatransportedesc;
    }

    public String getLrviatransporteual() {
        return lrviatransporteual;
    }

    public void setLrviatransporteual(String lrviatransporteual) {
        this.lrviatransporteual = lrviatransporteual;
    }

    public Date getLrviatransportefal() {
        return lrviatransportefal;
    }

    public void setLrviatransportefal(Date lrviatransportefal) {
        this.lrviatransportefal = lrviatransportefal;
    }

    public String getLrviatransporteumd() {
        return lrviatransporteumd;
    }

    public void setLrviatransporteumd(String lrviatransporteumd) {
        this.lrviatransporteumd = lrviatransporteumd;
    }

    public Date getLrviatransportefmd() {
        return lrviatransportefmd;
    }

    public void setLrviatransportefmd(Date lrviatransportefmd) {
        this.lrviatransportefmd = lrviatransportefmd;
    }

    public Character getLrviatransportehab() {
        return lrviatransportehab;
    }

    public void setLrviatransportehab(Character lrviatransportehab) {
        this.lrviatransportehab = lrviatransportehab;
    }

    public List<Lrmediostransporte> getLrmediostransporteList() {
        return lrmediostransporteList;
    }

    public void setLrmediostransporteList(List<Lrmediostransporte> lrmediostransporteList) {
        this.lrmediostransporteList = lrmediostransporteList;
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
        hash += (lrviatransporteid != null ? lrviatransporteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrviatransporte)) {
            return false;
        }
        Lrviatransporte other = (Lrviatransporte) object;
        if ((this.lrviatransporteid == null && other.lrviatransporteid != null) || (this.lrviatransporteid != null && !this.lrviatransporteid.equals(other.lrviatransporteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrviatransporte[ lrviatransporteid=" + lrviatransporteid + " ]";
    }
    
}
