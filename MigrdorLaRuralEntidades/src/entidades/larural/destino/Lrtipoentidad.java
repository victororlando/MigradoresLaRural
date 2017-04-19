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
@Table(name = "LRTIPOENTIDAD")
@NamedQueries({
    @NamedQuery(name = "Lrtipoentidad.findAll", query = "SELECT l FROM Lrtipoentidad l"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadid", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadid = :lrtipoentidadid"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadnombre", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadnombre = :lrtipoentidadnombre"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadact", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadact = :lrtipoentidadact"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadual", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadual = :lrtipoentidadual"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadufal", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadufal = :lrtipoentidadufal"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadumd", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadumd = :lrtipoentidadumd"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadufmd", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadufmd = :lrtipoentidadufmd"),
    @NamedQuery(name = "Lrtipoentidad.findByLrtipoentidadcobraiva", query = "SELECT l FROM Lrtipoentidad l WHERE l.lrtipoentidadcobraiva = :lrtipoentidadcobraiva")})
public class Lrtipoentidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADID", nullable = false)
    private Long lrtipoentidadid;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADNOMBRE", nullable = false, length = 100)
    private String lrtipoentidadnombre;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADACT", nullable = false)
    private Character lrtipoentidadact;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADUAL", nullable = false, length = 30)
    private String lrtipoentidadual;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADUFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoentidadufal;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADUMD", nullable = false, length = 30)
    private String lrtipoentidadumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADUFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoentidadufmd;
    @Basic(optional = false)
    @Column(name = "LRTIPOENTIDADCOBRAIVA", nullable = false)
    private Character lrtipoentidadcobraiva;
    @OneToMany(mappedBy = "lrtipoentidadid")
    private List<Lrpersonajur> lrpersonajurList;

    public Lrtipoentidad() {
    }

    public Lrtipoentidad(Long lrtipoentidadid) {
        this.lrtipoentidadid = lrtipoentidadid;
    }

    public Lrtipoentidad(Long lrtipoentidadid, String lrtipoentidadnombre, Character lrtipoentidadact, String lrtipoentidadual, Date lrtipoentidadufal, String lrtipoentidadumd, Date lrtipoentidadufmd, Character lrtipoentidadcobraiva) {
        this.lrtipoentidadid = lrtipoentidadid;
        this.lrtipoentidadnombre = lrtipoentidadnombre;
        this.lrtipoentidadact = lrtipoentidadact;
        this.lrtipoentidadual = lrtipoentidadual;
        this.lrtipoentidadufal = lrtipoentidadufal;
        this.lrtipoentidadumd = lrtipoentidadumd;
        this.lrtipoentidadufmd = lrtipoentidadufmd;
        this.lrtipoentidadcobraiva = lrtipoentidadcobraiva;
    }

    public Long getLrtipoentidadid() {
        return lrtipoentidadid;
    }

    public void setLrtipoentidadid(Long lrtipoentidadid) {
        this.lrtipoentidadid = lrtipoentidadid;
    }

    public String getLrtipoentidadnombre() {
        return lrtipoentidadnombre;
    }

    public void setLrtipoentidadnombre(String lrtipoentidadnombre) {
        this.lrtipoentidadnombre = lrtipoentidadnombre;
    }

    public Character getLrtipoentidadact() {
        return lrtipoentidadact;
    }

    public void setLrtipoentidadact(Character lrtipoentidadact) {
        this.lrtipoentidadact = lrtipoentidadact;
    }

    public String getLrtipoentidadual() {
        return lrtipoentidadual;
    }

    public void setLrtipoentidadual(String lrtipoentidadual) {
        this.lrtipoentidadual = lrtipoentidadual;
    }

    public Date getLrtipoentidadufal() {
        return lrtipoentidadufal;
    }

    public void setLrtipoentidadufal(Date lrtipoentidadufal) {
        this.lrtipoentidadufal = lrtipoentidadufal;
    }

    public String getLrtipoentidadumd() {
        return lrtipoentidadumd;
    }

    public void setLrtipoentidadumd(String lrtipoentidadumd) {
        this.lrtipoentidadumd = lrtipoentidadumd;
    }

    public Date getLrtipoentidadufmd() {
        return lrtipoentidadufmd;
    }

    public void setLrtipoentidadufmd(Date lrtipoentidadufmd) {
        this.lrtipoentidadufmd = lrtipoentidadufmd;
    }

    public Character getLrtipoentidadcobraiva() {
        return lrtipoentidadcobraiva;
    }

    public void setLrtipoentidadcobraiva(Character lrtipoentidadcobraiva) {
        this.lrtipoentidadcobraiva = lrtipoentidadcobraiva;
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
        hash += (lrtipoentidadid != null ? lrtipoentidadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoentidad)) {
            return false;
        }
        Lrtipoentidad other = (Lrtipoentidad) object;
        if ((this.lrtipoentidadid == null && other.lrtipoentidadid != null) || (this.lrtipoentidadid != null && !this.lrtipoentidadid.equals(other.lrtipoentidadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoentidad[ lrtipoentidadid=" + lrtipoentidadid + " ]";
    }
    
}
