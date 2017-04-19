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
@Table(name = "LRDESTINOS")
@NamedQueries({
    @NamedQuery(name = "Lrdestinos.findAll", query = "SELECT l FROM Lrdestinos l"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosid", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosid = :lrdestinosid"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosdesc", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosdesc = :lrdestinosdesc"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosfal", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosfal = :lrdestinosfal"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosual", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosual = :lrdestinosual"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosfmd", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosfmd = :lrdestinosfmd"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinosumd", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinosumd = :lrdestinosumd"),
    @NamedQuery(name = "Lrdestinos.findByLrdestinoshab", query = "SELECT l FROM Lrdestinos l WHERE l.lrdestinoshab = :lrdestinoshab")})
public class Lrdestinos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDESTINOSID", nullable = false)
    private Long lrdestinosid;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSDESC", nullable = false, length = 100)
    private String lrdestinosdesc;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdestinosfal;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSUAL", nullable = false, length = 30)
    private String lrdestinosual;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdestinosfmd;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSUMD", nullable = false, length = 30)
    private String lrdestinosumd;
    @Basic(optional = false)
    @Column(name = "LRDESTINOSHAB", nullable = false)
    private Character lrdestinoshab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrdestinosid")
    private List<Lrtasatransporte> lrtasatransporteList;

    public Lrdestinos() {
    }

    public Lrdestinos(Long lrdestinosid) {
        this.lrdestinosid = lrdestinosid;
    }

    public Lrdestinos(Long lrdestinosid, String lrdestinosdesc, Date lrdestinosfal, String lrdestinosual, Date lrdestinosfmd, String lrdestinosumd, Character lrdestinoshab) {
        this.lrdestinosid = lrdestinosid;
        this.lrdestinosdesc = lrdestinosdesc;
        this.lrdestinosfal = lrdestinosfal;
        this.lrdestinosual = lrdestinosual;
        this.lrdestinosfmd = lrdestinosfmd;
        this.lrdestinosumd = lrdestinosumd;
        this.lrdestinoshab = lrdestinoshab;
    }

    public Long getLrdestinosid() {
        return lrdestinosid;
    }

    public void setLrdestinosid(Long lrdestinosid) {
        this.lrdestinosid = lrdestinosid;
    }

    public String getLrdestinosdesc() {
        return lrdestinosdesc;
    }

    public void setLrdestinosdesc(String lrdestinosdesc) {
        this.lrdestinosdesc = lrdestinosdesc;
    }

    public Date getLrdestinosfal() {
        return lrdestinosfal;
    }

    public void setLrdestinosfal(Date lrdestinosfal) {
        this.lrdestinosfal = lrdestinosfal;
    }

    public String getLrdestinosual() {
        return lrdestinosual;
    }

    public void setLrdestinosual(String lrdestinosual) {
        this.lrdestinosual = lrdestinosual;
    }

    public Date getLrdestinosfmd() {
        return lrdestinosfmd;
    }

    public void setLrdestinosfmd(Date lrdestinosfmd) {
        this.lrdestinosfmd = lrdestinosfmd;
    }

    public String getLrdestinosumd() {
        return lrdestinosumd;
    }

    public void setLrdestinosumd(String lrdestinosumd) {
        this.lrdestinosumd = lrdestinosumd;
    }

    public Character getLrdestinoshab() {
        return lrdestinoshab;
    }

    public void setLrdestinoshab(Character lrdestinoshab) {
        this.lrdestinoshab = lrdestinoshab;
    }

    public List<Lrtasatransporte> getLrtasatransporteList() {
        return lrtasatransporteList;
    }

    public void setLrtasatransporteList(List<Lrtasatransporte> lrtasatransporteList) {
        this.lrtasatransporteList = lrtasatransporteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdestinosid != null ? lrdestinosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdestinos)) {
            return false;
        }
        Lrdestinos other = (Lrdestinos) object;
        if ((this.lrdestinosid == null && other.lrdestinosid != null) || (this.lrdestinosid != null && !this.lrdestinosid.equals(other.lrdestinosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdestinos[ lrdestinosid=" + lrdestinosid + " ]";
    }
    
}
