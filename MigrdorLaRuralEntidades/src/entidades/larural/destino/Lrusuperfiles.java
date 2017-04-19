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
@Table(name = "LRUSUPERFILES")
@NamedQueries({
    @NamedQuery(name = "Lrusuperfiles.findAll", query = "SELECT l FROM Lrusuperfiles l"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuariosid", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesPK.lrusuariosid = :lrusuariosid"),
    @NamedQuery(name = "Lrusuperfiles.findByLrperfilesid", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesPK.lrperfilesid = :lrperfilesid"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuperfileshab", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfileshab = :lrusuperfileshab"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuperfilesfal", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesfal = :lrusuperfilesfal"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuperfilesual", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesual = :lrusuperfilesual"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuperfilesfmd", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesfmd = :lrusuperfilesfmd"),
    @NamedQuery(name = "Lrusuperfiles.findByLrusuperfilesumd", query = "SELECT l FROM Lrusuperfiles l WHERE l.lrusuperfilesumd = :lrusuperfilesumd")})
public class Lrusuperfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrusuperfilesPK lrusuperfilesPK;
    @Basic(optional = false)
    @Column(name = "LRUSUPERFILESHAB", nullable = false)
    private Character lrusuperfileshab;
    @Basic(optional = false)
    @Column(name = "LRUSUPERFILESFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuperfilesfal;
    @Basic(optional = false)
    @Column(name = "LRUSUPERFILESUAL", nullable = false, length = 30)
    private String lrusuperfilesual;
    @Column(name = "LRUSUPERFILESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuperfilesfmd;
    @Column(name = "LRUSUPERFILESUMD", length = 30)
    private String lrusuperfilesumd;
    @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrperfiles lrperfiles;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuario;

    public Lrusuperfiles() {
    }

    public Lrusuperfiles(LrusuperfilesPK lrusuperfilesPK) {
        this.lrusuperfilesPK = lrusuperfilesPK;
    }

    public Lrusuperfiles(LrusuperfilesPK lrusuperfilesPK, Character lrusuperfileshab, Date lrusuperfilesfal, String lrusuperfilesual) {
        this.lrusuperfilesPK = lrusuperfilesPK;
        this.lrusuperfileshab = lrusuperfileshab;
        this.lrusuperfilesfal = lrusuperfilesfal;
        this.lrusuperfilesual = lrusuperfilesual;
    }

    public Lrusuperfiles(String lrusuariosid, long lrperfilesid) {
        this.lrusuperfilesPK = new LrusuperfilesPK(lrusuariosid, lrperfilesid);
    }

    public LrusuperfilesPK getLrusuperfilesPK() {
        return lrusuperfilesPK;
    }

    public void setLrusuperfilesPK(LrusuperfilesPK lrusuperfilesPK) {
        this.lrusuperfilesPK = lrusuperfilesPK;
    }

    public Character getLrusuperfileshab() {
        return lrusuperfileshab;
    }

    public void setLrusuperfileshab(Character lrusuperfileshab) {
        this.lrusuperfileshab = lrusuperfileshab;
    }

    public Date getLrusuperfilesfal() {
        return lrusuperfilesfal;
    }

    public void setLrusuperfilesfal(Date lrusuperfilesfal) {
        this.lrusuperfilesfal = lrusuperfilesfal;
    }

    public String getLrusuperfilesual() {
        return lrusuperfilesual;
    }

    public void setLrusuperfilesual(String lrusuperfilesual) {
        this.lrusuperfilesual = lrusuperfilesual;
    }

    public Date getLrusuperfilesfmd() {
        return lrusuperfilesfmd;
    }

    public void setLrusuperfilesfmd(Date lrusuperfilesfmd) {
        this.lrusuperfilesfmd = lrusuperfilesfmd;
    }

    public String getLrusuperfilesumd() {
        return lrusuperfilesumd;
    }

    public void setLrusuperfilesumd(String lrusuperfilesumd) {
        this.lrusuperfilesumd = lrusuperfilesumd;
    }

    public Lrperfiles getLrperfiles() {
        return lrperfiles;
    }

    public void setLrperfiles(Lrperfiles lrperfiles) {
        this.lrperfiles = lrperfiles;
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
        hash += (lrusuperfilesPK != null ? lrusuperfilesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrusuperfiles)) {
            return false;
        }
        Lrusuperfiles other = (Lrusuperfiles) object;
        if ((this.lrusuperfilesPK == null && other.lrusuperfilesPK != null) || (this.lrusuperfilesPK != null && !this.lrusuperfilesPK.equals(other.lrusuperfilesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrusuperfiles[ lrusuperfilesPK=" + lrusuperfilesPK + " ]";
    }
    
}
