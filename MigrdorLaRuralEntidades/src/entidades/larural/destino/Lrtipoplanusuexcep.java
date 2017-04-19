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
@Table(name = "LRTIPOPLANUSUEXCEP")
@NamedQueries({
    @NamedQuery(name = "Lrtipoplanusuexcep.findAll", query = "SELECT l FROM Lrtipoplanusuexcep l"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepid", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepid = :lrtipoplanusuexcepid"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepac", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepac = :lrtipoplanusuexcepac"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepual", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepual = :lrtipoplanusuexcepual"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepfal", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepfal = :lrtipoplanusuexcepfal"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepumd", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepumd = :lrtipoplanusuexcepumd"),
    @NamedQuery(name = "Lrtipoplanusuexcep.findByLrtipoplanusuexcepfmd", query = "SELECT l FROM Lrtipoplanusuexcep l WHERE l.lrtipoplanusuexcepfmd = :lrtipoplanusuexcepfmd")})
public class Lrtipoplanusuexcep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPID", nullable = false)
    private Long lrtipoplanusuexcepid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPAC", nullable = false)
    private Character lrtipoplanusuexcepac;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPUAL", nullable = false, length = 30)
    private String lrtipoplanusuexcepual;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplanusuexcepfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPUMD", nullable = false, length = 30)
    private String lrtipoplanusuexcepumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANUSUEXCEPFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplanusuexcepfmd;
    @JoinColumns({
        @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrplangrupusuario lrplangrupusuario;
    @JoinColumns({
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false),
        @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrtipoplan lrtipoplan;

    public Lrtipoplanusuexcep() {
    }

    public Lrtipoplanusuexcep(Long lrtipoplanusuexcepid) {
        this.lrtipoplanusuexcepid = lrtipoplanusuexcepid;
    }

    public Lrtipoplanusuexcep(Long lrtipoplanusuexcepid, Character lrtipoplanusuexcepac, String lrtipoplanusuexcepual, Date lrtipoplanusuexcepfal, String lrtipoplanusuexcepumd, Date lrtipoplanusuexcepfmd) {
        this.lrtipoplanusuexcepid = lrtipoplanusuexcepid;
        this.lrtipoplanusuexcepac = lrtipoplanusuexcepac;
        this.lrtipoplanusuexcepual = lrtipoplanusuexcepual;
        this.lrtipoplanusuexcepfal = lrtipoplanusuexcepfal;
        this.lrtipoplanusuexcepumd = lrtipoplanusuexcepumd;
        this.lrtipoplanusuexcepfmd = lrtipoplanusuexcepfmd;
    }

    public Long getLrtipoplanusuexcepid() {
        return lrtipoplanusuexcepid;
    }

    public void setLrtipoplanusuexcepid(Long lrtipoplanusuexcepid) {
        this.lrtipoplanusuexcepid = lrtipoplanusuexcepid;
    }

    public Character getLrtipoplanusuexcepac() {
        return lrtipoplanusuexcepac;
    }

    public void setLrtipoplanusuexcepac(Character lrtipoplanusuexcepac) {
        this.lrtipoplanusuexcepac = lrtipoplanusuexcepac;
    }

    public String getLrtipoplanusuexcepual() {
        return lrtipoplanusuexcepual;
    }

    public void setLrtipoplanusuexcepual(String lrtipoplanusuexcepual) {
        this.lrtipoplanusuexcepual = lrtipoplanusuexcepual;
    }

    public Date getLrtipoplanusuexcepfal() {
        return lrtipoplanusuexcepfal;
    }

    public void setLrtipoplanusuexcepfal(Date lrtipoplanusuexcepfal) {
        this.lrtipoplanusuexcepfal = lrtipoplanusuexcepfal;
    }

    public String getLrtipoplanusuexcepumd() {
        return lrtipoplanusuexcepumd;
    }

    public void setLrtipoplanusuexcepumd(String lrtipoplanusuexcepumd) {
        this.lrtipoplanusuexcepumd = lrtipoplanusuexcepumd;
    }

    public Date getLrtipoplanusuexcepfmd() {
        return lrtipoplanusuexcepfmd;
    }

    public void setLrtipoplanusuexcepfmd(Date lrtipoplanusuexcepfmd) {
        this.lrtipoplanusuexcepfmd = lrtipoplanusuexcepfmd;
    }

    public Lrplangrupusuario getLrplangrupusuario() {
        return lrplangrupusuario;
    }

    public void setLrplangrupusuario(Lrplangrupusuario lrplangrupusuario) {
        this.lrplangrupusuario = lrplangrupusuario;
    }

    public Lrtipoplan getLrtipoplan() {
        return lrtipoplan;
    }

    public void setLrtipoplan(Lrtipoplan lrtipoplan) {
        this.lrtipoplan = lrtipoplan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipoplanusuexcepid != null ? lrtipoplanusuexcepid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoplanusuexcep)) {
            return false;
        }
        Lrtipoplanusuexcep other = (Lrtipoplanusuexcep) object;
        if ((this.lrtipoplanusuexcepid == null && other.lrtipoplanusuexcepid != null) || (this.lrtipoplanusuexcepid != null && !this.lrtipoplanusuexcepid.equals(other.lrtipoplanusuexcepid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoplanusuexcep[ lrtipoplanusuexcepid=" + lrtipoplanusuexcepid + " ]";
    }
    
}
