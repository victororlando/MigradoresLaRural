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
import javax.persistence.JoinColumns;
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
@Table(name = "LRCOTIMOTIVORECHAZO")
@NamedQueries({
    @NamedQuery(name = "Lrcotimotivorechazo.findAll", query = "SELECT l FROM Lrcotimotivorechazo l"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrcotimotivorechazoid", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrcotimotivorechazoid = :lrcotimotivorechazoid"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrcotimotivorechazoual", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrcotimotivorechazoual = :lrcotimotivorechazoual"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrcotimotivorechazofal", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrcotimotivorechazofal = :lrcotimotivorechazofal"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrcotimotivorechazoumd", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrcotimotivorechazoumd = :lrcotimotivorechazoumd"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrcotimotivorechazofmd", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrcotimotivorechazofmd = :lrcotimotivorechazofmd"),
    @NamedQuery(name = "Lrcotimotivorechazo.findByLrmotivorechazodesc", query = "SELECT l FROM Lrcotimotivorechazo l WHERE l.lrmotivorechazodesc = :lrmotivorechazodesc")})
public class Lrcotimotivorechazo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIMOTIVORECHAZOID", nullable = false)
    private Long lrcotimotivorechazoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIMOTIVORECHAZOUAL", nullable = false, length = 30)
    private String lrcotimotivorechazoual;
    @Basic(optional = false)
    @Column(name = "LRCOTIMOTIVORECHAZOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotimotivorechazofal;
    @Basic(optional = false)
    @Column(name = "LRCOTIMOTIVORECHAZOUMD", nullable = false, length = 30)
    private String lrcotimotivorechazoumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIMOTIVORECHAZOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotimotivorechazofmd;
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZODESC", nullable = false, length = 2000)
    private String lrmotivorechazodesc;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacion lrcotizacion;
    @JoinColumn(name = "LRMOTIVORECHAZOID", referencedColumnName = "LRMOTIVORECHAZOID", nullable = false)
    @ManyToOne(optional = false)
    private Lrmotivorechazo lrmotivorechazoid;

    public Lrcotimotivorechazo() {
    }

    public Lrcotimotivorechazo(Long lrcotimotivorechazoid) {
        this.lrcotimotivorechazoid = lrcotimotivorechazoid;
    }

    public Lrcotimotivorechazo(Long lrcotimotivorechazoid, String lrcotimotivorechazoual, Date lrcotimotivorechazofal, String lrcotimotivorechazoumd, Date lrcotimotivorechazofmd, String lrmotivorechazodesc) {
        this.lrcotimotivorechazoid = lrcotimotivorechazoid;
        this.lrcotimotivorechazoual = lrcotimotivorechazoual;
        this.lrcotimotivorechazofal = lrcotimotivorechazofal;
        this.lrcotimotivorechazoumd = lrcotimotivorechazoumd;
        this.lrcotimotivorechazofmd = lrcotimotivorechazofmd;
        this.lrmotivorechazodesc = lrmotivorechazodesc;
    }

    public Long getLrcotimotivorechazoid() {
        return lrcotimotivorechazoid;
    }

    public void setLrcotimotivorechazoid(Long lrcotimotivorechazoid) {
        this.lrcotimotivorechazoid = lrcotimotivorechazoid;
    }

    public String getLrcotimotivorechazoual() {
        return lrcotimotivorechazoual;
    }

    public void setLrcotimotivorechazoual(String lrcotimotivorechazoual) {
        this.lrcotimotivorechazoual = lrcotimotivorechazoual;
    }

    public Date getLrcotimotivorechazofal() {
        return lrcotimotivorechazofal;
    }

    public void setLrcotimotivorechazofal(Date lrcotimotivorechazofal) {
        this.lrcotimotivorechazofal = lrcotimotivorechazofal;
    }

    public String getLrcotimotivorechazoumd() {
        return lrcotimotivorechazoumd;
    }

    public void setLrcotimotivorechazoumd(String lrcotimotivorechazoumd) {
        this.lrcotimotivorechazoumd = lrcotimotivorechazoumd;
    }

    public Date getLrcotimotivorechazofmd() {
        return lrcotimotivorechazofmd;
    }

    public void setLrcotimotivorechazofmd(Date lrcotimotivorechazofmd) {
        this.lrcotimotivorechazofmd = lrcotimotivorechazofmd;
    }

    public String getLrmotivorechazodesc() {
        return lrmotivorechazodesc;
    }

    public void setLrmotivorechazodesc(String lrmotivorechazodesc) {
        this.lrmotivorechazodesc = lrmotivorechazodesc;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    public Lrmotivorechazo getLrmotivorechazoid() {
        return lrmotivorechazoid;
    }

    public void setLrmotivorechazoid(Lrmotivorechazo lrmotivorechazoid) {
        this.lrmotivorechazoid = lrmotivorechazoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotimotivorechazoid != null ? lrcotimotivorechazoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotimotivorechazo)) {
            return false;
        }
        Lrcotimotivorechazo other = (Lrcotimotivorechazo) object;
        if ((this.lrcotimotivorechazoid == null && other.lrcotimotivorechazoid != null) || (this.lrcotimotivorechazoid != null && !this.lrcotimotivorechazoid.equals(other.lrcotimotivorechazoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotimotivorechazo[ lrcotimotivorechazoid=" + lrcotimotivorechazoid + " ]";
    }
    
}
