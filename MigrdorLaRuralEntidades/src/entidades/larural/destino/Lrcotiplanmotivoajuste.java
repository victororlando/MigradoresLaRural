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
@Table(name = "LRCOTIPLANMOTIVOAJUSTE")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findAll", query = "SELECT l FROM Lrcotiplanmotivoajuste l"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanbiendescid", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajustePK.lrcotiplanbiendescid = :lrcotiplanbiendescid"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrmotivoajusteid", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajustePK.lrmotivoajusteid = :lrmotivoajusteid"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanmotivoajusteobs", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajusteobs = :lrcotiplanmotivoajusteobs"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanmotivoajusteual", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajusteual = :lrcotiplanmotivoajusteual"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanmotivoajustefal", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajustefal = :lrcotiplanmotivoajustefal"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanmotivoajusteumd", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajusteumd = :lrcotiplanmotivoajusteumd"),
    @NamedQuery(name = "Lrcotiplanmotivoajuste.findByLrcotiplanmotivoajustefmd", query = "SELECT l FROM Lrcotiplanmotivoajuste l WHERE l.lrcotiplanmotivoajustefmd = :lrcotiplanmotivoajustefmd")})
public class Lrcotiplanmotivoajuste implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcotiplanmotivoajustePK lrcotiplanmotivoajustePK;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANMOTIVOAJUSTEOBS", nullable = false, length = 120)
    private String lrcotiplanmotivoajusteobs;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANMOTIVOAJUSTEUAL", nullable = false, length = 30)
    private String lrcotiplanmotivoajusteual;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANMOTIVOAJUSTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanmotivoajustefal;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANMOTIVOAJUSTEUMD", nullable = false, length = 30)
    private String lrcotiplanmotivoajusteumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANMOTIVOAJUSTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanmotivoajustefmd;
    @JoinColumn(name = "LRMOTIVOAJUSTEID", referencedColumnName = "LRMOTIVOAJUSTEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrmotivoajuste lrmotivoajuste;

    public Lrcotiplanmotivoajuste() {
    }

    public Lrcotiplanmotivoajuste(LrcotiplanmotivoajustePK lrcotiplanmotivoajustePK) {
        this.lrcotiplanmotivoajustePK = lrcotiplanmotivoajustePK;
    }

    public Lrcotiplanmotivoajuste(LrcotiplanmotivoajustePK lrcotiplanmotivoajustePK, String lrcotiplanmotivoajusteobs, String lrcotiplanmotivoajusteual, Date lrcotiplanmotivoajustefal, String lrcotiplanmotivoajusteumd, Date lrcotiplanmotivoajustefmd) {
        this.lrcotiplanmotivoajustePK = lrcotiplanmotivoajustePK;
        this.lrcotiplanmotivoajusteobs = lrcotiplanmotivoajusteobs;
        this.lrcotiplanmotivoajusteual = lrcotiplanmotivoajusteual;
        this.lrcotiplanmotivoajustefal = lrcotiplanmotivoajustefal;
        this.lrcotiplanmotivoajusteumd = lrcotiplanmotivoajusteumd;
        this.lrcotiplanmotivoajustefmd = lrcotiplanmotivoajustefmd;
    }

    public Lrcotiplanmotivoajuste(long lrcotiplanbiendescid, long lrmotivoajusteid) {
        this.lrcotiplanmotivoajustePK = new LrcotiplanmotivoajustePK(lrcotiplanbiendescid, lrmotivoajusteid);
    }

    public LrcotiplanmotivoajustePK getLrcotiplanmotivoajustePK() {
        return lrcotiplanmotivoajustePK;
    }

    public void setLrcotiplanmotivoajustePK(LrcotiplanmotivoajustePK lrcotiplanmotivoajustePK) {
        this.lrcotiplanmotivoajustePK = lrcotiplanmotivoajustePK;
    }

    public String getLrcotiplanmotivoajusteobs() {
        return lrcotiplanmotivoajusteobs;
    }

    public void setLrcotiplanmotivoajusteobs(String lrcotiplanmotivoajusteobs) {
        this.lrcotiplanmotivoajusteobs = lrcotiplanmotivoajusteobs;
    }

    public String getLrcotiplanmotivoajusteual() {
        return lrcotiplanmotivoajusteual;
    }

    public void setLrcotiplanmotivoajusteual(String lrcotiplanmotivoajusteual) {
        this.lrcotiplanmotivoajusteual = lrcotiplanmotivoajusteual;
    }

    public Date getLrcotiplanmotivoajustefal() {
        return lrcotiplanmotivoajustefal;
    }

    public void setLrcotiplanmotivoajustefal(Date lrcotiplanmotivoajustefal) {
        this.lrcotiplanmotivoajustefal = lrcotiplanmotivoajustefal;
    }

    public String getLrcotiplanmotivoajusteumd() {
        return lrcotiplanmotivoajusteumd;
    }

    public void setLrcotiplanmotivoajusteumd(String lrcotiplanmotivoajusteumd) {
        this.lrcotiplanmotivoajusteumd = lrcotiplanmotivoajusteumd;
    }

    public Date getLrcotiplanmotivoajustefmd() {
        return lrcotiplanmotivoajustefmd;
    }

    public void setLrcotiplanmotivoajustefmd(Date lrcotiplanmotivoajustefmd) {
        this.lrcotiplanmotivoajustefmd = lrcotiplanmotivoajustefmd;
    }

    public Lrmotivoajuste getLrmotivoajuste() {
        return lrmotivoajuste;
    }

    public void setLrmotivoajuste(Lrmotivoajuste lrmotivoajuste) {
        this.lrmotivoajuste = lrmotivoajuste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanmotivoajustePK != null ? lrcotiplanmotivoajustePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanmotivoajuste)) {
            return false;
        }
        Lrcotiplanmotivoajuste other = (Lrcotiplanmotivoajuste) object;
        if ((this.lrcotiplanmotivoajustePK == null && other.lrcotiplanmotivoajustePK != null) || (this.lrcotiplanmotivoajustePK != null && !this.lrcotiplanmotivoajustePK.equals(other.lrcotiplanmotivoajustePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanmotivoajuste[ lrcotiplanmotivoajustePK=" + lrcotiplanmotivoajustePK + " ]";
    }
    
}
