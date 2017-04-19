/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPLANGRUPUSUARIO")
@NamedQueries({
    @NamedQuery(name = "Lrplangrupusuario.findAll", query = "SELECT l FROM Lrplangrupusuario l"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrtipoplangrupid", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuarioPK.lrtipoplangrupid = :lrtipoplangrupid"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrusuariosid", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuarioPK.lrusuariosid = :lrusuariosid"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrplangrupusuarioac", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuarioac = :lrplangrupusuarioac"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrplangrupusuarioual", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuarioual = :lrplangrupusuarioual"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrplangrupusuariofal", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuariofal = :lrplangrupusuariofal"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrplangrupusuarioumd", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuarioumd = :lrplangrupusuarioumd"),
    @NamedQuery(name = "Lrplangrupusuario.findByLrplangrupusuariofmd", query = "SELECT l FROM Lrplangrupusuario l WHERE l.lrplangrupusuariofmd = :lrplangrupusuariofmd")})
public class Lrplangrupusuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrplangrupusuarioPK lrplangrupusuarioPK;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPUSUARIOAC", nullable = false)
    private Character lrplangrupusuarioac;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPUSUARIOUAL", nullable = false, length = 30)
    private String lrplangrupusuarioual;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPUSUARIOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrplangrupusuariofal;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPUSUARIOUMD", nullable = false, length = 30)
    private String lrplangrupusuarioumd;
    @Basic(optional = false)
    @Column(name = "LRPLANGRUPUSUARIOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrplangrupusuariofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrplangrupusuario")
    private List<Lrtipoplanusuexcep> lrtipoplanusuexcepList;
    @JoinColumn(name = "LRTIPOPLANGRUPID", referencedColumnName = "LRTIPOPLANGRUPID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipoplangrup lrtipoplangrup;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuario;

    public Lrplangrupusuario() {
    }

    public Lrplangrupusuario(LrplangrupusuarioPK lrplangrupusuarioPK) {
        this.lrplangrupusuarioPK = lrplangrupusuarioPK;
    }

    public Lrplangrupusuario(LrplangrupusuarioPK lrplangrupusuarioPK, Character lrplangrupusuarioac, String lrplangrupusuarioual, Date lrplangrupusuariofal, String lrplangrupusuarioumd, Date lrplangrupusuariofmd) {
        this.lrplangrupusuarioPK = lrplangrupusuarioPK;
        this.lrplangrupusuarioac = lrplangrupusuarioac;
        this.lrplangrupusuarioual = lrplangrupusuarioual;
        this.lrplangrupusuariofal = lrplangrupusuariofal;
        this.lrplangrupusuarioumd = lrplangrupusuarioumd;
        this.lrplangrupusuariofmd = lrplangrupusuariofmd;
    }

    public Lrplangrupusuario(long lrtipoplangrupid, String lrusuariosid) {
        this.lrplangrupusuarioPK = new LrplangrupusuarioPK(lrtipoplangrupid, lrusuariosid);
    }

    public LrplangrupusuarioPK getLrplangrupusuarioPK() {
        return lrplangrupusuarioPK;
    }

    public void setLrplangrupusuarioPK(LrplangrupusuarioPK lrplangrupusuarioPK) {
        this.lrplangrupusuarioPK = lrplangrupusuarioPK;
    }

    public Character getLrplangrupusuarioac() {
        return lrplangrupusuarioac;
    }

    public void setLrplangrupusuarioac(Character lrplangrupusuarioac) {
        this.lrplangrupusuarioac = lrplangrupusuarioac;
    }

    public String getLrplangrupusuarioual() {
        return lrplangrupusuarioual;
    }

    public void setLrplangrupusuarioual(String lrplangrupusuarioual) {
        this.lrplangrupusuarioual = lrplangrupusuarioual;
    }

    public Date getLrplangrupusuariofal() {
        return lrplangrupusuariofal;
    }

    public void setLrplangrupusuariofal(Date lrplangrupusuariofal) {
        this.lrplangrupusuariofal = lrplangrupusuariofal;
    }

    public String getLrplangrupusuarioumd() {
        return lrplangrupusuarioumd;
    }

    public void setLrplangrupusuarioumd(String lrplangrupusuarioumd) {
        this.lrplangrupusuarioumd = lrplangrupusuarioumd;
    }

    public Date getLrplangrupusuariofmd() {
        return lrplangrupusuariofmd;
    }

    public void setLrplangrupusuariofmd(Date lrplangrupusuariofmd) {
        this.lrplangrupusuariofmd = lrplangrupusuariofmd;
    }

    public List<Lrtipoplanusuexcep> getLrtipoplanusuexcepList() {
        return lrtipoplanusuexcepList;
    }

    public void setLrtipoplanusuexcepList(List<Lrtipoplanusuexcep> lrtipoplanusuexcepList) {
        this.lrtipoplanusuexcepList = lrtipoplanusuexcepList;
    }

    public Lrtipoplangrup getLrtipoplangrup() {
        return lrtipoplangrup;
    }

    public void setLrtipoplangrup(Lrtipoplangrup lrtipoplangrup) {
        this.lrtipoplangrup = lrtipoplangrup;
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
        hash += (lrplangrupusuarioPK != null ? lrplangrupusuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrplangrupusuario)) {
            return false;
        }
        Lrplangrupusuario other = (Lrplangrupusuario) object;
        if ((this.lrplangrupusuarioPK == null && other.lrplangrupusuarioPK != null) || (this.lrplangrupusuarioPK != null && !this.lrplangrupusuarioPK.equals(other.lrplangrupusuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrplangrupusuario[ lrplangrupusuarioPK=" + lrplangrupusuarioPK + " ]";
    }
    
}
