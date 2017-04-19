/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRUSUARIOSUPERIOR")
@NamedQueries({
    @NamedQuery(name = "Lrusuariosuperior.findAll", query = "SELECT l FROM Lrusuariosuperior l"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorid", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorid = :lrusuariosuperiorid"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorac", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorac = :lrusuariosuperiorac"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorual", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorual = :lrusuariosuperiorual"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorfal", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorfal = :lrusuariosuperiorfal"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorumd", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorumd = :lrusuariosuperiorumd"),
    @NamedQuery(name = "Lrusuariosuperior.findByLrusuariosuperiorfmd", query = "SELECT l FROM Lrusuariosuperior l WHERE l.lrusuariosuperiorfmd = :lrusuariosuperiorfmd")})
public class Lrusuariosuperior implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORID", nullable = false)
    private Long lrusuariosuperiorid;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORAC", nullable = false)
    private Character lrusuariosuperiorac;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORUAL", nullable = false, length = 30)
    private String lrusuariosuperiorual;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuariosuperiorfal;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORUMD", nullable = false, length = 30)
    private String lrusuariosuperiorumd;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUPERIORFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuariosuperiorfmd;
    @JoinColumn(name = "LRUSUARIOSSUID", referencedColumnName = "LRUSUARIOSID", nullable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuariossuid;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuariosid;

    public Lrusuariosuperior() {
    }

    public Lrusuariosuperior(Long lrusuariosuperiorid) {
        this.lrusuariosuperiorid = lrusuariosuperiorid;
    }

    public Lrusuariosuperior(Long lrusuariosuperiorid, Character lrusuariosuperiorac, String lrusuariosuperiorual, Date lrusuariosuperiorfal, String lrusuariosuperiorumd, Date lrusuariosuperiorfmd) {
        this.lrusuariosuperiorid = lrusuariosuperiorid;
        this.lrusuariosuperiorac = lrusuariosuperiorac;
        this.lrusuariosuperiorual = lrusuariosuperiorual;
        this.lrusuariosuperiorfal = lrusuariosuperiorfal;
        this.lrusuariosuperiorumd = lrusuariosuperiorumd;
        this.lrusuariosuperiorfmd = lrusuariosuperiorfmd;
    }

    public Long getLrusuariosuperiorid() {
        return lrusuariosuperiorid;
    }

    public void setLrusuariosuperiorid(Long lrusuariosuperiorid) {
        this.lrusuariosuperiorid = lrusuariosuperiorid;
    }

    public Character getLrusuariosuperiorac() {
        return lrusuariosuperiorac;
    }

    public void setLrusuariosuperiorac(Character lrusuariosuperiorac) {
        this.lrusuariosuperiorac = lrusuariosuperiorac;
    }

    public String getLrusuariosuperiorual() {
        return lrusuariosuperiorual;
    }

    public void setLrusuariosuperiorual(String lrusuariosuperiorual) {
        this.lrusuariosuperiorual = lrusuariosuperiorual;
    }

    public Date getLrusuariosuperiorfal() {
        return lrusuariosuperiorfal;
    }

    public void setLrusuariosuperiorfal(Date lrusuariosuperiorfal) {
        this.lrusuariosuperiorfal = lrusuariosuperiorfal;
    }

    public String getLrusuariosuperiorumd() {
        return lrusuariosuperiorumd;
    }

    public void setLrusuariosuperiorumd(String lrusuariosuperiorumd) {
        this.lrusuariosuperiorumd = lrusuariosuperiorumd;
    }

    public Date getLrusuariosuperiorfmd() {
        return lrusuariosuperiorfmd;
    }

    public void setLrusuariosuperiorfmd(Date lrusuariosuperiorfmd) {
        this.lrusuariosuperiorfmd = lrusuariosuperiorfmd;
    }

    public Lrusuario getLrusuariossuid() {
        return lrusuariossuid;
    }

    public void setLrusuariossuid(Lrusuario lrusuariossuid) {
        this.lrusuariossuid = lrusuariossuid;
    }

    public Lrusuario getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(Lrusuario lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrusuariosuperiorid != null ? lrusuariosuperiorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrusuariosuperior)) {
            return false;
        }
        Lrusuariosuperior other = (Lrusuariosuperior) object;
        if ((this.lrusuariosuperiorid == null && other.lrusuariosuperiorid != null) || (this.lrusuariosuperiorid != null && !this.lrusuariosuperiorid.equals(other.lrusuariosuperiorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrusuariosuperior[ lrusuariosuperiorid=" + lrusuariosuperiorid + " ]";
    }
    
}
