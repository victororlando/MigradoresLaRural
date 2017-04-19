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
@Table(name = "LRCATEGORIA")
@NamedQueries({
    @NamedQuery(name = "Lrcategoria.findAll", query = "SELECT l FROM Lrcategoria l"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriaid", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriaid = :lrcategoriaid"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriadesc", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriadesc = :lrcategoriadesc"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriaac", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriaac = :lrcategoriaac"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriaual", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriaual = :lrcategoriaual"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriafal", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriafal = :lrcategoriafal"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriaumd", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriaumd = :lrcategoriaumd"),
    @NamedQuery(name = "Lrcategoria.findByLrcategoriafmd", query = "SELECT l FROM Lrcategoria l WHERE l.lrcategoriafmd = :lrcategoriafmd")})
public class Lrcategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAID", nullable = false)
    private Long lrcategoriaid;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIADESC", nullable = false, length = 100)
    private String lrcategoriadesc;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAAC", nullable = false)
    private Character lrcategoriaac;
    @Column(name = "LRCATEGORIAUAL", length = 30)
    private String lrcategoriaual;
    @Column(name = "LRCATEGORIAFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriafal;
    @Column(name = "LRCATEGORIAUMD", length = 30)
    private String lrcategoriaumd;
    @Column(name = "LRCATEGORIAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriafmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcategoria")
    private List<Lrcategoriarea> lrcategoriareaList;

    public Lrcategoria() {
    }

    public Lrcategoria(Long lrcategoriaid) {
        this.lrcategoriaid = lrcategoriaid;
    }

    public Lrcategoria(Long lrcategoriaid, String lrcategoriadesc, Character lrcategoriaac) {
        this.lrcategoriaid = lrcategoriaid;
        this.lrcategoriadesc = lrcategoriadesc;
        this.lrcategoriaac = lrcategoriaac;
    }

    public Long getLrcategoriaid() {
        return lrcategoriaid;
    }

    public void setLrcategoriaid(Long lrcategoriaid) {
        this.lrcategoriaid = lrcategoriaid;
    }

    public String getLrcategoriadesc() {
        return lrcategoriadesc;
    }

    public void setLrcategoriadesc(String lrcategoriadesc) {
        this.lrcategoriadesc = lrcategoriadesc;
    }

    public Character getLrcategoriaac() {
        return lrcategoriaac;
    }

    public void setLrcategoriaac(Character lrcategoriaac) {
        this.lrcategoriaac = lrcategoriaac;
    }

    public String getLrcategoriaual() {
        return lrcategoriaual;
    }

    public void setLrcategoriaual(String lrcategoriaual) {
        this.lrcategoriaual = lrcategoriaual;
    }

    public Date getLrcategoriafal() {
        return lrcategoriafal;
    }

    public void setLrcategoriafal(Date lrcategoriafal) {
        this.lrcategoriafal = lrcategoriafal;
    }

    public String getLrcategoriaumd() {
        return lrcategoriaumd;
    }

    public void setLrcategoriaumd(String lrcategoriaumd) {
        this.lrcategoriaumd = lrcategoriaumd;
    }

    public Date getLrcategoriafmd() {
        return lrcategoriafmd;
    }

    public void setLrcategoriafmd(Date lrcategoriafmd) {
        this.lrcategoriafmd = lrcategoriafmd;
    }

    public List<Lrcategoriarea> getLrcategoriareaList() {
        return lrcategoriareaList;
    }

    public void setLrcategoriareaList(List<Lrcategoriarea> lrcategoriareaList) {
        this.lrcategoriareaList = lrcategoriareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcategoriaid != null ? lrcategoriaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcategoria)) {
            return false;
        }
        Lrcategoria other = (Lrcategoria) object;
        if ((this.lrcategoriaid == null && other.lrcategoriaid != null) || (this.lrcategoriaid != null && !this.lrcategoriaid.equals(other.lrcategoriaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcategoria[ lrcategoriaid=" + lrcategoriaid + " ]";
    }
    
}
