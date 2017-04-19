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
@Table(name = "LRTAREAINSPECCION")
@NamedQueries({
    @NamedQuery(name = "Lrtareainspeccion.findAll", query = "SELECT l FROM Lrtareainspeccion l"),
    @NamedQuery(name = "Lrtareainspeccion.findByLrtareainspeccionid", query = "SELECT l FROM Lrtareainspeccion l WHERE l.lrtareainspeccionid = :lrtareainspeccionid"),
    @NamedQuery(name = "Lrtareainspeccion.findByLrtareainspecciontarea", query = "SELECT l FROM Lrtareainspeccion l WHERE l.lrtareainspecciontarea = :lrtareainspecciontarea"),
    @NamedQuery(name = "Lrtareainspeccion.findByLrtareainspeccionfal", query = "SELECT l FROM Lrtareainspeccion l WHERE l.lrtareainspeccionfal = :lrtareainspeccionfal")})
public class Lrtareainspeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTAREAINSPECCIONID", nullable = false)
    private Long lrtareainspeccionid;
    @Basic(optional = false)
    @Column(name = "LRTAREAINSPECCIONTAREA", nullable = false, length = 500)
    private String lrtareainspecciontarea;
    @Basic(optional = false)
    @Column(name = "LRTAREAINSPECCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtareainspeccionfal;
    @JoinColumn(name = "LRCOTINSPECCIONID", referencedColumnName = "LRCOTINSPECCIONID")
    @ManyToOne
    private Lrcotinspeccion lrcotinspeccionid;
    @JoinColumn(name = "LRINSPECTORTAREAID", referencedColumnName = "LRINSPECTORID", nullable = false)
    @ManyToOne(optional = false)
    private Lrinspector lrinspectortareaid;

    public Lrtareainspeccion() {
    }

    public Lrtareainspeccion(Long lrtareainspeccionid) {
        this.lrtareainspeccionid = lrtareainspeccionid;
    }

    public Lrtareainspeccion(Long lrtareainspeccionid, String lrtareainspecciontarea, Date lrtareainspeccionfal) {
        this.lrtareainspeccionid = lrtareainspeccionid;
        this.lrtareainspecciontarea = lrtareainspecciontarea;
        this.lrtareainspeccionfal = lrtareainspeccionfal;
    }

    public Long getLrtareainspeccionid() {
        return lrtareainspeccionid;
    }

    public void setLrtareainspeccionid(Long lrtareainspeccionid) {
        this.lrtareainspeccionid = lrtareainspeccionid;
    }

    public String getLrtareainspecciontarea() {
        return lrtareainspecciontarea;
    }

    public void setLrtareainspecciontarea(String lrtareainspecciontarea) {
        this.lrtareainspecciontarea = lrtareainspecciontarea;
    }

    public Date getLrtareainspeccionfal() {
        return lrtareainspeccionfal;
    }

    public void setLrtareainspeccionfal(Date lrtareainspeccionfal) {
        this.lrtareainspeccionfal = lrtareainspeccionfal;
    }

    public Lrcotinspeccion getLrcotinspeccionid() {
        return lrcotinspeccionid;
    }

    public void setLrcotinspeccionid(Lrcotinspeccion lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public Lrinspector getLrinspectortareaid() {
        return lrinspectortareaid;
    }

    public void setLrinspectortareaid(Lrinspector lrinspectortareaid) {
        this.lrinspectortareaid = lrinspectortareaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtareainspeccionid != null ? lrtareainspeccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtareainspeccion)) {
            return false;
        }
        Lrtareainspeccion other = (Lrtareainspeccion) object;
        if ((this.lrtareainspeccionid == null && other.lrtareainspeccionid != null) || (this.lrtareainspeccionid != null && !this.lrtareainspeccionid.equals(other.lrtareainspeccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtareainspeccion[ lrtareainspeccionid=" + lrtareainspeccionid + " ]";
    }
    
}
