/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIINSPDETFOTO")
@NamedQueries({
    @NamedQuery(name = "Lrcotiinspdetfoto.findAll", query = "SELECT l FROM Lrcotiinspdetfoto l"),
    @NamedQuery(name = "Lrcotiinspdetfoto.findByLrcotiinspdetfotoid", query = "SELECT l FROM Lrcotiinspdetfoto l WHERE l.lrcotiinspdetfotoid = :lrcotiinspdetfotoid"),
    @NamedQuery(name = "Lrcotiinspdetfoto.findByLrcotiinspdetfotolink", query = "SELECT l FROM Lrcotiinspdetfoto l WHERE l.lrcotiinspdetfotolink = :lrcotiinspdetfotolink")})
public class Lrcotiinspdetfoto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIINSPDETFOTOID", nullable = false)
    private Long lrcotiinspdetfotoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIINSPDETFOTOLINK", nullable = false, length = 512)
    private String lrcotiinspdetfotolink;
    @JoinColumn(name = "LRCOTINSPDETID", referencedColumnName = "LRCOTINSPDETID", nullable = false)
    @ManyToOne(optional = false)
    private Lrcotinspdet lrcotinspdetid;

    public Lrcotiinspdetfoto() {
    }

    public Lrcotiinspdetfoto(Long lrcotiinspdetfotoid) {
        this.lrcotiinspdetfotoid = lrcotiinspdetfotoid;
    }

    public Lrcotiinspdetfoto(Long lrcotiinspdetfotoid, String lrcotiinspdetfotolink) {
        this.lrcotiinspdetfotoid = lrcotiinspdetfotoid;
        this.lrcotiinspdetfotolink = lrcotiinspdetfotolink;
    }

    public Long getLrcotiinspdetfotoid() {
        return lrcotiinspdetfotoid;
    }

    public void setLrcotiinspdetfotoid(Long lrcotiinspdetfotoid) {
        this.lrcotiinspdetfotoid = lrcotiinspdetfotoid;
    }

    public String getLrcotiinspdetfotolink() {
        return lrcotiinspdetfotolink;
    }

    public void setLrcotiinspdetfotolink(String lrcotiinspdetfotolink) {
        this.lrcotiinspdetfotolink = lrcotiinspdetfotolink;
    }

    public Lrcotinspdet getLrcotinspdetid() {
        return lrcotinspdetid;
    }

    public void setLrcotinspdetid(Lrcotinspdet lrcotinspdetid) {
        this.lrcotinspdetid = lrcotinspdetid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiinspdetfotoid != null ? lrcotiinspdetfotoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiinspdetfoto)) {
            return false;
        }
        Lrcotiinspdetfoto other = (Lrcotiinspdetfoto) object;
        if ((this.lrcotiinspdetfotoid == null && other.lrcotiinspdetfotoid != null) || (this.lrcotiinspdetfotoid != null && !this.lrcotiinspdetfotoid.equals(other.lrcotiinspdetfotoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiinspdetfoto[ lrcotiinspdetfotoid=" + lrcotiinspdetfotoid + " ]";
    }
    
}
