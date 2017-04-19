/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "LRPROVSERVTIPO")
@NamedQueries({
    @NamedQuery(name = "Lrprovservtipo.findAll", query = "SELECT l FROM Lrprovservtipo l"),
    @NamedQuery(name = "Lrprovservtipo.findByLrtipoajusteid", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoPK.lrtipoajusteid = :lrtipoajusteid"),
    @NamedQuery(name = "Lrprovservtipo.findByTiposserviciosseccid", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoPK.tiposserviciosseccid = :tiposserviciosseccid"),
    @NamedQuery(name = "Lrprovservtipo.findBySeccid", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoPK.seccid = :seccid"),
    @NamedQuery(name = "Lrprovservtipo.findByProvid", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoPK.provid = :provid"),
    @NamedQuery(name = "Lrprovservtipo.findByLrprovservtipoual", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoual = :lrprovservtipoual"),
    @NamedQuery(name = "Lrprovservtipo.findByLrprovservtipofal", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipofal = :lrprovservtipofal"),
    @NamedQuery(name = "Lrprovservtipo.findByLrprovservtipoumd", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipoumd = :lrprovservtipoumd"),
    @NamedQuery(name = "Lrprovservtipo.findByLrprovservtipofmd", query = "SELECT l FROM Lrprovservtipo l WHERE l.lrprovservtipofmd = :lrprovservtipofmd")})
public class Lrprovservtipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrprovservtipoPK lrprovservtipoPK;
    @Column(name = "LRPROVSERVTIPOUAL", length = 30)
    private String lrprovservtipoual;
    @Column(name = "LRPROVSERVTIPOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrprovservtipofal;
    @Column(name = "LRPROVSERVTIPOUMD", length = 30)
    private String lrprovservtipoumd;
    @Column(name = "LRPROVSERVTIPOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrprovservtipofmd;
    @JoinColumn(name = "LRTIPOAJUSTEID", referencedColumnName = "LRTIPOAJUSTEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipoajuste lrtipoajuste;

    public Lrprovservtipo() {
    }

    public Lrprovservtipo(LrprovservtipoPK lrprovservtipoPK) {
        this.lrprovservtipoPK = lrprovservtipoPK;
    }

    public Lrprovservtipo(long lrtipoajusteid, short tiposserviciosseccid, short seccid, int provid) {
        this.lrprovservtipoPK = new LrprovservtipoPK(lrtipoajusteid, tiposserviciosseccid, seccid, provid);
    }

    public LrprovservtipoPK getLrprovservtipoPK() {
        return lrprovservtipoPK;
    }

    public void setLrprovservtipoPK(LrprovservtipoPK lrprovservtipoPK) {
        this.lrprovservtipoPK = lrprovservtipoPK;
    }

    public String getLrprovservtipoual() {
        return lrprovservtipoual;
    }

    public void setLrprovservtipoual(String lrprovservtipoual) {
        this.lrprovservtipoual = lrprovservtipoual;
    }

    public Date getLrprovservtipofal() {
        return lrprovservtipofal;
    }

    public void setLrprovservtipofal(Date lrprovservtipofal) {
        this.lrprovservtipofal = lrprovservtipofal;
    }

    public String getLrprovservtipoumd() {
        return lrprovservtipoumd;
    }

    public void setLrprovservtipoumd(String lrprovservtipoumd) {
        this.lrprovservtipoumd = lrprovservtipoumd;
    }

    public Date getLrprovservtipofmd() {
        return lrprovservtipofmd;
    }

    public void setLrprovservtipofmd(Date lrprovservtipofmd) {
        this.lrprovservtipofmd = lrprovservtipofmd;
    }

    public Lrtipoajuste getLrtipoajuste() {
        return lrtipoajuste;
    }

    public void setLrtipoajuste(Lrtipoajuste lrtipoajuste) {
        this.lrtipoajuste = lrtipoajuste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrprovservtipoPK != null ? lrprovservtipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrprovservtipo)) {
            return false;
        }
        Lrprovservtipo other = (Lrprovservtipo) object;
        if ((this.lrprovservtipoPK == null && other.lrprovservtipoPK != null) || (this.lrprovservtipoPK != null && !this.lrprovservtipoPK.equals(other.lrprovservtipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrprovservtipo[ lrprovservtipoPK=" + lrprovservtipoPK + " ]";
    }
    
}
