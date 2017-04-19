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
@Table(name = "LRCOTIPLANBIENEXCLUSION")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbienexclusion.findAll", query = "SELECT l FROM Lrcotiplanbienexclusion l"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusionid", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusionid = :lrcotiplanbienexclusionid"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusiontexto", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusiontexto = :lrcotiplanbienexclusiontexto"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusionual", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusionual = :lrcotiplanbienexclusionual"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusionfal", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusionfal = :lrcotiplanbienexclusionfal"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusionumd", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusionumd = :lrcotiplanbienexclusionumd"),
    @NamedQuery(name = "Lrcotiplanbienexclusion.findByLrcotiplanbienexclusionfmd", query = "SELECT l FROM Lrcotiplanbienexclusion l WHERE l.lrcotiplanbienexclusionfmd = :lrcotiplanbienexclusionfmd")})
public class Lrcotiplanbienexclusion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONID", nullable = false)
    private Long lrcotiplanbienexclusionid;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONTEXTO", nullable = false, length = 1000)
    private String lrcotiplanbienexclusiontexto;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONUAL", nullable = false, length = 30)
    private String lrcotiplanbienexclusionual;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbienexclusionfal;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONUMD", nullable = false, length = 30)
    private String lrcotiplanbienexclusionumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENEXCLUSIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbienexclusionfmd;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "SCOTIZACIONVERSION", nullable = false),
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "SCOTIDATBIENASEID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotiplanbien lrcotiplanbien;

    public Lrcotiplanbienexclusion() {
    }

    public Lrcotiplanbienexclusion(Long lrcotiplanbienexclusionid) {
        this.lrcotiplanbienexclusionid = lrcotiplanbienexclusionid;
    }

    public Lrcotiplanbienexclusion(Long lrcotiplanbienexclusionid, String lrcotiplanbienexclusiontexto, String lrcotiplanbienexclusionual, Date lrcotiplanbienexclusionfal, String lrcotiplanbienexclusionumd, Date lrcotiplanbienexclusionfmd) {
        this.lrcotiplanbienexclusionid = lrcotiplanbienexclusionid;
        this.lrcotiplanbienexclusiontexto = lrcotiplanbienexclusiontexto;
        this.lrcotiplanbienexclusionual = lrcotiplanbienexclusionual;
        this.lrcotiplanbienexclusionfal = lrcotiplanbienexclusionfal;
        this.lrcotiplanbienexclusionumd = lrcotiplanbienexclusionumd;
        this.lrcotiplanbienexclusionfmd = lrcotiplanbienexclusionfmd;
    }

    public Long getLrcotiplanbienexclusionid() {
        return lrcotiplanbienexclusionid;
    }

    public void setLrcotiplanbienexclusionid(Long lrcotiplanbienexclusionid) {
        this.lrcotiplanbienexclusionid = lrcotiplanbienexclusionid;
    }

    public String getLrcotiplanbienexclusiontexto() {
        return lrcotiplanbienexclusiontexto;
    }

    public void setLrcotiplanbienexclusiontexto(String lrcotiplanbienexclusiontexto) {
        this.lrcotiplanbienexclusiontexto = lrcotiplanbienexclusiontexto;
    }

    public String getLrcotiplanbienexclusionual() {
        return lrcotiplanbienexclusionual;
    }

    public void setLrcotiplanbienexclusionual(String lrcotiplanbienexclusionual) {
        this.lrcotiplanbienexclusionual = lrcotiplanbienexclusionual;
    }

    public Date getLrcotiplanbienexclusionfal() {
        return lrcotiplanbienexclusionfal;
    }

    public void setLrcotiplanbienexclusionfal(Date lrcotiplanbienexclusionfal) {
        this.lrcotiplanbienexclusionfal = lrcotiplanbienexclusionfal;
    }

    public String getLrcotiplanbienexclusionumd() {
        return lrcotiplanbienexclusionumd;
    }

    public void setLrcotiplanbienexclusionumd(String lrcotiplanbienexclusionumd) {
        this.lrcotiplanbienexclusionumd = lrcotiplanbienexclusionumd;
    }

    public Date getLrcotiplanbienexclusionfmd() {
        return lrcotiplanbienexclusionfmd;
    }

    public void setLrcotiplanbienexclusionfmd(Date lrcotiplanbienexclusionfmd) {
        this.lrcotiplanbienexclusionfmd = lrcotiplanbienexclusionfmd;
    }

    public Lrcotiplanbien getLrcotiplanbien() {
        return lrcotiplanbien;
    }

    public void setLrcotiplanbien(Lrcotiplanbien lrcotiplanbien) {
        this.lrcotiplanbien = lrcotiplanbien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanbienexclusionid != null ? lrcotiplanbienexclusionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbienexclusion)) {
            return false;
        }
        Lrcotiplanbienexclusion other = (Lrcotiplanbienexclusion) object;
        if ((this.lrcotiplanbienexclusionid == null && other.lrcotiplanbienexclusionid != null) || (this.lrcotiplanbienexclusionid != null && !this.lrcotiplanbienexclusionid.equals(other.lrcotiplanbienexclusionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbienexclusion[ lrcotiplanbienexclusionid=" + lrcotiplanbienexclusionid + " ]";
    }
    
}
