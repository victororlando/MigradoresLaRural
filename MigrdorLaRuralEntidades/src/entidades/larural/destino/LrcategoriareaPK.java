/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class LrcategoriareaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAID", nullable = false)
    private long lrcategoriaid;
    @Basic(optional = false)
    @Column(name = "COMREACOAID", nullable = false)
    private short comreacoaid;
    @Basic(optional = false)
    @Column(name = "MONID", nullable = false)
    private short monid;

    public LrcategoriareaPK() {
    }

    public LrcategoriareaPK(long lrcategoriaid, short comreacoaid, short monid) {
        this.lrcategoriaid = lrcategoriaid;
        this.comreacoaid = comreacoaid;
        this.monid = monid;
    }

    public long getLrcategoriaid() {
        return lrcategoriaid;
    }

    public void setLrcategoriaid(long lrcategoriaid) {
        this.lrcategoriaid = lrcategoriaid;
    }

    public short getComreacoaid() {
        return comreacoaid;
    }

    public void setComreacoaid(short comreacoaid) {
        this.comreacoaid = comreacoaid;
    }

    public short getMonid() {
        return monid;
    }

    public void setMonid(short monid) {
        this.monid = monid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcategoriaid;
        hash += (int) comreacoaid;
        hash += (int) monid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcategoriareaPK)) {
            return false;
        }
        LrcategoriareaPK other = (LrcategoriareaPK) object;
        if (this.lrcategoriaid != other.lrcategoriaid) {
            return false;
        }
        if (this.comreacoaid != other.comreacoaid) {
            return false;
        }
        if (this.monid != other.monid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcategoriareaPK[ lrcategoriaid=" + lrcategoriaid + ", comreacoaid=" + comreacoaid + ", monid=" + monid + " ]";
    }
    
}
