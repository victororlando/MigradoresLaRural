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
@Table(name = "LRTIPOSOCIEDAD")
@NamedQueries({
    @NamedQuery(name = "Lrtiposociedad.findAll", query = "SELECT l FROM Lrtiposociedad l"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadid", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadid = :lrtiposociedadid"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadnombre", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadnombre = :lrtiposociedadnombre"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadact", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadact = :lrtiposociedadact"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadual", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadual = :lrtiposociedadual"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadufal", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadufal = :lrtiposociedadufal"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadumd", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadumd = :lrtiposociedadumd"),
    @NamedQuery(name = "Lrtiposociedad.findByLrtiposociedadufmd", query = "SELECT l FROM Lrtiposociedad l WHERE l.lrtiposociedadufmd = :lrtiposociedadufmd")})
public class Lrtiposociedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADID", nullable = false)
    private Long lrtiposociedadid;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADNOMBRE", nullable = false, length = 100)
    private String lrtiposociedadnombre;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADACT", nullable = false)
    private Character lrtiposociedadact;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADUAL", nullable = false, length = 30)
    private String lrtiposociedadual;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADUFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposociedadufal;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADUMD", nullable = false, length = 30)
    private String lrtiposociedadumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOCIEDADUFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposociedadufmd;
    @OneToMany(mappedBy = "lrtiposociedadid")
    private List<Lrpersonajur> lrpersonajurList;

    public Lrtiposociedad() {
    }

    public Lrtiposociedad(Long lrtiposociedadid) {
        this.lrtiposociedadid = lrtiposociedadid;
    }

    public Lrtiposociedad(Long lrtiposociedadid, String lrtiposociedadnombre, Character lrtiposociedadact, String lrtiposociedadual, Date lrtiposociedadufal, String lrtiposociedadumd, Date lrtiposociedadufmd) {
        this.lrtiposociedadid = lrtiposociedadid;
        this.lrtiposociedadnombre = lrtiposociedadnombre;
        this.lrtiposociedadact = lrtiposociedadact;
        this.lrtiposociedadual = lrtiposociedadual;
        this.lrtiposociedadufal = lrtiposociedadufal;
        this.lrtiposociedadumd = lrtiposociedadumd;
        this.lrtiposociedadufmd = lrtiposociedadufmd;
    }

    public Long getLrtiposociedadid() {
        return lrtiposociedadid;
    }

    public void setLrtiposociedadid(Long lrtiposociedadid) {
        this.lrtiposociedadid = lrtiposociedadid;
    }

    public String getLrtiposociedadnombre() {
        return lrtiposociedadnombre;
    }

    public void setLrtiposociedadnombre(String lrtiposociedadnombre) {
        this.lrtiposociedadnombre = lrtiposociedadnombre;
    }

    public Character getLrtiposociedadact() {
        return lrtiposociedadact;
    }

    public void setLrtiposociedadact(Character lrtiposociedadact) {
        this.lrtiposociedadact = lrtiposociedadact;
    }

    public String getLrtiposociedadual() {
        return lrtiposociedadual;
    }

    public void setLrtiposociedadual(String lrtiposociedadual) {
        this.lrtiposociedadual = lrtiposociedadual;
    }

    public Date getLrtiposociedadufal() {
        return lrtiposociedadufal;
    }

    public void setLrtiposociedadufal(Date lrtiposociedadufal) {
        this.lrtiposociedadufal = lrtiposociedadufal;
    }

    public String getLrtiposociedadumd() {
        return lrtiposociedadumd;
    }

    public void setLrtiposociedadumd(String lrtiposociedadumd) {
        this.lrtiposociedadumd = lrtiposociedadumd;
    }

    public Date getLrtiposociedadufmd() {
        return lrtiposociedadufmd;
    }

    public void setLrtiposociedadufmd(Date lrtiposociedadufmd) {
        this.lrtiposociedadufmd = lrtiposociedadufmd;
    }

    public List<Lrpersonajur> getLrpersonajurList() {
        return lrpersonajurList;
    }

    public void setLrpersonajurList(List<Lrpersonajur> lrpersonajurList) {
        this.lrpersonajurList = lrpersonajurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtiposociedadid != null ? lrtiposociedadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtiposociedad)) {
            return false;
        }
        Lrtiposociedad other = (Lrtiposociedad) object;
        if ((this.lrtiposociedadid == null && other.lrtiposociedadid != null) || (this.lrtiposociedadid != null && !this.lrtiposociedadid.equals(other.lrtiposociedadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtiposociedad[ lrtiposociedadid=" + lrtiposociedadid + " ]";
    }
    
}
