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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "LRFLUJOINSPECCION")
@NamedQueries({
    @NamedQuery(name = "Lrflujoinspeccion.findAll", query = "SELECT l FROM Lrflujoinspeccion l"),
    @NamedQuery(name = "Lrflujoinspeccion.findByLrflujoinspeccionid", query = "SELECT l FROM Lrflujoinspeccion l WHERE l.lrflujoinspeccionid = :lrflujoinspeccionid"),
    @NamedQuery(name = "Lrflujoinspeccion.findByLrflujoinspeccionual", query = "SELECT l FROM Lrflujoinspeccion l WHERE l.lrflujoinspeccionual = :lrflujoinspeccionual"),
    @NamedQuery(name = "Lrflujoinspeccion.findByLrflujoinspeccionfal", query = "SELECT l FROM Lrflujoinspeccion l WHERE l.lrflujoinspeccionfal = :lrflujoinspeccionfal")})
public class Lrflujoinspeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONID", nullable = false)
    private Long lrflujoinspeccionid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONUAL", nullable = false, length = 30)
    private String lrflujoinspeccionual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOINSPECCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujoinspeccionfal;
    @JoinColumns({
        @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false),
        @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrareasubarea lrareasubarea;
    @JoinColumn(name = "LRCOTINSPECCIONID", referencedColumnName = "LRCOTINSPECCIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrcotinspeccion lrcotinspeccionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrflujoinspeccionid")
    private List<Lrflujoinspecciondet> lrflujoinspecciondetList;

    public Lrflujoinspeccion() {
    }

    public Lrflujoinspeccion(Long lrflujoinspeccionid) {
        this.lrflujoinspeccionid = lrflujoinspeccionid;
    }

    public Lrflujoinspeccion(Long lrflujoinspeccionid, String lrflujoinspeccionual, Date lrflujoinspeccionfal) {
        this.lrflujoinspeccionid = lrflujoinspeccionid;
        this.lrflujoinspeccionual = lrflujoinspeccionual;
        this.lrflujoinspeccionfal = lrflujoinspeccionfal;
    }

    public Long getLrflujoinspeccionid() {
        return lrflujoinspeccionid;
    }

    public void setLrflujoinspeccionid(Long lrflujoinspeccionid) {
        this.lrflujoinspeccionid = lrflujoinspeccionid;
    }

    public String getLrflujoinspeccionual() {
        return lrflujoinspeccionual;
    }

    public void setLrflujoinspeccionual(String lrflujoinspeccionual) {
        this.lrflujoinspeccionual = lrflujoinspeccionual;
    }

    public Date getLrflujoinspeccionfal() {
        return lrflujoinspeccionfal;
    }

    public void setLrflujoinspeccionfal(Date lrflujoinspeccionfal) {
        this.lrflujoinspeccionfal = lrflujoinspeccionfal;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public Lrcotinspeccion getLrcotinspeccionid() {
        return lrcotinspeccionid;
    }

    public void setLrcotinspeccionid(Lrcotinspeccion lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public List<Lrflujoinspecciondet> getLrflujoinspecciondetList() {
        return lrflujoinspecciondetList;
    }

    public void setLrflujoinspecciondetList(List<Lrflujoinspecciondet> lrflujoinspecciondetList) {
        this.lrflujoinspecciondetList = lrflujoinspecciondetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujoinspeccionid != null ? lrflujoinspeccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujoinspeccion)) {
            return false;
        }
        Lrflujoinspeccion other = (Lrflujoinspeccion) object;
        if ((this.lrflujoinspeccionid == null && other.lrflujoinspeccionid != null) || (this.lrflujoinspeccionid != null && !this.lrflujoinspeccionid.equals(other.lrflujoinspeccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujoinspeccion[ lrflujoinspeccionid=" + lrflujoinspeccionid + " ]";
    }
    
}
