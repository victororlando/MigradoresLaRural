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
public class LraccionsubacccionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRACCIONID", nullable = false)
    private long lraccionid;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONID", nullable = false)
    private long lrsubaccionid;

    public LraccionsubacccionPK() {
    }

    public LraccionsubacccionPK(long lraccionid, long lrsubaccionid) {
        this.lraccionid = lraccionid;
        this.lrsubaccionid = lrsubaccionid;
    }

    public long getLraccionid() {
        return lraccionid;
    }

    public void setLraccionid(long lraccionid) {
        this.lraccionid = lraccionid;
    }

    public long getLrsubaccionid() {
        return lrsubaccionid;
    }

    public void setLrsubaccionid(long lrsubaccionid) {
        this.lrsubaccionid = lrsubaccionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lraccionid;
        hash += (int) lrsubaccionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LraccionsubacccionPK)) {
            return false;
        }
        LraccionsubacccionPK other = (LraccionsubacccionPK) object;
        if (this.lraccionid != other.lraccionid) {
            return false;
        }
        if (this.lrsubaccionid != other.lrsubaccionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LraccionsubacccionPK[ lraccionid=" + lraccionid + ", lrsubaccionid=" + lrsubaccionid + " ]";
    }
    
}
