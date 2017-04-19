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
@Table(name = "LRAGRUPARUBRO")
@NamedQueries({
    @NamedQuery(name = "Lragruparubro.findAll", query = "SELECT l FROM Lragruparubro l"),
    @NamedQuery(name = "Lragruparubro.findByLrcategoriarubroid", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubroPK.lrcategoriarubroid = :lrcategoriarubroid"),
    @NamedQuery(name = "Lragruparubro.findByRubrosid", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubroPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lragruparubro.findByLragruparubroual", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubroual = :lragruparubroual"),
    @NamedQuery(name = "Lragruparubro.findByLragruparubrofal", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubrofal = :lragruparubrofal"),
    @NamedQuery(name = "Lragruparubro.findByLragruparubroumd", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubroumd = :lragruparubroumd"),
    @NamedQuery(name = "Lragruparubro.findByLragruparubrofmd", query = "SELECT l FROM Lragruparubro l WHERE l.lragruparubrofmd = :lragruparubrofmd")})
public class Lragruparubro implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LragruparubroPK lragruparubroPK;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARUBROUAL", nullable = false, length = 30)
    private String lragruparubroual;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARUBROFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragruparubrofal;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARUBROUMD", nullable = false, length = 30)
    private String lragruparubroumd;
    @Basic(optional = false)
    @Column(name = "LRAGRUPARUBROFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragruparubrofmd;
    @JoinColumn(name = "LRCATEGORIARUBROID", referencedColumnName = "LRCATEGORIARUBROID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcategoriarubro lrcategoriarubro;

    public Lragruparubro() {
    }

    public Lragruparubro(LragruparubroPK lragruparubroPK) {
        this.lragruparubroPK = lragruparubroPK;
    }

    public Lragruparubro(LragruparubroPK lragruparubroPK, String lragruparubroual, Date lragruparubrofal, String lragruparubroumd, Date lragruparubrofmd) {
        this.lragruparubroPK = lragruparubroPK;
        this.lragruparubroual = lragruparubroual;
        this.lragruparubrofal = lragruparubrofal;
        this.lragruparubroumd = lragruparubroumd;
        this.lragruparubrofmd = lragruparubrofmd;
    }

    public Lragruparubro(long lrcategoriarubroid, long rubrosid) {
        this.lragruparubroPK = new LragruparubroPK(lrcategoriarubroid, rubrosid);
    }

    public LragruparubroPK getLragruparubroPK() {
        return lragruparubroPK;
    }

    public void setLragruparubroPK(LragruparubroPK lragruparubroPK) {
        this.lragruparubroPK = lragruparubroPK;
    }

    public String getLragruparubroual() {
        return lragruparubroual;
    }

    public void setLragruparubroual(String lragruparubroual) {
        this.lragruparubroual = lragruparubroual;
    }

    public Date getLragruparubrofal() {
        return lragruparubrofal;
    }

    public void setLragruparubrofal(Date lragruparubrofal) {
        this.lragruparubrofal = lragruparubrofal;
    }

    public String getLragruparubroumd() {
        return lragruparubroumd;
    }

    public void setLragruparubroumd(String lragruparubroumd) {
        this.lragruparubroumd = lragruparubroumd;
    }

    public Date getLragruparubrofmd() {
        return lragruparubrofmd;
    }

    public void setLragruparubrofmd(Date lragruparubrofmd) {
        this.lragruparubrofmd = lragruparubrofmd;
    }

    public Lrcategoriarubro getLrcategoriarubro() {
        return lrcategoriarubro;
    }

    public void setLrcategoriarubro(Lrcategoriarubro lrcategoriarubro) {
        this.lrcategoriarubro = lrcategoriarubro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragruparubroPK != null ? lragruparubroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragruparubro)) {
            return false;
        }
        Lragruparubro other = (Lragruparubro) object;
        if ((this.lragruparubroPK == null && other.lragruparubroPK != null) || (this.lragruparubroPK != null && !this.lragruparubroPK.equals(other.lragruparubroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragruparubro[ lragruparubroPK=" + lragruparubroPK + " ]";
    }
    
}
