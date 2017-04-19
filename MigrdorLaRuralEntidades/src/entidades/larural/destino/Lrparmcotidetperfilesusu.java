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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRPARMCOTIDETPERFILESUSU")
@NamedQueries({
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findAll", query = "SELECT l FROM Lrparmcotidetperfilesusu l"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesid", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusuPK.lrparmcotidetperfilesid = :lrparmcotidetperfilesid"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrusuariosid", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusuPK.lrusuariosid = :lrusuariosid"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesusuac", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusuac = :lrparmcotidetperfilesusuac"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesusuual", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusuual = :lrparmcotidetperfilesusuual"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesusufal", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusufal = :lrparmcotidetperfilesusufal"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesusuumd", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusuumd = :lrparmcotidetperfilesusuumd"),
    @NamedQuery(name = "Lrparmcotidetperfilesusu.findByLrparmcotidetperfilesusufmd", query = "SELECT l FROM Lrparmcotidetperfilesusu l WHERE l.lrparmcotidetperfilesusufmd = :lrparmcotidetperfilesusufmd")})
public class Lrparmcotidetperfilesusu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmcotidetperfilesusuPK lrparmcotidetperfilesusuPK;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUSUAC", nullable = false)
    private Character lrparmcotidetperfilesusuac;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUSUUAL", nullable = false, length = 30)
    private String lrparmcotidetperfilesusuual;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUSUFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotidetperfilesusufal;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUSUUMD", nullable = false, length = 30)
    private String lrparmcotidetperfilesusuumd;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESUSUFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotidetperfilesusufmd;
    @JoinColumn(name = "LRPARMCOTIDETPERFILESID", referencedColumnName = "LRPARMCOTIDETPERFILESID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrparmcotidetperfiles lrparmcotidetperfiles;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuario;

    public Lrparmcotidetperfilesusu() {
    }

    public Lrparmcotidetperfilesusu(LrparmcotidetperfilesusuPK lrparmcotidetperfilesusuPK) {
        this.lrparmcotidetperfilesusuPK = lrparmcotidetperfilesusuPK;
    }

    public Lrparmcotidetperfilesusu(LrparmcotidetperfilesusuPK lrparmcotidetperfilesusuPK, Character lrparmcotidetperfilesusuac, String lrparmcotidetperfilesusuual, Date lrparmcotidetperfilesusufal, String lrparmcotidetperfilesusuumd, Date lrparmcotidetperfilesusufmd) {
        this.lrparmcotidetperfilesusuPK = lrparmcotidetperfilesusuPK;
        this.lrparmcotidetperfilesusuac = lrparmcotidetperfilesusuac;
        this.lrparmcotidetperfilesusuual = lrparmcotidetperfilesusuual;
        this.lrparmcotidetperfilesusufal = lrparmcotidetperfilesusufal;
        this.lrparmcotidetperfilesusuumd = lrparmcotidetperfilesusuumd;
        this.lrparmcotidetperfilesusufmd = lrparmcotidetperfilesusufmd;
    }

    public Lrparmcotidetperfilesusu(long lrparmcotidetperfilesid, String lrusuariosid) {
        this.lrparmcotidetperfilesusuPK = new LrparmcotidetperfilesusuPK(lrparmcotidetperfilesid, lrusuariosid);
    }

    public LrparmcotidetperfilesusuPK getLrparmcotidetperfilesusuPK() {
        return lrparmcotidetperfilesusuPK;
    }

    public void setLrparmcotidetperfilesusuPK(LrparmcotidetperfilesusuPK lrparmcotidetperfilesusuPK) {
        this.lrparmcotidetperfilesusuPK = lrparmcotidetperfilesusuPK;
    }

    public Character getLrparmcotidetperfilesusuac() {
        return lrparmcotidetperfilesusuac;
    }

    public void setLrparmcotidetperfilesusuac(Character lrparmcotidetperfilesusuac) {
        this.lrparmcotidetperfilesusuac = lrparmcotidetperfilesusuac;
    }

    public String getLrparmcotidetperfilesusuual() {
        return lrparmcotidetperfilesusuual;
    }

    public void setLrparmcotidetperfilesusuual(String lrparmcotidetperfilesusuual) {
        this.lrparmcotidetperfilesusuual = lrparmcotidetperfilesusuual;
    }

    public Date getLrparmcotidetperfilesusufal() {
        return lrparmcotidetperfilesusufal;
    }

    public void setLrparmcotidetperfilesusufal(Date lrparmcotidetperfilesusufal) {
        this.lrparmcotidetperfilesusufal = lrparmcotidetperfilesusufal;
    }

    public String getLrparmcotidetperfilesusuumd() {
        return lrparmcotidetperfilesusuumd;
    }

    public void setLrparmcotidetperfilesusuumd(String lrparmcotidetperfilesusuumd) {
        this.lrparmcotidetperfilesusuumd = lrparmcotidetperfilesusuumd;
    }

    public Date getLrparmcotidetperfilesusufmd() {
        return lrparmcotidetperfilesusufmd;
    }

    public void setLrparmcotidetperfilesusufmd(Date lrparmcotidetperfilesusufmd) {
        this.lrparmcotidetperfilesusufmd = lrparmcotidetperfilesusufmd;
    }

    public Lrparmcotidetperfiles getLrparmcotidetperfiles() {
        return lrparmcotidetperfiles;
    }

    public void setLrparmcotidetperfiles(Lrparmcotidetperfiles lrparmcotidetperfiles) {
        this.lrparmcotidetperfiles = lrparmcotidetperfiles;
    }

    public Lrusuario getLrusuario() {
        return lrusuario;
    }

    public void setLrusuario(Lrusuario lrusuario) {
        this.lrusuario = lrusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmcotidetperfilesusuPK != null ? lrparmcotidetperfilesusuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmcotidetperfilesusu)) {
            return false;
        }
        Lrparmcotidetperfilesusu other = (Lrparmcotidetperfilesusu) object;
        if ((this.lrparmcotidetperfilesusuPK == null && other.lrparmcotidetperfilesusuPK != null) || (this.lrparmcotidetperfilesusuPK != null && !this.lrparmcotidetperfilesusuPK.equals(other.lrparmcotidetperfilesusuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmcotidetperfilesusu[ lrparmcotidetperfilesusuPK=" + lrparmcotidetperfilesusuPK + " ]";
    }
    
}
