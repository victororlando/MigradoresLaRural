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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRSECCFORMULARIO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRAGRUPAFORMULARIOID", "LRSECCDETALLEID"})})
@NamedQueries({
    @NamedQuery(name = "Lrseccformulario.findAll", query = "SELECT l FROM Lrseccformulario l"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformularioid", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformularioid = :lrseccformularioid"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformularioac", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformularioac = :lrseccformularioac"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformularioual", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformularioual = :lrseccformularioual"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformulariofal", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformulariofal = :lrseccformulariofal"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformularioumd", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformularioumd = :lrseccformularioumd"),
    @NamedQuery(name = "Lrseccformulario.findByLrseccformulariofmd", query = "SELECT l FROM Lrseccformulario l WHERE l.lrseccformulariofmd = :lrseccformulariofmd")})
public class Lrseccformulario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSECCFORMULARIOID", nullable = false)
    private Long lrseccformularioid;
    @Basic(optional = false)
    @Column(name = "LRSECCFORMULARIOAC", nullable = false)
    private Character lrseccformularioac;
    @Column(name = "LRSECCFORMULARIOUAL", length = 30)
    private String lrseccformularioual;
    @Column(name = "LRSECCFORMULARIOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccformulariofal;
    @Column(name = "LRSECCFORMULARIOUMD", length = 30)
    private String lrseccformularioumd;
    @Column(name = "LRSECCFORMULARIOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccformulariofmd;
    @JoinColumn(name = "LRAGRUPAFORMULARIOID", referencedColumnName = "LRAGRUPAFORMULARIOID", nullable = false)
    @ManyToOne(optional = false)
    private Lragrupaformulario lragrupaformularioid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrseccformulario() {
    }

    public Lrseccformulario(Long lrseccformularioid) {
        this.lrseccformularioid = lrseccformularioid;
    }

    public Lrseccformulario(Long lrseccformularioid, Character lrseccformularioac) {
        this.lrseccformularioid = lrseccformularioid;
        this.lrseccformularioac = lrseccformularioac;
    }

    public Long getLrseccformularioid() {
        return lrseccformularioid;
    }

    public void setLrseccformularioid(Long lrseccformularioid) {
        this.lrseccformularioid = lrseccformularioid;
    }

    public Character getLrseccformularioac() {
        return lrseccformularioac;
    }

    public void setLrseccformularioac(Character lrseccformularioac) {
        this.lrseccformularioac = lrseccformularioac;
    }

    public String getLrseccformularioual() {
        return lrseccformularioual;
    }

    public void setLrseccformularioual(String lrseccformularioual) {
        this.lrseccformularioual = lrseccformularioual;
    }

    public Date getLrseccformulariofal() {
        return lrseccformulariofal;
    }

    public void setLrseccformulariofal(Date lrseccformulariofal) {
        this.lrseccformulariofal = lrseccformulariofal;
    }

    public String getLrseccformularioumd() {
        return lrseccformularioumd;
    }

    public void setLrseccformularioumd(String lrseccformularioumd) {
        this.lrseccformularioumd = lrseccformularioumd;
    }

    public Date getLrseccformulariofmd() {
        return lrseccformulariofmd;
    }

    public void setLrseccformulariofmd(Date lrseccformulariofmd) {
        this.lrseccformulariofmd = lrseccformulariofmd;
    }

    public Lragrupaformulario getLragrupaformularioid() {
        return lragrupaformularioid;
    }

    public void setLragrupaformularioid(Lragrupaformulario lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrseccformularioid != null ? lrseccformularioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrseccformulario)) {
            return false;
        }
        Lrseccformulario other = (Lrseccformulario) object;
        if ((this.lrseccformularioid == null && other.lrseccformularioid != null) || (this.lrseccformularioid != null && !this.lrseccformularioid.equals(other.lrseccformularioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrseccformulario[ lrseccformularioid=" + lrseccformularioid + " ]";
    }
    
}
