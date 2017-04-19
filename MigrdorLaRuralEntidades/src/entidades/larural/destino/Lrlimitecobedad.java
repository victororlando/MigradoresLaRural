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
@Table(name = "LRLIMITECOBEDAD")
@NamedQueries({
    @NamedQuery(name = "Lrlimitecobedad.findAll", query = "SELECT l FROM Lrlimitecobedad l"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadid", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadid = :lrlimitecobedadid"),
    @NamedQuery(name = "Lrlimitecobedad.findBySeccid", query = "SELECT l FROM Lrlimitecobedad l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrlimitecobedad.findByRiesgosaseid", query = "SELECT l FROM Lrlimitecobedad l WHERE l.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrlimitecobedad.findByCoberturastipid", query = "SELECT l FROM Lrlimitecobedad l WHERE l.coberturastipid = :coberturastipid"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadmaxima", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadmaxima = :lrlimitecobedadmaxima"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadpermanencia", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadpermanencia = :lrlimitecobedadpermanencia"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadac", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadac = :lrlimitecobedadac"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedaduac", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedaduac = :lrlimitecobedaduac"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadfal", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadfal = :lrlimitecobedadfal"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadumd", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadumd = :lrlimitecobedadumd"),
    @NamedQuery(name = "Lrlimitecobedad.findByLrlimitecobedadfmd", query = "SELECT l FROM Lrlimitecobedad l WHERE l.lrlimitecobedadfmd = :lrlimitecobedadfmd")})
public class Lrlimitecobedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADID", nullable = false)
    private Long lrlimitecobedadid;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @Basic(optional = false)
    @Column(name = "COBERTURASTIPID", nullable = false)
    private short coberturastipid;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADMAXIMA", nullable = false)
    private short lrlimitecobedadmaxima;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADPERMANENCIA", nullable = false)
    private short lrlimitecobedadpermanencia;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADAC", nullable = false)
    private Character lrlimitecobedadac;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADUAC", nullable = false, length = 30)
    private String lrlimitecobedaduac;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrlimitecobedadfal;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADUMD", nullable = false, length = 30)
    private String lrlimitecobedadumd;
    @Basic(optional = false)
    @Column(name = "LRLIMITECOBEDADFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrlimitecobedadfmd;

    public Lrlimitecobedad() {
    }

    public Lrlimitecobedad(Long lrlimitecobedadid) {
        this.lrlimitecobedadid = lrlimitecobedadid;
    }

    public Lrlimitecobedad(Long lrlimitecobedadid, short seccid, short riesgosaseid, short coberturastipid, short lrlimitecobedadmaxima, short lrlimitecobedadpermanencia, Character lrlimitecobedadac, String lrlimitecobedaduac, Date lrlimitecobedadfal, String lrlimitecobedadumd, Date lrlimitecobedadfmd) {
        this.lrlimitecobedadid = lrlimitecobedadid;
        this.seccid = seccid;
        this.riesgosaseid = riesgosaseid;
        this.coberturastipid = coberturastipid;
        this.lrlimitecobedadmaxima = lrlimitecobedadmaxima;
        this.lrlimitecobedadpermanencia = lrlimitecobedadpermanencia;
        this.lrlimitecobedadac = lrlimitecobedadac;
        this.lrlimitecobedaduac = lrlimitecobedaduac;
        this.lrlimitecobedadfal = lrlimitecobedadfal;
        this.lrlimitecobedadumd = lrlimitecobedadumd;
        this.lrlimitecobedadfmd = lrlimitecobedadfmd;
    }

    public Long getLrlimitecobedadid() {
        return lrlimitecobedadid;
    }

    public void setLrlimitecobedadid(Long lrlimitecobedadid) {
        this.lrlimitecobedadid = lrlimitecobedadid;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public short getCoberturastipid() {
        return coberturastipid;
    }

    public void setCoberturastipid(short coberturastipid) {
        this.coberturastipid = coberturastipid;
    }

    public short getLrlimitecobedadmaxima() {
        return lrlimitecobedadmaxima;
    }

    public void setLrlimitecobedadmaxima(short lrlimitecobedadmaxima) {
        this.lrlimitecobedadmaxima = lrlimitecobedadmaxima;
    }

    public short getLrlimitecobedadpermanencia() {
        return lrlimitecobedadpermanencia;
    }

    public void setLrlimitecobedadpermanencia(short lrlimitecobedadpermanencia) {
        this.lrlimitecobedadpermanencia = lrlimitecobedadpermanencia;
    }

    public Character getLrlimitecobedadac() {
        return lrlimitecobedadac;
    }

    public void setLrlimitecobedadac(Character lrlimitecobedadac) {
        this.lrlimitecobedadac = lrlimitecobedadac;
    }

    public String getLrlimitecobedaduac() {
        return lrlimitecobedaduac;
    }

    public void setLrlimitecobedaduac(String lrlimitecobedaduac) {
        this.lrlimitecobedaduac = lrlimitecobedaduac;
    }

    public Date getLrlimitecobedadfal() {
        return lrlimitecobedadfal;
    }

    public void setLrlimitecobedadfal(Date lrlimitecobedadfal) {
        this.lrlimitecobedadfal = lrlimitecobedadfal;
    }

    public String getLrlimitecobedadumd() {
        return lrlimitecobedadumd;
    }

    public void setLrlimitecobedadumd(String lrlimitecobedadumd) {
        this.lrlimitecobedadumd = lrlimitecobedadumd;
    }

    public Date getLrlimitecobedadfmd() {
        return lrlimitecobedadfmd;
    }

    public void setLrlimitecobedadfmd(Date lrlimitecobedadfmd) {
        this.lrlimitecobedadfmd = lrlimitecobedadfmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrlimitecobedadid != null ? lrlimitecobedadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrlimitecobedad)) {
            return false;
        }
        Lrlimitecobedad other = (Lrlimitecobedad) object;
        if ((this.lrlimitecobedadid == null && other.lrlimitecobedadid != null) || (this.lrlimitecobedadid != null && !this.lrlimitecobedadid.equals(other.lrlimitecobedadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrlimitecobedad[ lrlimitecobedadid=" + lrlimitecobedadid + " ]";
    }
    
}
