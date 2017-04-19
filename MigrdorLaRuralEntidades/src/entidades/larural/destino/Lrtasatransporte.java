/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LRTASATRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "Lrtasatransporte.findAll", query = "SELECT l FROM Lrtasatransporte l"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransporteid", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransporteid = :lrtasatransporteid"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransportetasa", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransportetasa = :lrtasatransportetasa"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransportefal", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransportefal = :lrtasatransportefal"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransporteual", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransporteual = :lrtasatransporteual"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransportefmd", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransportefmd = :lrtasatransportefmd"),
    @NamedQuery(name = "Lrtasatransporte.findByLrtasatransporteumd", query = "SELECT l FROM Lrtasatransporte l WHERE l.lrtasatransporteumd = :lrtasatransporteumd")})
public class Lrtasatransporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTASATRANSPORTEID", nullable = false)
    private Long lrtasatransporteid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASATRANSPORTETASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrtasatransportetasa;
    @Column(name = "LRTASATRANSPORTEFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasatransportefal;
    @Column(name = "LRTASATRANSPORTEUAL", length = 30)
    private String lrtasatransporteual;
    @Column(name = "LRTASATRANSPORTEFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasatransportefmd;
    @Column(name = "LRTASATRANSPORTEUMD", length = 30)
    private String lrtasatransporteumd;
    @JoinColumn(name = "LRDESTINOSID", referencedColumnName = "LRDESTINOSID", nullable = false)
    @ManyToOne(optional = false)
    private Lrdestinos lrdestinosid;
    @JoinColumn(name = "LRMODOCOTIZACIONID", referencedColumnName = "LRMODOCOTIZACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrmodocotizacion lrmodocotizacionid;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;

    public Lrtasatransporte() {
    }

    public Lrtasatransporte(Long lrtasatransporteid) {
        this.lrtasatransporteid = lrtasatransporteid;
    }

    public Lrtasatransporte(Long lrtasatransporteid, BigDecimal lrtasatransportetasa) {
        this.lrtasatransporteid = lrtasatransporteid;
        this.lrtasatransportetasa = lrtasatransportetasa;
    }

    public Long getLrtasatransporteid() {
        return lrtasatransporteid;
    }

    public void setLrtasatransporteid(Long lrtasatransporteid) {
        this.lrtasatransporteid = lrtasatransporteid;
    }

    public BigDecimal getLrtasatransportetasa() {
        return lrtasatransportetasa;
    }

    public void setLrtasatransportetasa(BigDecimal lrtasatransportetasa) {
        this.lrtasatransportetasa = lrtasatransportetasa;
    }

    public Date getLrtasatransportefal() {
        return lrtasatransportefal;
    }

    public void setLrtasatransportefal(Date lrtasatransportefal) {
        this.lrtasatransportefal = lrtasatransportefal;
    }

    public String getLrtasatransporteual() {
        return lrtasatransporteual;
    }

    public void setLrtasatransporteual(String lrtasatransporteual) {
        this.lrtasatransporteual = lrtasatransporteual;
    }

    public Date getLrtasatransportefmd() {
        return lrtasatransportefmd;
    }

    public void setLrtasatransportefmd(Date lrtasatransportefmd) {
        this.lrtasatransportefmd = lrtasatransportefmd;
    }

    public String getLrtasatransporteumd() {
        return lrtasatransporteumd;
    }

    public void setLrtasatransporteumd(String lrtasatransporteumd) {
        this.lrtasatransporteumd = lrtasatransporteumd;
    }

    public Lrdestinos getLrdestinosid() {
        return lrdestinosid;
    }

    public void setLrdestinosid(Lrdestinos lrdestinosid) {
        this.lrdestinosid = lrdestinosid;
    }

    public Lrmodocotizacion getLrmodocotizacionid() {
        return lrmodocotizacionid;
    }

    public void setLrmodocotizacionid(Lrmodocotizacion lrmodocotizacionid) {
        this.lrmodocotizacionid = lrmodocotizacionid;
    }

    public Lrparmcotiplansecc getLrparmcotiplansecc() {
        return lrparmcotiplansecc;
    }

    public void setLrparmcotiplansecc(Lrparmcotiplansecc lrparmcotiplansecc) {
        this.lrparmcotiplansecc = lrparmcotiplansecc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtasatransporteid != null ? lrtasatransporteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasatransporte)) {
            return false;
        }
        Lrtasatransporte other = (Lrtasatransporte) object;
        if ((this.lrtasatransporteid == null && other.lrtasatransporteid != null) || (this.lrtasatransporteid != null && !this.lrtasatransporteid.equals(other.lrtasatransporteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasatransporte[ lrtasatransporteid=" + lrtasatransporteid + " ]";
    }
    
}
