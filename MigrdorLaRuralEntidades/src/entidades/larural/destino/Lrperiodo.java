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
@Table(name = "LRPERIODO")
@NamedQueries({
    @NamedQuery(name = "Lrperiodo.findAll", query = "SELECT l FROM Lrperiodo l"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodomes", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoPK.lrperiodomes = :lrperiodomes"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodoanho", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoPK.lrperiodoanho = :lrperiodoanho"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodoestado", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoestado = :lrperiodoestado"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodoac", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoac = :lrperiodoac"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodoual", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoual = :lrperiodoual"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodofal", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodofal = :lrperiodofal"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodoumd", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodoumd = :lrperiodoumd"),
    @NamedQuery(name = "Lrperiodo.findByLrperiodofmd", query = "SELECT l FROM Lrperiodo l WHERE l.lrperiodofmd = :lrperiodofmd")})
public class Lrperiodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrperiodoPK lrperiodoPK;
    @Basic(optional = false)
    @Column(name = "LRPERIODOESTADO", nullable = false)
    private Character lrperiodoestado;
    @Basic(optional = false)
    @Column(name = "LRPERIODOAC", nullable = false)
    private Character lrperiodoac;
    @Basic(optional = false)
    @Column(name = "LRPERIODOUAL", nullable = false, length = 30)
    private String lrperiodoual;
    @Basic(optional = false)
    @Column(name = "LRPERIODOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperiodofal;
    @Basic(optional = false)
    @Column(name = "LRPERIODOUMD", nullable = false, length = 30)
    private String lrperiodoumd;
    @Basic(optional = false)
    @Column(name = "LRPERIODOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperiodofmd;

    public Lrperiodo() {
    }

    public Lrperiodo(LrperiodoPK lrperiodoPK) {
        this.lrperiodoPK = lrperiodoPK;
    }

    public Lrperiodo(LrperiodoPK lrperiodoPK, Character lrperiodoestado, Character lrperiodoac, String lrperiodoual, Date lrperiodofal, String lrperiodoumd, Date lrperiodofmd) {
        this.lrperiodoPK = lrperiodoPK;
        this.lrperiodoestado = lrperiodoestado;
        this.lrperiodoac = lrperiodoac;
        this.lrperiodoual = lrperiodoual;
        this.lrperiodofal = lrperiodofal;
        this.lrperiodoumd = lrperiodoumd;
        this.lrperiodofmd = lrperiodofmd;
    }

    public Lrperiodo(short lrperiodomes, short lrperiodoanho) {
        this.lrperiodoPK = new LrperiodoPK(lrperiodomes, lrperiodoanho);
    }

    public LrperiodoPK getLrperiodoPK() {
        return lrperiodoPK;
    }

    public void setLrperiodoPK(LrperiodoPK lrperiodoPK) {
        this.lrperiodoPK = lrperiodoPK;
    }

    public Character getLrperiodoestado() {
        return lrperiodoestado;
    }

    public void setLrperiodoestado(Character lrperiodoestado) {
        this.lrperiodoestado = lrperiodoestado;
    }

    public Character getLrperiodoac() {
        return lrperiodoac;
    }

    public void setLrperiodoac(Character lrperiodoac) {
        this.lrperiodoac = lrperiodoac;
    }

    public String getLrperiodoual() {
        return lrperiodoual;
    }

    public void setLrperiodoual(String lrperiodoual) {
        this.lrperiodoual = lrperiodoual;
    }

    public Date getLrperiodofal() {
        return lrperiodofal;
    }

    public void setLrperiodofal(Date lrperiodofal) {
        this.lrperiodofal = lrperiodofal;
    }

    public String getLrperiodoumd() {
        return lrperiodoumd;
    }

    public void setLrperiodoumd(String lrperiodoumd) {
        this.lrperiodoumd = lrperiodoumd;
    }

    public Date getLrperiodofmd() {
        return lrperiodofmd;
    }

    public void setLrperiodofmd(Date lrperiodofmd) {
        this.lrperiodofmd = lrperiodofmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrperiodoPK != null ? lrperiodoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrperiodo)) {
            return false;
        }
        Lrperiodo other = (Lrperiodo) object;
        if ((this.lrperiodoPK == null && other.lrperiodoPK != null) || (this.lrperiodoPK != null && !this.lrperiodoPK.equals(other.lrperiodoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrperiodo[ lrperiodoPK=" + lrperiodoPK + " ]";
    }
    
}
