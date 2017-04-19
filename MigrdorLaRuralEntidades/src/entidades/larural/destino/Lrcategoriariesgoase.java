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
@Table(name = "LRCATEGORIARIESGOASE")
@NamedQueries({
    @NamedQuery(name = "Lrcategoriariesgoase.findAll", query = "SELECT l FROM Lrcategoriariesgoase l"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoaseid", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoaseid = :lrcategoriariesgoaseid"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoasedesc", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoasedesc = :lrcategoriariesgoasedesc"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoaseac", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoaseac = :lrcategoriariesgoaseac"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoaseual", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoaseual = :lrcategoriariesgoaseual"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoasefal", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoasefal = :lrcategoriariesgoasefal"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoaseumd", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoaseumd = :lrcategoriariesgoaseumd"),
    @NamedQuery(name = "Lrcategoriariesgoase.findByLrcategoriariesgoasefmd", query = "SELECT l FROM Lrcategoriariesgoase l WHERE l.lrcategoriariesgoasefmd = :lrcategoriariesgoasefmd")})
public class Lrcategoriariesgoase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEID", nullable = false)
    private Long lrcategoriariesgoaseid;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEDESC", nullable = false, length = 500)
    private String lrcategoriariesgoasedesc;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEAC", nullable = false)
    private Character lrcategoriariesgoaseac;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEUAL", nullable = false, length = 30)
    private String lrcategoriariesgoaseual;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriariesgoasefal;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEUMD", nullable = false, length = 30)
    private String lrcategoriariesgoaseumd;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriariesgoasefmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcategoriariesgoase")
    private List<Lrtasariesgocat> lrtasariesgocatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcategoriariesgoase")
    private List<Lragrupariesgoase> lragrupariesgoaseList;

    public Lrcategoriariesgoase() {
    }

    public Lrcategoriariesgoase(Long lrcategoriariesgoaseid) {
        this.lrcategoriariesgoaseid = lrcategoriariesgoaseid;
    }

    public Lrcategoriariesgoase(Long lrcategoriariesgoaseid, String lrcategoriariesgoasedesc, Character lrcategoriariesgoaseac, String lrcategoriariesgoaseual, Date lrcategoriariesgoasefal, String lrcategoriariesgoaseumd, Date lrcategoriariesgoasefmd) {
        this.lrcategoriariesgoaseid = lrcategoriariesgoaseid;
        this.lrcategoriariesgoasedesc = lrcategoriariesgoasedesc;
        this.lrcategoriariesgoaseac = lrcategoriariesgoaseac;
        this.lrcategoriariesgoaseual = lrcategoriariesgoaseual;
        this.lrcategoriariesgoasefal = lrcategoriariesgoasefal;
        this.lrcategoriariesgoaseumd = lrcategoriariesgoaseumd;
        this.lrcategoriariesgoasefmd = lrcategoriariesgoasefmd;
    }

    public Long getLrcategoriariesgoaseid() {
        return lrcategoriariesgoaseid;
    }

    public void setLrcategoriariesgoaseid(Long lrcategoriariesgoaseid) {
        this.lrcategoriariesgoaseid = lrcategoriariesgoaseid;
    }

    public String getLrcategoriariesgoasedesc() {
        return lrcategoriariesgoasedesc;
    }

    public void setLrcategoriariesgoasedesc(String lrcategoriariesgoasedesc) {
        this.lrcategoriariesgoasedesc = lrcategoriariesgoasedesc;
    }

    public Character getLrcategoriariesgoaseac() {
        return lrcategoriariesgoaseac;
    }

    public void setLrcategoriariesgoaseac(Character lrcategoriariesgoaseac) {
        this.lrcategoriariesgoaseac = lrcategoriariesgoaseac;
    }

    public String getLrcategoriariesgoaseual() {
        return lrcategoriariesgoaseual;
    }

    public void setLrcategoriariesgoaseual(String lrcategoriariesgoaseual) {
        this.lrcategoriariesgoaseual = lrcategoriariesgoaseual;
    }

    public Date getLrcategoriariesgoasefal() {
        return lrcategoriariesgoasefal;
    }

    public void setLrcategoriariesgoasefal(Date lrcategoriariesgoasefal) {
        this.lrcategoriariesgoasefal = lrcategoriariesgoasefal;
    }

    public String getLrcategoriariesgoaseumd() {
        return lrcategoriariesgoaseumd;
    }

    public void setLrcategoriariesgoaseumd(String lrcategoriariesgoaseumd) {
        this.lrcategoriariesgoaseumd = lrcategoriariesgoaseumd;
    }

    public Date getLrcategoriariesgoasefmd() {
        return lrcategoriariesgoasefmd;
    }

    public void setLrcategoriariesgoasefmd(Date lrcategoriariesgoasefmd) {
        this.lrcategoriariesgoasefmd = lrcategoriariesgoasefmd;
    }

    public List<Lrtasariesgocat> getLrtasariesgocatList() {
        return lrtasariesgocatList;
    }

    public void setLrtasariesgocatList(List<Lrtasariesgocat> lrtasariesgocatList) {
        this.lrtasariesgocatList = lrtasariesgocatList;
    }

    public List<Lragrupariesgoase> getLragrupariesgoaseList() {
        return lragrupariesgoaseList;
    }

    public void setLragrupariesgoaseList(List<Lragrupariesgoase> lragrupariesgoaseList) {
        this.lragrupariesgoaseList = lragrupariesgoaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcategoriariesgoaseid != null ? lrcategoriariesgoaseid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcategoriariesgoase)) {
            return false;
        }
        Lrcategoriariesgoase other = (Lrcategoriariesgoase) object;
        if ((this.lrcategoriariesgoaseid == null && other.lrcategoriariesgoaseid != null) || (this.lrcategoriariesgoaseid != null && !this.lrcategoriariesgoaseid.equals(other.lrcategoriariesgoaseid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcategoriariesgoase[ lrcategoriariesgoaseid=" + lrcategoriariesgoaseid + " ]";
    }
    
}
